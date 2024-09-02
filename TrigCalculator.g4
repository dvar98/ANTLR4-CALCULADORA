grammar TrigCalculator;

// Reglas léxicas (tokens)
NUMERO: [0-9]+ ('.' [0-9]+)?;  // Soporte para números enteros y decimales
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
POW: '^';
EQUAL: '=';
LPAREN: '(';
RPAREN: ')';
SIN: 'sin';
COS: 'cos';
TAN: 'tan';

// Manejo de espacios en blanco (opcional)
WS: [ \t\r\n]+ -> skip;  // Ignorar espacios en blanco

// Reglas sintácticas
inicio: (printExpr)* EOF;

printExpr: expresion;

expresion:   termino ((ADD | SUB) termino)*;
termino:     factor ((MUL | DIV) factor)*;
factor:      (SUB)? base (POW factor)?;
base:        NUMERO | LPAREN expresion RPAREN | trigFunc;

trigFunc: (SIN | COS | TAN) LPAREN expresion RPAREN;
