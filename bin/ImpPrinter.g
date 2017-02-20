tree grammar ImpPrinter;

options {
  language = Java;
  output = template;
  tokenVocab = Imp;
  ASTLabelType = CommonTree;
}

program
    :   ^(PROG recDecl* formDecl* a=methodDef*)
    -> template(a={$a.text}) "<a>"
    ;
    
recDecl
    :   
  (   predDecl
      |   intFuncDecl
    | binIntFuncDecl
      |   lsetFuncDecl
      |   setFuncDecl
      |   msetFuncDecl
    |   relDecl
    | binSetFuncDecl
  )
  ;
    
relDecl
    :
  ^('relation'
    ID
    fst=lVar
    snd=lVar
    p=formula
    (axm=formula)?
   )
  ;
  
predDecl
    :
  ^('pred'
    ID
    lVar
    p=formula
    (axm=formula)?
   )
  ;
  
intFuncDecl
    :
  ^('int-fun'
    ID
    lVar
    p=intDef
   )
  ;
  
binIntFuncDecl
    :
  ^('bin-int-fun'
    ID
    fst=lVar
    snd=lVar
    p=intDef
   )
  ;
  
intDef
    :   ^('default' intCase* intTerm)
  ;

intCase
    :   ^('case' formula intTerm)
  ;
  
lsetFuncDecl
    :
  ^('lset-fun'
    ID
    lVar
    p=lsetDef
   )
  ;
  
lsetDef
    :   ^('default' lsetCase* lsetTerm)
  ;

lsetCase
    :   ^('case' formula lsetTerm)
  ;
  
setFuncDecl
    :
  ^('set-fun'
    ID
    lVar
    p=setDef
   )
  ;
  
binSetFuncDecl
    :
  ^('bin-set-fun'
    ID
    fst=lVar
    snd=lVar
    p=setDef
   )
  ;
  
setDef
    :   ^('default' setCase* setTerm)
  ;

setCase
    :   ^('case' formula setTerm)
  ;
  
msetFuncDecl
    :
  ^('mset-fun'
    ID
    lVar
    p=msetDef
   )
  ;
  
msetDef
    :   ^('default' msetCase* msetTerm)
  ;

msetCase
    :   ^('case' formula msetTerm)
  ;
  
formDecl
  : ^('form' ID
    p=formula)
  ;

methodDef
    :   ^(type 
      ID 
      methodArgs 
      requires 
      ensures
      p=methodBody
      )
  ;
  
methodArgs
    :   ^(
          ARGS
        (arg)+
     )
  ;
  
arg
    :   ^(ITYPE iVar)
  |   ^(LTYPE lVar)
  |   ^(BTYPE bVar)
    ;

type
    :   ITYPE
  |   LTYPE
  |   BTYPE
    ;

requires
    :   ^('requires' p=formula)
  ;

ensures
    :   ^('ensures' p=formula)
  ;
    

methodBody
    :
    ^(SEQ statement*)
    ;
    
statement
    :   (whileLoop | conditional | command | ^(ATOMSTMT methodBody))
    ;
    
mainBody
    :   
    functionCall
    |   whileLoop
    ;
    
whileLoop
    :
    ^('while' boolExp statement)
    |   ^('loop' INT INT INT)
    |   ^('simple-loop' INT INT INT)
    ;
    
conditional
    :
    ^('if'  boolExp statement el?)
    ;
    
el
    :
    ^('else' statement)
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
  ^(STMT atomIntExp )
  ;

assignment
    :   ^( ASSGN ITYPE iVar intExp )
  |   ^( ASSGN LTYPE lVar locExp )
  |   ^( ASSGN BTYPE bVar boolExp )
  |   ^( DEREFASSGN ITYPE iVar dataDeref )
  |   ^( DEREFASSGN LTYPE lVar dirDeref )
  ;
  
mutation
    :   ^(MUTATE LTYPE dirDeref lVar)
  |   ^(MUTATE ITYPE dataDeref iVar)
  ;
  
ret
    :   ( ^(RET LTYPE locExp)
    | ^(RET ITYPE atomIntExp)
    | ^(RET BTYPE atomBoolExp) )
  ;

malloc
    :   ^(MALLOC lVar)
  ;
  
free
    :   ^(FREE lVar)
  ;

assume
    :   ^(ASSUME boolExp)
  ;
  
functionCall
    :   ^(func LTYPE lVar vars)
  |   ^(func ITYPE iVar vars)
  |   ^(func BTYPE bVar vars)
  ;
  
vars
    :    (lVar | iVar) +
  ;

lVars
    :   ^(LVARS (lVar)+)
  ;

iVars
    :   ^(IVARS iVar+)
  ;
  
bVars
    :   ^(BVARS bVar+)
  ;
  
formula
    :   atomForm
  |   ^(binaryConnector atomForm atomForm)
  |   ^(NEG atomForm)
  |   pointsTo
  |   ^(LOCEQ locTerm locTerm)
  |   ^(INTEQ atomIntTerm atomIntTerm)
  |   ^('<' atomIntTerm atomIntTerm)
  |   ^('<=' atomIntTerm atomIntTerm)
  |   ^(SETEQ atomSetTerm atomSetTerm)
  |   ^(LSETEQ atomLsetTerm atomLsetTerm)
  |   ^(MSETEQ atomMsetTerm atomMsetTerm)
  |   ^(INTMEM atomIntTerm atomSetTerm)
  |   ^(LOCMEM locTerm atomLsetTerm)
  |   ^(INTMMEM atomIntTerm atomMsetTerm)
  |   ^(INTSUBSET atomSetTerm atomSetTerm)
  |   ^('lt' atomSetTerm atomSetTerm)
  |   ^('le' atomSetTerm atomSetTerm)
  |   ^('lt-set' atomIntTerm atomSetTerm)
  |   ^('set-lt' atomSetTerm atomIntTerm)
  |   ^('le-set' atomIntTerm atomSetTerm)
  |   ^('set-le' atomSetTerm atomIntTerm)
  |   ^(LOCSUBSET atomLsetTerm atomLsetTerm)
  |   ^(INTMSUBSET atomMsetTerm atomMsetTerm)
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
    :   ^(ATOMBOOL formula)
  |   TRUE
  |   EMP
  |   RESULTFORM
  |   bVar
  |   relRec
  |   rec
  |   ^(OLD formula)
  ;

pointsTo
    :   ^('|->' locTerm fieldVal+)
  ;
  
fieldVal
    :   ^(':' ITYPE field iVar) 
  |   ^(':' LTYPE dir lVar) 
  |   ^(':' SLTYPE dir lVar) 
  |   ^(':' ITYPE field 'virtual' iVar) 
  |   ^(':' LTYPE dir 'virtual' lVar) 
  ;

locTerm returns [String value]
    :   NIL 
  |   RESULTLOC 
  |   lVar
  |   ^(OLD n=locTerm)
  ;
  
intTerm
    :   atomIntTerm
  |   ^('+' atomIntTerm atomIntTerm)
  |   ^('-' atomIntTerm atomIntTerm)
  |   ^('?' atomForm atomIntTerm atomIntTerm)
  ;

atomIntTerm
    :   ^(ATOMINT intTerm)
  |   INT
  |   RESULTINT
  |   iVar
  |   iRec
  |   biRec
  |   BOT
  |   TOP
  |   ^(OLD intTerm)
  ;
  
lsetTerm
    :   atomLsetTerm
  |   ^('lsingleton' locTerm)
  |   ^('lunion' lsetTerm lsetTerm)
  |   ^('lintersection' lsetTerm lsetTerm)
  |   ^('lsetminus' lsetTerm lsetTerm)
  |   ^(OLD lsetTerm)
  ;

atomLsetTerm
    :   'emptylset'
  |   lsVar
  |   rec
  ;
  
setTerm
    :   atomSetTerm
  |   ^('singleton' intTerm)
  |   ^('union' setTerm setTerm)
  |   ^('intersection' setTerm setTerm)
  |   ^('setminus' setTerm setTerm)
  |   ^(OLD setTerm)
  ;

atomSetTerm
    :   'emptyset'
  |   sVar
  |   rec
  ;
  
msetTerm
    :   atomMsetTerm
  |   ^('msingleton' intTerm)
  |   ^('munion' msetTerm msetTerm)
  |   ^('mintersection' msetTerm msetTerm)
  |   ^('msetminus' msetTerm msetTerm)
  |   ^(OLD msetTerm)
  ;

atomMsetTerm
    :   'emptymset'
  |   msVar
  |   rec
  ;
  
relRec
    :   ^(RELREC ID locTerm p=locTerm)
  ;
  
rec
    :   ^(REC ID locTerm)
  ;
  
iRec
    :   ^(IREC ID locTerm)
  ;

biRec
    :   ^(BIREC ID locTerm p=locTerm)
  ;
  
sRec
    :   ^(SREC ID locTerm)
  ;
  
bsRec
    :   ^(BSREC ID locTerm p=locTerm)
  ;
  
lsRec
    :   ^(LSREC ID locTerm)
  ;

msRec
    :   ^(MSREC ID locTerm)
  ;
  
intExp
  :   atomIntExp
  |   ^( ('+' | '-') intExp intExp ) 
  ;

atomIntExp
    :   ^(CONS INT)
  |   iVar
  ;

locExp
    :   NIL
  |   NEW
  |   lVar
  ;

boolExp
    :   atomBoolExp
  |   ^( (AND | OR | EQUALS) atomBoolExp atomBoolExp )
  |   ^(NOT atomBoolExp)
  ;
  
atomBoolExp
    : ^(ATOMBOOL boolExp)
  | ^(LOCEQ locExp locExp)
  | ^(INTEQ intExp intExp)
  | ^('<' intExp intExp)
  | ^('<=' intExp intExp)
  | TRUE
  | bVar
  | ^('cond' atomIntExp)
    ;

dirDeref
    :   ^('.' lVar dir)
  ;

dataDeref
    :   ^('.' lVar field)
  ;
  
iVar
    :   ^(IVAR ID)
    |  ^(IVAR QMARK)
    ;

lVar
    :   ^(LVAR ID)
    |  ^(LVAR QQMARK)
    ;
    
bVar
    :   ^(BVAR ID)
    |  ^(BVAR QMARK)
    ;

sVar
    :   ^(SVAR ID)
    ;
    
lsVar
    :   ^(LSVAR ID)
    ;

msVar
    :   ^(MSVAR ID)
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
