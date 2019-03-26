grammar SpoGrammar;

start: stmt EOF;
stmt: ID Assign e
    | IF Lparen e Rparen stmt Else stmt FI
    | IF Lparen e Rparen stmt FI
    | While Lparen e Rparen DO stmt OD
    | Begin stmts End;
stmts: stmts Semi stmt
    | stmt;
e: e Plus t
    |t;
t: ID | NUM;
Plus: '+';
Lparen: '(';
Rparen: ')';
FI: 'fi';
OD: 'od';
IF: 'if';
Semi: ';';
While: 'while';
Begin: 'begin';
End: 'end';
Else: 'else';
DO: 'do';
Assign: '=';
NUM: [0-9]+;
ID: [a-z]+;

WS  :   (' '|'\r'|'\n'|'\t') -> channel(HIDDEN);
