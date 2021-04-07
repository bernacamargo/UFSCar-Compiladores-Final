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

                try(PrintWriter pw = new PrintWriter(args[1])){
                    SemanticoUtils.errosSemanticos.forEach(it -> pw.print(it));
                }

            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

}
