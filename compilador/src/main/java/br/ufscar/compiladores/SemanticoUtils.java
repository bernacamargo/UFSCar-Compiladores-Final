package br.ufscar.compiladores;

import java.util.ArrayList;
import java.util.List;

public class SemanticoUtils {
    public static List<String> errosSemanticos = new ArrayList<>();
    private static LSQLParser.IdentificadorContext identifier = null;
    private static LSQLParser.ExpressaoContext expression = null;
    private static EntradaTabelaDeSimbolos identifierEntradaTabela = null;

    public static void adicionaErroSemantico(EntradaTabelaDeSimbolos entradaTabelaDeSimbolos, int linha, ErrosSemanticos tipoErro){

        var variavel = entradaTabelaDeSimbolos.nome;

        if (getErrosSemanticos().contains(variavel)){
            return;
        }

        StringBuilder erroSemantico = new StringBuilder();

        erroSemantico.append("Linha ").append(linha).append(": ");

        erroSemantico.append(switchErrorMsg(tipoErro, variavel));

        errosSemanticos.add(erroSemantico.toString());
    }

    public static void adicionaErroSemantico(String variavel, int linha, ErrosSemanticos tipoErro) {

        if (getErrosSemanticos().contains(variavel)){
            return;
        }

        StringBuilder erroSemantico = new StringBuilder();

        erroSemantico.append("Linha ").append(linha).append(": ");

        erroSemantico.append(switchErrorMsg(tipoErro, variavel));

        errosSemanticos.add(erroSemantico.toString());
    }

    private static String switchErrorMsg(ErrosSemanticos tipoErro, String variavel){
        switch (tipoErro){
            case IDENTIFICADOR_EXISTENTE:
                return "identificador " + variavel + " ja declarado anteriormente\n";
            case ATRIBUICAO_INCOMPATIVEL:
                return "atribuicao nao compativel para " + variavel + "\n";
            case PARAMETROS_INCOMPATIVEIS:
                return "incompatibilidade de parametros na chamada de " + variavel + "\n";
            case ESCOPO_INVALIDO:
                return "comando retorne nao permitido nesse escopo\n";
            case IDENTIFICADOR_INEXISTENTE:
                return "identificador " + variavel + " nao declarado\n";
            case TIPO_INEXISTENTE:
                return "tipo " + variavel + " nao declarado\n";
            default:
                return "";
        }
    }

    public static Tipos verificarTipo(String tipo){

        switch (tipo){
            case "inteiro":
                return Tipos.INTEIRO;
            case "real":
                return Tipos.REAL;
            case "texto":
                return Tipos.TEXTO;
            case "varchar":
                return Tipos.VARCHAR;
            default:
                return null;
        }

    }

    public static boolean comparaTipo(Tipos tipo1, Tipos tipo2){

        if (tipo1.equals(tipo2))
            return true;
        else if(tipo1.equals(Tipos.VARCHAR) || tipo1.equals(Tipos.TEXTO)){
            if (tipo2.equals(Tipos.VARCHAR) || tipo2.equals(Tipos.TEXTO)){
                return true;
            }
        }

        return false;
    }

    public static void exibeErrosSemanticos() {
        System.out.println("\n");
        errosSemanticos.forEach(it -> System.out.println(it));
    }

    public static String getErrosSemanticos() {
        StringBuilder saida = new StringBuilder();

        for(String erro: errosSemanticos){
            saida.append(erro);
        }

        if(saida.length() > 0)
            saida.append("Fim da compilacao\n");

        return saida.toString();
    }

//    public static void setValidacaoAtribuicao(AlParser.IdentifierContext identifier, EntradaTabelaDeSimbolos identifierEntradaTabela, AlParser.ExpressionContext expression){
//        SemanticoUtils.identifier = identifier;
//        SemanticoUtils.expression = expression;
//        SemanticoUtils.identifierEntradaTabela = identifierEntradaTabela;
//        var test = "";
//    }

    public static LSQLParser.IdentificadorContext getIdentifier() {
        return identifier;
    }

    public static LSQLParser.ExpressaoContext getExpression() {
        return expression;
    }

    public static EntradaTabelaDeSimbolos getIdentifierEntradaTabela() {
        return identifierEntradaTabela;
    }
}
