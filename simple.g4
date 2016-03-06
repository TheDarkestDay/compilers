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
    : DICTIONARY identifier OF type SEMI (variableDefinition)*
    ;
    
functionBlock
    : SUBS COL RCURL (functionDefinition)? LCURL
    ;
    
functionDefinition
    : type identifier RPAREN (args)? LPAREN RCURL functionDecl code LCURL (functionDefinition)*
    ;
    
functionDecl
    : HEAD COL RCURL
      ( constantBlock
      | variableBlock
      )*
      LCURL
    ;
    
args
    : type identifier (COM args)*
    ;

variable
    : identifier (RBRACK simpleExpression LBRACK | DOT identifier )?
    ;
    
code
    : BODY COL RCURL statementSequence (returnStatement)? LCURL
    ;
    
returnStatement
    : RET simpleExpression SEMI
    ;
    
statementSequence
    : ((statement | compStatement) SEMI)*
    ;
    
statement
    : assign
    | input
    | output
    | functionCall
    ;
    
compStatement
    : condition
    | loop
    ;
        
loop
    : WHILE expression RCURL statementSequence LCURL
    ;
    
condition
    : IF expression RCURL statementSequence LCURL (elseBranch)?
    ;
    
elseBranch
    : ELSE RCURL statementSequence LCURL
    ;
    
input
    : GET variable
    ;
    
output
    : PRINT (simpleExpression | string)
    ;
    
assign
    : variable ASSIGN (simpleExpression | string)
    ;
    
expression
    : simpleExpression( relop simpleExpression )*
    ;
    
relop
    : EQUAL | NOT_EQUAL | GT | LT | GE | LE
    ;
    
simpleExpression
    : term ( lowop term )*
    ;
    
lowop
    : PLUS | MINUS | OR
    ;

term
    : signedFactor ( highop signedFactor )*
    ;

highop
    : STAR | SLASH | AND
    ;

signedFactor
    : (PLUS|MINUS)? factor
    ;

factor
    : variable
    | RPAREN simpleExpression LPAREN
    | functionCall
    | unsignedNumber
    | NOT factor
    ;
    
argsList
    : argument (COM argument)*
    ;
    
functionCall
    : identifier RPAREN (argsList)? LPAREN
    ;
    
argument
    : simpleExpression
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
    
RET
    : R E T
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