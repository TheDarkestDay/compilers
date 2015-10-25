

grammar test;

program
    : declarations code
    ;
    
declarations
    : HEAD COL LCURL
      ( constantBlock
      | variableBlock
      | functionBlock
      )*
      RCURL
    ;
    
identifier
    : IDENT
    ;
    
constantBlock
    : CONST COL LCURL (constDefinition)? RCURL 
    ;
    
constDefinition
    : identifier EQUAL constant SEMI (constDefinition)*
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
    
COL
    : ':'
    ;
    
SEMI
    : ';'
    ;
    
functionBlock
    : SUB COL LCURL (functionDeclaration) RCURL
    ;
    
functionDeclaration
    : type identifier LPAREN (args)? RPAREN LCURL  RCURL (functionDeclaration)*
    ;
    
args
    : type identifier (COM args)*
    ;
    
type
    : NUMBER
    | REAL
    | STRING
    ;
    
variableBlock
    : VARS COL LCURL (variableDefinition)? RCURL
    ;
    
variableDefinition
    : atomicDefinition
    | arrayDefinition
    | dictDefinition
    ;

atomicDefinition
    : identifier COL type SEMI (atomicDefinition)*
    ;

arrayDefinition
    : COLLECTION identifier OF NUM_INT COL type  SEMI (arrayDefinition)*
    ;
    
dictDefinition
    : DICTIONARY identifier OF type COM type SEMI (dictDefinition)*
    ;


code
    : BODY COL statementsSequence
    ;
    
statementsSequence
    : LCURL (statement)* RCURL
    ;
    
statement
    : assign
    | input
    | output
    | loop
    | condition
    | functionCall
    ;
    
assign
    : variable ASSIGN expression SEMI
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
    
input
    : GET variable SEMI
    ;
    
variable
    : identifier (LBRACK expression RBRACK | DOT identifier )?      
    ;
    
output
    : PRINT variable SEMI
    ;
    
functionCall
    : identifier LPAREN params RPAREN
    ;
    
params
    : variable (COM variable)*
    ;
    
condition
    : IF expression statementsSequence (ELSE statementsSequence)?
    ;

loop
    : WHILE expression statementsSequence
    ;
    
LPAREN
    : '('
    ;
    
RPAREN
    : ')'
    ;
    
LCURL
    : '{'
    ;
    
RCURL
    : '}'
    ;
    
RBRACK
    : ']'
    ;
    
LBRACK
    : '['
    ;
    
DOT
    : '.'
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
    
PLUS
    : '+'
    ;
    
MINUS
    : '-'
    ;
    
SLASH
    : '/'
    ;
    
STAR
    : '*'
    ;
    
EQUAL
    : '='
    ;
    
NOT_EQUAL
    : '!='
    ;

LT
    : '<'
    ;

LE
    : '<='
    ;

GE
    : '>='
    ;

GT
    : '>'
    ;
    
COM
    : ','
    ;
    
ASSIGN
    : ':='
    ;
    
NOT
    : '!'
    ;
    
WS
    : [ \t\r\n]->skip
    ;
    
COMMENT
    : '^' .*? '^'-> skip
    ;    
    
STRING_LITERAL
    : '\'' ('\'\'' | ~('\''))* '\''
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
    
    
IF
    : I F
    ;
    
ELSE
    : E L S E
    ;
    
SUB
    : S U B
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
    
COLLECTION
    : C O L L E C T I O N
    ;
    
OF
    : O F
    ;
    
DICTIONARY
    : D I C T I O N A R Y
    ;
    
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
    
WHILE
    : W H I L E
    ;


PRINT
    : P R I N T
    ;

GET
    : G E T
    ;
    
AND
    : A N D
    ;
    
OR
    : O R
    ;
    