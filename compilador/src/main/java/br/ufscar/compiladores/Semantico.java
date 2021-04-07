package br.ufscar.compiladores;

public class Semantico extends LSQLBaseVisitor<Void>{

    TabelaDeSimbolos tabelaDeSimbolos;

    public Semantico() {
        tabelaDeSimbolos = new TabelaDeSimbolos();
    }

    @Override
    public Void visitPrograma(LSQLParser.ProgramaContext ctx) {
        visitCorpo(ctx.corpo());
        return null;
    }

    @Override
    public Void visitCorpo(LSQLParser.CorpoContext ctx) {

        ctx.cmd().forEach(cmd -> visitCmd(cmd));

        return null;
    }

    @Override
    public Void visitCmd_cria(LSQLParser.Cmd_criaContext ctx) {

        var ident = ctx.identificador().getText();

        ctx.declaracao_var().forEach(it -> visitaDeclaracao_var(it, ident));

        return null;
    }

    public Void visitaDeclaracao_var(LSQLParser.Declaracao_varContext ctx, String identificador) {

        var tipo = ctx.tipos_basicos().getText();
        var tipoLSQL = SemanticoUtils.verificarTipo(tipo);

//        tabelaDeSimbolos.inserir();

        return null;
    }

}
