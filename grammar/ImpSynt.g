tree grammar ImpSynt;

options {
  tokenVocab=Imp;
  language = Java;
  output = AST;
  ASTLabelType = CommonTree;
}

@header {
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
}

@members {
  public HashMap<String, String> sorts = new HashMap<String, String>();
  public HashMap<String, Pair<String, CommonTree>> defs = new HashMap<String, Pair<String, CommonTree>>();
  public HashMap<String, Triple<String, String, CommonTree>> axioms = new HashMap<String, Triple<String, String, CommonTree>>();
  public HashMap<String, String> secondVars = new HashMap<String, String>();
  public HashMap<String, HashSet<String>> reqDirs = new HashMap<String, HashSet<String>>();
  public HashMap<String, HashSet<Pair<String, String>>> exLocVars = new HashMap<String, HashSet<Pair<String, String>>>();
  public HashMap<String, HashSet<Pair<String, String>>> exIntVars = new HashMap<String, HashSet<Pair<String, String>>>();
  public HashMap<String, HashSet<Pair<String, String>>> secondExLocVars = new HashMap<String, HashSet<Pair<String, String>>>();
  public HashMap<String, HashSet<Pair<String, String>>> secondExIntVars = new HashMap<String, HashSet<Pair<String, String>>>();
  public HashMap<String, LinkedList<Pair<String, String>>> args = new HashMap<String, LinkedList<Pair<String, String>>>();
  public HashMap<String, String> ret_types = new HashMap<String, String>();
  public HashMap<Integer, String> callees = new HashMap<Integer, String>();
  public HashMap<Integer, LinkedList<String>> call_args = new HashMap<Integer, LinkedList<String>>();
  public HashMap<String, CommonTree> body = new HashMap<String, CommonTree>();
  public HashMap<String, Pair<CommonTree, CommonTree>> requires_ensures = new HashMap<String, Pair<CommonTree, CommonTree>>();
  public HashMap<String, HashSet<String>> olds = new HashMap<String, HashSet<String>>();
  public HashMap<String, HashSet<String>> postRecs = new HashMap<String, HashSet<String>>();
  public HashMap<String, Pair<CommonTree, CommonTree>> pre_post = new HashMap<String, Pair<CommonTree, CommonTree>>();
  public HashMap<String, HashSet<String>> derefVar = new HashMap<String, HashSet<String>>();
  public HashMap<String, HashSet<String>> secondArg = new HashMap<String, HashSet<String>>();
  int callCount;
  String currentVar = "";
  String currentSecondVar = "";
  String currentDef = "";
  String currentBB = "";
  String currentMtd = "";
  public HashMap<Integer, HashSet<String>> currentMod;
  public HashSet<String> currentOlds;
  public HashSet<String> currentPostRecs;
  public boolean oldOn = false;
  public HashMap<String, HashMap<Integer, HashSet<String>>> modifiedVar = new HashMap<String, HashMap<Integer, HashSet<String>>>();
  public HashMap<String, Integer> segNum = new HashMap<String, Integer>();
  public HashMap<String, HashSet<String>> locVars = new HashMap<String, HashSet<String>>();
  public HashMap<String, HashSet<String>> intVars = new HashMap<String, HashSet<String>>();
  public HashMap<String, HashSet<String>> boolVars = new HashMap<String, HashSet<String>>();
  public HashMap<String, HashSet<String>> sVars = new HashMap<String, HashSet<String>>();
  public HashMap<String, HashSet<String>> lsVars = new HashMap<String, HashSet<String>>();
  public HashMap<String, HashSet<String>> msVars = new HashMap<String, HashSet<String>>();
  public HashSet<String> dirs = new HashSet<String>();
  public HashSet<String> fields = new HashSet<String>();
  public HashSet<String> mtds = new HashSet<String>();
  public HashMap<String, LinkedList<CommonTree>> comms = new HashMap<String, LinkedList<CommonTree>>();
  public HashMap<String, CommonTree> forms = new HashMap<String, CommonTree>();
  int reachCount = 0;
  public HashMap<String, Integer> reaches = new HashMap<String, Integer>();
}

public
program
    :   ^(PROG recDecl* formDecl* methodDef* bbDef*)
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
    {
        currentDef = $ID.text;
      reqDirs.put($ID.text, new HashSet<String>());
    }
    fst=lVar
    {
        currentVar = $fst.value;
    }
    snd=lVar
    {
        currentSecondVar = $snd.value;
      exLocVars.put($ID.text, new HashSet<Pair<String, String>>());
      exIntVars.put($ID.text, new HashSet<Pair<String, String>>());
      secondExLocVars.put($ID.text, new HashSet<Pair<String, String>>());
      secondExIntVars.put($ID.text, new HashSet<Pair<String, String>>());
      secondVars.put(currentDef, currentSecondVar);
    }
    p=formula
    (axm=formula {axioms.put($ID.text, new Triple<String, String, CommonTree>(currentVar, currentSecondVar, (CommonTree)axm.getTree()));})?
   )
  {
     sorts.put($ID.text, "relation");
     defs.put($ID.text, new Pair<String, CommonTree>($fst.value, (CommonTree)p.getTree()));
     int code = -1;
     for (String n : reaches.keySet()) {
         if (reqDirs.get(currentDef).equals(reqDirs.get(n)))
           code = reaches.get(n);
     }
     if (code == -1) code = reachCount++;
     reaches.put(currentDef, code);
  }
  ;

predDecl
    :
  ^('pred'
    ID
    {
        currentDef = $ID.text;
      reqDirs.put($ID.text, new HashSet<String>());
    }
    lVar
    {
        currentVar = $lVar.value;
      currentSecondVar = "";
      exLocVars.put($ID.text, new HashSet<Pair<String, String>>());
      exIntVars.put($ID.text, new HashSet<Pair<String, String>>());
      secondExLocVars.put($ID.text, new HashSet<Pair<String, String>>());
      secondExIntVars.put($ID.text, new HashSet<Pair<String, String>>());
    }
    p=formula
    (axm=formula {axioms.put($ID.text, new Triple<String, String, CommonTree>(currentVar, currentSecondVar, (CommonTree)axm.getTree()));})?
   )
  {
     sorts.put($ID.text, "pred");
     defs.put($ID.text, new Pair<String, CommonTree>($lVar.value, (CommonTree)p.getTree()));
     int code = -1;
     for (String n : reaches.keySet()) {
         if (reqDirs.get(currentDef).equals(reqDirs.get(n)))
           code = reaches.get(n);
     }
     if (code == -1) code = reachCount++;
     reaches.put(currentDef, code);
  }
  ;

intFuncDecl
    :
  ^('int-fun'
    ID
    {
        currentDef = $ID.text;
      reqDirs.put($ID.text, new HashSet<String>());
    }
    lVar
    {
        currentVar = $lVar.value;
      currentSecondVar = "";
      exLocVars.put($ID.text, new HashSet<Pair<String, String>>());
      exIntVars.put($ID.text, new HashSet<Pair<String, String>>());
      secondExLocVars.put($ID.text, new HashSet<Pair<String, String>>());
      secondExIntVars.put($ID.text, new HashSet<Pair<String, String>>());
    }
    p=intDef
   )
  {
     sorts.put($ID.text, "int-fun");
     defs.put($ID.text, new Pair<String, CommonTree>($lVar.value, (CommonTree)p.getTree())); 
     int code = -1;
     for (String n : reaches.keySet()) {
         if (reqDirs.get(currentDef).equals(reqDirs.get(n)))
           code = reaches.get(n);
     }
     if (code == -1) code = reachCount++;
     reaches.put(currentDef, code);
  }
  ;

binIntFuncDecl
    :
  ^('bin-int-fun'
    ID
    {
        currentDef = $ID.text;
      reqDirs.put($ID.text, new HashSet<String>());
    }
    fst=lVar
    {
        currentVar = $fst.value;
    }
    snd=lVar
    {
        currentSecondVar = $snd.value;
      exLocVars.put($ID.text, new HashSet<Pair<String, String>>());
      exIntVars.put($ID.text, new HashSet<Pair<String, String>>());
      secondExLocVars.put($ID.text, new HashSet<Pair<String, String>>());
      secondExIntVars.put($ID.text, new HashSet<Pair<String, String>>());
      secondVars.put(currentDef, currentSecondVar);
    }
    p=intDef
   )
  {
     sorts.put($ID.text, "bin-int-def");
     defs.put($ID.text, new Pair<String, CommonTree>($fst.value, (CommonTree)p.getTree()));
     int code = -1;
     for (String n : reaches.keySet()) {
         if (reqDirs.get(currentDef).equals(reqDirs.get(n)))
           code = reaches.get(n);
     }
     if (code == -1) code = reachCount++;
     reaches.put(currentDef, code);
  }
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
    {
        currentDef = $ID.text;
      reqDirs.put($ID.text, new HashSet<String>());
    }
    lVar
    {
        currentVar = $lVar.value;
      currentSecondVar = "";
      exLocVars.put($ID.text, new HashSet<Pair<String, String>>());
      exIntVars.put($ID.text, new HashSet<Pair<String, String>>());
      secondExLocVars.put($ID.text, new HashSet<Pair<String, String>>());
      secondExIntVars.put($ID.text, new HashSet<Pair<String, String>>());
    }
    p=lsetDef
   )
  {
     sorts.put($ID.text, "lset-fun");
     defs.put($ID.text, new Pair<String, CommonTree>($lVar.value, (CommonTree)p.getTree())); 
     int code = -1;
     for (String n : reaches.keySet()) {
         if (reqDirs.get(currentDef).equals(reqDirs.get(n)))
           code = reaches.get(n);
     }
     if (code == -1) code = reachCount++;
     reaches.put(currentDef, code);
  }
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
    {
        currentDef = $ID.text;
      reqDirs.put($ID.text, new HashSet<String>());
    }
    lVar
    {
        currentVar = $lVar.value;
      currentSecondVar = "";
      exLocVars.put($ID.text, new HashSet<Pair<String, String>>());
      exIntVars.put($ID.text, new HashSet<Pair<String, String>>());
      secondExLocVars.put($ID.text, new HashSet<Pair<String, String>>());
      secondExIntVars.put($ID.text, new HashSet<Pair<String, String>>());
    }
    p=setDef
   )
  {
     sorts.put($ID.text, "set-fun");
     defs.put($ID.text, new Pair<String, CommonTree>($lVar.value, (CommonTree)p.getTree())); 
     int code = -1;
     for (String n : reaches.keySet()) {
         if (reqDirs.get(currentDef).equals(reqDirs.get(n)))
           code = reaches.get(n);
     }
     if (code == -1) code = reachCount++;
     reaches.put(currentDef, code);
  }
  ;

binSetFuncDecl
    :
  ^('bin-set-fun'
    ID
    {
        currentDef = $ID.text;
      reqDirs.put($ID.text, new HashSet<String>());
    }
    fst=lVar
    {
        currentVar = $fst.value;
    }
    snd=lVar
    {
        currentSecondVar = $snd.value;
      exLocVars.put($ID.text, new HashSet<Pair<String, String>>());
      exIntVars.put($ID.text, new HashSet<Pair<String, String>>());
      secondExLocVars.put($ID.text, new HashSet<Pair<String, String>>());
      secondExIntVars.put($ID.text, new HashSet<Pair<String, String>>());
      secondVars.put(currentDef, currentSecondVar);
    }
    p=setDef
   )
  {
     sorts.put($ID.text, "bin-set-def");
     defs.put($ID.text, new Pair<String, CommonTree>($fst.value, (CommonTree)p.getTree()));
     int code = -1;
     for (String n : reaches.keySet()) {
         if (reqDirs.get(currentDef).equals(reqDirs.get(n)))
           code = reaches.get(n);
     }
     if (code == -1) code = reachCount++;
     reaches.put(currentDef, code);
  }
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
    {
        currentDef = $ID.text;
      reqDirs.put($ID.text, new HashSet<String>());
    }
    lVar
    {
        currentVar = $lVar.value;
      currentSecondVar = "";
      exLocVars.put($ID.text, new HashSet<Pair<String, String>>());
      exIntVars.put($ID.text, new HashSet<Pair<String, String>>());
      secondExLocVars.put($ID.text, new HashSet<Pair<String, String>>());
      secondExIntVars.put($ID.text, new HashSet<Pair<String, String>>());
    }
    p=msetDef
   )
  {
     sorts.put($ID.text, "mset-fun");
     defs.put($ID.text, new Pair<String, CommonTree>($lVar.value, (CommonTree)p.getTree())); 
     int code = -1;
     for (String n : reaches.keySet()) {
         if (reqDirs.get(currentDef).equals(reqDirs.get(n)))
           code = reaches.get(n);
     }
     if (code == -1) code = reachCount++;
     reaches.put(currentDef, code);
  }
  ;

msetDef
    :   ^('default' msetCase* msetTerm)
  ;

msetCase
    :   ^('case' formula msetTerm)
  ;

formDecl
  : ^('form' ID
    {
      currentBB = $ID.text;
      secondArg.put($ID.text, new HashSet<String>());
      derefVar.put($ID.text, new HashSet<String>());
      locVars.put($ID.text, new HashSet<String>());
      intVars.put($ID.text, new HashSet<String>());
      sVars.put($ID.text, new HashSet<String>());
      lsVars.put($ID.text, new HashSet<String>());
      msVars.put($ID.text, new HashSet<String>());
    }
    p=formula)
    {
      forms.put($ID.text, (CommonTree)p.getTree());
    }
  ;

methodDef
    :   ^(type { currentDef = ""; currentVar = ""; currentSecondVar = ""; } 
      ID 
      {
        mtds.add($ID.text);
        currentMtd = $ID.text;
        currentMod = new HashMap<Integer, HashSet<String>>();
        callCount = 0;
        currentMod.put(callCount, new HashSet<String>());
        currentOlds = new HashSet<String>();
      }
      methodArgs 
      requires 
      {
        currentPostRecs = new HashSet<String>();
      }
      ensures
      {
        postRecs.put($ID.text, currentPostRecs);
      }
      p=methodBody
      )
      {
        body.put($ID.text, (CommonTree)p.getTree());
        ret_types.put($ID.text, $type.value);
        args.put($ID.text, $methodArgs.value); 
        requires_ensures.put($ID.text, new Pair<CommonTree, CommonTree>($requires.value, $ensures.value));
        olds.put($ID.text, currentOlds);
    }
  ;

methodArgs returns [LinkedList<Pair<String, String>> value]
    :   ^(
          ARGS
          { $value = new LinkedList<Pair<String, String>>(); }
        (arg {$value.add($arg.value);})+
     )
  ;

arg returns [Pair<String, String> value]
    :   ^(ITYPE iVar) { $value = new Pair<String, String>($iVar.value, $ITYPE.text); }
  |   ^(LTYPE lVar) { $value = new Pair<String, String>($lVar.value, $LTYPE.text); }
  |   ^(BTYPE bVar) { $value = new Pair<String, String>($bVar.value, $BTYPE.text); }
    ;

type returns [String value]
    :   ITYPE   {$value = $ITYPE.text;}
  |   LTYPE   {$value = $LTYPE.text;}
  |   BTYPE   {$value = $BTYPE.text;}
    ;

requires returns [CommonTree value]
    :   ^('requires' p=formula) { $value = (CommonTree)p.getTree(); }
  ;

ensures returns [CommonTree value]
    :   ^('ensures' p=formula) { $value = (CommonTree)p.getTree(); }
  ;

bbDef
    :   ^(
        'bb'
      ID
      {
          currentDef = "";
        currentVar = "";
        currentSecondVar = "";
          currentBB = $ID.text;
        secondArg.put($ID.text, new HashSet<String>());
        derefVar.put($ID.text, new HashSet<String>());
        locVars.put($ID.text, new HashSet<String>());
        intVars.put($ID.text, new HashSet<String>());
        sVars.put($ID.text, new HashSet<String>());
        lsVars.put($ID.text, new HashSet<String>());
        msVars.put($ID.text, new HashSet<String>());
        currentMod = new HashMap<Integer, HashSet<String>>();
        callCount = 0;
        currentMod.put(callCount, new HashSet<String>());
        comms.put($ID.text, new LinkedList<CommonTree>());
      }
      pre
      post
      basicBlock
     )
       {
         pre_post.put($ID.text, new Pair<CommonTree, CommonTree>($pre.value, $post.value));
       modifiedVar.put($ID.text, currentMod);
       segNum.put($ID.text, ++callCount);
     }
  ;

pre returns [CommonTree value]
    :   ^('pre' p=formula) { $value = (CommonTree)p.getTree(); }
  ;

post returns [CommonTree value]
    :   ^('post' p=formula) { $value = (CommonTree)p.getTree(); }
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

basicBlock
    :   ^(
        BB
      (p=command {
          if (comms.containsKey(currentBB)) comms.get(currentBB).add((CommonTree)p.getTree());
      })*
     )
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
    :   ^( ASSGN ITYPE iVar intExp 
         {
           //intVars[currentBB].put($iVar.value);
       } )
  |   ^( ASSGN LTYPE lVar locExp
         {
           //locVars[currentBB].put($lVar.value);
       } )
  |   ^( ASSGN BTYPE bVar boolExp
         {
           //boolVars[currentBB].put($bVar.value);
       } )
  |   ^( DEREFASSGN ITYPE iVar dataDeref
         {
           //intVars[currentBB].put($iVar.value);
         //locVars[currentBB].put($dataDeref.value);
         //derefVar.get(currentBB).add($dataDeref.value);
       } )
  |   ^( DEREFASSGN LTYPE lVar dirDeref
         {
           //locVars[currentBB].put($lVar.value);
         //locVars[currentBB].put($dirDeref.value);
         //derefVar.get(currentBB).add($dirDeref.value);
       } )
  ;

mutation
    :   ^(MUTATE LTYPE dirDeref lVar)
      {
      //locVars[currentBB].put($dirDeref.value);
        //derefVar.get(currentBB).add($dirDeref.value);
      //locVars[currentBB].put($lVar.value);
      currentMod.get(callCount).add($dirDeref.value);
    }
  |   ^(MUTATE ITYPE dataDeref iVar)
      {
      //locVars[currentBB].put($dataDeref.value);
        //derefVar.get(currentBB).add($dataDeref.value);
      //intVars[currentBB].put($iVar.value);
      currentMod.get(callCount).add($dataDeref.value);
    }
  ;

ret
    :   ( ^(RET LTYPE locExp)
    | ^(RET ITYPE atomIntExp)
    | ^(RET BTYPE atomBoolExp) )
  ;

malloc
    :   ^(MALLOC lVar)
      {
        //locVars[currentBB].put($lVar.value);
      derefVar.get(currentBB).add($lVar.value);
      }
  ;

free
    :   ^(FREE lVar)
  ;

assume
    :   ^(ASSUME boolExp)
  ;

functionCall
    :   ^(func LTYPE lVar vars)
      {
      currentMod.put(callCount, new HashSet<String>());
      //secondArg.get(currentBB).add($lVar.value);
      callees.put(callCount, $func.value);
      call_args.put(callCount, new LinkedList<String>());
      call_args.get(callCount++).add($lVar.value);

      //locVars[currentBB].put(p.value);
      }
  |   ^(func ITYPE iVar vars)
      {
      currentMod.put(callCount, new HashSet<String>());
      callees.put(callCount, $func.value);
      call_args.put(callCount, new LinkedList<String>());
      call_args.get(callCount++).add($iVar.value);

      //intVars[currentBB].put(q.value);
      }
  |   ^(func BTYPE bVar vars)
      {
      currentMod.put(callCount, new HashSet<String>());
      callees.put(callCount, $func.value);
      call_args.put(callCount, new LinkedList<String>());
      call_args.get(callCount++).add($bVar.value);

      //intVars[currentBB].put(q.value);
      }
  ;

vars
    :    (lVar | iVar) +
  ;

lVars
    :   ^(LVARS (lVar {
  //secondArg[currentBB].put($lVar.value);
  })+)
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
  |   rec
  |   {oldOn = true;} ^(OLD formula) {oldOn = false;}
  ;

pointsTo
    :   ^('|->' locTerm fieldVal+)
    {
      if (derefVar.containsKey(currentBB)) derefVar.get(currentBB).add($locTerm.value);
    }
  ;

fieldVal
    :   ^(':' ITYPE field iVar) 
      {
        if (exIntVars.containsKey(currentDef))
        exIntVars.get(currentDef).add(new Pair<String, String>($field.value, $iVar.value));
    }
  |   ^(':' LTYPE dir lVar) 
      {
        if (reqDirs.containsKey(currentDef)) reqDirs.get(currentDef).add($dir.value); 
      if (exLocVars.containsKey(currentDef) && currentVar != $lVar.value && currentSecondVar != $lVar.value)
        exLocVars.get(currentDef).add(new Pair<String, String>($dir.value, $lVar.value));
    }
  |   ^(':' SLTYPE dir lVar) 
      {
      if (exLocVars.containsKey(currentDef) && currentVar != $lVar.value && currentSecondVar != $lVar.value)
        exLocVars.get(currentDef).add(new Pair<String, String>($dir.value, $lVar.value));
    }
  |   ^(':' ITYPE field 'virtual' iVar) 
      {
        if (secondExIntVars.containsKey(currentDef))
        secondExIntVars.get(currentDef).add(new Pair<String, String>($field.value, $iVar.value));
    }
  |   ^(':' LTYPE dir 'virtual' lVar) 
      { 
      if (secondExLocVars.containsKey(currentDef) && currentVar != $lVar.value && currentSecondVar != $lVar.value)
        secondExLocVars.get(currentDef).add(new Pair<String, String>($dir.value, $lVar.value));
    }
  ;

locTerm returns [String value]
    :   NIL { $value = "nil"; }
  |   RESULTLOC { $value = "resultloc"; }
  |   lVar { $value = $lVar.value; }
  |   {oldOn = true;} ^(OLD n=locTerm) { $value = "old_" + $n.value; oldOn = false; }
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
  |   {oldOn = true;} ^(OLD intTerm) {oldOn = false;}
  ;
  
lsetTerm
    :   atomLsetTerm
  |   ^('lsingleton' locTerm)
  |   ^('lunion' lsetTerm lsetTerm)
  |   ^('lintersection' lsetTerm lsetTerm)
  |   ^('lsetminus' lsetTerm lsetTerm)
  |   {oldOn = true;} ^(OLD lsetTerm) {oldOn = false;}
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
  |   {oldOn = true;} ^(OLD setTerm) {oldOn = false;}
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
  |   {oldOn = true;} ^(OLD msetTerm) {oldOn = false;}
  ;

atomMsetTerm
    :   'emptymset'
  |   msVar
  |   rec
  ;

relRec
    :   ^(RELREC ID locTerm p=locTerm
    { 
      if ((!$p.value.equals("nil")) && (!currentBB.equals("")))
        secondArg.get(currentBB).add($p.value);
    })
  ;
  
rec
    :   ^(REC ID locTerm) {
            if (currentPostRecs != null) currentPostRecs.add($ID.text);
            if (oldOn) currentOlds.add($ID.text);
            }
  ;
  
iRec
    :   ^(IREC ID locTerm) {
            if (currentPostRecs != null) currentPostRecs.add($ID.text);
            if (oldOn) currentOlds.add($ID.text);
            }
  ;

biRec
    :   ^(BIREC ID locTerm p=locTerm
    { 
      if ((!$p.value.equals("nil")) && (!currentBB.equals("")))
        secondArg.get(currentBB).add($p.value);
    })
  ;
  
sRec
    :   ^(SREC ID locTerm) {if (oldOn) currentOlds.add($ID.text);}
  ;
  
bsRec
    :   ^(BSREC ID locTerm p=locTerm
    { 
      if ((!$p.value.equals("nil")) && (!currentBB.equals("")))
        secondArg.get(currentBB).add($p.value);
    })
  ;
  
lsRec
    :   ^(LSREC ID locTerm) {if (oldOn) currentOlds.add($ID.text);}
  ;

msRec
    :   ^(MSREC ID locTerm) {if (oldOn) currentOlds.add($ID.text);}
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

dirDeref returns [String value]
    :   ^('.' lVar dir)
      {
        $value = $lVar.value;
    }
  ;

dataDeref returns [String value]
    :   ^('.' lVar field)
      {
        $value = $lVar.value;
    }
  ;

iVar returns [String value]
    :   ^(IVAR ID)
      {
        $value = $ID.text;
      if (intVars.containsKey(currentBB)) intVars.get(currentBB).add($ID.text);
    }
    |  ^(IVAR QMARK) { $value = "??"; }
    ;

lVar returns [String value]
    :   ^(LVAR ID)
      {
        $value = $ID.text;
      if (locVars.containsKey(currentBB)) locVars.get(currentBB).add($ID.text);
    }
    |  ^(LVAR QQMARK) { $value = "???"; }
    ;
    
bVar returns [String value]
    :   ^(BVAR ID)
      {
        $value = $ID.text;
      if (boolVars.containsKey(currentBB)) boolVars.get(currentBB).add($ID.text);
    }
    |  ^(BVAR QMARK) { $value = "??"; }
    ;

sVar returns [String value]
    :   ^(SVAR ID)
      {
        $value = $ID.text;
      if (sVars.containsKey(currentBB)) sVars.get(currentBB).add($ID.text);
    }
    ;

lsVar returns [String value]
    :   ^(LSVAR ID)
      {
        $value = $ID.text;
      if (lsVars.containsKey(currentBB)) lsVars.get(currentBB).add($ID.text);
    }
    ;

msVar returns [String value]
    :   ^(MSVAR ID)
      {
        $value = $ID.text;
      if (msVars.containsKey(currentBB)) msVars.get(currentBB).add($ID.text);
    }
    ;

dir returns [String value]
    :   ID
      {
        dirs.add($ID.text);
      $value = $ID.text;
    }
    |   QMARK
    {
        dirs.add($QMARK.text);
      $value = $QMARK.text;
    }
  ;

field returns [String value]
    :   ID
      {
        fields.add($ID.text);
      $value = $ID.text;
      }
  ;

func returns [String value]
    :   ID
    {
      $value = $ID.text;
    }
  ;
