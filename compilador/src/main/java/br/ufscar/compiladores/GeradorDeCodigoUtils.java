package br.ufscar.compiladores;

import java.util.ArrayList;
import java.util.List;
//verifica o tipo da nossa gramatica com o tipo da linguaguem de SQL que estamos utilizando
public class GeradorDeCodigoUtils {

    public static String verificaTipoVar(Tipos tipos){

        String saida;

        switch (tipos){
            case REAL:
                saida = "FLOAT";
                break;
            case TEXTO:
                saida = "TEXT";
                break;
            case INTEIRO:
                saida = "INT";
                break;
            case VARCHAR:
                saida = "VARCHAR(255)";
                break;
            default:
                saida = "INVALIDO";
        }

        return saida;

    }
//verifica a estrutura da nossa operação 
    public static String expressaoParaFormatoInsere(List<LSQLParser.Expressao_relacionalContext> ctxLista){

        StringBuilder saida = new StringBuilder();
        List<LSQLParser.Expressao_aritmeticaContext> termosDireita = new ArrayList();
        List<LSQLParser.Expressao_aritmeticaContext> termosEsquerda = new ArrayList();

        for (int i = 0; i < ctxLista.size(); i++) {
            var expressaoRelacionalCtx = ctxLista.get(i);
            var expressaoAritmeticaCtx = expressaoRelacionalCtx.expressao_aritmetica();
            var termoDireitaExp = expressaoAritmeticaCtx.get(0);
            var termoEsquerdaExp = expressaoAritmeticaCtx.get(1);

            termosDireita.add(termoDireitaExp);
            termosEsquerda.add(termoEsquerdaExp);
        }

        saida.append(" (");

        for (int i = 0; i < termosDireita.size(); i++) {
            saida.append(termosDireita.get(i).getText());

            if (i != termosDireita.size()-1)
                saida.append(", ");
        }

        saida.append(") VALUES (");

        for (int i = 0; i < termosEsquerda.size(); i++) {
            saida.append(termosEsquerda.get(i).getText());

            if (i != termosEsquerda.size()-1)
                saida.append(", ");
        }

        saida.append(")");

        return saida.toString();

    }

}
