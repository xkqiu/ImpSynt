grammar Imp;

options {
  language = Java;
  output = AST;
  TokenLabelType=CommonToken;
  ASTLabelType=CommonTree;
  backtrack=true;
}

tokens { PROG; ARGS; BB; SEQ; SK; ASSGN; DEREFASSGN; MUTATE; LVARS; IVARS; BVARS; RELREC; REC; IREC; BIREC; SREC; BSREC; LSREC; MSREC;
ATOMSTMT; ATOMBOOL; ATOMINT; LOCEQ; INTEQ; SETEQ; LSETEQ; MSETEQ; INTMEM; LOCMEM; INTMMEM; INTSUBSET; LOCSUBSET; INTMSUBSET;
IVAR; LVAR; BVAR; SVAR; LSVAR; MSVAR; CONS;} // imaginary token

/*
 * Parser Rules
 */

public
program
    :   recDecl* formDecl* methodDef*
      -> ^(PROG recDecl* formDecl* methodDef*)
    ;

formDecl
  : 'form'^ ID ':='! formula ';'!
  ;

methodDef
    :   type ID methodArgs requires ensures '{' methodBody '}'
      -> ^(type ID ^(ARGS methodArgs) requires ensures methodBody)
  ;

methodArgs
    :   '('! arg (','! arg )* ')'!
  ;

arg :   ITYPE^ iVar
    |   LTYPE^ lVar
    |   BTYPE^ bVar
    ;

requires
    :   'requires'^ formula
  ;

ensures
    :   'ensures'^ formula
  ;



methodBody
    :   statement*
    -> ^(SEQ statement*)
    ;
    
statement
    :   whileLoop 
    | conditional 
    | (command ';'!)
    | '{' methodBody '}' -> ^(ATOMSTMT methodBody)
    ;
    
mainBody
    :   
    functionCall
    |   whileLoop
    ;
    
whileLoop
    :
    'while'^ '('! boolExp ')'! statement
    |   'loop'^ '('! INT ','! INT ','! INT ')'! ';'!
    |   'simple-loop'^ '('! INT ','! INT ','! INT ')'! ';'!
    ;
    
conditional
    :
    'if'^ '('! boolExp ')'! statement el?
    ;
    
el
    :
    'else'^ statement
    ;
    

command
  :   assignment
  |   mutation
  |   malloc
  |   free
  |   assume
  |   functionCall
  |   ret
  |   unknownStmt
  ;
  
unknownStmt
  :
  STMT^ '('! atomIntExp ')'!
  ;

assignment
    :   ITYPE iVar ASSGN intExp -> ^(ASSGN ITYPE iVar intExp)
  |   LTYPE lVar ASSGN locExp -> ^(ASSGN LTYPE lVar locExp)
  |   BTYPE bVar ASSGN boolExp -> ^(ASSGN BTYPE bVar boolExp)
  |   ITYPE iVar ASSGN dataDeref  -> ^(DEREFASSGN ITYPE iVar dataDeref)
  |   LTYPE lVar ASSGN dirDeref  -> ^(DEREFASSGN LTYPE lVar dirDeref)
  ;

mutation
    :   ITYPE dataDeref ASSGN iVar -> ^(MUTATE ITYPE dataDeref iVar)
  |   LTYPE dirDeref ASSGN lVar -> ^(MUTATE LTYPE dirDeref lVar)
  ;

ret
    :   ( RET locExp -> ^(RET LTYPE locExp)
  | RET atomIntExp -> ^(RET ITYPE atomIntExp)
  | RET atomBoolExp -> ^(RET BTYPE atomBoolExp) )
  ;

malloc
    :   MALLOC^ lVar
  ;

free
    :   FREE^ lVar
  ;

assume
    :   ASSUME^ boolExp
  ;

functionCall
    :   LTYPE lVar ASSGN! func^ ( '('! vars ')'! )
  |   ITYPE iVar ASSGN! func^ ( '('! vars ')'! )
  |   BTYPE bVar ASSGN! func^ ( '('! vars ')'! )
  ;

vars
    :    (lVar | iVar) ( ','! (lVar | iVar) )*
  ;

lVars
    :    lVar ( ',' lVar )*
       -> ^(LVARS lVar+)
  ;

iVars
    :   ';' iVar ( ',' iVar )*
      -> ^(IVARS iVar+)
  ;
  
bVars
    :   ';' bVar ( ',' bVar )*
      -> ^(BVARS bVar+)
  ;

recDecl
    :   
  (   predDecl
      |   intFuncDecl
    |   binIntFuncDecl
      |   lsetFuncDecl
      |   setFuncDecl
      |   msetFuncDecl
    |   relDecl
    | binSetFuncDecl
  )
  ';'!
  ;

relDecl
    :
  'define'! 'relation'^ ID '!'! '('! lVar ','! lVar ')'! ':'! formula axiom?
  ;

axiom
  :
  'axiom:'! formula
  ;

predDecl
    :
  'define'! 'pred'^ ID '^'! '('! lVar ')'! ':'! formula axiom?
  ;

intFuncDecl
    :
  'define'! 'int-fun'^ ID '^'! '('! lVar ')'! ':'! intDef axiom?
  ;

binIntFuncDecl
    :
  'define'! 'bin-int-fun'^ ID '!'! '('! lVar ','! lVar ')'! ':'! intDef axiom?
  ;

intDef
    :   '('! intCase* 'default'^ ':'! intTerm ')'!
  ;

intCase
    :   'case'^ formula ':'! intTerm ';'!
  ;

lsetFuncDecl
    :
  'define'! 'lset-fun'^ ID '^'! '('! lVar ')'! ':'! lsetDef
  ;

lsetDef
    :   '('! lsetCase* 'default'^ ':'! lsetTerm ')'!
  ;

lsetCase
    :   'case'^ formula ':'! lsetTerm ';'!
  ;

setFuncDecl
    :
  'define'! 'set-fun'^ ID '^'! '('! lVar ')'! ':'! setDef axiom?
  ;

binSetFuncDecl
    :
  'define'! 'bin-set-fun'^ ID '!'! '('! lVar ','! lVar ')'! ':'! setDef axiom?
  ;

setDef
    :   '('! setCase* 'default'^ ':'! setTerm ')'!
  ;

setCase
    :   'case'^ formula ':'! setTerm ';'!
  ;

msetFuncDecl
    :
  'define'! 'mset-fun'^ ID '^'! '('! lVar ')'! ':'! msetDef
  ;

msetDef
    :   '('! msetCase* 'default'^ ':'! msetTerm ')'!
  ;

msetCase
    :   'case'^ formula ':'! msetTerm ';'!
  ;

public
formula
  :   atomForm binaryConnector^ atomForm
  |   NEG^ atomForm
  |   pointsTo
  |   locTerm 'l=' locTerm -> ^(LOCEQ locTerm locTerm)
  |   atomIntTerm 'i=' atomIntTerm -> ^(INTEQ atomIntTerm atomIntTerm)
  |   atomIntTerm '<'^ atomIntTerm
  |   atomIntTerm '<='^ atomIntTerm
  |   atomSetTerm 's=' atomSetTerm -> ^(SETEQ atomSetTerm atomSetTerm)
  |   atomLsetTerm 'ls=' atomLsetTerm -> ^(LSETEQ atomLsetTerm atomLsetTerm)
  |   atomMsetTerm 'ms=' atomMsetTerm -> ^(MSETEQ atomMsetTerm atomMsetTerm)
  |   atomIntTerm 'i-in' atomSetTerm -> ^(INTMEM atomIntTerm atomSetTerm)
  |   locTerm 'l-in' atomLsetTerm -> ^(LOCMEM locTerm atomLsetTerm)
  |   atomIntTerm 'm-in' atomMsetTerm -> ^(INTMMEM atomIntTerm atomMsetTerm)
  |   atomSetTerm 's-subset' atomSetTerm -> ^(INTSUBSET atomSetTerm atomSetTerm)
  |   atomSetTerm 'lt'^ atomSetTerm
  |   atomSetTerm 'le'^ atomSetTerm
  |   atomIntTerm 'lt-set'^ atomSetTerm
  |   atomSetTerm 'set-lt'^ atomIntTerm
  |   atomIntTerm 'le-set'^ atomSetTerm
  |   atomSetTerm 'set-le'^ atomIntTerm
  |   atomLsetTerm 'l-subset' atomLsetTerm -> ^(LOCSUBSET atomLsetTerm atomLsetTerm)
  |   atomMsetTerm 'm-subset' atomMsetTerm -> ^(INTMSUBSET atomMsetTerm atomMsetTerm)
  |   atomForm
  ;

binaryConnector
    :   CONJ
  |   DISJ
  |   IMPLIES
  |   EQUIV
  |   SEPCONJ
  |   SEPIMPL
  ;

atomForm
    :   '(' formula ')' -> ^(ATOMBOOL formula)  
  |   TRUE
  |   EMP
  |   RESULTFORM
  |   relRec
  |   rec
  |   OLD^ '('! formula ')'!
  |   bVar
  ;

pointsTo
    :   (lVar | RESULTLOC) '|->'^ fieldVal (';'! fieldVal)*
  ;

fieldVal
    :   ITYPE field ':'^ 'virtual'? iVar
  |   LTYPE dir ':'^ 'virtual'? lVar
  |   SLTYPE dir ':'^ lVar
  ;

locTerm
    :   NIL
  |   RESULTLOC
  |   lVar
  |   OLD^ '('! locTerm ')'!
  ;

intTerm
  :   atomIntTerm '+'^ atomIntTerm
  |   atomIntTerm '-'^ atomIntTerm
  |   atomForm '?'^ atomIntTerm ':'! atomIntTerm
  |   atomIntTerm
  ;

atomIntTerm
    :  '(' intTerm ')' -> ^(ATOMINT intTerm)  
  |   INT
  |   RESULTINT
  |   iRec
  |   biRec
  |   iVar
  |   BOT
  |   TOP
  |   OLD^ '('! intTerm ')'!
  ;

lsetTerm
    :   atomLsetTerm
  |   '('! 'lsingleton'^ locTerm ')'!
  |   '('! lsetTerm 'lunion'^ lsetTerm ')'!
  |   '('! lsetTerm 'lintersection'^ lsetTerm ')'!
  |   '('! lsetTerm 'lsetminus'^ lsetTerm ')'!
  |   OLD^ '('! lsetTerm ')'!
  ;

atomLsetTerm
    :   'emptylset'
  |   lsVar
  |   lsRec
  ;

setTerm
    :   atomSetTerm
  |   '('! 'singleton'^ intTerm ')'!
  |   '('! setTerm 'union'^ setTerm ')'!
  |   '('! setTerm 'intersection'^ setTerm ')'!
  |   '('! setTerm 'setminus'^ setTerm ')'!
  |   OLD^ '('! setTerm ')'!
  |   RESULTSET
  ;

atomSetTerm
    :   'emptyset'
  |   sVar
  |   sRec
  | bsRec
  ;

msetTerm
    :   atomMsetTerm
  |   '('! 'msingleton'^ setTerm ')'!
  |   '('! msetTerm 'munion'^ msetTerm ')'!
  |   '('! msetTerm 'mintersection'^ msetTerm ')'!
  |   '('! msetTerm 'msetminus'^ msetTerm ')'!
  |   OLD^ '('! msetTerm ')'!
  ;

atomMsetTerm
    :   'emptymset'
  |   msVar
  |   msRec
  ;

boolExp
    :   atomBoolExp (AND | OR | EQUALS)^ atomBoolExp
    |   NOT^ atomBoolExp
    |   atomBoolExp
    ;

atomBoolExp
    : 
    '(' boolExp ')' -> ^(ATOMBOOL boolExp)
    | locExp 'l==' locExp  ->  ^(LOCEQ locExp locExp)
    | atomIntExp 'i==' atomIntExp  ->  ^(INTEQ atomIntExp atomIntExp)
    | atomIntExp '<' atomIntExp    ->  ^('<' atomIntExp atomIntExp)
    | atomIntExp '<=' atomIntExp   ->  ^('<=' atomIntExp atomIntExp)
    | TRUE
    | bVar
    | 'cond'^ '('! atomIntExp ')'!
    ;

intExp
  :   atomIntExp
      (
      ('+' | '-')^ atomIntExp
    )*
  ;

atomIntExp
    :   INT -> ^(CONS INT)
  | iVar
  ;

locExp
    :   NIL
  |   NEW
  |   lVar
  ;

dirDeref
    :   lVar '.'^ dir
  ;

dataDeref
    :   lVar '.'^ field
  ;

iVar :   ID -> ^(IVAR ID)
    |    QMARK -> ^(IVAR QMARK)
    ;

lVar :   ID -> ^(LVAR ID)
    |    QQMARK -> ^(LVAR QQMARK)
    ;
    
bVar :   ID -> ^(BVAR ID)
    |    QMARK -> ^(BVAR QMARK)
    ;

sVar :   ID -> ^(SVAR ID)
    ;

lsVar :   ID -> ^(LSVAR ID)
    ;

msVar :   ID -> ^(MSVAR ID)
    ;

dir
    :   ID
    |   QMARK
  ;

field
    :   ID
  ;

func
    :   ID
  ;

relRec
    :   ID '^' '(' locTerm ',' locTerm ')' -> ^(RELREC ID locTerm locTerm)
  ;

rec
    :   ID '^' '(' locTerm ')' -> ^(REC ID locTerm)
  ;

iRec
    :   ID '^' '(' locTerm ')' -> ^(IREC ID locTerm)
  ;

biRec
    :   ID '^' '(' locTerm ',' locTerm ')' -> ^(BIREC ID locTerm locTerm)
  ;

sRec
    :   ID '^' '(' locTerm ')' -> ^(SREC ID locTerm)
  ;

bsRec
    :   ID '^' '(' locTerm ',' locTerm ')' -> ^(BSREC ID locTerm locTerm)
  ;

lsRec
    :   ID '^' '(' locTerm ')' -> ^(LSREC ID locTerm)
  ;

msRec
    :   ID '^' '(' locTerm ')' -> ^(MSREC ID locTerm)
  ;

type
    :   ITYPE
  |   LTYPE
  |   BTYPE
  ;

/*
 * Lexer Rules
 */

QMARK
  :   '??'
  ;
  
QQMARK
  :   '???'
  ;
  
STMT
  :   'statement'
  ;
  
CONJSYMB
  :   'conj'
  ;
  
EXPSYMB
  :   'exp'
  ;

RESULTFORM
    :   'resultform'
  ;

RESULTLOC
    :   'resultloc'
  ;

RESULTINT
    :   'resultint'
  ;

RESULTSET
    :   'resultset'
  ;

OLD
    :   'old'
  ;

TRUE
    :   'true'
  ;

EMP :   'emp'
    ;

ITYPE
    :   'int'
  ;
LTYPE
    :   'loc'
  ;
  
BTYPE
    :   'bool'
  ;

BOT :   'bot'
    ;

TOP :   'top'
    ;

SLTYPE
    :   'secondary'
  ;

ASSGN
  :   ':='
  ;

MALLOC
  :   'malloc'
  ;

RET
  :   'return'
  ;
  
NEW
  :   'new'
  ;

FREE
  :   'free'
  ;

ASSUME
  :   'assume'
  ;

NIL : 'nil'
    ;

AND :   '&&'
  ;

OR  :   '||'
  ;

NOT :   '!'
  ;

EQUALS
    :   '=='
  ;

CONJ
    :   '&'
    ;

DISJ
    :   '|'
    ;

NEG :   '~'
    ;

IMPLIES
    :   '=>'
    ;

EQUIV
    :   '<=>'
    ;

SEPCONJ
    :   '*'
    ;

SEPIMPL
    :   '-*'
    ;

ID  : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'-'|'_')*
    ;

INT : ('-')? ('1'..'9')* '0'..'9'
    ;

WS
    :
    (' '|'\t'|'\r'|'\n')+ { $channel = HIDDEN; }
  ;
  
COMMENT
    :   '#pragma option' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

