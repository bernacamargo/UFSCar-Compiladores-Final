package br.ufscar.compiladores;

import java.util.List;

public class Semantico extends LSQLBaseVisitor<Void>{

    TabelaDeSimbolos tabelaDeSimbolos;

    public Semantico() {
        tabelaDeSimbolos = new TabelaDeSimbolos();
    }

    @Override
    public Void visitPrograma(LSQLParser.ProgramaContext ctx) {
        visitCorpo(ctx.corpo());
        System.out.println(tabelaDeSimbolos.toString());
        return null;
    }

    @Override
    public Void visitCorpo(LSQLParser.CorpoContext ctx) {

        ctx.cmd().forEach(cmd -> visitCmd(cmd));

        return null;
    }
// visita a gramatica para cmd cria
    @Override
    public Void visitCmd_cria(LSQLParser.Cmd_criaContext ctx) {

        var identificadorTabela = ctx.identificador().getText();

        if (!tabelaDeSimbolos.existeIdentificadorTabela(identificadorTabela)){
            ctx.declaracao_var().forEach(it -> visitaDeclaracao_var(it, identificadorTabela));
        }
        else{
            SemanticoUtils.adicionaErroSemantico(identificadorTabela, ctx.start.getLine(), ErrosSemanticos.IDENTIFICADOR_EXISTENTE);
        }

        return null;
    }
// verifica a declaração da variavel em nível semantico
    public Void visitaDeclaracao_var(LSQLParser.Declaracao_varContext ctx, String identificadorTabela) {

        var ident = ctx.identificador().getText();
        var nomeVar = !ident.contains(".") ? identificadorTabela + "." + ident : ident;
        var tipo = ctx.tipos_basicos().getText();
        var tipoLSQL = SemanticoUtils.verificarTipo(tipo);

        if (tipoLSQL != null){
            if(!tabelaDeSimbolos.existe(nomeVar)){
                tabelaDeSimbolos.inserir(nomeVar, tipoLSQL);
            }
            else {
                SemanticoUtils.adicionaErroSemantico(nomeVar, ctx.start.getLine(), ErrosSemanticos.IDENTIFICADOR_EXISTENTE);
            }
        }
        else {
            SemanticoUtils.adicionaErroSemantico(tipo, ctx.start.getLine(), ErrosSemanticos.TIPO_INEXISTENTE);
        }

        return null;
    }

    @Override
    public Void visitCmd_mostra(LSQLParser.Cmd_mostraContext ctx) {
        var ident = ctx.identificador().getText();

        if (tabelaDeSimbolos.existeIdentificadorTabela(ident)){
            visitaColunas(ctx.colunas(), ident);
            if (ctx.ONDE() != null){
                visitaExpressao(ctx.expressao(), ident);
            }
        }
        else {
            SemanticoUtils.adicionaErroSemantico(ident, ctx.start.getLine(), ErrosSemanticos.IDENTIFICADOR_INEXISTENTE);
        }

        return null;
    }
// verifica valor semantico do insere 
    @Override
    public Void visitCmd_insere(LSQLParser.Cmd_insereContext ctx) {
        var ident = ctx.identificador().getText();

        if (tabelaDeSimbolos.existeIdentificadorTabela(ident)){
            for (int i = 0; i < ctx.expressao_relacional().size(); i++) {
                var expRelacional = ctx.expressao_relacional(i);
                visitaExpressao_relacional(expRelacional, ident);
            }
        }
        else {
            SemanticoUtils.adicionaErroSemantico(ident, ctx.start.getLine(), ErrosSemanticos.IDENTIFICADOR_INEXISTENTE);
        }

        return null;
    }
// verifica valor semantico do atualiza
    @Override
    public Void visitCmd_atualiza(LSQLParser.Cmd_atualizaContext ctx) {

        var ident = ctx.identificador().getText();

        if (tabelaDeSimbolos.existeIdentificadorTabela(ident)){
            if (ctx.ONDE() != null){
                visitaExpressao(ctx.expressao(), ident);
            }

            for (int i = 0; i < ctx.expressao_relacional().size(); i++) {
                var expRelacional = ctx.expressao_relacional(i);
                visitaExpressao_relacional(expRelacional, ident);

            }
        }
        else {
            SemanticoUtils.adicionaErroSemantico(ident, ctx.start.getLine(), ErrosSemanticos.IDENTIFICADOR_INEXISTENTE);
        }

        return null;
    }
// verifica valor semantico do deletar/apagar 
    @Override
    public Void visitCmd_apaga(LSQLParser.Cmd_apagaContext ctx) {

        var ident = ctx.identificador().getText();

        if(tabelaDeSimbolos.existeIdentificadorTabela(ident)){
            if (ctx.ONDE() != null){
                visitaExpressao(ctx.expressao(), ident);
            }
        }
        else {
            SemanticoUtils.adicionaErroSemantico(ident, ctx.start.getLine(), ErrosSemanticos.IDENTIFICADOR_INEXISTENTE);
        }

        return null;
    }
// verifica valor semantico da variavel e declaração conforme as colunas
    private Void visitaColunas(LSQLParser.ColunasContext ctx, String identificadorTabela){

        if (ctx.TODOS() == null) {
            for (int i=0; i < ctx.identificador().size(); i++) {
                var ident = ctx.identificador(i).getText();
                var nomeVar = !ident.contains(".") ? identificadorTabela + "." + ident : ident;
                if (!tabelaDeSimbolos.existe(nomeVar)) {
                    SemanticoUtils.adicionaErroSemantico(nomeVar, ctx.start.getLine(), ErrosSemanticos.IDENTIFICADOR_INEXISTENTE);
                }
            }
        }

        return null;
    }
// identifica o valor que será atribuido para uma variável 
    private Void visitaExpressao(LSQLParser.ExpressaoContext ctx, String identificadorTabela) {

        var teste = ctx.getText();

        ctx.termo_logico().forEach(it -> visitaTermo_logico(it, identificadorTabela));

        return null;
    }
// identifica os termos lógicos que estão na expressão
    private Void visitaTermo_logico(LSQLParser.Termo_logicoContext ctx, String identificadorTabela) {

        var teste = ctx.getText();

        ctx.fator_logico().forEach(it -> visitaFator_logico(it, identificadorTabela));

        return null;
    }
// identifica os termos factor que estão nos termos
    private Void visitaFator_logico(LSQLParser.Fator_logicoContext ctx, String identificadorTabela){

        var teste = ctx.getText();

        visitaExpressao_relacional(ctx.expressao_relacional(), identificadorTabela);

        return null;
    }
// identifica os operadores de comparações entre termos
    private Void visitaExpressao_relacional(LSQLParser.Expressao_relacionalContext ctx, String identificadorTabela) {

        var teste = ctx.getText();

        visitaExpressao_aritmetica(ctx.expressao_aritmetica(), identificadorTabela);

        return null;
    }
// visita a expressão aritimetica 
    private Void visitaExpressao_aritmetica(List<LSQLParser.Expressao_aritmeticaContext> ctxList, String identificadorTabela) {

        var ctxLeft = ctxList.get(0);
        var ctxRight = ctxList.get(1);

        var tipoVarRight = "invalido";
        if (ctxRight.NUM_INT() != null){
            tipoVarRight = "inteiro";
        }
        else if(ctxRight.NUM_REAL() != null){
            tipoVarRight = "real";
        }
        else if(ctxRight.parcela_nao_numerica() != null){
            if (ctxRight.parcela_nao_numerica().CADEIA() != null)
                tipoVarRight = "texto";
        }

        var identLeft = ctxLeft.getText();
        var nomeVarLeft = !identLeft.contains(".") ? identificadorTabela + "." + identLeft : identLeft;
        var tipoVarLeft = tabelaDeSimbolos.verificar(nomeVarLeft);

        if (tabelaDeSimbolos.existe(nomeVarLeft)) {

            if(!SemanticoUtils.comparaTipo(tipoVarLeft.tipo, SemanticoUtils.verificarTipo(tipoVarRight))){
                SemanticoUtils.adicionaErroSemantico(nomeVarLeft, ctxLeft.start.getLine(), ErrosSemanticos.ATRIBUICAO_INCOMPATIVEL);
            }

        }
        else{
            SemanticoUtils.adicionaErroSemantico(nomeVarLeft, ctxLeft.start.getLine(), ErrosSemanticos.IDENTIFICADOR_INEXISTENTE);
        }

        return null;
    }
}
