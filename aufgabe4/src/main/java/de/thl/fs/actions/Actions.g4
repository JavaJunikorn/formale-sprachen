grammar Actions;
@parser::members {
    Map<String, Integer> memory = new HashMap<String, Integer>();

    int eval(int left, int op, int right) {
        switch ( op ) {
        case 4 : return left + right;
        case 5 : return left - right;
        case 2 : return left * right;
        case 3 : return left / right;
    }
    return 0;
  }
}

/** The start rule; begin parsing here*/
prog: stat+
    ;

stat: expr  {System.out.println($expr.value);}
    |ID '=' expr NEWLINE {memory.put($ID.text, $expr.value);}
    |NEWLINE
    ;

expr returns [int value]:
     <assoc=right> a=expr '^' b=expr {$value = (int)Math.pow($a.value, $b.value);}
    | a=expr op=('*'|'/')b=expr {if($op.type == 3)$value = $a.value*$b.value;
                                 else $value = (int)$a.value/$b.value;}
    | a=expr op=('+'|'-')b=expr {if($op.type == 5)$value = $a.value+$b.value;
                                 else $value = (int)$a.value-$b.value;}
    | a=expr op=('=='|'<'|'>') b=expr {if($op.type == 7) $value = $a.value == $b.value ? 1 : 0;
                                       else if($op.type == 8) $value = $a.value < $b.value ? 1 : 0;
                                       else $value = $a.value > $b.value ? 1:0;}
    | a=expr '?' b=expr ':' c=expr {$value= $a.value == 1 ? $b.value : $c.value;}
    | 'if(' a=expr ')' b=expr ' ' 'else' c=expr {$value=$a.value == 1? $b.value : $c.value;}
    | INT {$value = $INT.int;}
    | ID
        {
            String id = $ID.text;
            System.out.println("ID ist: " + id);
            if(id != "clear") {$value = memory.containsKey(id) ? memory.get(id) : 0;}
             memory = new HashMap<String, Integer>();
        }
    | '('expr')'    {$value = $expr.value;}
    ;

    ID: [a-zA-Z]+;
    INT: [0-9]+;
    NEWLINE: '\r'? '\n';
    WS: [\t]+ -> skip;