grammar Listener;

/** The start rule; begin parsing here*/
prog: stat+;

stat: expr #PrintExpr
    |ID '=' expr NEWLINE #Assign
    |NEWLINE #Blank
    ;

expr: <assoc=right> expr '^' expr #Pot
    | expr op=('*'|'/')expr #MULTDIV
    | expr op=('+'|'-')expr #ADDSUB
    | expr op=('=='|'<'|'>') expr #Comp
    | expr '?' expr ':' expr #Ltd
    | INT #INT
    | ID #ID
    | '('expr')' #CLAMS
    ;

    ID: [a-zA-Z]+;
    INT: [0-9]+;
    NEWLINE: '\r'? '\n';
    WS: [\t]+ -> skip;