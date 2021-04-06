grammar LSQL;

INICIO: 'inicio';
FIM: 'fim';
MOSTRA: 'mostra';
CRIA: 'cria';
ONDE: 'onde';
TODOS: 'todos';
DOIS_PONTOS: ':';
OP_MAIS: '+';
OP_MENOS: '-';
OP_MULT: '*';
OP_DIV: '/';
OP_PORCENTAGEM: '%';
OP_MAIOR: '>';
OP_MENOR: '<';
OP_MAIOR_IGUAL: '>=';
OP_MENOR_IGUAL: '<=';
OP_DIFERENTE: '<>';
OP_IGUAL: '=';
ABRE_PARENTESE: '(';
FECHA_PARENTESE: ')';
VIRGULA: ',';
PONTO: '.';
PONTO_E_VIRGULA: ';';
ABRE_COLCHETE: '[';
FECHA_COLCHETE: ']';
SETA: '->';
VERDADEIRO: 'verdadeiro';
FALSO: 'falso';

// tipos
VARCHAR: 'varchar';
LITERAL: 'texto';
INTEIRO: 'inteiro';
REAL: 'real';
LOGICO: 'logico';

IDENT: ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;

COMENTARIO: '{' ~('\n' | '\r' | '}')* '}' -> skip;

ESC_SEQ: '\\"';
CADEIA: '"' (ESC_SEQ | ~('"' | '\n') )* '"';

NUM_INT: ('0'..'9')+;
NUM_REAL: ('0'..'9')+ ('.' ('0'..'9')+)?;

WS: ( ' ' | '\t' | '\r' | '\n') {skip();};
UNDEFINED_CHAR: .;


// gramatica

programa: INICIO corpo FIM EOF;

corpo: cmd*;

cmd: cmd_mostra | cmd_cria;

cmd_cria: CRIA IDENT ABRE_COLCHETE identificador (VIRGULA identificador)* FECHA_COLCHETE;

identificador: IDENT SETA tipos_basicos;

tipos_basicos: LITERAL | INTEIRO | REAL | VARCHAR;

cmd_mostra: MOSTRA colunas IDENT ONDE expressao_relacional (VIRGULA expressao_relacional)*;

colunas: IDENT (VIRGULA IDENT)* | TODOS;

expressao_relacional: expressao_aritmetica (op_relacional expressao_aritmetica);

op_relacional: OP_IGUAL | OP_DIFERENTE | OP_MAIOR_IGUAL | OP_MENOR_IGUAL | OP_MAIOR | OP_MENOR;

expressao_aritmetica: termo (op1 termo)*;

termo: fator (op2 fator)*;

fator: NUM_INT | NUM_REAL;

op1: OP_MAIS | OP_MENOS;

op2: OP_MULT | OP_DIV;