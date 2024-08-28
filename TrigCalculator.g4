grammar TrigCalculator;

stat: expr NEWLINE          # printExpr
    | ID '=' expr NEWLINE   # assign
    | NEWLINE               # blank
    ;

expr: expr op=('*'|'/') expr    # MulDiv
    | expr op=('+'|'-') expr    # AddSub
    | func '(' expr ')'         # trigFunc
    | INT                       # int
    | ID                        # id
    | '(' expr ')'              # parens
    ;

func: 'sin' | 'cos' | 'tan' ;

MUL : '*' ;
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
ID  : [a-zA-Z]+ ;
INT : [0-9]+ ;
NEWLINE: [\r\n]+ ;
WS : [ \t]+ -> skip ;
