package br.ufscar.compiladores;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.io.FileWriter;
import java.io.IOException;
import java.util.BitSet;

public class CustomErrorListener implements ANTLRErrorListener {
    LSQLLexer lex;
    FileWriter fileWriter;

    public CustomErrorListener(LSQLLexer lex, String filePath) {
        this.lex = lex;
        try{
            this.fileWriter = new FileWriter(filePath);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object t, int linha, int i1, String s, RecognitionException e) {
        Token token = (Token) t;
        String ident = token.getText();
        StringBuilder saida = new StringBuilder();

        if (token.getType() == 41){
            saida.append(ident)
                    .append(" - simbolo nao identificado\n");
        }
        else if (ident.contains("{")){
            saida.append("comentario nao fechado\n");
        }
        else if (ident.contains("\"") && !ident.endsWith("\"")){
            saida.append("cadeia literal nao fechada\n");
        }
        else {
            if (ident.equals("<EOF>"))
                ident = "EOF";

            saida.append("erro sintatico proximo a ")
                    .append(ident)
                    .append("\n");
        }

        escreveNoArquivo(saida, linha);
    }

    private void escreveNoArquivo(StringBuilder saida, int linha) {
        try {
            if (saida.length() > 0){
                saida.insert(0, "Linha " + linha + ": ");
                saida.append("Fim da compilacao\n");

                fileWriter.write(saida.toString());
            }

            fileWriter.close();
        }
        catch (IOException ioException){
            ioException.printStackTrace();
        }
    }

    @Override
    public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean b, BitSet bitSet, ATNConfigSet atnConfigSet) {

    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitSet, ATNConfigSet atnConfigSet) {

    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atnConfigSet) {

    }
}
