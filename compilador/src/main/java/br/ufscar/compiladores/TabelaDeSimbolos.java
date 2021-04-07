package br.ufscar.compiladores;

import java.util.HashMap;
import java.util.Map;

public class TabelaDeSimbolos {
    private HashMap<String, EntradaTabelaDeSimbolos> tabelaDeSimbolos;

    public TabelaDeSimbolos() {
        tabelaDeSimbolos = new HashMap<>();
    }

    public void inserir(String nome, Tipos tipo) {
        EntradaTabelaDeSimbolos entradaTabelaDeSimbolos = new EntradaTabelaDeSimbolos(nome, tipo);
        tabelaDeSimbolos.put(nome, entradaTabelaDeSimbolos);
    }

    public boolean existe(String nome){
        return verificar(nome) != null;
    }

    // Retorna um valor da tabela de simbolos baseado na key
    public EntradaTabelaDeSimbolos verificar(String nome) {

        EntradaTabelaDeSimbolos retorno = null;

        if(nome.contains("[")) {
            var nomeVetor = nome.split("\\[")[0];
            for (Map.Entry<String, EntradaTabelaDeSimbolos> entry : tabelaDeSimbolos.entrySet()) {
                String key = entry.getKey();
                EntradaTabelaDeSimbolos itemTabela = entry.getValue();
                if (itemTabela.nome.contains(nomeVetor)) {
                    retorno = itemTabela;
                    break;
                }
            }
        }
        else {
            retorno = tabelaDeSimbolos.get(nome);
        }

        return retorno;
    }

    // Verifica na tabela de simolos por tipos customizados (typedef)
    // e insere a variavel com a tipagem correta
    public void verificarTipoCustomizados(String nome, String tipoVar) {

        HashMap<String, EntradaTabelaDeSimbolos> tabelaDeSimbolosAuxiliar = new HashMap<>();

        tabelaDeSimbolos.forEach((key, itemTabela) -> {
            EntradaTabelaDeSimbolos entrada = new EntradaTabelaDeSimbolos(itemTabela.nome, itemTabela.tipo);
            tabelaDeSimbolosAuxiliar.put(itemTabela.nome, entrada);
        });

        tabelaDeSimbolosAuxiliar.forEach((key, itemTabela) -> {
            if (itemTabela.nome.contains(tipoVar)){
                inserir(itemTabela.nome.replace(tipoVar, nome), itemTabela.tipo);
            }
        });
    }


    // Imprime a tabela (utilizado para debug)
    @Override
    public String toString() {
        StringBuilder tabela = new StringBuilder();
        tabela.append("\n");
        tabelaDeSimbolos.forEach((t, s) -> {
            tabela.append("key: ").append(t.toString()).append("\n");
            tabela.append("value: \n");
            tabela.append("\t nome:").append(s.nome).append("\n");
            tabela.append("\t tipo:").append(s.tipo).append("\n\n");
        });

        return tabela.toString();
    }
}
