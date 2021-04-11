package br.ufscar.compiladores;

import java.util.List;

public class GeradorDeCodigo extends LSQLBaseVisitor<Void>{

    StringBuilder saida;
    TabelaDeSimbolos tabelaDeSimbolos;

    public GeradorDeCodigo() {
        saida = new StringBuilder();
        tabelaDeSimbolos = new TabelaDeSimbolos();
    }

    @Override
    public Void visitPrograma(LSQLParser.ProgramaContext ctx) {

        visitCorpo(ctx.corpo());

        return null;
    }

    @Override
    public Void visitCorpo(LSQLParser.CorpoContext ctx) {

        ctx.cmd().forEach(this::visitCmd);

        return null;
    }

    public Void visitaIdentificador(List<LSQLParser.IdentificadorContext> ctxLista) {

        for (int i = 0; i < ctxLista.size(); i++) {
            var ctx = ctxLista.get(i);
            saida.append(ctx.getText());

            if (i != ctxLista.size()-1){
                saida.append(", ");
            }
        }

        return null;
    }

    @Override
    public Void visitCmd_cria(LSQLParser.Cmd_criaContext ctx) {

        var ident = ctx.identificador().getText();

        saida.append("CREATE TABLE ");
        saida.append(ident);
        saida.append(" ( \n");
        visitaDeclaracao_var(ctx.declaracao_var());
        saida.append(");\n\n");
        return null;
    }

    public Void visitaDeclaracao_var(List<LSQLParser.Declaracao_varContext> ctxLista) {

        for (int i=0; i < ctxLista.size(); i++) {
            var ctx = ctxLista.get(i);
            var ident = ctx.identificador().getText();
            var tipo = ctx.tipos_basicos().getText();
            var tipoLSQL = SemanticoUtils.verificarTipo(tipo);
            var tipoGerado = GeradorDeCodigoUtils.verificaTipoVar(tipoLSQL);

            saida.append("\t");
            saida.append(ident);
            saida.append(" ")
                    .append(tipoGerado);

            if (i != ctxLista.size()-1)
                saida.append(",\n");
            else
                saida.append("\n");
        }

        return null;
    }

    @Override
    public Void visitCmd_mostra(LSQLParser.Cmd_mostraContext ctx) {

        var ident = ctx.identificador().getText();

        saida.append("SELECT ");
        visitColunas(ctx.colunas());
        saida.append(" FROM ").append(ident);
        if (ctx.ONDE() != null) {
            saida.append("\n\tWHERE ");
            visitExpressao(ctx.expressao());
        }
        saida.append(";\n\n");
        return null;
    }

    @Override
    public Void visitColunas(LSQLParser.ColunasContext ctx) {

        if (ctx.TODOS() == null){
            var identificadorLista = ctx.identificador();
            for (int i = 0; i < identificadorLista.size(); i++) {
                var ident = identificadorLista.get(i);
                saida.append(ident.getText());
                if (i != identificadorLista.size()-1){
                    saida.append(", ");
                }
            }
        }
        else{
            saida.append("*");
        }

        return null;
    }

    @Override
    public Void visitCmd_insere(LSQLParser.Cmd_insereContext ctx) {
        var ident = ctx.identificador().getText();
        var expressaoParaFormatoInsere = GeradorDeCodigoUtils.expressaoParaFormatoInsere(ctx.expressao_relacional());

        saida.append("INSERT INTO ").append(ident);

        saida.append(expressaoParaFormatoInsere);

        saida.append(";\n\n");

        return null;
    }

    @Override
    public Void visitCmd_atualiza(LSQLParser.Cmd_atualizaContext ctx) {

        var ident = ctx.identificador().getText();

        saida.append("UPDATE ").append(ident);
        saida.append(" SET ");
        var expressao_relacional = ctx.expressao_relacional();
        for (int i = 0; i < expressao_relacional.size(); i++) {
            var expRelacional = expressao_relacional.get(i);
            visitExpressao_relacional(expRelacional);

            if (i != expressao_relacional.size()-1){
                saida.append(", ");
            }
        }

        if (ctx.ONDE() != null){
            saida.append("\n\tWHERE ");
            visitExpressao(ctx.expressao());
        }

        saida.append(";\n\n");

        return null;
    }

    @Override
    public Void visitCmd_apaga(LSQLParser.Cmd_apagaContext ctx) {

        var ident = ctx.identificador().getText();
        var expressao = ctx.expressao();

        saida.append("DELETE FROM ").append(ident);

        if (ctx.ONDE() != null){
            saida.append(" WHERE ");
            visitExpressao(expressao);
        }

        saida.append(";\n\n");

        return null;
    }

    @Override
    public Void visitExpressao(LSQLParser.ExpressaoContext ctx) {

        for (int i = 0; i < ctx.termo_logico().size(); i++) {
            visitTermo_logico(ctx.termo_logico(i));
            if (ctx.OP_OU(i) != null){
                saida.append(" OR\n\t");
            }
        }

        return null;
    }

    @Override
    public Void visitTermo_logico(LSQLParser.Termo_logicoContext ctx) {

        for (int i = 0; i < ctx.fator_logico().size(); i++) {
            visitFator_logico(ctx.fator_logico(i));
            if (ctx.OP_E(i) != null){
                saida.append(" AND\n\t");
            }
        }

        return null;
    }

    @Override
    public Void visitFator_logico(LSQLParser.Fator_logicoContext ctx) {

        visitExpressao_relacional(ctx.expressao_relacional());

        return null;
    }


    @Override
    public Void visitExpressao_relacional(LSQLParser.Expressao_relacionalContext ctx) {

        visitExpressao_aritmetica(ctx.expressao_aritmetica(0));
        visitOp_relacional(ctx.op_relacional());
        visitExpressao_aritmetica(ctx.expressao_aritmetica(1));

        return null;
    }

    @Override
    public Void visitExpressao_aritmetica(LSQLParser.Expressao_aritmeticaContext ctx) {

        saida.append(ctx.getText());

        return null;
    }

    @Override
    public Void visitOp_relacional(LSQLParser.Op_relacionalContext ctx) {

        saida.append(" ").append(ctx.getText()).append(" ");

        return null;
    }
}
