grammar simple;

program
    : declarations code
    ;
    
declarations
    : HEAD COL RCURL
      ( constantBlock
      | variableBlock
      | functionBlock
      )*
      LCURL
    ;

constantBlock
    : CONST COL RCURL (constDefinition)? LCURL
    ;

constDefinition
    : identifier EQUAL constant SEMI (constDefinition)*
    ;
    
identifier
    : IDENT
    ;
    
constant
    : unsignedNumber
    | sign unsignedNumber
    | string
    ;
    
unsignedNumber
    : NUM_INT
    | NUM_REAL
    ;
    
sign
    : PLUS | MINUS
    ;

string
    : STRING_LITERAL
    ;
    
variableBlock
    : VARS COL RCURL (variableDefinition)? LCURL
    ;
    
variableDefinition
    : atomicDefinition
    | arrayDefinition
    | dictDefinition
    ;
    
atomicDefinition
    : identifier COL type SEMI (variableDefinition)*
    ;    

type
    : NUMBER
    | REAL
    | STRING
    ;
    
arrayDefinition
    : COLLECTION identifier OF NUM_INT COL type SEMI (variableDefinition)*
    ;
    
dictDefinition
    : DICTIONARY identifier OF type COM type SEMI (variableDefinition)*
    ;
    
functionBlock
    : SUBS COL RCURL (functionDefinition)? LCURL
    ;
    
functionDefinition
    : type identifier RPAREN (args)? LPAREN RCURL program LCURL (functionDefinition)*
    ;
    
args
    : type identifier (COM args)*
    ;

variable
    : identifier (RBRACK expression LBRACK | DOT identifier )?
    ;

code
    : BODY COL statementSequence
    ;
    
statementSequence
    : RCURL (statement SEMI)* LCURL
    ;
    
statement
    : assign
    | input
    | output
    | functionCall
    | condition
    | loop
    ;
    
loop
    : WHILE expression statementSequence
    ;
    
condition
    : IF expression statementSequence (ELSE statementSequence)?
    ;
    
input
    : GET variable
    ;
    
output
    : PRINT variable
    ;
    
assign
    : variable ASSIGN expression
    ;
    
expression
    : simpleExpression( (EQUAL | NOT_EQUAL | LT | LE | GE | GT ) simpleExpression )*
    ;

simpleExpression
    : term ( (PLUS | MINUS | OR) term )*
    ;

term
    : signedFactor ( (STAR | SLASH | AND) signedFactor )*
    ;

signedFactor
    : (PLUS|MINUS)? factor
    ;

factor
    : variable
    | LPAREN expression RPAREN
    | functionCall
    | unsignedNumber
    | NOT factor
    ;
    
argsList
    : expression (COM expression)*
    ;
    
functionCall
    : identifier RPAREN (argsList)? LPAREN
    ;
    
    
fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');

BODY
    : B O D Y
    ;
    
HEAD
    : H E A D
    ;
    
CONST
    : C O N S T
    ;
    
VARS
    : V A R S
    ;
    
SUBS
    : S U B S
    ;
    
COLLECTION
    : C O L L E C T I O N
    ;
    
DICTIONARY
    : D I C T I O N A R Y
    ;
    
OF
    : O F
    ;
    
IF
    : I F
    ;
    
ELSE
    : E L S E
    ;
    
NUMBER
    : N U M B E R
    ;

REAL
    : R E A L
    ;
    
STRING
    : S T R I N G
    ;
    
OR
    : O R
    ;
    
AND
    : A N D
    ;
    
PRINT
    : P R I N T
    ;
    
GET
    : G E T
    ;
    
WHILE
    : W H I L E
    ;
    
ASSIGN
    : ':='
    ;
    
RCURL
    : '{'
    ;
    
LCURL
    : '}'
    ;

RPAREN
    : '('
    ;
    
LPAREN
    : ')'
    ;
    
RBRACK
    : '['
    ;
    
LBRACK
    : ']'
    ;
    
COL
    : ':'
    ;
    
SEMI
    : ';'
    ;

COM
    : ','
    ;
    
DOT
    : '.'
    ;
    
EQUAL
    : '='
    ;
    
NOT_EQUAL
    : '!='
    ;
    
NOT
    : '!'
    ;
    
LT
    : '<'
    ;

LE
    : '<='
    ;
    
GT
    : '>'
    ;
    
GE
    : '>='
    ;
        
PLUS
    : '+'
    ;
        
MINUS
    : '-'
    ;
    
STAR
    : '*'
    ;
    
SLASH
    : '/'
    ;
    
IDENT
    : ('a'..'z' | 'A'..'Z')  ('a'..'z'|'A'..'Z' | '0'..'9'| '_')*
    ;
    
NUM_INT
    : ('0'..'9')+
    ;
    
NUM_REAL
    : ('0'..'9')+ '.' ('0'..'9')+
    ;    
    
WS
    : [ \t\r\n]->skip
    ; 
    
STRING_LITERAL
    : '\'' ('\'\'' | ~('\''))* '\''
    ;

COMMENT
    : '^' .*? '^'-> skip
    ;  