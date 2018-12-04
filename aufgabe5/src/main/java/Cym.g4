/** Simple statically-typed programming language with functions and variables
 *  taken from "Language Implementation Patterns" book.
 */
grammar Cym;

file:   (functionDecl | varDecl)+ ;

varDecl
    :   type ID ('=' expr)? ';'
    ;
type:   'float' | 'int' | 'void' ; // user-defined types

functionDecl
    :   type ID '(' formalParameters? ')' block // "void f(int x) {...}"
    ;
formalParameters
    :   formalParameter (',' formalParameter)*
    ;
formalParameter
    :   type ID
    ;

block:  '{' stat* '}' ;   // possibly empty statement block
stat:   block                   #notReturn
    |   varDecl                 #notReturn
    |   'if' expr stat ('else' stat)?       #notReturn// if/else assignement
    |   'return' expr? ';'      #Return
    |   expr '=' expr ';'       #notReturn// assignment
    |   expr ';'                #notReturn// func call
    ;

expr:   ID '(' exprList? ')'    #CallGraphExpr // func call like f(), f(x), f(1,2)
    |   ID '[' expr ']'         #NonCallGraphExpr// array index like a[i], a[i][j]
    |   '-' expr                #NonCallGraphExpr// unary minus
    |   '!' expr                #NonCallGraphExpr// boolean not
    |   expr ('*'|'/') expr     #NonCallGraphExpr
    |   expr ('+'|'-') expr     #NonCallGraphExpr
    |   expr '==' expr          #NonCallGraphExpr// equality comparison (lowest priority op)
    |   expr '!=' expr          #NonCallGraphExpr
    |   expr '<' expr           #NonCallGraphExpr
    |   expr '>' expr           #NonCallGraphExpr
    |   expr '>=' expr          #NonCallGraphExpr
    |   expr '<=' expr          #NonCallGraphExpr
    |   ID                      #NonCallGraphExpr// variable reference
    |   INT                     #NonCallGraphExpr
    |   '(' expr ')'            #NonCallGraphExpr
    ;
exprList : expr (',' expr)* ;   // arg list

ID  :   LETTER (LETTER | [0-9])* ;
fragment
LETTER : [a-zA-Z] ;

INT :   [0-9]+ ;

WS  :   [ \t\n\r]+ -> skip ;

SL_COMMENT
    :   '//' .*? '\n' -> skip
    ;