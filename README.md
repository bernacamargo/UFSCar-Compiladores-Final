# Construção de Compiladores

## Analisador Léxico, Sintático, Semântico e Gerador de Código SQL

Este projeto consiste na implementação de um compilador completo para a linguagem LSQL (Linguagem SQL).
O objetivo desta etapa é elaborar uma linguagem simples e desenvolver o compilador responsável por analisar e apontar os erros léxicos, sintáticos, semânticos e também gerar o código equivalente em querys SQL.

---

### Autores

- Bernardo Camargo [@bernacamargo](https://github.com/bernacamargo) - 620343
- Paulo Betareli [@paulobetareli](https://github.com/paulobetareli) - 587648
- Renata Praisler [@RenataPraisler](https://github.com/RenataPraisler) - 746044

## Como compilar

1. Primeiramente é necessário ter o Java 11 e o [Maven](https://maven.apache.org/index.html) instalados em seu ambiente.
2. Realize o clone do projeto para seu computador
3. Acesse a pasta raiz `./compilador` do repositório pelo terminal
4. Utilize o comando `mvn package` para compilar e gerar as classes Java do ANTLR4 e o pacote com as dependencias .jar
5. O arquivo executável e os arquivos Java gerados na build podem ser localizados na pasta `./compilador/target`.

## Como utilizar

1. É necessário ter o Java 11 instalado
2. Utilize o arquivo executável gerado na compilação ou faça o download do executável [compilador.jar](https://github.com/bernacamargo/UFSCar-Compiladores-Final/raw/main/compilador.jar)
3. Agora basta executar o programa baixado através de um terminal. Para isso utilizaremos o comando `java -jar` juntamente com os seguintes parâmetros:

   - **ARG1:** O caminho absoluto para o arquivo baixado no passo anterior;
   - **ARG2:** O caminho absoluto do arquivo de entrada que contém o código em LSQL;
   - **ARG3:** O caminho absoluto do arquivo de saída.

   <br>

   ```sh
    $ java -jar ARG1 ARG2 ARG3
   ```

   > Os caminhos enviados como parâmetros devem ser **absolutos**!

4. Feito isso será criado o arquivo de saída com a análise lexica, sintatica e semantica do algoritmo de entrada. Caso o compilador não encontre problemas nestas análises, será escrito no arquivo de saída o código em querys SQL relativo ao arquivo de entrada.

### Exemplo para testar o gerador de código:
> O arquivo executável .jar está na pasta raiz do projeto;

-   Comando:

    ```sh
    $ java -jar /home/user/compiladores/UFSCAR-Compiladores-Final/compilador.jar  /home/user/compiladores/UFSCar-Compiladores-Final/Casos\ de\     testes/3.casos_gerador_codigo/1.entrada/8.insere_atualiza_mostra.txt /home/user/compiladores/UFSCar-Compiladores-Final/Casos\ de\ testes/3.casos_gerador_codigo\2.exemplos_codigo_SQL\8.insere_atualiza_mostra.txt
    ```

-   Entrada: 8.insere_atualiza_mostra.txt

    ```
    inicio
       cria Funcionario [
           nome        -> varchar,
           idade       -> inteiro,
           cpf         -> inteiro,
           profissao   -> texto
       ]
       cria Aluno [
           nome        -> varchar,
           ra          -> inteiro,
           curso       -> varchar
       ]

       insere Funcionario nome="Bernardo", cpf=43765478987, idade=41, profissao="Mecânico"
       insere Funcionario nome="Junir", cpf=67812345985, idade=28, profissao="Astronauta"
       insere Funcionario nome="Jose Pedro", cpf=7891875232, idade=34, profissao="Advogado "

       atualiza Funcionario onde nome="Bernardo" e cpf=43765478987 para nome="Beto", profissao="Engenheiro Mecanico"

       atualiza Aluno onde nome="Paulo" e ra=757485 para curso="Economia"

       mostra todos Funcionario onde idade > 17 e idade < 35

    fim
    ```

-   Saída: 8.insere_atualiza_mostra

    ```
      CREATE TABLE Funcionario ( 
         nome VARCHAR(255),
         idade INT,
         cpf INT,
         profissao TEXT
      );

      CREATE TABLE Aluno ( 
         nome VARCHAR(255),
         ra INT,
         curso VARCHAR(255)
      );

      INSERT INTO Funcionario (nome, cpf, idade, profissao) VALUES ("Bernardo", 43765478987, 41, "Mecânico");

      INSERT INTO Funcionario (nome, cpf, idade, profissao) VALUES ("Junir", 67812345985, 28, "Astronauta");

      INSERT INTO Funcionario (nome, cpf, idade, profissao) VALUES ("Jose Pedro", 7891875232, 34, "Advogado ");

      UPDATE Funcionario SET nome = "Beto", profissao = "Engenheiro Mecanico"
         WHERE nome = "Bernardo" AND
         cpf = 43765478987;

      UPDATE Aluno SET curso = "Economia"
         WHERE nome = "Paulo" AND
         ra = 757485;

      SELECT * FROM Funcionario
         WHERE idade > 17 AND
         idade < 35;

    ```
