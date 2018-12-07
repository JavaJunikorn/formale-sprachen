grammar JSON;

json
    :   object
    |   array
    ;
object
    :   '{' pair (',' pair)* '}'    # AnObject
    |   '{' '}'                     # EmptyObject
    ;
pair
    :   STRING ':' value
    ;
array
    :   '[' value (',' value)* ']'  # ArrayOfValues
    |   '[' ']'                     # EmptyArray
    ;
value
    :   STRING      # String
    |   NUMBER      # Atom
    |   object      # ObjectValue
    |   array       # ArrayValue
    |   'true'      # Atom
    |   'false'     # Atom
    |   'null'      # Atom
    ;

STRING
    :   '"' (ESC | ~["\\])* '"'
    ;
NUMBER
    :   '-'? INT '.' INT EXP?
    |   '-'? INT EXP
    |   '-'? INT
    ;
WS
    :   [ \t\n\r]+ -> skip
    ;

fragment ESC
    :   '\\' (["\\/bfnrt] | UNICODE)
    ;
fragment UNICODE
    :   'u' HEX HEX HEX HEX
    ;
fragment HEX
    :   [0-9a-fA-F]
    ;
fragment INT
    :   '0'
    |   [1-9] [0-9]*
    ;
fragment EXP
    :   [Ee] [+\-]? INT
    ;