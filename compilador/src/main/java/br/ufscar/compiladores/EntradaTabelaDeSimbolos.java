package br.ufscar.compiladores;

public class EntradaTabelaDeSimbolos {
    public String nome;
    public Tipos tipo;

    //Para conseguir encontrar o tipo e o nome da variavel e se é ponteiro ou não
    public EntradaTabelaDeSimbolos(String nome, Tipos tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
}
