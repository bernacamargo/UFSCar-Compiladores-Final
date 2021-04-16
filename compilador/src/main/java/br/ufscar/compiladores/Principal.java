package br.ufscar.compiladores;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.io.PrintWriter;

public class Principal {

    public static void main(String[] args) {
        CharStream cs;
        try{
            cs = CharStreams.fromFileName(args[0]);
            LSQLLexer lex = new LSQLLexer(cs);

            CommonTokenStream tokens = new CommonTokenStream(lex);
            LSQLParser parser = new LSQLParser(tokens);
            CustomErrorListener customErrorListener = new CustomErrorListener(lex, args[1]);
            parser.addErrorListener(customErrorListener);
            LSQLParser.ProgramaContext arvore = parser.programa();

            // Analisador Sintatico
            if (CharStreams.fromFileName(args[1]).size() == 0){
                // Analisador Semantico
                Semantico semanticoVisitor = new Semantico();
                semanticoVisitor.visitPrograma(arvore);

                if (SemanticoUtils.errosSemanticos.isEmpty()){
                    // Gerador de código
                    GeradorDeCodigo geradorDeCodigo = new GeradorDeCodigo();
                    geradorDeCodigo.visitPrograma(arvore);

                    try(PrintWriter pw = new PrintWriter(args[1])){
                        pw.print(geradorDeCodigo.saida.toString());
                    }
                }
                else {
                    try(PrintWriter pw = new PrintWriter(args[1])){
                        SemanticoUtils.errosSemanticos.forEach(pw::print);
                        pw.print("Fim da compilacao\n");
                    }
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
