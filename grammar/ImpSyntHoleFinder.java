// $ANTLR 3.5.2 ImpSyntHoleFinder.g 2017-01-17 11:05:33

import java.util.LinkedList;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings("all")
public class ImpSyntHoleFinder extends TreeParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARGS", "ASSGN", "ASSUME", 
		"ATOMBOOL", "ATOMINT", "ATOMSTMT", "BB", "BIREC", "BOT", "BSREC", "BTYPE", 
		"BVAR", "BVARS", "COMMENT", "CONJ", "CONJSYMB", "CONS", "DEREFASSGN", 
		"DISJ", "EMP", "EQUALS", "EQUIV", "EXPSYMB", "FREE", "ID", "IMPLIES", 
		"INT", "INTEQ", "INTMEM", "INTMMEM", "INTMSUBSET", "INTSUBSET", "IREC", 
		"ITYPE", "IVAR", "IVARS", "LOCEQ", "LOCMEM", "LOCSUBSET", "LSETEQ", "LSREC", 
		"LSVAR", "LTYPE", "LVAR", "LVARS", "MALLOC", "MSETEQ", "MSREC", "MSVAR", 
		"MUTATE", "NEG", "NEW", "NIL", "NOT", "OLD", "OR", "PROG", "QMARK", "QQMARK", 
		"REC", "RELREC", "RESULTFORM", "RESULTINT", "RESULTLOC", "RESULTSET", 
		"RET", "SEPCONJ", "SEPIMPL", "SEQ", "SETEQ", "SK", "SLTYPE", "SREC", "STMT", 
		"SVAR", "TOP", "TRUE", "WS", "'('", "')'", "'+'", "','", "'-'", "'.'", 
		"':'", "';'", "'<'", "'<='", "'?'", "'^'", "'axiom:'", "'bin-int-fun'", 
		"'bin-set-fun'", "'case'", "'cond'", "'default'", "'define'", "'else'", 
		"'emptylset'", "'emptymset'", "'emptyset'", "'ensures'", "'form'", "'i-in'", 
		"'i='", "'i=='", "'if'", "'int-fun'", "'intersection'", "'l-in'", "'l-subset'", 
		"'l='", "'l=='", "'le'", "'le-set'", "'lintersection'", "'loop'", "'ls='", 
		"'lset-fun'", "'lsetminus'", "'lsingleton'", "'lt'", "'lt-set'", "'lunion'", 
		"'m-in'", "'m-subset'", "'mintersection'", "'ms='", "'mset-fun'", "'msetminus'", 
		"'msingleton'", "'munion'", "'pred'", "'relation'", "'requires'", "'s-subset'", 
		"'s='", "'set-fun'", "'set-le'", "'set-lt'", "'setminus'", "'simple-loop'", 
		"'singleton'", "'union'", "'virtual'", "'while'", "'{'", "'|->'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int T__92=92;
	public static final int T__93=93;
	public static final int T__94=94;
	public static final int T__95=95;
	public static final int T__96=96;
	public static final int T__97=97;
	public static final int T__98=98;
	public static final int T__99=99;
	public static final int T__100=100;
	public static final int T__101=101;
	public static final int T__102=102;
	public static final int T__103=103;
	public static final int T__104=104;
	public static final int T__105=105;
	public static final int T__106=106;
	public static final int T__107=107;
	public static final int T__108=108;
	public static final int T__109=109;
	public static final int T__110=110;
	public static final int T__111=111;
	public static final int T__112=112;
	public static final int T__113=113;
	public static final int T__114=114;
	public static final int T__115=115;
	public static final int T__116=116;
	public static final int T__117=117;
	public static final int T__118=118;
	public static final int T__119=119;
	public static final int T__120=120;
	public static final int T__121=121;
	public static final int T__122=122;
	public static final int T__123=123;
	public static final int T__124=124;
	public static final int T__125=125;
	public static final int T__126=126;
	public static final int T__127=127;
	public static final int T__128=128;
	public static final int T__129=129;
	public static final int T__130=130;
	public static final int T__131=131;
	public static final int T__132=132;
	public static final int T__133=133;
	public static final int T__134=134;
	public static final int T__135=135;
	public static final int T__136=136;
	public static final int T__137=137;
	public static final int T__138=138;
	public static final int T__139=139;
	public static final int T__140=140;
	public static final int T__141=141;
	public static final int T__142=142;
	public static final int T__143=143;
	public static final int T__144=144;
	public static final int T__145=145;
	public static final int T__146=146;
	public static final int T__147=147;
	public static final int T__148=148;
	public static final int T__149=149;
	public static final int T__150=150;
	public static final int T__151=151;
	public static final int T__152=152;
	public static final int T__153=153;
	public static final int AND=4;
	public static final int ARGS=5;
	public static final int ASSGN=6;
	public static final int ASSUME=7;
	public static final int ATOMBOOL=8;
	public static final int ATOMINT=9;
	public static final int ATOMSTMT=10;
	public static final int BB=11;
	public static final int BIREC=12;
	public static final int BOT=13;
	public static final int BSREC=14;
	public static final int BTYPE=15;
	public static final int BVAR=16;
	public static final int BVARS=17;
	public static final int COMMENT=18;
	public static final int CONJ=19;
	public static final int CONJSYMB=20;
	public static final int CONS=21;
	public static final int DEREFASSGN=22;
	public static final int DISJ=23;
	public static final int EMP=24;
	public static final int EQUALS=25;
	public static final int EQUIV=26;
	public static final int EXPSYMB=27;
	public static final int FREE=28;
	public static final int ID=29;
	public static final int IMPLIES=30;
	public static final int INT=31;
	public static final int INTEQ=32;
	public static final int INTMEM=33;
	public static final int INTMMEM=34;
	public static final int INTMSUBSET=35;
	public static final int INTSUBSET=36;
	public static final int IREC=37;
	public static final int ITYPE=38;
	public static final int IVAR=39;
	public static final int IVARS=40;
	public static final int LOCEQ=41;
	public static final int LOCMEM=42;
	public static final int LOCSUBSET=43;
	public static final int LSETEQ=44;
	public static final int LSREC=45;
	public static final int LSVAR=46;
	public static final int LTYPE=47;
	public static final int LVAR=48;
	public static final int LVARS=49;
	public static final int MALLOC=50;
	public static final int MSETEQ=51;
	public static final int MSREC=52;
	public static final int MSVAR=53;
	public static final int MUTATE=54;
	public static final int NEG=55;
	public static final int NEW=56;
	public static final int NIL=57;
	public static final int NOT=58;
	public static final int OLD=59;
	public static final int OR=60;
	public static final int PROG=61;
	public static final int QMARK=62;
	public static final int QQMARK=63;
	public static final int REC=64;
	public static final int RELREC=65;
	public static final int RESULTFORM=66;
	public static final int RESULTINT=67;
	public static final int RESULTLOC=68;
	public static final int RESULTSET=69;
	public static final int RET=70;
	public static final int SEPCONJ=71;
	public static final int SEPIMPL=72;
	public static final int SEQ=73;
	public static final int SETEQ=74;
	public static final int SK=75;
	public static final int SLTYPE=76;
	public static final int SREC=77;
	public static final int STMT=78;
	public static final int SVAR=79;
	public static final int TOP=80;
	public static final int TRUE=81;
	public static final int WS=82;

	// delegates
	public TreeParser[] getDelegates() {
		return new TreeParser[] {};
	}

	// delegators


	public ImpSyntHoleFinder(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public ImpSyntHoleFinder(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return ImpSyntHoleFinder.tokenNames; }
	@Override public String getGrammarFileName() { return "ImpSyntHoleFinder.g"; }


	  public LinkedList<Integer> unknownLocs = new LinkedList<Integer>();
	  public LinkedList<Integer> unknownInts = new LinkedList<Integer>();
	  public LinkedList<Tree> unknownConds = new LinkedList<Tree>();
	  public LinkedList<Tree> unknownStmts = new LinkedList<Tree>();
	  public LinkedList<Tree> unknownLoops = new LinkedList<Tree>();
	  public LinkedList<Tree> unknownSimpleLoops = new LinkedList<Tree>();
	  public LinkedList<Integer> unknownNew = new LinkedList<Integer>();
	  public LinkedList<Integer> loopLocs = new LinkedList<Integer>();
	  public boolean inFunction = false;
	  public int order = 0;
	  public int bbSize = 0;


	public static class program_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "program"
	// ImpSyntHoleFinder.g:28:1: program : ^( PROG ( recDecl )* ( formDecl )* (a= methodDef )* ) ;
	public final ImpSyntHoleFinder.program_return program() throws RecognitionException {
		ImpSyntHoleFinder.program_return retval = new ImpSyntHoleFinder.program_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree PROG1=null;
		TreeRuleReturnScope a =null;
		TreeRuleReturnScope recDecl2 =null;
		TreeRuleReturnScope formDecl3 =null;

		CommonTree PROG1_tree=null;

		try {
			// ImpSyntHoleFinder.g:29:5: ( ^( PROG ( recDecl )* ( formDecl )* (a= methodDef )* ) )
			// ImpSyntHoleFinder.g:29:9: ^( PROG ( recDecl )* ( formDecl )* (a= methodDef )* )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			PROG1=(CommonTree)match(input,PROG,FOLLOW_PROG_in_program72); 
			PROG1_tree = (CommonTree)adaptor.dupNode(PROG1);


			root_1 = (CommonTree)adaptor.becomeRoot(PROG1_tree, root_1);

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// ImpSyntHoleFinder.g:29:16: ( recDecl )*
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( ((LA1_0 >= 96 && LA1_0 <= 97)||LA1_0==112||LA1_0==123||LA1_0==133||(LA1_0 >= 137 && LA1_0 <= 138)||LA1_0==142) ) {
						alt1=1;
					}

					switch (alt1) {
					case 1 :
						// ImpSyntHoleFinder.g:29:16: recDecl
						{
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_recDecl_in_program74);
						recDecl2=recDecl();
						state._fsp--;

						adaptor.addChild(root_1, recDecl2.getTree());

						}
						break;

					default :
						break loop1;
					}
				}

				// ImpSyntHoleFinder.g:29:25: ( formDecl )*
				loop2:
				while (true) {
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==107) ) {
						alt2=1;
					}

					switch (alt2) {
					case 1 :
						// ImpSyntHoleFinder.g:29:25: formDecl
						{
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_formDecl_in_program77);
						formDecl3=formDecl();
						state._fsp--;

						adaptor.addChild(root_1, formDecl3.getTree());

						}
						break;

					default :
						break loop2;
					}
				}

				// ImpSyntHoleFinder.g:29:36: (a= methodDef )*
				loop3:
				while (true) {
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==BTYPE||LA3_0==ITYPE||LA3_0==LTYPE) ) {
						alt3=1;
					}

					switch (alt3) {
					case 1 :
						// ImpSyntHoleFinder.g:29:36: a= methodDef
						{
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_methodDef_in_program82);
						a=methodDef();
						state._fsp--;

						adaptor.addChild(root_1, a.getTree());

						}
						break;

					default :
						break loop3;
					}
				}

				match(input, Token.UP, null); 
			}
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class recDecl_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "recDecl"
	// ImpSyntHoleFinder.g:32:1: recDecl : ( predDecl | intFuncDecl | binIntFuncDecl | lsetFuncDecl | setFuncDecl | msetFuncDecl | relDecl | binSetFuncDecl ) ;
	public final ImpSyntHoleFinder.recDecl_return recDecl() throws RecognitionException {
		ImpSyntHoleFinder.recDecl_return retval = new ImpSyntHoleFinder.recDecl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope predDecl4 =null;
		TreeRuleReturnScope intFuncDecl5 =null;
		TreeRuleReturnScope binIntFuncDecl6 =null;
		TreeRuleReturnScope lsetFuncDecl7 =null;
		TreeRuleReturnScope setFuncDecl8 =null;
		TreeRuleReturnScope msetFuncDecl9 =null;
		TreeRuleReturnScope relDecl10 =null;
		TreeRuleReturnScope binSetFuncDecl11 =null;


		try {
			// ImpSyntHoleFinder.g:33:5: ( ( predDecl | intFuncDecl | binIntFuncDecl | lsetFuncDecl | setFuncDecl | msetFuncDecl | relDecl | binSetFuncDecl ) )
			// ImpSyntHoleFinder.g:34:3: ( predDecl | intFuncDecl | binIntFuncDecl | lsetFuncDecl | setFuncDecl | msetFuncDecl | relDecl | binSetFuncDecl )
			{
			root_0 = (CommonTree)adaptor.nil();


			// ImpSyntHoleFinder.g:34:3: ( predDecl | intFuncDecl | binIntFuncDecl | lsetFuncDecl | setFuncDecl | msetFuncDecl | relDecl | binSetFuncDecl )
			int alt4=8;
			switch ( input.LA(1) ) {
			case 137:
				{
				alt4=1;
				}
				break;
			case 112:
				{
				alt4=2;
				}
				break;
			case 96:
				{
				alt4=3;
				}
				break;
			case 123:
				{
				alt4=4;
				}
				break;
			case 142:
				{
				alt4=5;
				}
				break;
			case 133:
				{
				alt4=6;
				}
				break;
			case 138:
				{
				alt4=7;
				}
				break;
			case 97:
				{
				alt4=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// ImpSyntHoleFinder.g:34:7: predDecl
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_predDecl_in_recDecl114);
					predDecl4=predDecl();
					state._fsp--;

					adaptor.addChild(root_0, predDecl4.getTree());

					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:35:11: intFuncDecl
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_intFuncDecl_in_recDecl126);
					intFuncDecl5=intFuncDecl();
					state._fsp--;

					adaptor.addChild(root_0, intFuncDecl5.getTree());

					}
					break;
				case 3 :
					// ImpSyntHoleFinder.g:36:7: binIntFuncDecl
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_binIntFuncDecl_in_recDecl134);
					binIntFuncDecl6=binIntFuncDecl();
					state._fsp--;

					adaptor.addChild(root_0, binIntFuncDecl6.getTree());

					}
					break;
				case 4 :
					// ImpSyntHoleFinder.g:37:11: lsetFuncDecl
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lsetFuncDecl_in_recDecl146);
					lsetFuncDecl7=lsetFuncDecl();
					state._fsp--;

					adaptor.addChild(root_0, lsetFuncDecl7.getTree());

					}
					break;
				case 5 :
					// ImpSyntHoleFinder.g:38:11: setFuncDecl
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_setFuncDecl_in_recDecl158);
					setFuncDecl8=setFuncDecl();
					state._fsp--;

					adaptor.addChild(root_0, setFuncDecl8.getTree());

					}
					break;
				case 6 :
					// ImpSyntHoleFinder.g:39:11: msetFuncDecl
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_msetFuncDecl_in_recDecl170);
					msetFuncDecl9=msetFuncDecl();
					state._fsp--;

					adaptor.addChild(root_0, msetFuncDecl9.getTree());

					}
					break;
				case 7 :
					// ImpSyntHoleFinder.g:40:9: relDecl
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_relDecl_in_recDecl180);
					relDecl10=relDecl();
					state._fsp--;

					adaptor.addChild(root_0, relDecl10.getTree());

					}
					break;
				case 8 :
					// ImpSyntHoleFinder.g:41:7: binSetFuncDecl
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_binSetFuncDecl_in_recDecl188);
					binSetFuncDecl11=binSetFuncDecl();
					state._fsp--;

					adaptor.addChild(root_0, binSetFuncDecl11.getTree());

					}
					break;

			}

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "recDecl"


	public static class relDecl_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "relDecl"
	// ImpSyntHoleFinder.g:45:1: relDecl : ^( 'relation' ID fst= lVar snd= lVar p= formula (axm= formula )? ) ;
	public final ImpSyntHoleFinder.relDecl_return relDecl() throws RecognitionException {
		ImpSyntHoleFinder.relDecl_return retval = new ImpSyntHoleFinder.relDecl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal12=null;
		CommonTree ID13=null;
		TreeRuleReturnScope fst =null;
		TreeRuleReturnScope snd =null;
		TreeRuleReturnScope p =null;
		TreeRuleReturnScope axm =null;

		CommonTree string_literal12_tree=null;
		CommonTree ID13_tree=null;

		try {
			// ImpSyntHoleFinder.g:46:5: ( ^( 'relation' ID fst= lVar snd= lVar p= formula (axm= formula )? ) )
			// ImpSyntHoleFinder.g:47:3: ^( 'relation' ID fst= lVar snd= lVar p= formula (axm= formula )? )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal12=(CommonTree)match(input,138,FOLLOW_138_in_relDecl214); 
			string_literal12_tree = (CommonTree)adaptor.dupNode(string_literal12);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal12_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID13=(CommonTree)match(input,ID,FOLLOW_ID_in_relDecl220); 
			ID13_tree = (CommonTree)adaptor.dupNode(ID13);


			adaptor.addChild(root_1, ID13_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_lVar_in_relDecl228);
			fst=lVar();
			state._fsp--;

			adaptor.addChild(root_1, fst.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_lVar_in_relDecl236);
			snd=lVar();
			state._fsp--;

			adaptor.addChild(root_1, snd.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_formula_in_relDecl244);
			p=formula();
			state._fsp--;

			adaptor.addChild(root_1, p.getTree());

			// ImpSyntHoleFinder.g:52:5: (axm= formula )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ATOMBOOL||LA5_0==BVAR||LA5_0==CONJ||(LA5_0 >= DISJ && LA5_0 <= EMP)||LA5_0==EQUIV||LA5_0==IMPLIES||(LA5_0 >= INTEQ && LA5_0 <= INTSUBSET)||(LA5_0 >= LOCEQ && LA5_0 <= LSETEQ)||LA5_0==MSETEQ||LA5_0==NEG||LA5_0==OLD||(LA5_0 >= REC && LA5_0 <= RESULTFORM)||(LA5_0 >= SEPCONJ && LA5_0 <= SEPIMPL)||LA5_0==SETEQ||LA5_0==TRUE||(LA5_0 >= 91 && LA5_0 <= 92)||(LA5_0 >= 118 && LA5_0 <= 119)||(LA5_0 >= 126 && LA5_0 <= 127)||(LA5_0 >= 143 && LA5_0 <= 144)||LA5_0==152) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// ImpSyntHoleFinder.g:52:6: axm= formula
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_formula_in_relDecl253);
					axm=formula();
					state._fsp--;

					adaptor.addChild(root_1, axm.getTree());

					}
					break;

			}

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relDecl"


	public static class predDecl_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "predDecl"
	// ImpSyntHoleFinder.g:56:1: predDecl : ^( 'pred' ID lVar p= formula (axm= formula )? ) ;
	public final ImpSyntHoleFinder.predDecl_return predDecl() throws RecognitionException {
		ImpSyntHoleFinder.predDecl_return retval = new ImpSyntHoleFinder.predDecl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal14=null;
		CommonTree ID15=null;
		TreeRuleReturnScope p =null;
		TreeRuleReturnScope axm =null;
		TreeRuleReturnScope lVar16 =null;

		CommonTree string_literal14_tree=null;
		CommonTree ID15_tree=null;

		try {
			// ImpSyntHoleFinder.g:57:5: ( ^( 'pred' ID lVar p= formula (axm= formula )? ) )
			// ImpSyntHoleFinder.g:58:3: ^( 'pred' ID lVar p= formula (axm= formula )? )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal14=(CommonTree)match(input,137,FOLLOW_137_in_predDecl280); 
			string_literal14_tree = (CommonTree)adaptor.dupNode(string_literal14);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal14_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID15=(CommonTree)match(input,ID,FOLLOW_ID_in_predDecl286); 
			ID15_tree = (CommonTree)adaptor.dupNode(ID15);


			adaptor.addChild(root_1, ID15_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_lVar_in_predDecl292);
			lVar16=lVar();
			state._fsp--;

			adaptor.addChild(root_1, lVar16.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_formula_in_predDecl300);
			p=formula();
			state._fsp--;

			adaptor.addChild(root_1, p.getTree());

			// ImpSyntHoleFinder.g:62:5: (axm= formula )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==ATOMBOOL||LA6_0==BVAR||LA6_0==CONJ||(LA6_0 >= DISJ && LA6_0 <= EMP)||LA6_0==EQUIV||LA6_0==IMPLIES||(LA6_0 >= INTEQ && LA6_0 <= INTSUBSET)||(LA6_0 >= LOCEQ && LA6_0 <= LSETEQ)||LA6_0==MSETEQ||LA6_0==NEG||LA6_0==OLD||(LA6_0 >= REC && LA6_0 <= RESULTFORM)||(LA6_0 >= SEPCONJ && LA6_0 <= SEPIMPL)||LA6_0==SETEQ||LA6_0==TRUE||(LA6_0 >= 91 && LA6_0 <= 92)||(LA6_0 >= 118 && LA6_0 <= 119)||(LA6_0 >= 126 && LA6_0 <= 127)||(LA6_0 >= 143 && LA6_0 <= 144)||LA6_0==152) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// ImpSyntHoleFinder.g:62:6: axm= formula
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_formula_in_predDecl309);
					axm=formula();
					state._fsp--;

					adaptor.addChild(root_1, axm.getTree());

					}
					break;

			}

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "predDecl"


	public static class intFuncDecl_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "intFuncDecl"
	// ImpSyntHoleFinder.g:66:1: intFuncDecl : ^( 'int-fun' ID lVar p= intDef ) ;
	public final ImpSyntHoleFinder.intFuncDecl_return intFuncDecl() throws RecognitionException {
		ImpSyntHoleFinder.intFuncDecl_return retval = new ImpSyntHoleFinder.intFuncDecl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal17=null;
		CommonTree ID18=null;
		TreeRuleReturnScope p =null;
		TreeRuleReturnScope lVar19 =null;

		CommonTree string_literal17_tree=null;
		CommonTree ID18_tree=null;

		try {
			// ImpSyntHoleFinder.g:67:5: ( ^( 'int-fun' ID lVar p= intDef ) )
			// ImpSyntHoleFinder.g:68:3: ^( 'int-fun' ID lVar p= intDef )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal17=(CommonTree)match(input,112,FOLLOW_112_in_intFuncDecl336); 
			string_literal17_tree = (CommonTree)adaptor.dupNode(string_literal17);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal17_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID18=(CommonTree)match(input,ID,FOLLOW_ID_in_intFuncDecl342); 
			ID18_tree = (CommonTree)adaptor.dupNode(ID18);


			adaptor.addChild(root_1, ID18_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_lVar_in_intFuncDecl348);
			lVar19=lVar();
			state._fsp--;

			adaptor.addChild(root_1, lVar19.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_intDef_in_intFuncDecl356);
			p=intDef();
			state._fsp--;

			adaptor.addChild(root_1, p.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "intFuncDecl"


	public static class binIntFuncDecl_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "binIntFuncDecl"
	// ImpSyntHoleFinder.g:75:1: binIntFuncDecl : ^( 'bin-int-fun' ID fst= lVar snd= lVar p= intDef ) ;
	public final ImpSyntHoleFinder.binIntFuncDecl_return binIntFuncDecl() throws RecognitionException {
		ImpSyntHoleFinder.binIntFuncDecl_return retval = new ImpSyntHoleFinder.binIntFuncDecl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal20=null;
		CommonTree ID21=null;
		TreeRuleReturnScope fst =null;
		TreeRuleReturnScope snd =null;
		TreeRuleReturnScope p =null;

		CommonTree string_literal20_tree=null;
		CommonTree ID21_tree=null;

		try {
			// ImpSyntHoleFinder.g:76:5: ( ^( 'bin-int-fun' ID fst= lVar snd= lVar p= intDef ) )
			// ImpSyntHoleFinder.g:77:3: ^( 'bin-int-fun' ID fst= lVar snd= lVar p= intDef )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal20=(CommonTree)match(input,96,FOLLOW_96_in_binIntFuncDecl381); 
			string_literal20_tree = (CommonTree)adaptor.dupNode(string_literal20);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal20_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID21=(CommonTree)match(input,ID,FOLLOW_ID_in_binIntFuncDecl387); 
			ID21_tree = (CommonTree)adaptor.dupNode(ID21);


			adaptor.addChild(root_1, ID21_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_lVar_in_binIntFuncDecl395);
			fst=lVar();
			state._fsp--;

			adaptor.addChild(root_1, fst.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_lVar_in_binIntFuncDecl403);
			snd=lVar();
			state._fsp--;

			adaptor.addChild(root_1, snd.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_intDef_in_binIntFuncDecl411);
			p=intDef();
			state._fsp--;

			adaptor.addChild(root_1, p.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "binIntFuncDecl"


	public static class intDef_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "intDef"
	// ImpSyntHoleFinder.g:85:1: intDef : ^( 'default' ( intCase )* intTerm ) ;
	public final ImpSyntHoleFinder.intDef_return intDef() throws RecognitionException {
		ImpSyntHoleFinder.intDef_return retval = new ImpSyntHoleFinder.intDef_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal22=null;
		TreeRuleReturnScope intCase23 =null;
		TreeRuleReturnScope intTerm24 =null;

		CommonTree string_literal22_tree=null;

		try {
			// ImpSyntHoleFinder.g:86:5: ( ^( 'default' ( intCase )* intTerm ) )
			// ImpSyntHoleFinder.g:86:9: ^( 'default' ( intCase )* intTerm )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal22=(CommonTree)match(input,100,FOLLOW_100_in_intDef436); 
			string_literal22_tree = (CommonTree)adaptor.dupNode(string_literal22);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal22_tree, root_1);

			match(input, Token.DOWN, null); 
			// ImpSyntHoleFinder.g:86:21: ( intCase )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==98) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// ImpSyntHoleFinder.g:86:21: intCase
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_intCase_in_intDef438);
					intCase23=intCase();
					state._fsp--;

					adaptor.addChild(root_1, intCase23.getTree());

					}
					break;

				default :
					break loop7;
				}
			}

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_intTerm_in_intDef441);
			intTerm24=intTerm();
			state._fsp--;

			adaptor.addChild(root_1, intTerm24.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "intDef"


	public static class intCase_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "intCase"
	// ImpSyntHoleFinder.g:89:1: intCase : ^( 'case' formula intTerm ) ;
	public final ImpSyntHoleFinder.intCase_return intCase() throws RecognitionException {
		ImpSyntHoleFinder.intCase_return retval = new ImpSyntHoleFinder.intCase_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal25=null;
		TreeRuleReturnScope formula26 =null;
		TreeRuleReturnScope intTerm27 =null;

		CommonTree string_literal25_tree=null;

		try {
			// ImpSyntHoleFinder.g:90:5: ( ^( 'case' formula intTerm ) )
			// ImpSyntHoleFinder.g:90:9: ^( 'case' formula intTerm )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal25=(CommonTree)match(input,98,FOLLOW_98_in_intCase460); 
			string_literal25_tree = (CommonTree)adaptor.dupNode(string_literal25);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal25_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_formula_in_intCase462);
			formula26=formula();
			state._fsp--;

			adaptor.addChild(root_1, formula26.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_intTerm_in_intCase464);
			intTerm27=intTerm();
			state._fsp--;

			adaptor.addChild(root_1, intTerm27.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "intCase"


	public static class lsetFuncDecl_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "lsetFuncDecl"
	// ImpSyntHoleFinder.g:93:1: lsetFuncDecl : ^( 'lset-fun' ID lVar p= lsetDef ) ;
	public final ImpSyntHoleFinder.lsetFuncDecl_return lsetFuncDecl() throws RecognitionException {
		ImpSyntHoleFinder.lsetFuncDecl_return retval = new ImpSyntHoleFinder.lsetFuncDecl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal28=null;
		CommonTree ID29=null;
		TreeRuleReturnScope p =null;
		TreeRuleReturnScope lVar30 =null;

		CommonTree string_literal28_tree=null;
		CommonTree ID29_tree=null;

		try {
			// ImpSyntHoleFinder.g:94:5: ( ^( 'lset-fun' ID lVar p= lsetDef ) )
			// ImpSyntHoleFinder.g:95:3: ^( 'lset-fun' ID lVar p= lsetDef )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal28=(CommonTree)match(input,123,FOLLOW_123_in_lsetFuncDecl485); 
			string_literal28_tree = (CommonTree)adaptor.dupNode(string_literal28);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal28_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID29=(CommonTree)match(input,ID,FOLLOW_ID_in_lsetFuncDecl491); 
			ID29_tree = (CommonTree)adaptor.dupNode(ID29);


			adaptor.addChild(root_1, ID29_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_lVar_in_lsetFuncDecl497);
			lVar30=lVar();
			state._fsp--;

			adaptor.addChild(root_1, lVar30.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_lsetDef_in_lsetFuncDecl505);
			p=lsetDef();
			state._fsp--;

			adaptor.addChild(root_1, p.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lsetFuncDecl"


	public static class lsetDef_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "lsetDef"
	// ImpSyntHoleFinder.g:102:1: lsetDef : ^( 'default' ( lsetCase )* lsetTerm ) ;
	public final ImpSyntHoleFinder.lsetDef_return lsetDef() throws RecognitionException {
		ImpSyntHoleFinder.lsetDef_return retval = new ImpSyntHoleFinder.lsetDef_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal31=null;
		TreeRuleReturnScope lsetCase32 =null;
		TreeRuleReturnScope lsetTerm33 =null;

		CommonTree string_literal31_tree=null;

		try {
			// ImpSyntHoleFinder.g:103:5: ( ^( 'default' ( lsetCase )* lsetTerm ) )
			// ImpSyntHoleFinder.g:103:9: ^( 'default' ( lsetCase )* lsetTerm )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal31=(CommonTree)match(input,100,FOLLOW_100_in_lsetDef530); 
			string_literal31_tree = (CommonTree)adaptor.dupNode(string_literal31);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal31_tree, root_1);

			match(input, Token.DOWN, null); 
			// ImpSyntHoleFinder.g:103:21: ( lsetCase )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==98) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// ImpSyntHoleFinder.g:103:21: lsetCase
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lsetCase_in_lsetDef532);
					lsetCase32=lsetCase();
					state._fsp--;

					adaptor.addChild(root_1, lsetCase32.getTree());

					}
					break;

				default :
					break loop8;
				}
			}

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_lsetTerm_in_lsetDef535);
			lsetTerm33=lsetTerm();
			state._fsp--;

			adaptor.addChild(root_1, lsetTerm33.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lsetDef"


	public static class lsetCase_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "lsetCase"
	// ImpSyntHoleFinder.g:106:1: lsetCase : ^( 'case' formula lsetTerm ) ;
	public final ImpSyntHoleFinder.lsetCase_return lsetCase() throws RecognitionException {
		ImpSyntHoleFinder.lsetCase_return retval = new ImpSyntHoleFinder.lsetCase_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal34=null;
		TreeRuleReturnScope formula35 =null;
		TreeRuleReturnScope lsetTerm36 =null;

		CommonTree string_literal34_tree=null;

		try {
			// ImpSyntHoleFinder.g:107:5: ( ^( 'case' formula lsetTerm ) )
			// ImpSyntHoleFinder.g:107:9: ^( 'case' formula lsetTerm )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal34=(CommonTree)match(input,98,FOLLOW_98_in_lsetCase554); 
			string_literal34_tree = (CommonTree)adaptor.dupNode(string_literal34);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal34_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_formula_in_lsetCase556);
			formula35=formula();
			state._fsp--;

			adaptor.addChild(root_1, formula35.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_lsetTerm_in_lsetCase558);
			lsetTerm36=lsetTerm();
			state._fsp--;

			adaptor.addChild(root_1, lsetTerm36.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lsetCase"


	public static class setFuncDecl_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "setFuncDecl"
	// ImpSyntHoleFinder.g:110:1: setFuncDecl : ^( 'set-fun' ID lVar p= setDef ) ;
	public final ImpSyntHoleFinder.setFuncDecl_return setFuncDecl() throws RecognitionException {
		ImpSyntHoleFinder.setFuncDecl_return retval = new ImpSyntHoleFinder.setFuncDecl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal37=null;
		CommonTree ID38=null;
		TreeRuleReturnScope p =null;
		TreeRuleReturnScope lVar39 =null;

		CommonTree string_literal37_tree=null;
		CommonTree ID38_tree=null;

		try {
			// ImpSyntHoleFinder.g:111:5: ( ^( 'set-fun' ID lVar p= setDef ) )
			// ImpSyntHoleFinder.g:112:3: ^( 'set-fun' ID lVar p= setDef )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal37=(CommonTree)match(input,142,FOLLOW_142_in_setFuncDecl579); 
			string_literal37_tree = (CommonTree)adaptor.dupNode(string_literal37);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal37_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID38=(CommonTree)match(input,ID,FOLLOW_ID_in_setFuncDecl585); 
			ID38_tree = (CommonTree)adaptor.dupNode(ID38);


			adaptor.addChild(root_1, ID38_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_lVar_in_setFuncDecl591);
			lVar39=lVar();
			state._fsp--;

			adaptor.addChild(root_1, lVar39.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_setDef_in_setFuncDecl599);
			p=setDef();
			state._fsp--;

			adaptor.addChild(root_1, p.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "setFuncDecl"


	public static class binSetFuncDecl_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "binSetFuncDecl"
	// ImpSyntHoleFinder.g:119:1: binSetFuncDecl : ^( 'bin-set-fun' ID fst= lVar snd= lVar p= setDef ) ;
	public final ImpSyntHoleFinder.binSetFuncDecl_return binSetFuncDecl() throws RecognitionException {
		ImpSyntHoleFinder.binSetFuncDecl_return retval = new ImpSyntHoleFinder.binSetFuncDecl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal40=null;
		CommonTree ID41=null;
		TreeRuleReturnScope fst =null;
		TreeRuleReturnScope snd =null;
		TreeRuleReturnScope p =null;

		CommonTree string_literal40_tree=null;
		CommonTree ID41_tree=null;

		try {
			// ImpSyntHoleFinder.g:120:5: ( ^( 'bin-set-fun' ID fst= lVar snd= lVar p= setDef ) )
			// ImpSyntHoleFinder.g:121:3: ^( 'bin-set-fun' ID fst= lVar snd= lVar p= setDef )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal40=(CommonTree)match(input,97,FOLLOW_97_in_binSetFuncDecl624); 
			string_literal40_tree = (CommonTree)adaptor.dupNode(string_literal40);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal40_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID41=(CommonTree)match(input,ID,FOLLOW_ID_in_binSetFuncDecl630); 
			ID41_tree = (CommonTree)adaptor.dupNode(ID41);


			adaptor.addChild(root_1, ID41_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_lVar_in_binSetFuncDecl638);
			fst=lVar();
			state._fsp--;

			adaptor.addChild(root_1, fst.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_lVar_in_binSetFuncDecl646);
			snd=lVar();
			state._fsp--;

			adaptor.addChild(root_1, snd.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_setDef_in_binSetFuncDecl654);
			p=setDef();
			state._fsp--;

			adaptor.addChild(root_1, p.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "binSetFuncDecl"


	public static class setDef_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "setDef"
	// ImpSyntHoleFinder.g:129:1: setDef : ^( 'default' ( setCase )* setTerm ) ;
	public final ImpSyntHoleFinder.setDef_return setDef() throws RecognitionException {
		ImpSyntHoleFinder.setDef_return retval = new ImpSyntHoleFinder.setDef_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal42=null;
		TreeRuleReturnScope setCase43 =null;
		TreeRuleReturnScope setTerm44 =null;

		CommonTree string_literal42_tree=null;

		try {
			// ImpSyntHoleFinder.g:130:5: ( ^( 'default' ( setCase )* setTerm ) )
			// ImpSyntHoleFinder.g:130:9: ^( 'default' ( setCase )* setTerm )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal42=(CommonTree)match(input,100,FOLLOW_100_in_setDef679); 
			string_literal42_tree = (CommonTree)adaptor.dupNode(string_literal42);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal42_tree, root_1);

			match(input, Token.DOWN, null); 
			// ImpSyntHoleFinder.g:130:21: ( setCase )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==98) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// ImpSyntHoleFinder.g:130:21: setCase
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_setCase_in_setDef681);
					setCase43=setCase();
					state._fsp--;

					adaptor.addChild(root_1, setCase43.getTree());

					}
					break;

				default :
					break loop9;
				}
			}

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_setTerm_in_setDef684);
			setTerm44=setTerm();
			state._fsp--;

			adaptor.addChild(root_1, setTerm44.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "setDef"


	public static class setCase_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "setCase"
	// ImpSyntHoleFinder.g:133:1: setCase : ^( 'case' formula setTerm ) ;
	public final ImpSyntHoleFinder.setCase_return setCase() throws RecognitionException {
		ImpSyntHoleFinder.setCase_return retval = new ImpSyntHoleFinder.setCase_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal45=null;
		TreeRuleReturnScope formula46 =null;
		TreeRuleReturnScope setTerm47 =null;

		CommonTree string_literal45_tree=null;

		try {
			// ImpSyntHoleFinder.g:134:5: ( ^( 'case' formula setTerm ) )
			// ImpSyntHoleFinder.g:134:9: ^( 'case' formula setTerm )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal45=(CommonTree)match(input,98,FOLLOW_98_in_setCase703); 
			string_literal45_tree = (CommonTree)adaptor.dupNode(string_literal45);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal45_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_formula_in_setCase705);
			formula46=formula();
			state._fsp--;

			adaptor.addChild(root_1, formula46.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_setTerm_in_setCase707);
			setTerm47=setTerm();
			state._fsp--;

			adaptor.addChild(root_1, setTerm47.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "setCase"


	public static class msetFuncDecl_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "msetFuncDecl"
	// ImpSyntHoleFinder.g:137:1: msetFuncDecl : ^( 'mset-fun' ID lVar p= msetDef ) ;
	public final ImpSyntHoleFinder.msetFuncDecl_return msetFuncDecl() throws RecognitionException {
		ImpSyntHoleFinder.msetFuncDecl_return retval = new ImpSyntHoleFinder.msetFuncDecl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal48=null;
		CommonTree ID49=null;
		TreeRuleReturnScope p =null;
		TreeRuleReturnScope lVar50 =null;

		CommonTree string_literal48_tree=null;
		CommonTree ID49_tree=null;

		try {
			// ImpSyntHoleFinder.g:138:5: ( ^( 'mset-fun' ID lVar p= msetDef ) )
			// ImpSyntHoleFinder.g:139:3: ^( 'mset-fun' ID lVar p= msetDef )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal48=(CommonTree)match(input,133,FOLLOW_133_in_msetFuncDecl728); 
			string_literal48_tree = (CommonTree)adaptor.dupNode(string_literal48);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal48_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID49=(CommonTree)match(input,ID,FOLLOW_ID_in_msetFuncDecl734); 
			ID49_tree = (CommonTree)adaptor.dupNode(ID49);


			adaptor.addChild(root_1, ID49_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_lVar_in_msetFuncDecl740);
			lVar50=lVar();
			state._fsp--;

			adaptor.addChild(root_1, lVar50.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_msetDef_in_msetFuncDecl748);
			p=msetDef();
			state._fsp--;

			adaptor.addChild(root_1, p.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "msetFuncDecl"


	public static class msetDef_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "msetDef"
	// ImpSyntHoleFinder.g:146:1: msetDef : ^( 'default' ( msetCase )* msetTerm ) ;
	public final ImpSyntHoleFinder.msetDef_return msetDef() throws RecognitionException {
		ImpSyntHoleFinder.msetDef_return retval = new ImpSyntHoleFinder.msetDef_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal51=null;
		TreeRuleReturnScope msetCase52 =null;
		TreeRuleReturnScope msetTerm53 =null;

		CommonTree string_literal51_tree=null;

		try {
			// ImpSyntHoleFinder.g:147:5: ( ^( 'default' ( msetCase )* msetTerm ) )
			// ImpSyntHoleFinder.g:147:9: ^( 'default' ( msetCase )* msetTerm )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal51=(CommonTree)match(input,100,FOLLOW_100_in_msetDef773); 
			string_literal51_tree = (CommonTree)adaptor.dupNode(string_literal51);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal51_tree, root_1);

			match(input, Token.DOWN, null); 
			// ImpSyntHoleFinder.g:147:21: ( msetCase )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==98) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// ImpSyntHoleFinder.g:147:21: msetCase
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_msetCase_in_msetDef775);
					msetCase52=msetCase();
					state._fsp--;

					adaptor.addChild(root_1, msetCase52.getTree());

					}
					break;

				default :
					break loop10;
				}
			}

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_msetTerm_in_msetDef778);
			msetTerm53=msetTerm();
			state._fsp--;

			adaptor.addChild(root_1, msetTerm53.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "msetDef"


	public static class msetCase_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "msetCase"
	// ImpSyntHoleFinder.g:150:1: msetCase : ^( 'case' formula msetTerm ) ;
	public final ImpSyntHoleFinder.msetCase_return msetCase() throws RecognitionException {
		ImpSyntHoleFinder.msetCase_return retval = new ImpSyntHoleFinder.msetCase_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal54=null;
		TreeRuleReturnScope formula55 =null;
		TreeRuleReturnScope msetTerm56 =null;

		CommonTree string_literal54_tree=null;

		try {
			// ImpSyntHoleFinder.g:151:5: ( ^( 'case' formula msetTerm ) )
			// ImpSyntHoleFinder.g:151:9: ^( 'case' formula msetTerm )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal54=(CommonTree)match(input,98,FOLLOW_98_in_msetCase797); 
			string_literal54_tree = (CommonTree)adaptor.dupNode(string_literal54);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal54_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_formula_in_msetCase799);
			formula55=formula();
			state._fsp--;

			adaptor.addChild(root_1, formula55.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_msetTerm_in_msetCase801);
			msetTerm56=msetTerm();
			state._fsp--;

			adaptor.addChild(root_1, msetTerm56.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "msetCase"


	public static class formDecl_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "formDecl"
	// ImpSyntHoleFinder.g:154:1: formDecl : ^( 'form' ID p= formula ) ;
	public final ImpSyntHoleFinder.formDecl_return formDecl() throws RecognitionException {
		ImpSyntHoleFinder.formDecl_return retval = new ImpSyntHoleFinder.formDecl_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal57=null;
		CommonTree ID58=null;
		TreeRuleReturnScope p =null;

		CommonTree string_literal57_tree=null;
		CommonTree ID58_tree=null;

		try {
			// ImpSyntHoleFinder.g:155:3: ( ^( 'form' ID p= formula ) )
			// ImpSyntHoleFinder.g:155:5: ^( 'form' ID p= formula )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal57=(CommonTree)match(input,107,FOLLOW_107_in_formDecl818); 
			string_literal57_tree = (CommonTree)adaptor.dupNode(string_literal57);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal57_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID58=(CommonTree)match(input,ID,FOLLOW_ID_in_formDecl820); 
			ID58_tree = (CommonTree)adaptor.dupNode(ID58);


			adaptor.addChild(root_1, ID58_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_formula_in_formDecl828);
			p=formula();
			state._fsp--;

			adaptor.addChild(root_1, p.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "formDecl"


	public static class methodDef_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "methodDef"
	// ImpSyntHoleFinder.g:159:1: methodDef : ^( type ID methodArgs requires ensures p= methodBody ) ;
	public final ImpSyntHoleFinder.methodDef_return methodDef() throws RecognitionException {
		ImpSyntHoleFinder.methodDef_return retval = new ImpSyntHoleFinder.methodDef_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree ID60=null;
		TreeRuleReturnScope p =null;
		TreeRuleReturnScope type59 =null;
		TreeRuleReturnScope methodArgs61 =null;
		TreeRuleReturnScope requires62 =null;
		TreeRuleReturnScope ensures63 =null;

		CommonTree ID60_tree=null;

		try {
			// ImpSyntHoleFinder.g:160:5: ( ^( type ID methodArgs requires ensures p= methodBody ) )
			// ImpSyntHoleFinder.g:160:9: ^( type ID methodArgs requires ensures p= methodBody )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_type_in_methodDef847);
			type59=type();
			state._fsp--;

			root_1 = (CommonTree)adaptor.becomeRoot(type59.getTree(), root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID60=(CommonTree)match(input,ID,FOLLOW_ID_in_methodDef856); 
			ID60_tree = (CommonTree)adaptor.dupNode(ID60);


			adaptor.addChild(root_1, ID60_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_methodArgs_in_methodDef865);
			methodArgs61=methodArgs();
			state._fsp--;

			adaptor.addChild(root_1, methodArgs61.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_requires_in_methodDef874);
			requires62=requires();
			state._fsp--;

			adaptor.addChild(root_1, requires62.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_ensures_in_methodDef883);
			ensures63=ensures();
			state._fsp--;

			adaptor.addChild(root_1, ensures63.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_methodBody_in_methodDef893);
			p=methodBody();
			state._fsp--;

			adaptor.addChild(root_1, p.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "methodDef"


	public static class methodArgs_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "methodArgs"
	// ImpSyntHoleFinder.g:169:1: methodArgs : ^( ARGS ( arg )+ ) ;
	public final ImpSyntHoleFinder.methodArgs_return methodArgs() throws RecognitionException {
		ImpSyntHoleFinder.methodArgs_return retval = new ImpSyntHoleFinder.methodArgs_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree ARGS64=null;
		TreeRuleReturnScope arg65 =null;

		CommonTree ARGS64_tree=null;

		try {
			// ImpSyntHoleFinder.g:170:5: ( ^( ARGS ( arg )+ ) )
			// ImpSyntHoleFinder.g:170:9: ^( ARGS ( arg )+ )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			ARGS64=(CommonTree)match(input,ARGS,FOLLOW_ARGS_in_methodArgs932); 
			ARGS64_tree = (CommonTree)adaptor.dupNode(ARGS64);


			root_1 = (CommonTree)adaptor.becomeRoot(ARGS64_tree, root_1);

			match(input, Token.DOWN, null); 
			// ImpSyntHoleFinder.g:172:9: ( arg )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==BTYPE||LA11_0==ITYPE||LA11_0==LTYPE) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// ImpSyntHoleFinder.g:172:10: arg
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_arg_in_methodArgs943);
					arg65=arg();
					state._fsp--;

					adaptor.addChild(root_1, arg65.getTree());

					}
					break;

				default :
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "methodArgs"


	public static class arg_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "arg"
	// ImpSyntHoleFinder.g:176:1: arg : ( ^( ITYPE iVar ) | ^( LTYPE lVar ) | ^( BTYPE bVar ) );
	public final ImpSyntHoleFinder.arg_return arg() throws RecognitionException {
		ImpSyntHoleFinder.arg_return retval = new ImpSyntHoleFinder.arg_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree ITYPE66=null;
		CommonTree LTYPE68=null;
		CommonTree BTYPE70=null;
		TreeRuleReturnScope iVar67 =null;
		TreeRuleReturnScope lVar69 =null;
		TreeRuleReturnScope bVar71 =null;

		CommonTree ITYPE66_tree=null;
		CommonTree LTYPE68_tree=null;
		CommonTree BTYPE70_tree=null;

		try {
			// ImpSyntHoleFinder.g:177:5: ( ^( ITYPE iVar ) | ^( LTYPE lVar ) | ^( BTYPE bVar ) )
			int alt12=3;
			switch ( input.LA(1) ) {
			case ITYPE:
				{
				alt12=1;
				}
				break;
			case LTYPE:
				{
				alt12=2;
				}
				break;
			case BTYPE:
				{
				alt12=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// ImpSyntHoleFinder.g:177:9: ^( ITYPE iVar )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					ITYPE66=(CommonTree)match(input,ITYPE,FOLLOW_ITYPE_in_arg972); 
					ITYPE66_tree = (CommonTree)adaptor.dupNode(ITYPE66);


					root_1 = (CommonTree)adaptor.becomeRoot(ITYPE66_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_iVar_in_arg974);
					iVar67=iVar();
					state._fsp--;

					adaptor.addChild(root_1, iVar67.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:178:7: ^( LTYPE lVar )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					LTYPE68=(CommonTree)match(input,LTYPE,FOLLOW_LTYPE_in_arg984); 
					LTYPE68_tree = (CommonTree)adaptor.dupNode(LTYPE68);


					root_1 = (CommonTree)adaptor.becomeRoot(LTYPE68_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lVar_in_arg986);
					lVar69=lVar();
					state._fsp--;

					adaptor.addChild(root_1, lVar69.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 3 :
					// ImpSyntHoleFinder.g:179:7: ^( BTYPE bVar )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					BTYPE70=(CommonTree)match(input,BTYPE,FOLLOW_BTYPE_in_arg996); 
					BTYPE70_tree = (CommonTree)adaptor.dupNode(BTYPE70);


					root_1 = (CommonTree)adaptor.becomeRoot(BTYPE70_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_bVar_in_arg998);
					bVar71=bVar();
					state._fsp--;

					adaptor.addChild(root_1, bVar71.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arg"


	public static class type_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "type"
	// ImpSyntHoleFinder.g:182:1: type : ( ITYPE | LTYPE | BTYPE );
	public final ImpSyntHoleFinder.type_return type() throws RecognitionException {
		ImpSyntHoleFinder.type_return retval = new ImpSyntHoleFinder.type_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree set72=null;

		CommonTree set72_tree=null;

		try {
			// ImpSyntHoleFinder.g:183:5: ( ITYPE | LTYPE | BTYPE )
			// ImpSyntHoleFinder.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			set72=(CommonTree)input.LT(1);
			if ( input.LA(1)==BTYPE||input.LA(1)==ITYPE||input.LA(1)==LTYPE ) {
				input.consume();
				set72_tree = (CommonTree)adaptor.dupNode(set72);


				adaptor.addChild(root_0, set72_tree);

				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

			 

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"


	public static class requires_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "requires"
	// ImpSyntHoleFinder.g:188:1: requires : ^( 'requires' p= formula ) ;
	public final ImpSyntHoleFinder.requires_return requires() throws RecognitionException {
		ImpSyntHoleFinder.requires_return retval = new ImpSyntHoleFinder.requires_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal73=null;
		TreeRuleReturnScope p =null;

		CommonTree string_literal73_tree=null;

		try {
			// ImpSyntHoleFinder.g:189:5: ( ^( 'requires' p= formula ) )
			// ImpSyntHoleFinder.g:189:9: ^( 'requires' p= formula )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal73=(CommonTree)match(input,139,FOLLOW_139_in_requires1054); 
			string_literal73_tree = (CommonTree)adaptor.dupNode(string_literal73);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal73_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_formula_in_requires1058);
			p=formula();
			state._fsp--;

			adaptor.addChild(root_1, p.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "requires"


	public static class ensures_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ensures"
	// ImpSyntHoleFinder.g:192:1: ensures : ^( 'ensures' p= formula ) ;
	public final ImpSyntHoleFinder.ensures_return ensures() throws RecognitionException {
		ImpSyntHoleFinder.ensures_return retval = new ImpSyntHoleFinder.ensures_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal74=null;
		TreeRuleReturnScope p =null;

		CommonTree string_literal74_tree=null;

		try {
			// ImpSyntHoleFinder.g:193:5: ( ^( 'ensures' p= formula ) )
			// ImpSyntHoleFinder.g:193:9: ^( 'ensures' p= formula )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal74=(CommonTree)match(input,106,FOLLOW_106_in_ensures1077); 
			string_literal74_tree = (CommonTree)adaptor.dupNode(string_literal74);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal74_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_formula_in_ensures1081);
			p=formula();
			state._fsp--;

			adaptor.addChild(root_1, p.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ensures"


	public static class methodBody_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "methodBody"
	// ImpSyntHoleFinder.g:197:1: methodBody : ^( SEQ ( statement )* ) ;
	public final ImpSyntHoleFinder.methodBody_return methodBody() throws RecognitionException {
		ImpSyntHoleFinder.methodBody_return retval = new ImpSyntHoleFinder.methodBody_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree SEQ75=null;
		TreeRuleReturnScope statement76 =null;

		CommonTree SEQ75_tree=null;

		try {
			// ImpSyntHoleFinder.g:198:5: ( ^( SEQ ( statement )* ) )
			// ImpSyntHoleFinder.g:199:5: ^( SEQ ( statement )* )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			SEQ75=(CommonTree)match(input,SEQ,FOLLOW_SEQ_in_methodBody1107); 
			SEQ75_tree = (CommonTree)adaptor.dupNode(SEQ75);


			root_1 = (CommonTree)adaptor.becomeRoot(SEQ75_tree, root_1);

			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// ImpSyntHoleFinder.g:199:11: ( statement )*
				loop13:
				while (true) {
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( ((LA13_0 >= ASSGN && LA13_0 <= ASSUME)||LA13_0==ATOMSTMT||LA13_0==DEREFASSGN||(LA13_0 >= FREE && LA13_0 <= ID)||LA13_0==MALLOC||LA13_0==MUTATE||LA13_0==RET||LA13_0==STMT||LA13_0==111||LA13_0==121||LA13_0==146||LA13_0==150) ) {
						alt13=1;
					}

					switch (alt13) {
					case 1 :
						// ImpSyntHoleFinder.g:199:11: statement
						{
						_last = (CommonTree)input.LT(1);
						pushFollow(FOLLOW_statement_in_methodBody1109);
						statement76=statement();
						state._fsp--;

						adaptor.addChild(root_1, statement76.getTree());

						}
						break;

					default :
						break loop13;
					}
				}

				match(input, Token.UP, null); 
			}
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "methodBody"


	public static class statement_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// ImpSyntHoleFinder.g:202:1: statement : ( whileLoop | conditional | command | ^( ATOMSTMT methodBody ) ) ;
	public final ImpSyntHoleFinder.statement_return statement() throws RecognitionException {
		ImpSyntHoleFinder.statement_return retval = new ImpSyntHoleFinder.statement_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree ATOMSTMT80=null;
		TreeRuleReturnScope whileLoop77 =null;
		TreeRuleReturnScope conditional78 =null;
		TreeRuleReturnScope command79 =null;
		TreeRuleReturnScope methodBody81 =null;

		CommonTree ATOMSTMT80_tree=null;

		try {
			// ImpSyntHoleFinder.g:203:5: ( ( whileLoop | conditional | command | ^( ATOMSTMT methodBody ) ) )
			// ImpSyntHoleFinder.g:203:9: ( whileLoop | conditional | command | ^( ATOMSTMT methodBody ) )
			{
			root_0 = (CommonTree)adaptor.nil();


			// ImpSyntHoleFinder.g:203:9: ( whileLoop | conditional | command | ^( ATOMSTMT methodBody ) )
			int alt14=4;
			switch ( input.LA(1) ) {
			case 121:
			case 146:
			case 150:
				{
				alt14=1;
				}
				break;
			case 111:
				{
				alt14=2;
				}
				break;
			case ASSGN:
			case ASSUME:
			case DEREFASSGN:
			case FREE:
			case ID:
			case MALLOC:
			case MUTATE:
			case RET:
			case STMT:
				{
				alt14=3;
				}
				break;
			case ATOMSTMT:
				{
				alt14=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// ImpSyntHoleFinder.g:203:10: whileLoop
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_whileLoop_in_statement1135);
					whileLoop77=whileLoop();
					state._fsp--;

					adaptor.addChild(root_0, whileLoop77.getTree());

					bbSize = 0;
					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:203:36: conditional
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_conditional_in_statement1141);
					conditional78=conditional();
					state._fsp--;

					adaptor.addChild(root_0, conditional78.getTree());

					}
					break;
				case 3 :
					// ImpSyntHoleFinder.g:203:50: command
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_command_in_statement1145);
					command79=command();
					state._fsp--;

					adaptor.addChild(root_0, command79.getTree());

					bbSize++;
					}
					break;
				case 4 :
					// ImpSyntHoleFinder.g:203:72: ^( ATOMSTMT methodBody )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					ATOMSTMT80=(CommonTree)match(input,ATOMSTMT,FOLLOW_ATOMSTMT_in_statement1152); 
					ATOMSTMT80_tree = (CommonTree)adaptor.dupNode(ATOMSTMT80);


					root_1 = (CommonTree)adaptor.becomeRoot(ATOMSTMT80_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_methodBody_in_statement1154);
					methodBody81=methodBody();
					state._fsp--;

					adaptor.addChild(root_1, methodBody81.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;

			}

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class mainBody_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "mainBody"
	// ImpSyntHoleFinder.g:206:1: mainBody : ( functionCall | whileLoop );
	public final ImpSyntHoleFinder.mainBody_return mainBody() throws RecognitionException {
		ImpSyntHoleFinder.mainBody_return retval = new ImpSyntHoleFinder.mainBody_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope functionCall82 =null;
		TreeRuleReturnScope whileLoop83 =null;


		try {
			// ImpSyntHoleFinder.g:207:5: ( functionCall | whileLoop )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==ID) ) {
				alt15=1;
			}
			else if ( (LA15_0==121||LA15_0==146||LA15_0==150) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// ImpSyntHoleFinder.g:208:5: functionCall
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_functionCall_in_mainBody1184);
					functionCall82=functionCall();
					state._fsp--;

					adaptor.addChild(root_0, functionCall82.getTree());

					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:209:9: whileLoop
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_whileLoop_in_mainBody1194);
					whileLoop83=whileLoop();
					state._fsp--;

					adaptor.addChild(root_0, whileLoop83.getTree());

					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mainBody"


	public static class whileLoop_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "whileLoop"
	// ImpSyntHoleFinder.g:212:1: whileLoop : ( ^( 'while' boolExp statement ) | ^( 'loop' INT INT INT ) | ^( 'simple-loop' INT INT INT ) );
	public final ImpSyntHoleFinder.whileLoop_return whileLoop() throws RecognitionException {
		ImpSyntHoleFinder.whileLoop_return retval = new ImpSyntHoleFinder.whileLoop_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal84=null;
		CommonTree string_literal87=null;
		CommonTree INT88=null;
		CommonTree INT89=null;
		CommonTree INT90=null;
		CommonTree string_literal91=null;
		CommonTree INT92=null;
		CommonTree INT93=null;
		CommonTree INT94=null;
		TreeRuleReturnScope boolExp85 =null;
		TreeRuleReturnScope statement86 =null;

		CommonTree string_literal84_tree=null;
		CommonTree string_literal87_tree=null;
		CommonTree INT88_tree=null;
		CommonTree INT89_tree=null;
		CommonTree INT90_tree=null;
		CommonTree string_literal91_tree=null;
		CommonTree INT92_tree=null;
		CommonTree INT93_tree=null;
		CommonTree INT94_tree=null;

		try {
			// ImpSyntHoleFinder.g:213:5: ( ^( 'while' boolExp statement ) | ^( 'loop' INT INT INT ) | ^( 'simple-loop' INT INT INT ) )
			int alt16=3;
			switch ( input.LA(1) ) {
			case 150:
				{
				alt16=1;
				}
				break;
			case 121:
				{
				alt16=2;
				}
				break;
			case 146:
				{
				alt16=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// ImpSyntHoleFinder.g:214:5: ^( 'while' boolExp statement )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					string_literal84=(CommonTree)match(input,150,FOLLOW_150_in_whileLoop1220); 
					string_literal84_tree = (CommonTree)adaptor.dupNode(string_literal84);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal84_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_boolExp_in_whileLoop1222);
					boolExp85=boolExp();
					state._fsp--;

					adaptor.addChild(root_1, boolExp85.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_statement_in_whileLoop1224);
					statement86=statement();
					state._fsp--;

					adaptor.addChild(root_1, statement86.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:215:9: ^( 'loop' INT INT INT )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					string_literal87=(CommonTree)match(input,121,FOLLOW_121_in_whileLoop1236); 
					string_literal87_tree = (CommonTree)adaptor.dupNode(string_literal87);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal87_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					INT88=(CommonTree)match(input,INT,FOLLOW_INT_in_whileLoop1238); 
					INT88_tree = (CommonTree)adaptor.dupNode(INT88);


					adaptor.addChild(root_1, INT88_tree);

					_last = (CommonTree)input.LT(1);
					INT89=(CommonTree)match(input,INT,FOLLOW_INT_in_whileLoop1240); 
					INT89_tree = (CommonTree)adaptor.dupNode(INT89);


					adaptor.addChild(root_1, INT89_tree);

					_last = (CommonTree)input.LT(1);
					INT90=(CommonTree)match(input,INT,FOLLOW_INT_in_whileLoop1242); 
					INT90_tree = (CommonTree)adaptor.dupNode(INT90);


					adaptor.addChild(root_1, INT90_tree);

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					unknownLoops.add(retval.tree); loopLocs.add(Integer.valueOf(bbSize));
					}
					break;
				case 3 :
					// ImpSyntHoleFinder.g:216:9: ^( 'simple-loop' INT INT INT )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					string_literal91=(CommonTree)match(input,146,FOLLOW_146_in_whileLoop1256); 
					string_literal91_tree = (CommonTree)adaptor.dupNode(string_literal91);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal91_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					INT92=(CommonTree)match(input,INT,FOLLOW_INT_in_whileLoop1258); 
					INT92_tree = (CommonTree)adaptor.dupNode(INT92);


					adaptor.addChild(root_1, INT92_tree);

					_last = (CommonTree)input.LT(1);
					INT93=(CommonTree)match(input,INT,FOLLOW_INT_in_whileLoop1260); 
					INT93_tree = (CommonTree)adaptor.dupNode(INT93);


					adaptor.addChild(root_1, INT93_tree);

					_last = (CommonTree)input.LT(1);
					INT94=(CommonTree)match(input,INT,FOLLOW_INT_in_whileLoop1262); 
					INT94_tree = (CommonTree)adaptor.dupNode(INT94);


					adaptor.addChild(root_1, INT94_tree);

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					unknownSimpleLoops.add(retval.tree); loopLocs.add(Integer.valueOf(bbSize));
					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whileLoop"


	public static class conditional_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "conditional"
	// ImpSyntHoleFinder.g:219:1: conditional : ^( 'if' boolExp statement ( el )? ) ;
	public final ImpSyntHoleFinder.conditional_return conditional() throws RecognitionException {
		ImpSyntHoleFinder.conditional_return retval = new ImpSyntHoleFinder.conditional_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal95=null;
		TreeRuleReturnScope boolExp96 =null;
		TreeRuleReturnScope statement97 =null;
		TreeRuleReturnScope el98 =null;

		CommonTree string_literal95_tree=null;

		try {
			// ImpSyntHoleFinder.g:220:5: ( ^( 'if' boolExp statement ( el )? ) )
			// ImpSyntHoleFinder.g:221:5: ^( 'if' boolExp statement ( el )? )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal95=(CommonTree)match(input,111,FOLLOW_111_in_conditional1291); 
			string_literal95_tree = (CommonTree)adaptor.dupNode(string_literal95);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal95_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_boolExp_in_conditional1294);
			boolExp96=boolExp();
			state._fsp--;

			adaptor.addChild(root_1, boolExp96.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_statement_in_conditional1296);
			statement97=statement();
			state._fsp--;

			adaptor.addChild(root_1, statement97.getTree());

			// ImpSyntHoleFinder.g:221:31: ( el )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==102) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// ImpSyntHoleFinder.g:221:31: el
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_el_in_conditional1298);
					el98=el();
					state._fsp--;

					adaptor.addChild(root_1, el98.getTree());

					}
					break;

			}

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conditional"


	public static class el_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "el"
	// ImpSyntHoleFinder.g:224:1: el : ^( 'else' statement ) ;
	public final ImpSyntHoleFinder.el_return el() throws RecognitionException {
		ImpSyntHoleFinder.el_return retval = new ImpSyntHoleFinder.el_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal99=null;
		TreeRuleReturnScope statement100 =null;

		CommonTree string_literal99_tree=null;

		try {
			// ImpSyntHoleFinder.g:225:5: ( ^( 'else' statement ) )
			// ImpSyntHoleFinder.g:226:5: ^( 'else' statement )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal99=(CommonTree)match(input,102,FOLLOW_102_in_el1326); 
			string_literal99_tree = (CommonTree)adaptor.dupNode(string_literal99);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal99_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_statement_in_el1328);
			statement100=statement();
			state._fsp--;

			adaptor.addChild(root_1, statement100.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "el"


	public static class command_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "command"
	// ImpSyntHoleFinder.g:230:1: command : ( assignment | mutation | malloc | free | assume | functionCall | ret | unknownStmt );
	public final ImpSyntHoleFinder.command_return command() throws RecognitionException {
		ImpSyntHoleFinder.command_return retval = new ImpSyntHoleFinder.command_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope assignment101 =null;
		TreeRuleReturnScope mutation102 =null;
		TreeRuleReturnScope malloc103 =null;
		TreeRuleReturnScope free104 =null;
		TreeRuleReturnScope assume105 =null;
		TreeRuleReturnScope functionCall106 =null;
		TreeRuleReturnScope ret107 =null;
		TreeRuleReturnScope unknownStmt108 =null;


		try {
			// ImpSyntHoleFinder.g:231:3: ( assignment | mutation | malloc | free | assume | functionCall | ret | unknownStmt )
			int alt18=8;
			switch ( input.LA(1) ) {
			case ASSGN:
			case DEREFASSGN:
				{
				alt18=1;
				}
				break;
			case MUTATE:
				{
				alt18=2;
				}
				break;
			case MALLOC:
				{
				alt18=3;
				}
				break;
			case FREE:
				{
				alt18=4;
				}
				break;
			case ASSUME:
				{
				alt18=5;
				}
				break;
			case ID:
				{
				alt18=6;
				}
				break;
			case RET:
				{
				alt18=7;
				}
				break;
			case STMT:
				{
				alt18=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}
			switch (alt18) {
				case 1 :
					// ImpSyntHoleFinder.g:231:7: assignment
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_assignment_in_command1347);
					assignment101=assignment();
					state._fsp--;

					adaptor.addChild(root_0, assignment101.getTree());

					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:232:7: mutation
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_mutation_in_command1355);
					mutation102=mutation();
					state._fsp--;

					adaptor.addChild(root_0, mutation102.getTree());

					}
					break;
				case 3 :
					// ImpSyntHoleFinder.g:233:7: malloc
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_malloc_in_command1363);
					malloc103=malloc();
					state._fsp--;

					adaptor.addChild(root_0, malloc103.getTree());

					}
					break;
				case 4 :
					// ImpSyntHoleFinder.g:234:7: free
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_free_in_command1371);
					free104=free();
					state._fsp--;

					adaptor.addChild(root_0, free104.getTree());

					}
					break;
				case 5 :
					// ImpSyntHoleFinder.g:235:7: assume
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_assume_in_command1379);
					assume105=assume();
					state._fsp--;

					adaptor.addChild(root_0, assume105.getTree());

					}
					break;
				case 6 :
					// ImpSyntHoleFinder.g:236:7: functionCall
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_functionCall_in_command1387);
					functionCall106=functionCall();
					state._fsp--;

					adaptor.addChild(root_0, functionCall106.getTree());

					}
					break;
				case 7 :
					// ImpSyntHoleFinder.g:237:7: ret
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_ret_in_command1395);
					ret107=ret();
					state._fsp--;

					adaptor.addChild(root_0, ret107.getTree());

					}
					break;
				case 8 :
					// ImpSyntHoleFinder.g:238:7: unknownStmt
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_unknownStmt_in_command1403);
					unknownStmt108=unknownStmt();
					state._fsp--;

					adaptor.addChild(root_0, unknownStmt108.getTree());

					unknownStmts.add((unknownStmt108!=null?((CommonTree)unknownStmt108.getTree()):null));
					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "command"


	public static class unknownStmt_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "unknownStmt"
	// ImpSyntHoleFinder.g:241:1: unknownStmt : ^( STMT atomIntExp ) ;
	public final ImpSyntHoleFinder.unknownStmt_return unknownStmt() throws RecognitionException {
		ImpSyntHoleFinder.unknownStmt_return retval = new ImpSyntHoleFinder.unknownStmt_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree STMT109=null;
		TreeRuleReturnScope atomIntExp110 =null;

		CommonTree STMT109_tree=null;

		try {
			// ImpSyntHoleFinder.g:242:3: ( ^( STMT atomIntExp ) )
			// ImpSyntHoleFinder.g:243:3: ^( STMT atomIntExp )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			STMT109=(CommonTree)match(input,STMT,FOLLOW_STMT_in_unknownStmt1423); 
			STMT109_tree = (CommonTree)adaptor.dupNode(STMT109);


			root_1 = (CommonTree)adaptor.becomeRoot(STMT109_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_atomIntExp_in_unknownStmt1425);
			atomIntExp110=atomIntExp();
			state._fsp--;

			adaptor.addChild(root_1, atomIntExp110.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unknownStmt"


	public static class assignment_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// ImpSyntHoleFinder.g:246:1: assignment : ( ^( ASSGN ITYPE iVar intExp ) | ^( ASSGN LTYPE lVar locExp ) | ^( ASSGN BTYPE bVar boolExp ) | ^( DEREFASSGN ITYPE iVar dataDeref ) | ^( DEREFASSGN LTYPE lVar dirDeref ) );
	public final ImpSyntHoleFinder.assignment_return assignment() throws RecognitionException {
		ImpSyntHoleFinder.assignment_return retval = new ImpSyntHoleFinder.assignment_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree ASSGN111=null;
		CommonTree ITYPE112=null;
		CommonTree ASSGN115=null;
		CommonTree LTYPE116=null;
		CommonTree ASSGN119=null;
		CommonTree BTYPE120=null;
		CommonTree DEREFASSGN123=null;
		CommonTree ITYPE124=null;
		CommonTree DEREFASSGN127=null;
		CommonTree LTYPE128=null;
		TreeRuleReturnScope iVar113 =null;
		TreeRuleReturnScope intExp114 =null;
		TreeRuleReturnScope lVar117 =null;
		TreeRuleReturnScope locExp118 =null;
		TreeRuleReturnScope bVar121 =null;
		TreeRuleReturnScope boolExp122 =null;
		TreeRuleReturnScope iVar125 =null;
		TreeRuleReturnScope dataDeref126 =null;
		TreeRuleReturnScope lVar129 =null;
		TreeRuleReturnScope dirDeref130 =null;

		CommonTree ASSGN111_tree=null;
		CommonTree ITYPE112_tree=null;
		CommonTree ASSGN115_tree=null;
		CommonTree LTYPE116_tree=null;
		CommonTree ASSGN119_tree=null;
		CommonTree BTYPE120_tree=null;
		CommonTree DEREFASSGN123_tree=null;
		CommonTree ITYPE124_tree=null;
		CommonTree DEREFASSGN127_tree=null;
		CommonTree LTYPE128_tree=null;

		try {
			// ImpSyntHoleFinder.g:247:5: ( ^( ASSGN ITYPE iVar intExp ) | ^( ASSGN LTYPE lVar locExp ) | ^( ASSGN BTYPE bVar boolExp ) | ^( DEREFASSGN ITYPE iVar dataDeref ) | ^( DEREFASSGN LTYPE lVar dirDeref ) )
			int alt19=5;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==ASSGN) ) {
				int LA19_1 = input.LA(2);
				if ( (LA19_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case ITYPE:
						{
						alt19=1;
						}
						break;
					case LTYPE:
						{
						alt19=2;
						}
						break;
					case BTYPE:
						{
						alt19=3;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 19, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA19_0==DEREFASSGN) ) {
				int LA19_2 = input.LA(2);
				if ( (LA19_2==DOWN) ) {
					int LA19_4 = input.LA(3);
					if ( (LA19_4==ITYPE) ) {
						alt19=4;
					}
					else if ( (LA19_4==LTYPE) ) {
						alt19=5;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 19, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// ImpSyntHoleFinder.g:247:9: ^( ASSGN ITYPE iVar intExp )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					ASSGN111=(CommonTree)match(input,ASSGN,FOLLOW_ASSGN_in_assignment1446); 
					ASSGN111_tree = (CommonTree)adaptor.dupNode(ASSGN111);


					root_1 = (CommonTree)adaptor.becomeRoot(ASSGN111_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					ITYPE112=(CommonTree)match(input,ITYPE,FOLLOW_ITYPE_in_assignment1448); 
					ITYPE112_tree = (CommonTree)adaptor.dupNode(ITYPE112);


					adaptor.addChild(root_1, ITYPE112_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_iVar_in_assignment1450);
					iVar113=iVar();
					state._fsp--;

					adaptor.addChild(root_1, iVar113.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_intExp_in_assignment1452);
					intExp114=intExp();
					state._fsp--;

					adaptor.addChild(root_1, intExp114.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:248:7: ^( ASSGN LTYPE lVar locExp )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					ASSGN115=(CommonTree)match(input,ASSGN,FOLLOW_ASSGN_in_assignment1464); 
					ASSGN115_tree = (CommonTree)adaptor.dupNode(ASSGN115);


					root_1 = (CommonTree)adaptor.becomeRoot(ASSGN115_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					LTYPE116=(CommonTree)match(input,LTYPE,FOLLOW_LTYPE_in_assignment1466); 
					LTYPE116_tree = (CommonTree)adaptor.dupNode(LTYPE116);


					adaptor.addChild(root_1, LTYPE116_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lVar_in_assignment1468);
					lVar117=lVar();
					state._fsp--;

					adaptor.addChild(root_1, lVar117.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_locExp_in_assignment1470);
					locExp118=locExp();
					state._fsp--;

					adaptor.addChild(root_1, locExp118.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 3 :
					// ImpSyntHoleFinder.g:249:7: ^( ASSGN BTYPE bVar boolExp )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					ASSGN119=(CommonTree)match(input,ASSGN,FOLLOW_ASSGN_in_assignment1482); 
					ASSGN119_tree = (CommonTree)adaptor.dupNode(ASSGN119);


					root_1 = (CommonTree)adaptor.becomeRoot(ASSGN119_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					BTYPE120=(CommonTree)match(input,BTYPE,FOLLOW_BTYPE_in_assignment1484); 
					BTYPE120_tree = (CommonTree)adaptor.dupNode(BTYPE120);


					adaptor.addChild(root_1, BTYPE120_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_bVar_in_assignment1486);
					bVar121=bVar();
					state._fsp--;

					adaptor.addChild(root_1, bVar121.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_boolExp_in_assignment1488);
					boolExp122=boolExp();
					state._fsp--;

					adaptor.addChild(root_1, boolExp122.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 4 :
					// ImpSyntHoleFinder.g:250:7: ^( DEREFASSGN ITYPE iVar dataDeref )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					DEREFASSGN123=(CommonTree)match(input,DEREFASSGN,FOLLOW_DEREFASSGN_in_assignment1500); 
					DEREFASSGN123_tree = (CommonTree)adaptor.dupNode(DEREFASSGN123);


					root_1 = (CommonTree)adaptor.becomeRoot(DEREFASSGN123_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					ITYPE124=(CommonTree)match(input,ITYPE,FOLLOW_ITYPE_in_assignment1502); 
					ITYPE124_tree = (CommonTree)adaptor.dupNode(ITYPE124);


					adaptor.addChild(root_1, ITYPE124_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_iVar_in_assignment1504);
					iVar125=iVar();
					state._fsp--;

					adaptor.addChild(root_1, iVar125.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_dataDeref_in_assignment1506);
					dataDeref126=dataDeref();
					state._fsp--;

					adaptor.addChild(root_1, dataDeref126.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 5 :
					// ImpSyntHoleFinder.g:251:7: ^( DEREFASSGN LTYPE lVar dirDeref )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					DEREFASSGN127=(CommonTree)match(input,DEREFASSGN,FOLLOW_DEREFASSGN_in_assignment1518); 
					DEREFASSGN127_tree = (CommonTree)adaptor.dupNode(DEREFASSGN127);


					root_1 = (CommonTree)adaptor.becomeRoot(DEREFASSGN127_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					LTYPE128=(CommonTree)match(input,LTYPE,FOLLOW_LTYPE_in_assignment1520); 
					LTYPE128_tree = (CommonTree)adaptor.dupNode(LTYPE128);


					adaptor.addChild(root_1, LTYPE128_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lVar_in_assignment1522);
					lVar129=lVar();
					state._fsp--;

					adaptor.addChild(root_1, lVar129.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_dirDeref_in_assignment1524);
					dirDeref130=dirDeref();
					state._fsp--;

					adaptor.addChild(root_1, dirDeref130.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment"


	public static class mutation_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "mutation"
	// ImpSyntHoleFinder.g:254:1: mutation : ( ^( MUTATE LTYPE dirDeref lVar ) | ^( MUTATE ITYPE dataDeref iVar ) );
	public final ImpSyntHoleFinder.mutation_return mutation() throws RecognitionException {
		ImpSyntHoleFinder.mutation_return retval = new ImpSyntHoleFinder.mutation_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree MUTATE131=null;
		CommonTree LTYPE132=null;
		CommonTree MUTATE135=null;
		CommonTree ITYPE136=null;
		TreeRuleReturnScope dirDeref133 =null;
		TreeRuleReturnScope lVar134 =null;
		TreeRuleReturnScope dataDeref137 =null;
		TreeRuleReturnScope iVar138 =null;

		CommonTree MUTATE131_tree=null;
		CommonTree LTYPE132_tree=null;
		CommonTree MUTATE135_tree=null;
		CommonTree ITYPE136_tree=null;

		try {
			// ImpSyntHoleFinder.g:255:5: ( ^( MUTATE LTYPE dirDeref lVar ) | ^( MUTATE ITYPE dataDeref iVar ) )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==MUTATE) ) {
				int LA20_1 = input.LA(2);
				if ( (LA20_1==DOWN) ) {
					int LA20_2 = input.LA(3);
					if ( (LA20_2==LTYPE) ) {
						alt20=1;
					}
					else if ( (LA20_2==ITYPE) ) {
						alt20=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 20, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 20, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// ImpSyntHoleFinder.g:255:9: ^( MUTATE LTYPE dirDeref lVar )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					MUTATE131=(CommonTree)match(input,MUTATE,FOLLOW_MUTATE_in_mutation1546); 
					MUTATE131_tree = (CommonTree)adaptor.dupNode(MUTATE131);


					root_1 = (CommonTree)adaptor.becomeRoot(MUTATE131_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					LTYPE132=(CommonTree)match(input,LTYPE,FOLLOW_LTYPE_in_mutation1548); 
					LTYPE132_tree = (CommonTree)adaptor.dupNode(LTYPE132);


					adaptor.addChild(root_1, LTYPE132_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_dirDeref_in_mutation1550);
					dirDeref133=dirDeref();
					state._fsp--;

					adaptor.addChild(root_1, dirDeref133.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lVar_in_mutation1552);
					lVar134=lVar();
					state._fsp--;

					adaptor.addChild(root_1, lVar134.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:256:7: ^( MUTATE ITYPE dataDeref iVar )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					MUTATE135=(CommonTree)match(input,MUTATE,FOLLOW_MUTATE_in_mutation1562); 
					MUTATE135_tree = (CommonTree)adaptor.dupNode(MUTATE135);


					root_1 = (CommonTree)adaptor.becomeRoot(MUTATE135_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					ITYPE136=(CommonTree)match(input,ITYPE,FOLLOW_ITYPE_in_mutation1564); 
					ITYPE136_tree = (CommonTree)adaptor.dupNode(ITYPE136);


					adaptor.addChild(root_1, ITYPE136_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_dataDeref_in_mutation1566);
					dataDeref137=dataDeref();
					state._fsp--;

					adaptor.addChild(root_1, dataDeref137.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_iVar_in_mutation1568);
					iVar138=iVar();
					state._fsp--;

					adaptor.addChild(root_1, iVar138.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "mutation"


	public static class ret_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "ret"
	// ImpSyntHoleFinder.g:259:1: ret : ( ^( RET LTYPE locExp ) | ^( RET ITYPE atomIntExp ) | ^( RET BTYPE atomBoolExp ) ) ;
	public final ImpSyntHoleFinder.ret_return ret() throws RecognitionException {
		ImpSyntHoleFinder.ret_return retval = new ImpSyntHoleFinder.ret_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree RET139=null;
		CommonTree LTYPE140=null;
		CommonTree RET142=null;
		CommonTree ITYPE143=null;
		CommonTree RET145=null;
		CommonTree BTYPE146=null;
		TreeRuleReturnScope locExp141 =null;
		TreeRuleReturnScope atomIntExp144 =null;
		TreeRuleReturnScope atomBoolExp147 =null;

		CommonTree RET139_tree=null;
		CommonTree LTYPE140_tree=null;
		CommonTree RET142_tree=null;
		CommonTree ITYPE143_tree=null;
		CommonTree RET145_tree=null;
		CommonTree BTYPE146_tree=null;

		try {
			// ImpSyntHoleFinder.g:260:5: ( ( ^( RET LTYPE locExp ) | ^( RET ITYPE atomIntExp ) | ^( RET BTYPE atomBoolExp ) ) )
			// ImpSyntHoleFinder.g:260:9: ( ^( RET LTYPE locExp ) | ^( RET ITYPE atomIntExp ) | ^( RET BTYPE atomBoolExp ) )
			{
			root_0 = (CommonTree)adaptor.nil();


			// ImpSyntHoleFinder.g:260:9: ( ^( RET LTYPE locExp ) | ^( RET ITYPE atomIntExp ) | ^( RET BTYPE atomBoolExp ) )
			int alt21=3;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==RET) ) {
				int LA21_1 = input.LA(2);
				if ( (LA21_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case LTYPE:
						{
						alt21=1;
						}
						break;
					case ITYPE:
						{
						alt21=2;
						}
						break;
					case BTYPE:
						{
						alt21=3;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 21, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// ImpSyntHoleFinder.g:260:11: ^( RET LTYPE locExp )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					RET139=(CommonTree)match(input,RET,FOLLOW_RET_in_ret1591); 
					RET139_tree = (CommonTree)adaptor.dupNode(RET139);


					root_1 = (CommonTree)adaptor.becomeRoot(RET139_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					LTYPE140=(CommonTree)match(input,LTYPE,FOLLOW_LTYPE_in_ret1593); 
					LTYPE140_tree = (CommonTree)adaptor.dupNode(LTYPE140);


					adaptor.addChild(root_1, LTYPE140_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_locExp_in_ret1595);
					locExp141=locExp();
					state._fsp--;

					adaptor.addChild(root_1, locExp141.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:261:7: ^( RET ITYPE atomIntExp )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					RET142=(CommonTree)match(input,RET,FOLLOW_RET_in_ret1605); 
					RET142_tree = (CommonTree)adaptor.dupNode(RET142);


					root_1 = (CommonTree)adaptor.becomeRoot(RET142_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					ITYPE143=(CommonTree)match(input,ITYPE,FOLLOW_ITYPE_in_ret1607); 
					ITYPE143_tree = (CommonTree)adaptor.dupNode(ITYPE143);


					adaptor.addChild(root_1, ITYPE143_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntExp_in_ret1609);
					atomIntExp144=atomIntExp();
					state._fsp--;

					adaptor.addChild(root_1, atomIntExp144.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 3 :
					// ImpSyntHoleFinder.g:262:7: ^( RET BTYPE atomBoolExp )
					{
					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					RET145=(CommonTree)match(input,RET,FOLLOW_RET_in_ret1619); 
					RET145_tree = (CommonTree)adaptor.dupNode(RET145);


					root_1 = (CommonTree)adaptor.becomeRoot(RET145_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					BTYPE146=(CommonTree)match(input,BTYPE,FOLLOW_BTYPE_in_ret1621); 
					BTYPE146_tree = (CommonTree)adaptor.dupNode(BTYPE146);


					adaptor.addChild(root_1, BTYPE146_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomBoolExp_in_ret1623);
					atomBoolExp147=atomBoolExp();
					state._fsp--;

					adaptor.addChild(root_1, atomBoolExp147.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;

			}

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ret"


	public static class malloc_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "malloc"
	// ImpSyntHoleFinder.g:265:1: malloc : ^( MALLOC lVar ) ;
	public final ImpSyntHoleFinder.malloc_return malloc() throws RecognitionException {
		ImpSyntHoleFinder.malloc_return retval = new ImpSyntHoleFinder.malloc_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree MALLOC148=null;
		TreeRuleReturnScope lVar149 =null;

		CommonTree MALLOC148_tree=null;

		try {
			// ImpSyntHoleFinder.g:266:5: ( ^( MALLOC lVar ) )
			// ImpSyntHoleFinder.g:266:9: ^( MALLOC lVar )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			MALLOC148=(CommonTree)match(input,MALLOC,FOLLOW_MALLOC_in_malloc1644); 
			MALLOC148_tree = (CommonTree)adaptor.dupNode(MALLOC148);


			root_1 = (CommonTree)adaptor.becomeRoot(MALLOC148_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_lVar_in_malloc1646);
			lVar149=lVar();
			state._fsp--;

			adaptor.addChild(root_1, lVar149.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "malloc"


	public static class free_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "free"
	// ImpSyntHoleFinder.g:269:1: free : ^( FREE lVar ) ;
	public final ImpSyntHoleFinder.free_return free() throws RecognitionException {
		ImpSyntHoleFinder.free_return retval = new ImpSyntHoleFinder.free_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree FREE150=null;
		TreeRuleReturnScope lVar151 =null;

		CommonTree FREE150_tree=null;

		try {
			// ImpSyntHoleFinder.g:270:5: ( ^( FREE lVar ) )
			// ImpSyntHoleFinder.g:270:9: ^( FREE lVar )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			FREE150=(CommonTree)match(input,FREE,FOLLOW_FREE_in_free1667); 
			FREE150_tree = (CommonTree)adaptor.dupNode(FREE150);


			root_1 = (CommonTree)adaptor.becomeRoot(FREE150_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_lVar_in_free1669);
			lVar151=lVar();
			state._fsp--;

			adaptor.addChild(root_1, lVar151.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "free"


	public static class assume_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "assume"
	// ImpSyntHoleFinder.g:273:1: assume : ^( ASSUME boolExp ) ;
	public final ImpSyntHoleFinder.assume_return assume() throws RecognitionException {
		ImpSyntHoleFinder.assume_return retval = new ImpSyntHoleFinder.assume_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree ASSUME152=null;
		TreeRuleReturnScope boolExp153 =null;

		CommonTree ASSUME152_tree=null;

		try {
			// ImpSyntHoleFinder.g:274:5: ( ^( ASSUME boolExp ) )
			// ImpSyntHoleFinder.g:274:9: ^( ASSUME boolExp )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			ASSUME152=(CommonTree)match(input,ASSUME,FOLLOW_ASSUME_in_assume1688); 
			ASSUME152_tree = (CommonTree)adaptor.dupNode(ASSUME152);


			root_1 = (CommonTree)adaptor.becomeRoot(ASSUME152_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_boolExp_in_assume1690);
			boolExp153=boolExp();
			state._fsp--;

			adaptor.addChild(root_1, boolExp153.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assume"


	public static class functionCall_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "functionCall"
	// ImpSyntHoleFinder.g:277:1: functionCall : ( ^( func LTYPE lVar vars ) | ^( func ITYPE iVar vars ) | ^( func BTYPE bVar vars ) );
	public final ImpSyntHoleFinder.functionCall_return functionCall() throws RecognitionException {
		ImpSyntHoleFinder.functionCall_return retval = new ImpSyntHoleFinder.functionCall_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree LTYPE155=null;
		CommonTree ITYPE159=null;
		CommonTree BTYPE163=null;
		TreeRuleReturnScope func154 =null;
		TreeRuleReturnScope lVar156 =null;
		TreeRuleReturnScope vars157 =null;
		TreeRuleReturnScope func158 =null;
		TreeRuleReturnScope iVar160 =null;
		TreeRuleReturnScope vars161 =null;
		TreeRuleReturnScope func162 =null;
		TreeRuleReturnScope bVar164 =null;
		TreeRuleReturnScope vars165 =null;

		CommonTree LTYPE155_tree=null;
		CommonTree ITYPE159_tree=null;
		CommonTree BTYPE163_tree=null;

		try {
			// ImpSyntHoleFinder.g:278:5: ( ^( func LTYPE lVar vars ) | ^( func ITYPE iVar vars ) | ^( func BTYPE bVar vars ) )
			int alt22=3;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==ID) ) {
				int LA22_1 = input.LA(2);
				if ( (LA22_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case LTYPE:
						{
						alt22=1;
						}
						break;
					case ITYPE:
						{
						alt22=2;
						}
						break;
					case BTYPE:
						{
						alt22=3;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 22, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// ImpSyntHoleFinder.g:278:9: ^( func LTYPE lVar vars )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_func_in_functionCall1711);
					func154=func();
					state._fsp--;

					root_1 = (CommonTree)adaptor.becomeRoot(func154.getTree(), root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					LTYPE155=(CommonTree)match(input,LTYPE,FOLLOW_LTYPE_in_functionCall1713); 
					LTYPE155_tree = (CommonTree)adaptor.dupNode(LTYPE155);


					adaptor.addChild(root_1, LTYPE155_tree);

					inFunction=true;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lVar_in_functionCall1727);
					lVar156=lVar();
					state._fsp--;

					adaptor.addChild(root_1, lVar156.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_vars_in_functionCall1729);
					vars157=vars();
					state._fsp--;

					adaptor.addChild(root_1, vars157.getTree());


					    inFunction=false;
					    for (int t = 0; t < unknownLocs.size(); t++)
					      if (unknownLocs.get(t) <= 0) unknownLocs.set(t, new Integer(order));
					    order = 0; 
					    
					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:287:7: ^( func ITYPE iVar vars )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_func_in_functionCall1746);
					func158=func();
					state._fsp--;

					root_1 = (CommonTree)adaptor.becomeRoot(func158.getTree(), root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					ITYPE159=(CommonTree)match(input,ITYPE,FOLLOW_ITYPE_in_functionCall1748); 
					ITYPE159_tree = (CommonTree)adaptor.dupNode(ITYPE159);


					adaptor.addChild(root_1, ITYPE159_tree);

					inFunction=true;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_iVar_in_functionCall1758);
					iVar160=iVar();
					state._fsp--;

					adaptor.addChild(root_1, iVar160.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_vars_in_functionCall1760);
					vars161=vars();
					state._fsp--;

					adaptor.addChild(root_1, vars161.getTree());


					    inFunction=false;
					    for (int t = 0; t < unknownInts.size(); t++)
					      if (unknownInts.get(t) <= 0) unknownInts.set(t, new Integer(order));
					    order = 0; 
					  
					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 3 :
					// ImpSyntHoleFinder.g:296:7: ^( func BTYPE bVar vars )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_func_in_functionCall1774);
					func162=func();
					state._fsp--;

					root_1 = (CommonTree)adaptor.becomeRoot(func162.getTree(), root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					BTYPE163=(CommonTree)match(input,BTYPE,FOLLOW_BTYPE_in_functionCall1776); 
					BTYPE163_tree = (CommonTree)adaptor.dupNode(BTYPE163);


					adaptor.addChild(root_1, BTYPE163_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_bVar_in_functionCall1778);
					bVar164=bVar();
					state._fsp--;

					adaptor.addChild(root_1, bVar164.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_vars_in_functionCall1780);
					vars165=vars();
					state._fsp--;

					adaptor.addChild(root_1, vars165.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionCall"


	public static class vars_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "vars"
	// ImpSyntHoleFinder.g:299:1: vars : ( lVar | iVar )+ ;
	public final ImpSyntHoleFinder.vars_return vars() throws RecognitionException {
		ImpSyntHoleFinder.vars_return retval = new ImpSyntHoleFinder.vars_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		TreeRuleReturnScope lVar166 =null;
		TreeRuleReturnScope iVar167 =null;


		try {
			// ImpSyntHoleFinder.g:300:5: ( ( lVar | iVar )+ )
			// ImpSyntHoleFinder.g:300:10: ( lVar | iVar )+
			{
			root_0 = (CommonTree)adaptor.nil();


			// ImpSyntHoleFinder.g:300:10: ( lVar | iVar )+
			int cnt23=0;
			loop23:
			while (true) {
				int alt23=3;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==LVAR) ) {
					alt23=1;
				}
				else if ( (LA23_0==IVAR) ) {
					alt23=2;
				}

				switch (alt23) {
				case 1 :
					// ImpSyntHoleFinder.g:300:11: lVar
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lVar_in_vars1802);
					lVar166=lVar();
					state._fsp--;

					adaptor.addChild(root_0, lVar166.getTree());

					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:300:18: iVar
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_iVar_in_vars1806);
					iVar167=iVar();
					state._fsp--;

					adaptor.addChild(root_0, iVar167.getTree());

					}
					break;

				default :
					if ( cnt23 >= 1 ) break loop23;
					EarlyExitException eee = new EarlyExitException(23, input);
					throw eee;
				}
				cnt23++;
			}

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "vars"


	public static class lVars_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "lVars"
	// ImpSyntHoleFinder.g:303:1: lVars : ^( LVARS ( lVar )+ ) ;
	public final ImpSyntHoleFinder.lVars_return lVars() throws RecognitionException {
		ImpSyntHoleFinder.lVars_return retval = new ImpSyntHoleFinder.lVars_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree LVARS168=null;
		TreeRuleReturnScope lVar169 =null;

		CommonTree LVARS168_tree=null;

		try {
			// ImpSyntHoleFinder.g:304:5: ( ^( LVARS ( lVar )+ ) )
			// ImpSyntHoleFinder.g:304:9: ^( LVARS ( lVar )+ )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			LVARS168=(CommonTree)match(input,LVARS,FOLLOW_LVARS_in_lVars1827); 
			LVARS168_tree = (CommonTree)adaptor.dupNode(LVARS168);


			root_1 = (CommonTree)adaptor.becomeRoot(LVARS168_tree, root_1);

			match(input, Token.DOWN, null); 
			// ImpSyntHoleFinder.g:304:17: ( lVar )+
			int cnt24=0;
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==LVAR) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// ImpSyntHoleFinder.g:304:18: lVar
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lVar_in_lVars1830);
					lVar169=lVar();
					state._fsp--;

					adaptor.addChild(root_1, lVar169.getTree());

					}
					break;

				default :
					if ( cnt24 >= 1 ) break loop24;
					EarlyExitException eee = new EarlyExitException(24, input);
					throw eee;
				}
				cnt24++;
			}

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lVars"


	public static class iVars_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "iVars"
	// ImpSyntHoleFinder.g:307:1: iVars : ^( IVARS ( iVar )+ ) ;
	public final ImpSyntHoleFinder.iVars_return iVars() throws RecognitionException {
		ImpSyntHoleFinder.iVars_return retval = new ImpSyntHoleFinder.iVars_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree IVARS170=null;
		TreeRuleReturnScope iVar171 =null;

		CommonTree IVARS170_tree=null;

		try {
			// ImpSyntHoleFinder.g:308:5: ( ^( IVARS ( iVar )+ ) )
			// ImpSyntHoleFinder.g:308:9: ^( IVARS ( iVar )+ )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			IVARS170=(CommonTree)match(input,IVARS,FOLLOW_IVARS_in_iVars1851); 
			IVARS170_tree = (CommonTree)adaptor.dupNode(IVARS170);


			root_1 = (CommonTree)adaptor.becomeRoot(IVARS170_tree, root_1);

			match(input, Token.DOWN, null); 
			// ImpSyntHoleFinder.g:308:17: ( iVar )+
			int cnt25=0;
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==IVAR) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// ImpSyntHoleFinder.g:308:17: iVar
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_iVar_in_iVars1853);
					iVar171=iVar();
					state._fsp--;

					adaptor.addChild(root_1, iVar171.getTree());

					}
					break;

				default :
					if ( cnt25 >= 1 ) break loop25;
					EarlyExitException eee = new EarlyExitException(25, input);
					throw eee;
				}
				cnt25++;
			}

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "iVars"


	public static class bVars_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bVars"
	// ImpSyntHoleFinder.g:311:1: bVars : ^( BVARS ( bVar )+ ) ;
	public final ImpSyntHoleFinder.bVars_return bVars() throws RecognitionException {
		ImpSyntHoleFinder.bVars_return retval = new ImpSyntHoleFinder.bVars_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree BVARS172=null;
		TreeRuleReturnScope bVar173 =null;

		CommonTree BVARS172_tree=null;

		try {
			// ImpSyntHoleFinder.g:312:5: ( ^( BVARS ( bVar )+ ) )
			// ImpSyntHoleFinder.g:312:9: ^( BVARS ( bVar )+ )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			BVARS172=(CommonTree)match(input,BVARS,FOLLOW_BVARS_in_bVars1875); 
			BVARS172_tree = (CommonTree)adaptor.dupNode(BVARS172);


			root_1 = (CommonTree)adaptor.becomeRoot(BVARS172_tree, root_1);

			match(input, Token.DOWN, null); 
			// ImpSyntHoleFinder.g:312:17: ( bVar )+
			int cnt26=0;
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==BVAR) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// ImpSyntHoleFinder.g:312:17: bVar
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_bVar_in_bVars1877);
					bVar173=bVar();
					state._fsp--;

					adaptor.addChild(root_1, bVar173.getTree());

					}
					break;

				default :
					if ( cnt26 >= 1 ) break loop26;
					EarlyExitException eee = new EarlyExitException(26, input);
					throw eee;
				}
				cnt26++;
			}

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bVars"


	public static class formula_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "formula"
	// ImpSyntHoleFinder.g:315:1: formula : ( atomForm | ^( binaryConnector atomForm atomForm ) | ^( NEG atomForm ) | pointsTo | ^( LOCEQ locTerm locTerm ) | ^( INTEQ atomIntTerm atomIntTerm ) | ^( '<' atomIntTerm atomIntTerm ) | ^( '<=' atomIntTerm atomIntTerm ) | ^( SETEQ atomSetTerm atomSetTerm ) | ^( LSETEQ atomLsetTerm atomLsetTerm ) | ^( MSETEQ atomMsetTerm atomMsetTerm ) | ^( INTMEM atomIntTerm atomSetTerm ) | ^( LOCMEM locTerm atomLsetTerm ) | ^( INTMMEM atomIntTerm atomMsetTerm ) | ^( INTSUBSET atomSetTerm atomSetTerm ) | ^( 'lt' atomSetTerm atomSetTerm ) | ^( 'le' atomSetTerm atomSetTerm ) | ^( 'lt-set' atomIntTerm atomSetTerm ) | ^( 'set-lt' atomSetTerm atomIntTerm ) | ^( 'le-set' atomIntTerm atomSetTerm ) | ^( 'set-le' atomSetTerm atomIntTerm ) | ^( LOCSUBSET atomLsetTerm atomLsetTerm ) | ^( INTMSUBSET atomMsetTerm atomMsetTerm ) );
	public final ImpSyntHoleFinder.formula_return formula() throws RecognitionException {
		ImpSyntHoleFinder.formula_return retval = new ImpSyntHoleFinder.formula_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree NEG178=null;
		CommonTree LOCEQ181=null;
		CommonTree INTEQ184=null;
		CommonTree char_literal187=null;
		CommonTree string_literal190=null;
		CommonTree SETEQ193=null;
		CommonTree LSETEQ196=null;
		CommonTree MSETEQ199=null;
		CommonTree INTMEM202=null;
		CommonTree LOCMEM205=null;
		CommonTree INTMMEM208=null;
		CommonTree INTSUBSET211=null;
		CommonTree string_literal214=null;
		CommonTree string_literal217=null;
		CommonTree string_literal220=null;
		CommonTree string_literal223=null;
		CommonTree string_literal226=null;
		CommonTree string_literal229=null;
		CommonTree LOCSUBSET232=null;
		CommonTree INTMSUBSET235=null;
		TreeRuleReturnScope atomForm174 =null;
		TreeRuleReturnScope binaryConnector175 =null;
		TreeRuleReturnScope atomForm176 =null;
		TreeRuleReturnScope atomForm177 =null;
		TreeRuleReturnScope atomForm179 =null;
		TreeRuleReturnScope pointsTo180 =null;
		TreeRuleReturnScope locTerm182 =null;
		TreeRuleReturnScope locTerm183 =null;
		TreeRuleReturnScope atomIntTerm185 =null;
		TreeRuleReturnScope atomIntTerm186 =null;
		TreeRuleReturnScope atomIntTerm188 =null;
		TreeRuleReturnScope atomIntTerm189 =null;
		TreeRuleReturnScope atomIntTerm191 =null;
		TreeRuleReturnScope atomIntTerm192 =null;
		TreeRuleReturnScope atomSetTerm194 =null;
		TreeRuleReturnScope atomSetTerm195 =null;
		TreeRuleReturnScope atomLsetTerm197 =null;
		TreeRuleReturnScope atomLsetTerm198 =null;
		TreeRuleReturnScope atomMsetTerm200 =null;
		TreeRuleReturnScope atomMsetTerm201 =null;
		TreeRuleReturnScope atomIntTerm203 =null;
		TreeRuleReturnScope atomSetTerm204 =null;
		TreeRuleReturnScope locTerm206 =null;
		TreeRuleReturnScope atomLsetTerm207 =null;
		TreeRuleReturnScope atomIntTerm209 =null;
		TreeRuleReturnScope atomMsetTerm210 =null;
		TreeRuleReturnScope atomSetTerm212 =null;
		TreeRuleReturnScope atomSetTerm213 =null;
		TreeRuleReturnScope atomSetTerm215 =null;
		TreeRuleReturnScope atomSetTerm216 =null;
		TreeRuleReturnScope atomSetTerm218 =null;
		TreeRuleReturnScope atomSetTerm219 =null;
		TreeRuleReturnScope atomIntTerm221 =null;
		TreeRuleReturnScope atomSetTerm222 =null;
		TreeRuleReturnScope atomSetTerm224 =null;
		TreeRuleReturnScope atomIntTerm225 =null;
		TreeRuleReturnScope atomIntTerm227 =null;
		TreeRuleReturnScope atomSetTerm228 =null;
		TreeRuleReturnScope atomSetTerm230 =null;
		TreeRuleReturnScope atomIntTerm231 =null;
		TreeRuleReturnScope atomLsetTerm233 =null;
		TreeRuleReturnScope atomLsetTerm234 =null;
		TreeRuleReturnScope atomMsetTerm236 =null;
		TreeRuleReturnScope atomMsetTerm237 =null;

		CommonTree NEG178_tree=null;
		CommonTree LOCEQ181_tree=null;
		CommonTree INTEQ184_tree=null;
		CommonTree char_literal187_tree=null;
		CommonTree string_literal190_tree=null;
		CommonTree SETEQ193_tree=null;
		CommonTree LSETEQ196_tree=null;
		CommonTree MSETEQ199_tree=null;
		CommonTree INTMEM202_tree=null;
		CommonTree LOCMEM205_tree=null;
		CommonTree INTMMEM208_tree=null;
		CommonTree INTSUBSET211_tree=null;
		CommonTree string_literal214_tree=null;
		CommonTree string_literal217_tree=null;
		CommonTree string_literal220_tree=null;
		CommonTree string_literal223_tree=null;
		CommonTree string_literal226_tree=null;
		CommonTree string_literal229_tree=null;
		CommonTree LOCSUBSET232_tree=null;
		CommonTree INTMSUBSET235_tree=null;

		try {
			// ImpSyntHoleFinder.g:316:5: ( atomForm | ^( binaryConnector atomForm atomForm ) | ^( NEG atomForm ) | pointsTo | ^( LOCEQ locTerm locTerm ) | ^( INTEQ atomIntTerm atomIntTerm ) | ^( '<' atomIntTerm atomIntTerm ) | ^( '<=' atomIntTerm atomIntTerm ) | ^( SETEQ atomSetTerm atomSetTerm ) | ^( LSETEQ atomLsetTerm atomLsetTerm ) | ^( MSETEQ atomMsetTerm atomMsetTerm ) | ^( INTMEM atomIntTerm atomSetTerm ) | ^( LOCMEM locTerm atomLsetTerm ) | ^( INTMMEM atomIntTerm atomMsetTerm ) | ^( INTSUBSET atomSetTerm atomSetTerm ) | ^( 'lt' atomSetTerm atomSetTerm ) | ^( 'le' atomSetTerm atomSetTerm ) | ^( 'lt-set' atomIntTerm atomSetTerm ) | ^( 'set-lt' atomSetTerm atomIntTerm ) | ^( 'le-set' atomIntTerm atomSetTerm ) | ^( 'set-le' atomSetTerm atomIntTerm ) | ^( LOCSUBSET atomLsetTerm atomLsetTerm ) | ^( INTMSUBSET atomMsetTerm atomMsetTerm ) )
			int alt27=23;
			switch ( input.LA(1) ) {
			case ATOMBOOL:
			case BVAR:
			case EMP:
			case OLD:
			case REC:
			case RELREC:
			case RESULTFORM:
			case TRUE:
				{
				alt27=1;
				}
				break;
			case CONJ:
			case DISJ:
			case EQUIV:
			case IMPLIES:
			case SEPCONJ:
			case SEPIMPL:
				{
				alt27=2;
				}
				break;
			case NEG:
				{
				alt27=3;
				}
				break;
			case 152:
				{
				alt27=4;
				}
				break;
			case LOCEQ:
				{
				alt27=5;
				}
				break;
			case INTEQ:
				{
				alt27=6;
				}
				break;
			case 91:
				{
				alt27=7;
				}
				break;
			case 92:
				{
				alt27=8;
				}
				break;
			case SETEQ:
				{
				alt27=9;
				}
				break;
			case LSETEQ:
				{
				alt27=10;
				}
				break;
			case MSETEQ:
				{
				alt27=11;
				}
				break;
			case INTMEM:
				{
				alt27=12;
				}
				break;
			case LOCMEM:
				{
				alt27=13;
				}
				break;
			case INTMMEM:
				{
				alt27=14;
				}
				break;
			case INTSUBSET:
				{
				alt27=15;
				}
				break;
			case 126:
				{
				alt27=16;
				}
				break;
			case 118:
				{
				alt27=17;
				}
				break;
			case 127:
				{
				alt27=18;
				}
				break;
			case 144:
				{
				alt27=19;
				}
				break;
			case 119:
				{
				alt27=20;
				}
				break;
			case 143:
				{
				alt27=21;
				}
				break;
			case LOCSUBSET:
				{
				alt27=22;
				}
				break;
			case INTMSUBSET:
				{
				alt27=23;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}
			switch (alt27) {
				case 1 :
					// ImpSyntHoleFinder.g:316:9: atomForm
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomForm_in_formula1898);
					atomForm174=atomForm();
					state._fsp--;

					adaptor.addChild(root_0, atomForm174.getTree());

					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:317:7: ^( binaryConnector atomForm atomForm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_binaryConnector_in_formula1907);
					binaryConnector175=binaryConnector();
					state._fsp--;

					root_1 = (CommonTree)adaptor.becomeRoot(binaryConnector175.getTree(), root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomForm_in_formula1909);
					atomForm176=atomForm();
					state._fsp--;

					adaptor.addChild(root_1, atomForm176.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomForm_in_formula1911);
					atomForm177=atomForm();
					state._fsp--;

					adaptor.addChild(root_1, atomForm177.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 3 :
					// ImpSyntHoleFinder.g:318:7: ^( NEG atomForm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					NEG178=(CommonTree)match(input,NEG,FOLLOW_NEG_in_formula1921); 
					NEG178_tree = (CommonTree)adaptor.dupNode(NEG178);


					root_1 = (CommonTree)adaptor.becomeRoot(NEG178_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomForm_in_formula1923);
					atomForm179=atomForm();
					state._fsp--;

					adaptor.addChild(root_1, atomForm179.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 4 :
					// ImpSyntHoleFinder.g:319:7: pointsTo
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_pointsTo_in_formula1932);
					pointsTo180=pointsTo();
					state._fsp--;

					adaptor.addChild(root_0, pointsTo180.getTree());

					}
					break;
				case 5 :
					// ImpSyntHoleFinder.g:320:7: ^( LOCEQ locTerm locTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					LOCEQ181=(CommonTree)match(input,LOCEQ,FOLLOW_LOCEQ_in_formula1941); 
					LOCEQ181_tree = (CommonTree)adaptor.dupNode(LOCEQ181);


					root_1 = (CommonTree)adaptor.becomeRoot(LOCEQ181_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_locTerm_in_formula1943);
					locTerm182=locTerm();
					state._fsp--;

					adaptor.addChild(root_1, locTerm182.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_locTerm_in_formula1945);
					locTerm183=locTerm();
					state._fsp--;

					adaptor.addChild(root_1, locTerm183.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 6 :
					// ImpSyntHoleFinder.g:321:7: ^( INTEQ atomIntTerm atomIntTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					INTEQ184=(CommonTree)match(input,INTEQ,FOLLOW_INTEQ_in_formula1955); 
					INTEQ184_tree = (CommonTree)adaptor.dupNode(INTEQ184);


					root_1 = (CommonTree)adaptor.becomeRoot(INTEQ184_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_formula1957);
					atomIntTerm185=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm185.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_formula1959);
					atomIntTerm186=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm186.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 7 :
					// ImpSyntHoleFinder.g:322:7: ^( '<' atomIntTerm atomIntTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					char_literal187=(CommonTree)match(input,91,FOLLOW_91_in_formula1969); 
					char_literal187_tree = (CommonTree)adaptor.dupNode(char_literal187);


					root_1 = (CommonTree)adaptor.becomeRoot(char_literal187_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_formula1971);
					atomIntTerm188=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm188.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_formula1973);
					atomIntTerm189=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm189.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 8 :
					// ImpSyntHoleFinder.g:323:7: ^( '<=' atomIntTerm atomIntTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					string_literal190=(CommonTree)match(input,92,FOLLOW_92_in_formula1983); 
					string_literal190_tree = (CommonTree)adaptor.dupNode(string_literal190);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal190_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_formula1985);
					atomIntTerm191=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm191.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_formula1987);
					atomIntTerm192=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm192.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 9 :
					// ImpSyntHoleFinder.g:324:7: ^( SETEQ atomSetTerm atomSetTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					SETEQ193=(CommonTree)match(input,SETEQ,FOLLOW_SETEQ_in_formula1997); 
					SETEQ193_tree = (CommonTree)adaptor.dupNode(SETEQ193);


					root_1 = (CommonTree)adaptor.becomeRoot(SETEQ193_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomSetTerm_in_formula1999);
					atomSetTerm194=atomSetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomSetTerm194.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomSetTerm_in_formula2001);
					atomSetTerm195=atomSetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomSetTerm195.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 10 :
					// ImpSyntHoleFinder.g:325:7: ^( LSETEQ atomLsetTerm atomLsetTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					LSETEQ196=(CommonTree)match(input,LSETEQ,FOLLOW_LSETEQ_in_formula2011); 
					LSETEQ196_tree = (CommonTree)adaptor.dupNode(LSETEQ196);


					root_1 = (CommonTree)adaptor.becomeRoot(LSETEQ196_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomLsetTerm_in_formula2013);
					atomLsetTerm197=atomLsetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomLsetTerm197.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomLsetTerm_in_formula2015);
					atomLsetTerm198=atomLsetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomLsetTerm198.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 11 :
					// ImpSyntHoleFinder.g:326:7: ^( MSETEQ atomMsetTerm atomMsetTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					MSETEQ199=(CommonTree)match(input,MSETEQ,FOLLOW_MSETEQ_in_formula2025); 
					MSETEQ199_tree = (CommonTree)adaptor.dupNode(MSETEQ199);


					root_1 = (CommonTree)adaptor.becomeRoot(MSETEQ199_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomMsetTerm_in_formula2027);
					atomMsetTerm200=atomMsetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomMsetTerm200.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomMsetTerm_in_formula2029);
					atomMsetTerm201=atomMsetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomMsetTerm201.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 12 :
					// ImpSyntHoleFinder.g:327:7: ^( INTMEM atomIntTerm atomSetTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					INTMEM202=(CommonTree)match(input,INTMEM,FOLLOW_INTMEM_in_formula2039); 
					INTMEM202_tree = (CommonTree)adaptor.dupNode(INTMEM202);


					root_1 = (CommonTree)adaptor.becomeRoot(INTMEM202_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_formula2041);
					atomIntTerm203=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm203.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomSetTerm_in_formula2043);
					atomSetTerm204=atomSetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomSetTerm204.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 13 :
					// ImpSyntHoleFinder.g:328:7: ^( LOCMEM locTerm atomLsetTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					LOCMEM205=(CommonTree)match(input,LOCMEM,FOLLOW_LOCMEM_in_formula2053); 
					LOCMEM205_tree = (CommonTree)adaptor.dupNode(LOCMEM205);


					root_1 = (CommonTree)adaptor.becomeRoot(LOCMEM205_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_locTerm_in_formula2055);
					locTerm206=locTerm();
					state._fsp--;

					adaptor.addChild(root_1, locTerm206.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomLsetTerm_in_formula2057);
					atomLsetTerm207=atomLsetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomLsetTerm207.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 14 :
					// ImpSyntHoleFinder.g:329:7: ^( INTMMEM atomIntTerm atomMsetTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					INTMMEM208=(CommonTree)match(input,INTMMEM,FOLLOW_INTMMEM_in_formula2067); 
					INTMMEM208_tree = (CommonTree)adaptor.dupNode(INTMMEM208);


					root_1 = (CommonTree)adaptor.becomeRoot(INTMMEM208_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_formula2069);
					atomIntTerm209=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm209.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomMsetTerm_in_formula2071);
					atomMsetTerm210=atomMsetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomMsetTerm210.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 15 :
					// ImpSyntHoleFinder.g:330:7: ^( INTSUBSET atomSetTerm atomSetTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					INTSUBSET211=(CommonTree)match(input,INTSUBSET,FOLLOW_INTSUBSET_in_formula2081); 
					INTSUBSET211_tree = (CommonTree)adaptor.dupNode(INTSUBSET211);


					root_1 = (CommonTree)adaptor.becomeRoot(INTSUBSET211_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomSetTerm_in_formula2083);
					atomSetTerm212=atomSetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomSetTerm212.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomSetTerm_in_formula2085);
					atomSetTerm213=atomSetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomSetTerm213.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 16 :
					// ImpSyntHoleFinder.g:331:7: ^( 'lt' atomSetTerm atomSetTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					string_literal214=(CommonTree)match(input,126,FOLLOW_126_in_formula2095); 
					string_literal214_tree = (CommonTree)adaptor.dupNode(string_literal214);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal214_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomSetTerm_in_formula2097);
					atomSetTerm215=atomSetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomSetTerm215.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomSetTerm_in_formula2099);
					atomSetTerm216=atomSetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomSetTerm216.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 17 :
					// ImpSyntHoleFinder.g:332:7: ^( 'le' atomSetTerm atomSetTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					string_literal217=(CommonTree)match(input,118,FOLLOW_118_in_formula2109); 
					string_literal217_tree = (CommonTree)adaptor.dupNode(string_literal217);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal217_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomSetTerm_in_formula2111);
					atomSetTerm218=atomSetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomSetTerm218.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomSetTerm_in_formula2113);
					atomSetTerm219=atomSetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomSetTerm219.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 18 :
					// ImpSyntHoleFinder.g:333:7: ^( 'lt-set' atomIntTerm atomSetTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					string_literal220=(CommonTree)match(input,127,FOLLOW_127_in_formula2123); 
					string_literal220_tree = (CommonTree)adaptor.dupNode(string_literal220);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal220_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_formula2125);
					atomIntTerm221=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm221.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomSetTerm_in_formula2127);
					atomSetTerm222=atomSetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomSetTerm222.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 19 :
					// ImpSyntHoleFinder.g:334:7: ^( 'set-lt' atomSetTerm atomIntTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					string_literal223=(CommonTree)match(input,144,FOLLOW_144_in_formula2137); 
					string_literal223_tree = (CommonTree)adaptor.dupNode(string_literal223);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal223_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomSetTerm_in_formula2139);
					atomSetTerm224=atomSetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomSetTerm224.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_formula2141);
					atomIntTerm225=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm225.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 20 :
					// ImpSyntHoleFinder.g:335:7: ^( 'le-set' atomIntTerm atomSetTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					string_literal226=(CommonTree)match(input,119,FOLLOW_119_in_formula2151); 
					string_literal226_tree = (CommonTree)adaptor.dupNode(string_literal226);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal226_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_formula2153);
					atomIntTerm227=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm227.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomSetTerm_in_formula2155);
					atomSetTerm228=atomSetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomSetTerm228.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 21 :
					// ImpSyntHoleFinder.g:336:7: ^( 'set-le' atomSetTerm atomIntTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					string_literal229=(CommonTree)match(input,143,FOLLOW_143_in_formula2165); 
					string_literal229_tree = (CommonTree)adaptor.dupNode(string_literal229);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal229_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomSetTerm_in_formula2167);
					atomSetTerm230=atomSetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomSetTerm230.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_formula2169);
					atomIntTerm231=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm231.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 22 :
					// ImpSyntHoleFinder.g:337:7: ^( LOCSUBSET atomLsetTerm atomLsetTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					LOCSUBSET232=(CommonTree)match(input,LOCSUBSET,FOLLOW_LOCSUBSET_in_formula2179); 
					LOCSUBSET232_tree = (CommonTree)adaptor.dupNode(LOCSUBSET232);


					root_1 = (CommonTree)adaptor.becomeRoot(LOCSUBSET232_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomLsetTerm_in_formula2181);
					atomLsetTerm233=atomLsetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomLsetTerm233.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomLsetTerm_in_formula2183);
					atomLsetTerm234=atomLsetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomLsetTerm234.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 23 :
					// ImpSyntHoleFinder.g:338:7: ^( INTMSUBSET atomMsetTerm atomMsetTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					INTMSUBSET235=(CommonTree)match(input,INTMSUBSET,FOLLOW_INTMSUBSET_in_formula2193); 
					INTMSUBSET235_tree = (CommonTree)adaptor.dupNode(INTMSUBSET235);


					root_1 = (CommonTree)adaptor.becomeRoot(INTMSUBSET235_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomMsetTerm_in_formula2195);
					atomMsetTerm236=atomMsetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomMsetTerm236.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomMsetTerm_in_formula2197);
					atomMsetTerm237=atomMsetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomMsetTerm237.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "formula"


	public static class binaryConnector_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "binaryConnector"
	// ImpSyntHoleFinder.g:341:1: binaryConnector : ( CONJ | DISJ | IMPLIES | EQUIV | SEPCONJ | SEPIMPL );
	public final ImpSyntHoleFinder.binaryConnector_return binaryConnector() throws RecognitionException {
		ImpSyntHoleFinder.binaryConnector_return retval = new ImpSyntHoleFinder.binaryConnector_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree set238=null;

		CommonTree set238_tree=null;

		try {
			// ImpSyntHoleFinder.g:342:5: ( CONJ | DISJ | IMPLIES | EQUIV | SEPCONJ | SEPIMPL )
			// ImpSyntHoleFinder.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			set238=(CommonTree)input.LT(1);
			if ( input.LA(1)==CONJ||input.LA(1)==DISJ||input.LA(1)==EQUIV||input.LA(1)==IMPLIES||(input.LA(1) >= SEPCONJ && input.LA(1) <= SEPIMPL) ) {
				input.consume();
				set238_tree = (CommonTree)adaptor.dupNode(set238);


				adaptor.addChild(root_0, set238_tree);

				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

			 

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "binaryConnector"


	public static class atomForm_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "atomForm"
	// ImpSyntHoleFinder.g:350:1: atomForm : ( ^( ATOMBOOL formula ) | TRUE | EMP | RESULTFORM | bVar | relRec | rec | ^( OLD formula ) );
	public final ImpSyntHoleFinder.atomForm_return atomForm() throws RecognitionException {
		ImpSyntHoleFinder.atomForm_return retval = new ImpSyntHoleFinder.atomForm_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree ATOMBOOL239=null;
		CommonTree TRUE241=null;
		CommonTree EMP242=null;
		CommonTree RESULTFORM243=null;
		CommonTree OLD247=null;
		TreeRuleReturnScope formula240 =null;
		TreeRuleReturnScope bVar244 =null;
		TreeRuleReturnScope relRec245 =null;
		TreeRuleReturnScope rec246 =null;
		TreeRuleReturnScope formula248 =null;

		CommonTree ATOMBOOL239_tree=null;
		CommonTree TRUE241_tree=null;
		CommonTree EMP242_tree=null;
		CommonTree RESULTFORM243_tree=null;
		CommonTree OLD247_tree=null;

		try {
			// ImpSyntHoleFinder.g:351:5: ( ^( ATOMBOOL formula ) | TRUE | EMP | RESULTFORM | bVar | relRec | rec | ^( OLD formula ) )
			int alt28=8;
			switch ( input.LA(1) ) {
			case ATOMBOOL:
				{
				alt28=1;
				}
				break;
			case TRUE:
				{
				alt28=2;
				}
				break;
			case EMP:
				{
				alt28=3;
				}
				break;
			case RESULTFORM:
				{
				alt28=4;
				}
				break;
			case BVAR:
				{
				alt28=5;
				}
				break;
			case RELREC:
				{
				alt28=6;
				}
				break;
			case REC:
				{
				alt28=7;
				}
				break;
			case OLD:
				{
				alt28=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}
			switch (alt28) {
				case 1 :
					// ImpSyntHoleFinder.g:351:9: ^( ATOMBOOL formula )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					ATOMBOOL239=(CommonTree)match(input,ATOMBOOL,FOLLOW_ATOMBOOL_in_atomForm2275); 
					ATOMBOOL239_tree = (CommonTree)adaptor.dupNode(ATOMBOOL239);


					root_1 = (CommonTree)adaptor.becomeRoot(ATOMBOOL239_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_formula_in_atomForm2277);
					formula240=formula();
					state._fsp--;

					adaptor.addChild(root_1, formula240.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:352:7: TRUE
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					TRUE241=(CommonTree)match(input,TRUE,FOLLOW_TRUE_in_atomForm2286); 
					TRUE241_tree = (CommonTree)adaptor.dupNode(TRUE241);


					adaptor.addChild(root_0, TRUE241_tree);

					}
					break;
				case 3 :
					// ImpSyntHoleFinder.g:353:7: EMP
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					EMP242=(CommonTree)match(input,EMP,FOLLOW_EMP_in_atomForm2294); 
					EMP242_tree = (CommonTree)adaptor.dupNode(EMP242);


					adaptor.addChild(root_0, EMP242_tree);

					}
					break;
				case 4 :
					// ImpSyntHoleFinder.g:354:7: RESULTFORM
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					RESULTFORM243=(CommonTree)match(input,RESULTFORM,FOLLOW_RESULTFORM_in_atomForm2302); 
					RESULTFORM243_tree = (CommonTree)adaptor.dupNode(RESULTFORM243);


					adaptor.addChild(root_0, RESULTFORM243_tree);

					}
					break;
				case 5 :
					// ImpSyntHoleFinder.g:355:7: bVar
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_bVar_in_atomForm2310);
					bVar244=bVar();
					state._fsp--;

					adaptor.addChild(root_0, bVar244.getTree());

					}
					break;
				case 6 :
					// ImpSyntHoleFinder.g:356:7: relRec
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_relRec_in_atomForm2318);
					relRec245=relRec();
					state._fsp--;

					adaptor.addChild(root_0, relRec245.getTree());

					}
					break;
				case 7 :
					// ImpSyntHoleFinder.g:357:7: rec
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_rec_in_atomForm2326);
					rec246=rec();
					state._fsp--;

					adaptor.addChild(root_0, rec246.getTree());

					}
					break;
				case 8 :
					// ImpSyntHoleFinder.g:358:7: ^( OLD formula )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					OLD247=(CommonTree)match(input,OLD,FOLLOW_OLD_in_atomForm2335); 
					OLD247_tree = (CommonTree)adaptor.dupNode(OLD247);


					root_1 = (CommonTree)adaptor.becomeRoot(OLD247_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_formula_in_atomForm2337);
					formula248=formula();
					state._fsp--;

					adaptor.addChild(root_1, formula248.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atomForm"


	public static class pointsTo_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "pointsTo"
	// ImpSyntHoleFinder.g:361:1: pointsTo : ^( '|->' locTerm ( fieldVal )+ ) ;
	public final ImpSyntHoleFinder.pointsTo_return pointsTo() throws RecognitionException {
		ImpSyntHoleFinder.pointsTo_return retval = new ImpSyntHoleFinder.pointsTo_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal249=null;
		TreeRuleReturnScope locTerm250 =null;
		TreeRuleReturnScope fieldVal251 =null;

		CommonTree string_literal249_tree=null;

		try {
			// ImpSyntHoleFinder.g:362:5: ( ^( '|->' locTerm ( fieldVal )+ ) )
			// ImpSyntHoleFinder.g:362:9: ^( '|->' locTerm ( fieldVal )+ )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			string_literal249=(CommonTree)match(input,152,FOLLOW_152_in_pointsTo2356); 
			string_literal249_tree = (CommonTree)adaptor.dupNode(string_literal249);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal249_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_locTerm_in_pointsTo2358);
			locTerm250=locTerm();
			state._fsp--;

			adaptor.addChild(root_1, locTerm250.getTree());

			// ImpSyntHoleFinder.g:362:25: ( fieldVal )+
			int cnt29=0;
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==89) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// ImpSyntHoleFinder.g:362:25: fieldVal
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_fieldVal_in_pointsTo2360);
					fieldVal251=fieldVal();
					state._fsp--;

					adaptor.addChild(root_1, fieldVal251.getTree());

					}
					break;

				default :
					if ( cnt29 >= 1 ) break loop29;
					EarlyExitException eee = new EarlyExitException(29, input);
					throw eee;
				}
				cnt29++;
			}

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "pointsTo"


	public static class fieldVal_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "fieldVal"
	// ImpSyntHoleFinder.g:365:1: fieldVal : ( ^( ':' ITYPE field iVar ) | ^( ':' LTYPE dir lVar ) | ^( ':' SLTYPE dir lVar ) | ^( ':' ITYPE field 'virtual' iVar ) | ^( ':' LTYPE dir 'virtual' lVar ) );
	public final ImpSyntHoleFinder.fieldVal_return fieldVal() throws RecognitionException {
		ImpSyntHoleFinder.fieldVal_return retval = new ImpSyntHoleFinder.fieldVal_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree char_literal252=null;
		CommonTree ITYPE253=null;
		CommonTree char_literal256=null;
		CommonTree LTYPE257=null;
		CommonTree char_literal260=null;
		CommonTree SLTYPE261=null;
		CommonTree char_literal264=null;
		CommonTree ITYPE265=null;
		CommonTree string_literal267=null;
		CommonTree char_literal269=null;
		CommonTree LTYPE270=null;
		CommonTree string_literal272=null;
		TreeRuleReturnScope field254 =null;
		TreeRuleReturnScope iVar255 =null;
		TreeRuleReturnScope dir258 =null;
		TreeRuleReturnScope lVar259 =null;
		TreeRuleReturnScope dir262 =null;
		TreeRuleReturnScope lVar263 =null;
		TreeRuleReturnScope field266 =null;
		TreeRuleReturnScope iVar268 =null;
		TreeRuleReturnScope dir271 =null;
		TreeRuleReturnScope lVar273 =null;

		CommonTree char_literal252_tree=null;
		CommonTree ITYPE253_tree=null;
		CommonTree char_literal256_tree=null;
		CommonTree LTYPE257_tree=null;
		CommonTree char_literal260_tree=null;
		CommonTree SLTYPE261_tree=null;
		CommonTree char_literal264_tree=null;
		CommonTree ITYPE265_tree=null;
		CommonTree string_literal267_tree=null;
		CommonTree char_literal269_tree=null;
		CommonTree LTYPE270_tree=null;
		CommonTree string_literal272_tree=null;

		try {
			// ImpSyntHoleFinder.g:366:5: ( ^( ':' ITYPE field iVar ) | ^( ':' LTYPE dir lVar ) | ^( ':' SLTYPE dir lVar ) | ^( ':' ITYPE field 'virtual' iVar ) | ^( ':' LTYPE dir 'virtual' lVar ) )
			int alt30=5;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==89) ) {
				int LA30_1 = input.LA(2);
				if ( (LA30_1==DOWN) ) {
					switch ( input.LA(3) ) {
					case ITYPE:
						{
						int LA30_3 = input.LA(4);
						if ( (LA30_3==ID) ) {
							int LA30_6 = input.LA(5);
							if ( (LA30_6==IVAR) ) {
								alt30=1;
							}
							else if ( (LA30_6==149) ) {
								alt30=4;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 30, 6, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 30, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case LTYPE:
						{
						int LA30_4 = input.LA(4);
						if ( (LA30_4==ID||LA30_4==QMARK) ) {
							int LA30_7 = input.LA(5);
							if ( (LA30_7==LVAR) ) {
								alt30=2;
							}
							else if ( (LA30_7==149) ) {
								alt30=5;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 30, 7, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 30, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case SLTYPE:
						{
						alt30=3;
						}
						break;
					default:
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 30, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 30, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// ImpSyntHoleFinder.g:366:9: ^( ':' ITYPE field iVar )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					char_literal252=(CommonTree)match(input,89,FOLLOW_89_in_fieldVal2382); 
					char_literal252_tree = (CommonTree)adaptor.dupNode(char_literal252);


					root_1 = (CommonTree)adaptor.becomeRoot(char_literal252_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					ITYPE253=(CommonTree)match(input,ITYPE,FOLLOW_ITYPE_in_fieldVal2384); 
					ITYPE253_tree = (CommonTree)adaptor.dupNode(ITYPE253);


					adaptor.addChild(root_1, ITYPE253_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_field_in_fieldVal2386);
					field254=field();
					state._fsp--;

					adaptor.addChild(root_1, field254.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_iVar_in_fieldVal2388);
					iVar255=iVar();
					state._fsp--;

					adaptor.addChild(root_1, iVar255.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:367:7: ^( ':' LTYPE dir lVar )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					char_literal256=(CommonTree)match(input,89,FOLLOW_89_in_fieldVal2399); 
					char_literal256_tree = (CommonTree)adaptor.dupNode(char_literal256);


					root_1 = (CommonTree)adaptor.becomeRoot(char_literal256_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					LTYPE257=(CommonTree)match(input,LTYPE,FOLLOW_LTYPE_in_fieldVal2401); 
					LTYPE257_tree = (CommonTree)adaptor.dupNode(LTYPE257);


					adaptor.addChild(root_1, LTYPE257_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_dir_in_fieldVal2403);
					dir258=dir();
					state._fsp--;

					adaptor.addChild(root_1, dir258.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lVar_in_fieldVal2405);
					lVar259=lVar();
					state._fsp--;

					adaptor.addChild(root_1, lVar259.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 3 :
					// ImpSyntHoleFinder.g:368:7: ^( ':' SLTYPE dir lVar )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					char_literal260=(CommonTree)match(input,89,FOLLOW_89_in_fieldVal2416); 
					char_literal260_tree = (CommonTree)adaptor.dupNode(char_literal260);


					root_1 = (CommonTree)adaptor.becomeRoot(char_literal260_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					SLTYPE261=(CommonTree)match(input,SLTYPE,FOLLOW_SLTYPE_in_fieldVal2418); 
					SLTYPE261_tree = (CommonTree)adaptor.dupNode(SLTYPE261);


					adaptor.addChild(root_1, SLTYPE261_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_dir_in_fieldVal2420);
					dir262=dir();
					state._fsp--;

					adaptor.addChild(root_1, dir262.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lVar_in_fieldVal2422);
					lVar263=lVar();
					state._fsp--;

					adaptor.addChild(root_1, lVar263.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 4 :
					// ImpSyntHoleFinder.g:369:7: ^( ':' ITYPE field 'virtual' iVar )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					char_literal264=(CommonTree)match(input,89,FOLLOW_89_in_fieldVal2433); 
					char_literal264_tree = (CommonTree)adaptor.dupNode(char_literal264);


					root_1 = (CommonTree)adaptor.becomeRoot(char_literal264_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					ITYPE265=(CommonTree)match(input,ITYPE,FOLLOW_ITYPE_in_fieldVal2435); 
					ITYPE265_tree = (CommonTree)adaptor.dupNode(ITYPE265);


					adaptor.addChild(root_1, ITYPE265_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_field_in_fieldVal2437);
					field266=field();
					state._fsp--;

					adaptor.addChild(root_1, field266.getTree());

					_last = (CommonTree)input.LT(1);
					string_literal267=(CommonTree)match(input,149,FOLLOW_149_in_fieldVal2439); 
					string_literal267_tree = (CommonTree)adaptor.dupNode(string_literal267);


					adaptor.addChild(root_1, string_literal267_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_iVar_in_fieldVal2441);
					iVar268=iVar();
					state._fsp--;

					adaptor.addChild(root_1, iVar268.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 5 :
					// ImpSyntHoleFinder.g:370:7: ^( ':' LTYPE dir 'virtual' lVar )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					char_literal269=(CommonTree)match(input,89,FOLLOW_89_in_fieldVal2452); 
					char_literal269_tree = (CommonTree)adaptor.dupNode(char_literal269);


					root_1 = (CommonTree)adaptor.becomeRoot(char_literal269_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					LTYPE270=(CommonTree)match(input,LTYPE,FOLLOW_LTYPE_in_fieldVal2454); 
					LTYPE270_tree = (CommonTree)adaptor.dupNode(LTYPE270);


					adaptor.addChild(root_1, LTYPE270_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_dir_in_fieldVal2456);
					dir271=dir();
					state._fsp--;

					adaptor.addChild(root_1, dir271.getTree());

					_last = (CommonTree)input.LT(1);
					string_literal272=(CommonTree)match(input,149,FOLLOW_149_in_fieldVal2458); 
					string_literal272_tree = (CommonTree)adaptor.dupNode(string_literal272);


					adaptor.addChild(root_1, string_literal272_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lVar_in_fieldVal2460);
					lVar273=lVar();
					state._fsp--;

					adaptor.addChild(root_1, lVar273.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fieldVal"


	public static class locTerm_return extends TreeRuleReturnScope {
		public String value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "locTerm"
	// ImpSyntHoleFinder.g:373:1: locTerm returns [String value] : ( NIL | RESULTLOC | lVar | ^( OLD n= locTerm ) );
	public final ImpSyntHoleFinder.locTerm_return locTerm() throws RecognitionException {
		ImpSyntHoleFinder.locTerm_return retval = new ImpSyntHoleFinder.locTerm_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree NIL274=null;
		CommonTree RESULTLOC275=null;
		CommonTree OLD277=null;
		TreeRuleReturnScope n =null;
		TreeRuleReturnScope lVar276 =null;

		CommonTree NIL274_tree=null;
		CommonTree RESULTLOC275_tree=null;
		CommonTree OLD277_tree=null;

		try {
			// ImpSyntHoleFinder.g:374:5: ( NIL | RESULTLOC | lVar | ^( OLD n= locTerm ) )
			int alt31=4;
			switch ( input.LA(1) ) {
			case NIL:
				{
				alt31=1;
				}
				break;
			case RESULTLOC:
				{
				alt31=2;
				}
				break;
			case LVAR:
				{
				alt31=3;
				}
				break;
			case OLD:
				{
				alt31=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// ImpSyntHoleFinder.g:374:9: NIL
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					NIL274=(CommonTree)match(input,NIL,FOLLOW_NIL_in_locTerm2483); 
					NIL274_tree = (CommonTree)adaptor.dupNode(NIL274);


					adaptor.addChild(root_0, NIL274_tree);

					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:375:7: RESULTLOC
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					RESULTLOC275=(CommonTree)match(input,RESULTLOC,FOLLOW_RESULTLOC_in_locTerm2492); 
					RESULTLOC275_tree = (CommonTree)adaptor.dupNode(RESULTLOC275);


					adaptor.addChild(root_0, RESULTLOC275_tree);

					}
					break;
				case 3 :
					// ImpSyntHoleFinder.g:376:7: lVar
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lVar_in_locTerm2501);
					lVar276=lVar();
					state._fsp--;

					adaptor.addChild(root_0, lVar276.getTree());

					}
					break;
				case 4 :
					// ImpSyntHoleFinder.g:377:7: ^( OLD n= locTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					OLD277=(CommonTree)match(input,OLD,FOLLOW_OLD_in_locTerm2510); 
					OLD277_tree = (CommonTree)adaptor.dupNode(OLD277);


					root_1 = (CommonTree)adaptor.becomeRoot(OLD277_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_locTerm_in_locTerm2514);
					n=locTerm();
					state._fsp--;

					adaptor.addChild(root_1, n.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "locTerm"


	public static class intTerm_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "intTerm"
	// ImpSyntHoleFinder.g:380:1: intTerm : ( atomIntTerm | ^( '+' atomIntTerm atomIntTerm ) | ^( '-' atomIntTerm atomIntTerm ) | ^( '?' atomForm atomIntTerm atomIntTerm ) );
	public final ImpSyntHoleFinder.intTerm_return intTerm() throws RecognitionException {
		ImpSyntHoleFinder.intTerm_return retval = new ImpSyntHoleFinder.intTerm_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree char_literal279=null;
		CommonTree char_literal282=null;
		CommonTree char_literal285=null;
		TreeRuleReturnScope atomIntTerm278 =null;
		TreeRuleReturnScope atomIntTerm280 =null;
		TreeRuleReturnScope atomIntTerm281 =null;
		TreeRuleReturnScope atomIntTerm283 =null;
		TreeRuleReturnScope atomIntTerm284 =null;
		TreeRuleReturnScope atomForm286 =null;
		TreeRuleReturnScope atomIntTerm287 =null;
		TreeRuleReturnScope atomIntTerm288 =null;

		CommonTree char_literal279_tree=null;
		CommonTree char_literal282_tree=null;
		CommonTree char_literal285_tree=null;

		try {
			// ImpSyntHoleFinder.g:381:5: ( atomIntTerm | ^( '+' atomIntTerm atomIntTerm ) | ^( '-' atomIntTerm atomIntTerm ) | ^( '?' atomForm atomIntTerm atomIntTerm ) )
			int alt32=4;
			switch ( input.LA(1) ) {
			case ATOMINT:
			case BIREC:
			case BOT:
			case INT:
			case IREC:
			case IVAR:
			case OLD:
			case RESULTINT:
			case TOP:
				{
				alt32=1;
				}
				break;
			case 85:
				{
				alt32=2;
				}
				break;
			case 87:
				{
				alt32=3;
				}
				break;
			case 93:
				{
				alt32=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}
			switch (alt32) {
				case 1 :
					// ImpSyntHoleFinder.g:381:9: atomIntTerm
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_intTerm2534);
					atomIntTerm278=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_0, atomIntTerm278.getTree());

					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:382:7: ^( '+' atomIntTerm atomIntTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					char_literal279=(CommonTree)match(input,85,FOLLOW_85_in_intTerm2543); 
					char_literal279_tree = (CommonTree)adaptor.dupNode(char_literal279);


					root_1 = (CommonTree)adaptor.becomeRoot(char_literal279_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_intTerm2545);
					atomIntTerm280=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm280.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_intTerm2547);
					atomIntTerm281=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm281.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 3 :
					// ImpSyntHoleFinder.g:383:7: ^( '-' atomIntTerm atomIntTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					char_literal282=(CommonTree)match(input,87,FOLLOW_87_in_intTerm2557); 
					char_literal282_tree = (CommonTree)adaptor.dupNode(char_literal282);


					root_1 = (CommonTree)adaptor.becomeRoot(char_literal282_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_intTerm2559);
					atomIntTerm283=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm283.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_intTerm2561);
					atomIntTerm284=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm284.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 4 :
					// ImpSyntHoleFinder.g:384:7: ^( '?' atomForm atomIntTerm atomIntTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					char_literal285=(CommonTree)match(input,93,FOLLOW_93_in_intTerm2571); 
					char_literal285_tree = (CommonTree)adaptor.dupNode(char_literal285);


					root_1 = (CommonTree)adaptor.becomeRoot(char_literal285_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomForm_in_intTerm2573);
					atomForm286=atomForm();
					state._fsp--;

					adaptor.addChild(root_1, atomForm286.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_intTerm2575);
					atomIntTerm287=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm287.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_intTerm2577);
					atomIntTerm288=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm288.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "intTerm"


	public static class atomIntTerm_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "atomIntTerm"
	// ImpSyntHoleFinder.g:387:1: atomIntTerm : ( ^( ATOMINT intTerm ) | INT | RESULTINT | iVar | iRec | biRec | BOT | TOP | ^( OLD intTerm ) );
	public final ImpSyntHoleFinder.atomIntTerm_return atomIntTerm() throws RecognitionException {
		ImpSyntHoleFinder.atomIntTerm_return retval = new ImpSyntHoleFinder.atomIntTerm_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree ATOMINT289=null;
		CommonTree INT291=null;
		CommonTree RESULTINT292=null;
		CommonTree BOT296=null;
		CommonTree TOP297=null;
		CommonTree OLD298=null;
		TreeRuleReturnScope intTerm290 =null;
		TreeRuleReturnScope iVar293 =null;
		TreeRuleReturnScope iRec294 =null;
		TreeRuleReturnScope biRec295 =null;
		TreeRuleReturnScope intTerm299 =null;

		CommonTree ATOMINT289_tree=null;
		CommonTree INT291_tree=null;
		CommonTree RESULTINT292_tree=null;
		CommonTree BOT296_tree=null;
		CommonTree TOP297_tree=null;
		CommonTree OLD298_tree=null;

		try {
			// ImpSyntHoleFinder.g:388:5: ( ^( ATOMINT intTerm ) | INT | RESULTINT | iVar | iRec | biRec | BOT | TOP | ^( OLD intTerm ) )
			int alt33=9;
			switch ( input.LA(1) ) {
			case ATOMINT:
				{
				alt33=1;
				}
				break;
			case INT:
				{
				alt33=2;
				}
				break;
			case RESULTINT:
				{
				alt33=3;
				}
				break;
			case IVAR:
				{
				alt33=4;
				}
				break;
			case IREC:
				{
				alt33=5;
				}
				break;
			case BIREC:
				{
				alt33=6;
				}
				break;
			case BOT:
				{
				alt33=7;
				}
				break;
			case TOP:
				{
				alt33=8;
				}
				break;
			case OLD:
				{
				alt33=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}
			switch (alt33) {
				case 1 :
					// ImpSyntHoleFinder.g:388:9: ^( ATOMINT intTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					ATOMINT289=(CommonTree)match(input,ATOMINT,FOLLOW_ATOMINT_in_atomIntTerm2596); 
					ATOMINT289_tree = (CommonTree)adaptor.dupNode(ATOMINT289);


					root_1 = (CommonTree)adaptor.becomeRoot(ATOMINT289_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_intTerm_in_atomIntTerm2598);
					intTerm290=intTerm();
					state._fsp--;

					adaptor.addChild(root_1, intTerm290.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:389:7: INT
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					INT291=(CommonTree)match(input,INT,FOLLOW_INT_in_atomIntTerm2607); 
					INT291_tree = (CommonTree)adaptor.dupNode(INT291);


					adaptor.addChild(root_0, INT291_tree);

					}
					break;
				case 3 :
					// ImpSyntHoleFinder.g:390:7: RESULTINT
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					RESULTINT292=(CommonTree)match(input,RESULTINT,FOLLOW_RESULTINT_in_atomIntTerm2615); 
					RESULTINT292_tree = (CommonTree)adaptor.dupNode(RESULTINT292);


					adaptor.addChild(root_0, RESULTINT292_tree);

					}
					break;
				case 4 :
					// ImpSyntHoleFinder.g:391:7: iVar
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_iVar_in_atomIntTerm2623);
					iVar293=iVar();
					state._fsp--;

					adaptor.addChild(root_0, iVar293.getTree());

					}
					break;
				case 5 :
					// ImpSyntHoleFinder.g:392:7: iRec
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_iRec_in_atomIntTerm2631);
					iRec294=iRec();
					state._fsp--;

					adaptor.addChild(root_0, iRec294.getTree());

					}
					break;
				case 6 :
					// ImpSyntHoleFinder.g:393:7: biRec
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_biRec_in_atomIntTerm2639);
					biRec295=biRec();
					state._fsp--;

					adaptor.addChild(root_0, biRec295.getTree());

					}
					break;
				case 7 :
					// ImpSyntHoleFinder.g:394:7: BOT
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					BOT296=(CommonTree)match(input,BOT,FOLLOW_BOT_in_atomIntTerm2647); 
					BOT296_tree = (CommonTree)adaptor.dupNode(BOT296);


					adaptor.addChild(root_0, BOT296_tree);

					}
					break;
				case 8 :
					// ImpSyntHoleFinder.g:395:7: TOP
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					TOP297=(CommonTree)match(input,TOP,FOLLOW_TOP_in_atomIntTerm2655); 
					TOP297_tree = (CommonTree)adaptor.dupNode(TOP297);


					adaptor.addChild(root_0, TOP297_tree);

					}
					break;
				case 9 :
					// ImpSyntHoleFinder.g:396:7: ^( OLD intTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					OLD298=(CommonTree)match(input,OLD,FOLLOW_OLD_in_atomIntTerm2664); 
					OLD298_tree = (CommonTree)adaptor.dupNode(OLD298);


					root_1 = (CommonTree)adaptor.becomeRoot(OLD298_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_intTerm_in_atomIntTerm2666);
					intTerm299=intTerm();
					state._fsp--;

					adaptor.addChild(root_1, intTerm299.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atomIntTerm"


	public static class lsetTerm_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "lsetTerm"
	// ImpSyntHoleFinder.g:399:1: lsetTerm : ( atomLsetTerm | ^( 'lsingleton' locTerm ) | ^( 'lunion' lsetTerm lsetTerm ) | ^( 'lintersection' lsetTerm lsetTerm ) | ^( 'lsetminus' lsetTerm lsetTerm ) | ^( OLD lsetTerm ) );
	public final ImpSyntHoleFinder.lsetTerm_return lsetTerm() throws RecognitionException {
		ImpSyntHoleFinder.lsetTerm_return retval = new ImpSyntHoleFinder.lsetTerm_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal301=null;
		CommonTree string_literal303=null;
		CommonTree string_literal306=null;
		CommonTree string_literal309=null;
		CommonTree OLD312=null;
		TreeRuleReturnScope atomLsetTerm300 =null;
		TreeRuleReturnScope locTerm302 =null;
		TreeRuleReturnScope lsetTerm304 =null;
		TreeRuleReturnScope lsetTerm305 =null;
		TreeRuleReturnScope lsetTerm307 =null;
		TreeRuleReturnScope lsetTerm308 =null;
		TreeRuleReturnScope lsetTerm310 =null;
		TreeRuleReturnScope lsetTerm311 =null;
		TreeRuleReturnScope lsetTerm313 =null;

		CommonTree string_literal301_tree=null;
		CommonTree string_literal303_tree=null;
		CommonTree string_literal306_tree=null;
		CommonTree string_literal309_tree=null;
		CommonTree OLD312_tree=null;

		try {
			// ImpSyntHoleFinder.g:400:5: ( atomLsetTerm | ^( 'lsingleton' locTerm ) | ^( 'lunion' lsetTerm lsetTerm ) | ^( 'lintersection' lsetTerm lsetTerm ) | ^( 'lsetminus' lsetTerm lsetTerm ) | ^( OLD lsetTerm ) )
			int alt34=6;
			switch ( input.LA(1) ) {
			case LSVAR:
			case REC:
			case 103:
				{
				alt34=1;
				}
				break;
			case 125:
				{
				alt34=2;
				}
				break;
			case 128:
				{
				alt34=3;
				}
				break;
			case 120:
				{
				alt34=4;
				}
				break;
			case 124:
				{
				alt34=5;
				}
				break;
			case OLD:
				{
				alt34=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}
			switch (alt34) {
				case 1 :
					// ImpSyntHoleFinder.g:400:9: atomLsetTerm
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomLsetTerm_in_lsetTerm2686);
					atomLsetTerm300=atomLsetTerm();
					state._fsp--;

					adaptor.addChild(root_0, atomLsetTerm300.getTree());

					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:401:7: ^( 'lsingleton' locTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					string_literal301=(CommonTree)match(input,125,FOLLOW_125_in_lsetTerm2695); 
					string_literal301_tree = (CommonTree)adaptor.dupNode(string_literal301);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal301_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_locTerm_in_lsetTerm2697);
					locTerm302=locTerm();
					state._fsp--;

					adaptor.addChild(root_1, locTerm302.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 3 :
					// ImpSyntHoleFinder.g:402:7: ^( 'lunion' lsetTerm lsetTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					string_literal303=(CommonTree)match(input,128,FOLLOW_128_in_lsetTerm2707); 
					string_literal303_tree = (CommonTree)adaptor.dupNode(string_literal303);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal303_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lsetTerm_in_lsetTerm2709);
					lsetTerm304=lsetTerm();
					state._fsp--;

					adaptor.addChild(root_1, lsetTerm304.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lsetTerm_in_lsetTerm2711);
					lsetTerm305=lsetTerm();
					state._fsp--;

					adaptor.addChild(root_1, lsetTerm305.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 4 :
					// ImpSyntHoleFinder.g:403:7: ^( 'lintersection' lsetTerm lsetTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					string_literal306=(CommonTree)match(input,120,FOLLOW_120_in_lsetTerm2721); 
					string_literal306_tree = (CommonTree)adaptor.dupNode(string_literal306);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal306_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lsetTerm_in_lsetTerm2723);
					lsetTerm307=lsetTerm();
					state._fsp--;

					adaptor.addChild(root_1, lsetTerm307.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lsetTerm_in_lsetTerm2725);
					lsetTerm308=lsetTerm();
					state._fsp--;

					adaptor.addChild(root_1, lsetTerm308.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 5 :
					// ImpSyntHoleFinder.g:404:7: ^( 'lsetminus' lsetTerm lsetTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					string_literal309=(CommonTree)match(input,124,FOLLOW_124_in_lsetTerm2735); 
					string_literal309_tree = (CommonTree)adaptor.dupNode(string_literal309);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal309_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lsetTerm_in_lsetTerm2737);
					lsetTerm310=lsetTerm();
					state._fsp--;

					adaptor.addChild(root_1, lsetTerm310.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lsetTerm_in_lsetTerm2739);
					lsetTerm311=lsetTerm();
					state._fsp--;

					adaptor.addChild(root_1, lsetTerm311.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 6 :
					// ImpSyntHoleFinder.g:405:7: ^( OLD lsetTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					OLD312=(CommonTree)match(input,OLD,FOLLOW_OLD_in_lsetTerm2749); 
					OLD312_tree = (CommonTree)adaptor.dupNode(OLD312);


					root_1 = (CommonTree)adaptor.becomeRoot(OLD312_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lsetTerm_in_lsetTerm2751);
					lsetTerm313=lsetTerm();
					state._fsp--;

					adaptor.addChild(root_1, lsetTerm313.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lsetTerm"


	public static class atomLsetTerm_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "atomLsetTerm"
	// ImpSyntHoleFinder.g:408:1: atomLsetTerm : ( 'emptylset' | lsVar | rec );
	public final ImpSyntHoleFinder.atomLsetTerm_return atomLsetTerm() throws RecognitionException {
		ImpSyntHoleFinder.atomLsetTerm_return retval = new ImpSyntHoleFinder.atomLsetTerm_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal314=null;
		TreeRuleReturnScope lsVar315 =null;
		TreeRuleReturnScope rec316 =null;

		CommonTree string_literal314_tree=null;

		try {
			// ImpSyntHoleFinder.g:409:5: ( 'emptylset' | lsVar | rec )
			int alt35=3;
			switch ( input.LA(1) ) {
			case 103:
				{
				alt35=1;
				}
				break;
			case LSVAR:
				{
				alt35=2;
				}
				break;
			case REC:
				{
				alt35=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}
			switch (alt35) {
				case 1 :
					// ImpSyntHoleFinder.g:409:9: 'emptylset'
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					string_literal314=(CommonTree)match(input,103,FOLLOW_103_in_atomLsetTerm2769); 
					string_literal314_tree = (CommonTree)adaptor.dupNode(string_literal314);


					adaptor.addChild(root_0, string_literal314_tree);

					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:410:7: lsVar
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lsVar_in_atomLsetTerm2777);
					lsVar315=lsVar();
					state._fsp--;

					adaptor.addChild(root_0, lsVar315.getTree());

					}
					break;
				case 3 :
					// ImpSyntHoleFinder.g:411:7: rec
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_rec_in_atomLsetTerm2785);
					rec316=rec();
					state._fsp--;

					adaptor.addChild(root_0, rec316.getTree());

					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atomLsetTerm"


	public static class setTerm_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "setTerm"
	// ImpSyntHoleFinder.g:414:1: setTerm : ( atomSetTerm | ^( 'singleton' intTerm ) | ^( 'union' setTerm setTerm ) | ^( 'intersection' setTerm setTerm ) | ^( 'setminus' setTerm setTerm ) | ^( OLD setTerm ) );
	public final ImpSyntHoleFinder.setTerm_return setTerm() throws RecognitionException {
		ImpSyntHoleFinder.setTerm_return retval = new ImpSyntHoleFinder.setTerm_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal318=null;
		CommonTree string_literal320=null;
		CommonTree string_literal323=null;
		CommonTree string_literal326=null;
		CommonTree OLD329=null;
		TreeRuleReturnScope atomSetTerm317 =null;
		TreeRuleReturnScope intTerm319 =null;
		TreeRuleReturnScope setTerm321 =null;
		TreeRuleReturnScope setTerm322 =null;
		TreeRuleReturnScope setTerm324 =null;
		TreeRuleReturnScope setTerm325 =null;
		TreeRuleReturnScope setTerm327 =null;
		TreeRuleReturnScope setTerm328 =null;
		TreeRuleReturnScope setTerm330 =null;

		CommonTree string_literal318_tree=null;
		CommonTree string_literal320_tree=null;
		CommonTree string_literal323_tree=null;
		CommonTree string_literal326_tree=null;
		CommonTree OLD329_tree=null;

		try {
			// ImpSyntHoleFinder.g:415:5: ( atomSetTerm | ^( 'singleton' intTerm ) | ^( 'union' setTerm setTerm ) | ^( 'intersection' setTerm setTerm ) | ^( 'setminus' setTerm setTerm ) | ^( OLD setTerm ) )
			int alt36=6;
			switch ( input.LA(1) ) {
			case REC:
			case SVAR:
			case 105:
				{
				alt36=1;
				}
				break;
			case 147:
				{
				alt36=2;
				}
				break;
			case 148:
				{
				alt36=3;
				}
				break;
			case 113:
				{
				alt36=4;
				}
				break;
			case 145:
				{
				alt36=5;
				}
				break;
			case OLD:
				{
				alt36=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}
			switch (alt36) {
				case 1 :
					// ImpSyntHoleFinder.g:415:9: atomSetTerm
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomSetTerm_in_setTerm2804);
					atomSetTerm317=atomSetTerm();
					state._fsp--;

					adaptor.addChild(root_0, atomSetTerm317.getTree());

					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:416:7: ^( 'singleton' intTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					string_literal318=(CommonTree)match(input,147,FOLLOW_147_in_setTerm2813); 
					string_literal318_tree = (CommonTree)adaptor.dupNode(string_literal318);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal318_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_intTerm_in_setTerm2815);
					intTerm319=intTerm();
					state._fsp--;

					adaptor.addChild(root_1, intTerm319.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 3 :
					// ImpSyntHoleFinder.g:417:7: ^( 'union' setTerm setTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					string_literal320=(CommonTree)match(input,148,FOLLOW_148_in_setTerm2825); 
					string_literal320_tree = (CommonTree)adaptor.dupNode(string_literal320);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal320_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_setTerm_in_setTerm2827);
					setTerm321=setTerm();
					state._fsp--;

					adaptor.addChild(root_1, setTerm321.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_setTerm_in_setTerm2829);
					setTerm322=setTerm();
					state._fsp--;

					adaptor.addChild(root_1, setTerm322.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 4 :
					// ImpSyntHoleFinder.g:418:7: ^( 'intersection' setTerm setTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					string_literal323=(CommonTree)match(input,113,FOLLOW_113_in_setTerm2839); 
					string_literal323_tree = (CommonTree)adaptor.dupNode(string_literal323);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal323_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_setTerm_in_setTerm2841);
					setTerm324=setTerm();
					state._fsp--;

					adaptor.addChild(root_1, setTerm324.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_setTerm_in_setTerm2843);
					setTerm325=setTerm();
					state._fsp--;

					adaptor.addChild(root_1, setTerm325.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 5 :
					// ImpSyntHoleFinder.g:419:7: ^( 'setminus' setTerm setTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					string_literal326=(CommonTree)match(input,145,FOLLOW_145_in_setTerm2853); 
					string_literal326_tree = (CommonTree)adaptor.dupNode(string_literal326);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal326_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_setTerm_in_setTerm2855);
					setTerm327=setTerm();
					state._fsp--;

					adaptor.addChild(root_1, setTerm327.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_setTerm_in_setTerm2857);
					setTerm328=setTerm();
					state._fsp--;

					adaptor.addChild(root_1, setTerm328.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 6 :
					// ImpSyntHoleFinder.g:420:7: ^( OLD setTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					OLD329=(CommonTree)match(input,OLD,FOLLOW_OLD_in_setTerm2867); 
					OLD329_tree = (CommonTree)adaptor.dupNode(OLD329);


					root_1 = (CommonTree)adaptor.becomeRoot(OLD329_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_setTerm_in_setTerm2869);
					setTerm330=setTerm();
					state._fsp--;

					adaptor.addChild(root_1, setTerm330.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "setTerm"


	public static class atomSetTerm_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "atomSetTerm"
	// ImpSyntHoleFinder.g:423:1: atomSetTerm : ( 'emptyset' | sVar | rec );
	public final ImpSyntHoleFinder.atomSetTerm_return atomSetTerm() throws RecognitionException {
		ImpSyntHoleFinder.atomSetTerm_return retval = new ImpSyntHoleFinder.atomSetTerm_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal331=null;
		TreeRuleReturnScope sVar332 =null;
		TreeRuleReturnScope rec333 =null;

		CommonTree string_literal331_tree=null;

		try {
			// ImpSyntHoleFinder.g:424:5: ( 'emptyset' | sVar | rec )
			int alt37=3;
			switch ( input.LA(1) ) {
			case 105:
				{
				alt37=1;
				}
				break;
			case SVAR:
				{
				alt37=2;
				}
				break;
			case REC:
				{
				alt37=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}
			switch (alt37) {
				case 1 :
					// ImpSyntHoleFinder.g:424:9: 'emptyset'
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					string_literal331=(CommonTree)match(input,105,FOLLOW_105_in_atomSetTerm2887); 
					string_literal331_tree = (CommonTree)adaptor.dupNode(string_literal331);


					adaptor.addChild(root_0, string_literal331_tree);

					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:425:7: sVar
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_sVar_in_atomSetTerm2895);
					sVar332=sVar();
					state._fsp--;

					adaptor.addChild(root_0, sVar332.getTree());

					}
					break;
				case 3 :
					// ImpSyntHoleFinder.g:426:7: rec
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_rec_in_atomSetTerm2903);
					rec333=rec();
					state._fsp--;

					adaptor.addChild(root_0, rec333.getTree());

					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atomSetTerm"


	public static class msetTerm_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "msetTerm"
	// ImpSyntHoleFinder.g:429:1: msetTerm : ( atomMsetTerm | ^( 'msingleton' intTerm ) | ^( 'munion' msetTerm msetTerm ) | ^( 'mintersection' msetTerm msetTerm ) | ^( 'msetminus' msetTerm msetTerm ) | ^( OLD msetTerm ) );
	public final ImpSyntHoleFinder.msetTerm_return msetTerm() throws RecognitionException {
		ImpSyntHoleFinder.msetTerm_return retval = new ImpSyntHoleFinder.msetTerm_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal335=null;
		CommonTree string_literal337=null;
		CommonTree string_literal340=null;
		CommonTree string_literal343=null;
		CommonTree OLD346=null;
		TreeRuleReturnScope atomMsetTerm334 =null;
		TreeRuleReturnScope intTerm336 =null;
		TreeRuleReturnScope msetTerm338 =null;
		TreeRuleReturnScope msetTerm339 =null;
		TreeRuleReturnScope msetTerm341 =null;
		TreeRuleReturnScope msetTerm342 =null;
		TreeRuleReturnScope msetTerm344 =null;
		TreeRuleReturnScope msetTerm345 =null;
		TreeRuleReturnScope msetTerm347 =null;

		CommonTree string_literal335_tree=null;
		CommonTree string_literal337_tree=null;
		CommonTree string_literal340_tree=null;
		CommonTree string_literal343_tree=null;
		CommonTree OLD346_tree=null;

		try {
			// ImpSyntHoleFinder.g:430:5: ( atomMsetTerm | ^( 'msingleton' intTerm ) | ^( 'munion' msetTerm msetTerm ) | ^( 'mintersection' msetTerm msetTerm ) | ^( 'msetminus' msetTerm msetTerm ) | ^( OLD msetTerm ) )
			int alt38=6;
			switch ( input.LA(1) ) {
			case MSVAR:
			case REC:
			case 104:
				{
				alt38=1;
				}
				break;
			case 135:
				{
				alt38=2;
				}
				break;
			case 136:
				{
				alt38=3;
				}
				break;
			case 131:
				{
				alt38=4;
				}
				break;
			case 134:
				{
				alt38=5;
				}
				break;
			case OLD:
				{
				alt38=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}
			switch (alt38) {
				case 1 :
					// ImpSyntHoleFinder.g:430:9: atomMsetTerm
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomMsetTerm_in_msetTerm2922);
					atomMsetTerm334=atomMsetTerm();
					state._fsp--;

					adaptor.addChild(root_0, atomMsetTerm334.getTree());

					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:431:7: ^( 'msingleton' intTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					string_literal335=(CommonTree)match(input,135,FOLLOW_135_in_msetTerm2931); 
					string_literal335_tree = (CommonTree)adaptor.dupNode(string_literal335);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal335_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_intTerm_in_msetTerm2933);
					intTerm336=intTerm();
					state._fsp--;

					adaptor.addChild(root_1, intTerm336.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 3 :
					// ImpSyntHoleFinder.g:432:7: ^( 'munion' msetTerm msetTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					string_literal337=(CommonTree)match(input,136,FOLLOW_136_in_msetTerm2943); 
					string_literal337_tree = (CommonTree)adaptor.dupNode(string_literal337);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal337_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_msetTerm_in_msetTerm2945);
					msetTerm338=msetTerm();
					state._fsp--;

					adaptor.addChild(root_1, msetTerm338.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_msetTerm_in_msetTerm2947);
					msetTerm339=msetTerm();
					state._fsp--;

					adaptor.addChild(root_1, msetTerm339.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 4 :
					// ImpSyntHoleFinder.g:433:7: ^( 'mintersection' msetTerm msetTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					string_literal340=(CommonTree)match(input,131,FOLLOW_131_in_msetTerm2957); 
					string_literal340_tree = (CommonTree)adaptor.dupNode(string_literal340);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal340_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_msetTerm_in_msetTerm2959);
					msetTerm341=msetTerm();
					state._fsp--;

					adaptor.addChild(root_1, msetTerm341.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_msetTerm_in_msetTerm2961);
					msetTerm342=msetTerm();
					state._fsp--;

					adaptor.addChild(root_1, msetTerm342.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 5 :
					// ImpSyntHoleFinder.g:434:7: ^( 'msetminus' msetTerm msetTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					string_literal343=(CommonTree)match(input,134,FOLLOW_134_in_msetTerm2971); 
					string_literal343_tree = (CommonTree)adaptor.dupNode(string_literal343);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal343_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_msetTerm_in_msetTerm2973);
					msetTerm344=msetTerm();
					state._fsp--;

					adaptor.addChild(root_1, msetTerm344.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_msetTerm_in_msetTerm2975);
					msetTerm345=msetTerm();
					state._fsp--;

					adaptor.addChild(root_1, msetTerm345.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 6 :
					// ImpSyntHoleFinder.g:435:7: ^( OLD msetTerm )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					OLD346=(CommonTree)match(input,OLD,FOLLOW_OLD_in_msetTerm2985); 
					OLD346_tree = (CommonTree)adaptor.dupNode(OLD346);


					root_1 = (CommonTree)adaptor.becomeRoot(OLD346_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_msetTerm_in_msetTerm2987);
					msetTerm347=msetTerm();
					state._fsp--;

					adaptor.addChild(root_1, msetTerm347.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "msetTerm"


	public static class atomMsetTerm_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "atomMsetTerm"
	// ImpSyntHoleFinder.g:438:1: atomMsetTerm : ( 'emptymset' | msVar | rec );
	public final ImpSyntHoleFinder.atomMsetTerm_return atomMsetTerm() throws RecognitionException {
		ImpSyntHoleFinder.atomMsetTerm_return retval = new ImpSyntHoleFinder.atomMsetTerm_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal348=null;
		TreeRuleReturnScope msVar349 =null;
		TreeRuleReturnScope rec350 =null;

		CommonTree string_literal348_tree=null;

		try {
			// ImpSyntHoleFinder.g:439:5: ( 'emptymset' | msVar | rec )
			int alt39=3;
			switch ( input.LA(1) ) {
			case 104:
				{
				alt39=1;
				}
				break;
			case MSVAR:
				{
				alt39=2;
				}
				break;
			case REC:
				{
				alt39=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 39, 0, input);
				throw nvae;
			}
			switch (alt39) {
				case 1 :
					// ImpSyntHoleFinder.g:439:9: 'emptymset'
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					string_literal348=(CommonTree)match(input,104,FOLLOW_104_in_atomMsetTerm3005); 
					string_literal348_tree = (CommonTree)adaptor.dupNode(string_literal348);


					adaptor.addChild(root_0, string_literal348_tree);

					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:440:7: msVar
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_msVar_in_atomMsetTerm3013);
					msVar349=msVar();
					state._fsp--;

					adaptor.addChild(root_0, msVar349.getTree());

					}
					break;
				case 3 :
					// ImpSyntHoleFinder.g:441:7: rec
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_rec_in_atomMsetTerm3021);
					rec350=rec();
					state._fsp--;

					adaptor.addChild(root_0, rec350.getTree());

					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atomMsetTerm"


	public static class relRec_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "relRec"
	// ImpSyntHoleFinder.g:444:1: relRec : ^( RELREC ID locTerm p= locTerm ) ;
	public final ImpSyntHoleFinder.relRec_return relRec() throws RecognitionException {
		ImpSyntHoleFinder.relRec_return retval = new ImpSyntHoleFinder.relRec_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree RELREC351=null;
		CommonTree ID352=null;
		TreeRuleReturnScope p =null;
		TreeRuleReturnScope locTerm353 =null;

		CommonTree RELREC351_tree=null;
		CommonTree ID352_tree=null;

		try {
			// ImpSyntHoleFinder.g:445:5: ( ^( RELREC ID locTerm p= locTerm ) )
			// ImpSyntHoleFinder.g:445:9: ^( RELREC ID locTerm p= locTerm )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			RELREC351=(CommonTree)match(input,RELREC,FOLLOW_RELREC_in_relRec3041); 
			RELREC351_tree = (CommonTree)adaptor.dupNode(RELREC351);


			root_1 = (CommonTree)adaptor.becomeRoot(RELREC351_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID352=(CommonTree)match(input,ID,FOLLOW_ID_in_relRec3043); 
			ID352_tree = (CommonTree)adaptor.dupNode(ID352);


			adaptor.addChild(root_1, ID352_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_locTerm_in_relRec3045);
			locTerm353=locTerm();
			state._fsp--;

			adaptor.addChild(root_1, locTerm353.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_locTerm_in_relRec3049);
			p=locTerm();
			state._fsp--;

			adaptor.addChild(root_1, p.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relRec"


	public static class rec_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "rec"
	// ImpSyntHoleFinder.g:448:1: rec : ^( REC ID locTerm ) ;
	public final ImpSyntHoleFinder.rec_return rec() throws RecognitionException {
		ImpSyntHoleFinder.rec_return retval = new ImpSyntHoleFinder.rec_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree REC354=null;
		CommonTree ID355=null;
		TreeRuleReturnScope locTerm356 =null;

		CommonTree REC354_tree=null;
		CommonTree ID355_tree=null;

		try {
			// ImpSyntHoleFinder.g:449:5: ( ^( REC ID locTerm ) )
			// ImpSyntHoleFinder.g:449:9: ^( REC ID locTerm )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			REC354=(CommonTree)match(input,REC,FOLLOW_REC_in_rec3070); 
			REC354_tree = (CommonTree)adaptor.dupNode(REC354);


			root_1 = (CommonTree)adaptor.becomeRoot(REC354_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID355=(CommonTree)match(input,ID,FOLLOW_ID_in_rec3072); 
			ID355_tree = (CommonTree)adaptor.dupNode(ID355);


			adaptor.addChild(root_1, ID355_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_locTerm_in_rec3074);
			locTerm356=locTerm();
			state._fsp--;

			adaptor.addChild(root_1, locTerm356.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rec"


	public static class iRec_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "iRec"
	// ImpSyntHoleFinder.g:452:1: iRec : ^( IREC ID locTerm ) ;
	public final ImpSyntHoleFinder.iRec_return iRec() throws RecognitionException {
		ImpSyntHoleFinder.iRec_return retval = new ImpSyntHoleFinder.iRec_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree IREC357=null;
		CommonTree ID358=null;
		TreeRuleReturnScope locTerm359 =null;

		CommonTree IREC357_tree=null;
		CommonTree ID358_tree=null;

		try {
			// ImpSyntHoleFinder.g:453:5: ( ^( IREC ID locTerm ) )
			// ImpSyntHoleFinder.g:453:9: ^( IREC ID locTerm )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			IREC357=(CommonTree)match(input,IREC,FOLLOW_IREC_in_iRec3095); 
			IREC357_tree = (CommonTree)adaptor.dupNode(IREC357);


			root_1 = (CommonTree)adaptor.becomeRoot(IREC357_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID358=(CommonTree)match(input,ID,FOLLOW_ID_in_iRec3097); 
			ID358_tree = (CommonTree)adaptor.dupNode(ID358);


			adaptor.addChild(root_1, ID358_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_locTerm_in_iRec3099);
			locTerm359=locTerm();
			state._fsp--;

			adaptor.addChild(root_1, locTerm359.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "iRec"


	public static class biRec_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "biRec"
	// ImpSyntHoleFinder.g:456:1: biRec : ^( BIREC ID locTerm p= locTerm ) ;
	public final ImpSyntHoleFinder.biRec_return biRec() throws RecognitionException {
		ImpSyntHoleFinder.biRec_return retval = new ImpSyntHoleFinder.biRec_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree BIREC360=null;
		CommonTree ID361=null;
		TreeRuleReturnScope p =null;
		TreeRuleReturnScope locTerm362 =null;

		CommonTree BIREC360_tree=null;
		CommonTree ID361_tree=null;

		try {
			// ImpSyntHoleFinder.g:457:5: ( ^( BIREC ID locTerm p= locTerm ) )
			// ImpSyntHoleFinder.g:457:9: ^( BIREC ID locTerm p= locTerm )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			BIREC360=(CommonTree)match(input,BIREC,FOLLOW_BIREC_in_biRec3118); 
			BIREC360_tree = (CommonTree)adaptor.dupNode(BIREC360);


			root_1 = (CommonTree)adaptor.becomeRoot(BIREC360_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID361=(CommonTree)match(input,ID,FOLLOW_ID_in_biRec3120); 
			ID361_tree = (CommonTree)adaptor.dupNode(ID361);


			adaptor.addChild(root_1, ID361_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_locTerm_in_biRec3122);
			locTerm362=locTerm();
			state._fsp--;

			adaptor.addChild(root_1, locTerm362.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_locTerm_in_biRec3126);
			p=locTerm();
			state._fsp--;

			adaptor.addChild(root_1, p.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "biRec"


	public static class sRec_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "sRec"
	// ImpSyntHoleFinder.g:460:1: sRec : ^( SREC ID locTerm ) ;
	public final ImpSyntHoleFinder.sRec_return sRec() throws RecognitionException {
		ImpSyntHoleFinder.sRec_return retval = new ImpSyntHoleFinder.sRec_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree SREC363=null;
		CommonTree ID364=null;
		TreeRuleReturnScope locTerm365 =null;

		CommonTree SREC363_tree=null;
		CommonTree ID364_tree=null;

		try {
			// ImpSyntHoleFinder.g:461:5: ( ^( SREC ID locTerm ) )
			// ImpSyntHoleFinder.g:461:9: ^( SREC ID locTerm )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			SREC363=(CommonTree)match(input,SREC,FOLLOW_SREC_in_sRec3147); 
			SREC363_tree = (CommonTree)adaptor.dupNode(SREC363);


			root_1 = (CommonTree)adaptor.becomeRoot(SREC363_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID364=(CommonTree)match(input,ID,FOLLOW_ID_in_sRec3149); 
			ID364_tree = (CommonTree)adaptor.dupNode(ID364);


			adaptor.addChild(root_1, ID364_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_locTerm_in_sRec3151);
			locTerm365=locTerm();
			state._fsp--;

			adaptor.addChild(root_1, locTerm365.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sRec"


	public static class bsRec_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bsRec"
	// ImpSyntHoleFinder.g:464:1: bsRec : ^( BSREC ID locTerm p= locTerm ) ;
	public final ImpSyntHoleFinder.bsRec_return bsRec() throws RecognitionException {
		ImpSyntHoleFinder.bsRec_return retval = new ImpSyntHoleFinder.bsRec_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree BSREC366=null;
		CommonTree ID367=null;
		TreeRuleReturnScope p =null;
		TreeRuleReturnScope locTerm368 =null;

		CommonTree BSREC366_tree=null;
		CommonTree ID367_tree=null;

		try {
			// ImpSyntHoleFinder.g:465:5: ( ^( BSREC ID locTerm p= locTerm ) )
			// ImpSyntHoleFinder.g:465:9: ^( BSREC ID locTerm p= locTerm )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			BSREC366=(CommonTree)match(input,BSREC,FOLLOW_BSREC_in_bsRec3172); 
			BSREC366_tree = (CommonTree)adaptor.dupNode(BSREC366);


			root_1 = (CommonTree)adaptor.becomeRoot(BSREC366_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID367=(CommonTree)match(input,ID,FOLLOW_ID_in_bsRec3174); 
			ID367_tree = (CommonTree)adaptor.dupNode(ID367);


			adaptor.addChild(root_1, ID367_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_locTerm_in_bsRec3176);
			locTerm368=locTerm();
			state._fsp--;

			adaptor.addChild(root_1, locTerm368.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_locTerm_in_bsRec3180);
			p=locTerm();
			state._fsp--;

			adaptor.addChild(root_1, p.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bsRec"


	public static class lsRec_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "lsRec"
	// ImpSyntHoleFinder.g:468:1: lsRec : ^( LSREC ID locTerm ) ;
	public final ImpSyntHoleFinder.lsRec_return lsRec() throws RecognitionException {
		ImpSyntHoleFinder.lsRec_return retval = new ImpSyntHoleFinder.lsRec_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree LSREC369=null;
		CommonTree ID370=null;
		TreeRuleReturnScope locTerm371 =null;

		CommonTree LSREC369_tree=null;
		CommonTree ID370_tree=null;

		try {
			// ImpSyntHoleFinder.g:469:5: ( ^( LSREC ID locTerm ) )
			// ImpSyntHoleFinder.g:469:9: ^( LSREC ID locTerm )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			LSREC369=(CommonTree)match(input,LSREC,FOLLOW_LSREC_in_lsRec3201); 
			LSREC369_tree = (CommonTree)adaptor.dupNode(LSREC369);


			root_1 = (CommonTree)adaptor.becomeRoot(LSREC369_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID370=(CommonTree)match(input,ID,FOLLOW_ID_in_lsRec3203); 
			ID370_tree = (CommonTree)adaptor.dupNode(ID370);


			adaptor.addChild(root_1, ID370_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_locTerm_in_lsRec3205);
			locTerm371=locTerm();
			state._fsp--;

			adaptor.addChild(root_1, locTerm371.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lsRec"


	public static class msRec_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "msRec"
	// ImpSyntHoleFinder.g:472:1: msRec : ^( MSREC ID locTerm ) ;
	public final ImpSyntHoleFinder.msRec_return msRec() throws RecognitionException {
		ImpSyntHoleFinder.msRec_return retval = new ImpSyntHoleFinder.msRec_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree MSREC372=null;
		CommonTree ID373=null;
		TreeRuleReturnScope locTerm374 =null;

		CommonTree MSREC372_tree=null;
		CommonTree ID373_tree=null;

		try {
			// ImpSyntHoleFinder.g:473:5: ( ^( MSREC ID locTerm ) )
			// ImpSyntHoleFinder.g:473:9: ^( MSREC ID locTerm )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			MSREC372=(CommonTree)match(input,MSREC,FOLLOW_MSREC_in_msRec3224); 
			MSREC372_tree = (CommonTree)adaptor.dupNode(MSREC372);


			root_1 = (CommonTree)adaptor.becomeRoot(MSREC372_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID373=(CommonTree)match(input,ID,FOLLOW_ID_in_msRec3226); 
			ID373_tree = (CommonTree)adaptor.dupNode(ID373);


			adaptor.addChild(root_1, ID373_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_locTerm_in_msRec3228);
			locTerm374=locTerm();
			state._fsp--;

			adaptor.addChild(root_1, locTerm374.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "msRec"


	public static class intExp_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "intExp"
	// ImpSyntHoleFinder.g:476:1: intExp : ( atomIntExp | ^( ( '+' | '-' ) intExp intExp ) );
	public final ImpSyntHoleFinder.intExp_return intExp() throws RecognitionException {
		ImpSyntHoleFinder.intExp_return retval = new ImpSyntHoleFinder.intExp_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree set376=null;
		TreeRuleReturnScope atomIntExp375 =null;
		TreeRuleReturnScope intExp377 =null;
		TreeRuleReturnScope intExp378 =null;

		CommonTree set376_tree=null;

		try {
			// ImpSyntHoleFinder.g:477:3: ( atomIntExp | ^( ( '+' | '-' ) intExp intExp ) )
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==CONS||LA40_0==IVAR) ) {
				alt40=1;
			}
			else if ( (LA40_0==85||LA40_0==87) ) {
				alt40=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}

			switch (alt40) {
				case 1 :
					// ImpSyntHoleFinder.g:477:7: atomIntExp
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntExp_in_intExp3246);
					atomIntExp375=atomIntExp();
					state._fsp--;

					adaptor.addChild(root_0, atomIntExp375.getTree());

					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:478:7: ^( ( '+' | '-' ) intExp intExp )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					set376=(CommonTree)input.LT(1);
					if ( input.LA(1)==85||input.LA(1)==87 ) {
						input.consume();
						set376_tree = (CommonTree)adaptor.dupNode(set376);


						root_1 = (CommonTree)adaptor.becomeRoot(set376_tree, root_1);

						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_intExp_in_intExp3264);
					intExp377=intExp();
					state._fsp--;

					adaptor.addChild(root_1, intExp377.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_intExp_in_intExp3266);
					intExp378=intExp();
					state._fsp--;

					adaptor.addChild(root_1, intExp378.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "intExp"


	public static class atomIntExp_return extends TreeRuleReturnScope {
		public CommonTree value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "atomIntExp"
	// ImpSyntHoleFinder.g:481:1: atomIntExp returns [CommonTree value] : ( ^( CONS INT ) | iVar );
	public final ImpSyntHoleFinder.atomIntExp_return atomIntExp() throws RecognitionException {
		ImpSyntHoleFinder.atomIntExp_return retval = new ImpSyntHoleFinder.atomIntExp_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree CONS379=null;
		CommonTree INT380=null;
		TreeRuleReturnScope iVar381 =null;

		CommonTree CONS379_tree=null;
		CommonTree INT380_tree=null;

		try {
			// ImpSyntHoleFinder.g:482:5: ( ^( CONS INT ) | iVar )
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==CONS) ) {
				alt41=1;
			}
			else if ( (LA41_0==IVAR) ) {
				alt41=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}

			switch (alt41) {
				case 1 :
					// ImpSyntHoleFinder.g:482:9: ^( CONS INT )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					CONS379=(CommonTree)match(input,CONS,FOLLOW_CONS_in_atomIntExp3291); 
					CONS379_tree = (CommonTree)adaptor.dupNode(CONS379);


					root_1 = (CommonTree)adaptor.becomeRoot(CONS379_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					INT380=(CommonTree)match(input,INT,FOLLOW_INT_in_atomIntExp3293); 
					INT380_tree = (CommonTree)adaptor.dupNode(INT380);


					adaptor.addChild(root_1, INT380_tree);

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:483:7: iVar
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_iVar_in_atomIntExp3302);
					iVar381=iVar();
					state._fsp--;

					adaptor.addChild(root_0, iVar381.getTree());

					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atomIntExp"


	public static class locExp_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "locExp"
	// ImpSyntHoleFinder.g:486:1: locExp : ( NIL | NEW | lVar );
	public final ImpSyntHoleFinder.locExp_return locExp() throws RecognitionException {
		ImpSyntHoleFinder.locExp_return retval = new ImpSyntHoleFinder.locExp_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree NIL382=null;
		CommonTree NEW383=null;
		TreeRuleReturnScope lVar384 =null;

		CommonTree NIL382_tree=null;
		CommonTree NEW383_tree=null;

		try {
			// ImpSyntHoleFinder.g:487:5: ( NIL | NEW | lVar )
			int alt42=3;
			switch ( input.LA(1) ) {
			case NIL:
				{
				alt42=1;
				}
				break;
			case NEW:
				{
				alt42=2;
				}
				break;
			case LVAR:
				{
				alt42=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 42, 0, input);
				throw nvae;
			}
			switch (alt42) {
				case 1 :
					// ImpSyntHoleFinder.g:487:9: NIL
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					NIL382=(CommonTree)match(input,NIL,FOLLOW_NIL_in_locExp3319); 
					NIL382_tree = (CommonTree)adaptor.dupNode(NIL382);


					adaptor.addChild(root_0, NIL382_tree);

					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:488:7: NEW
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					NEW383=(CommonTree)match(input,NEW,FOLLOW_NEW_in_locExp3327); 
					NEW383_tree = (CommonTree)adaptor.dupNode(NEW383);


					adaptor.addChild(root_0, NEW383_tree);

					unknownNew.add(new Integer(1));
					}
					break;
				case 3 :
					// ImpSyntHoleFinder.g:489:7: lVar
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lVar_in_locExp3337);
					lVar384=lVar();
					state._fsp--;

					adaptor.addChild(root_0, lVar384.getTree());

					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "locExp"


	public static class boolExp_return extends TreeRuleReturnScope {
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "boolExp"
	// ImpSyntHoleFinder.g:492:1: boolExp : ( atomBoolExp | ^( ( AND | OR | EQUALS ) atomBoolExp atomBoolExp ) | ^( NOT atomBoolExp ) );
	public final ImpSyntHoleFinder.boolExp_return boolExp() throws RecognitionException {
		ImpSyntHoleFinder.boolExp_return retval = new ImpSyntHoleFinder.boolExp_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree set386=null;
		CommonTree NOT389=null;
		TreeRuleReturnScope atomBoolExp385 =null;
		TreeRuleReturnScope atomBoolExp387 =null;
		TreeRuleReturnScope atomBoolExp388 =null;
		TreeRuleReturnScope atomBoolExp390 =null;

		CommonTree set386_tree=null;
		CommonTree NOT389_tree=null;

		try {
			// ImpSyntHoleFinder.g:493:5: ( atomBoolExp | ^( ( AND | OR | EQUALS ) atomBoolExp atomBoolExp ) | ^( NOT atomBoolExp ) )
			int alt43=3;
			switch ( input.LA(1) ) {
			case ATOMBOOL:
			case BVAR:
			case INTEQ:
			case LOCEQ:
			case TRUE:
			case 91:
			case 92:
			case 99:
				{
				alt43=1;
				}
				break;
			case AND:
			case EQUALS:
			case OR:
				{
				alt43=2;
				}
				break;
			case NOT:
				{
				alt43=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}
			switch (alt43) {
				case 1 :
					// ImpSyntHoleFinder.g:493:9: atomBoolExp
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomBoolExp_in_boolExp3354);
					atomBoolExp385=atomBoolExp();
					state._fsp--;

					adaptor.addChild(root_0, atomBoolExp385.getTree());

					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:494:7: ^( ( AND | OR | EQUALS ) atomBoolExp atomBoolExp )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					set386=(CommonTree)input.LT(1);
					if ( input.LA(1)==AND||input.LA(1)==EQUALS||input.LA(1)==OR ) {
						input.consume();
						set386_tree = (CommonTree)adaptor.dupNode(set386);


						root_1 = (CommonTree)adaptor.becomeRoot(set386_tree, root_1);

						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomBoolExp_in_boolExp3376);
					atomBoolExp387=atomBoolExp();
					state._fsp--;

					adaptor.addChild(root_1, atomBoolExp387.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomBoolExp_in_boolExp3378);
					atomBoolExp388=atomBoolExp();
					state._fsp--;

					adaptor.addChild(root_1, atomBoolExp388.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 3 :
					// ImpSyntHoleFinder.g:495:7: ^( NOT atomBoolExp )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					NOT389=(CommonTree)match(input,NOT,FOLLOW_NOT_in_boolExp3389); 
					NOT389_tree = (CommonTree)adaptor.dupNode(NOT389);


					root_1 = (CommonTree)adaptor.becomeRoot(NOT389_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomBoolExp_in_boolExp3391);
					atomBoolExp390=atomBoolExp();
					state._fsp--;

					adaptor.addChild(root_1, atomBoolExp390.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "boolExp"


	public static class atomBoolExp_return extends TreeRuleReturnScope {
		public CommonTree value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "atomBoolExp"
	// ImpSyntHoleFinder.g:498:1: atomBoolExp returns [CommonTree value] : ( ^( ATOMBOOL boolExp ) | ^( LOCEQ locExp locExp ) | ^( INTEQ intExp intExp ) | ^( '<' intExp intExp ) | ^( '<=' intExp intExp ) | TRUE | bVar | ^( 'cond' atomIntExp ) );
	public final ImpSyntHoleFinder.atomBoolExp_return atomBoolExp() throws RecognitionException {
		ImpSyntHoleFinder.atomBoolExp_return retval = new ImpSyntHoleFinder.atomBoolExp_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree ATOMBOOL391=null;
		CommonTree LOCEQ393=null;
		CommonTree INTEQ396=null;
		CommonTree char_literal399=null;
		CommonTree string_literal402=null;
		CommonTree TRUE405=null;
		CommonTree string_literal407=null;
		TreeRuleReturnScope boolExp392 =null;
		TreeRuleReturnScope locExp394 =null;
		TreeRuleReturnScope locExp395 =null;
		TreeRuleReturnScope intExp397 =null;
		TreeRuleReturnScope intExp398 =null;
		TreeRuleReturnScope intExp400 =null;
		TreeRuleReturnScope intExp401 =null;
		TreeRuleReturnScope intExp403 =null;
		TreeRuleReturnScope intExp404 =null;
		TreeRuleReturnScope bVar406 =null;
		TreeRuleReturnScope atomIntExp408 =null;

		CommonTree ATOMBOOL391_tree=null;
		CommonTree LOCEQ393_tree=null;
		CommonTree INTEQ396_tree=null;
		CommonTree char_literal399_tree=null;
		CommonTree string_literal402_tree=null;
		CommonTree TRUE405_tree=null;
		CommonTree string_literal407_tree=null;

		try {
			// ImpSyntHoleFinder.g:499:5: ( ^( ATOMBOOL boolExp ) | ^( LOCEQ locExp locExp ) | ^( INTEQ intExp intExp ) | ^( '<' intExp intExp ) | ^( '<=' intExp intExp ) | TRUE | bVar | ^( 'cond' atomIntExp ) )
			int alt44=8;
			switch ( input.LA(1) ) {
			case ATOMBOOL:
				{
				alt44=1;
				}
				break;
			case LOCEQ:
				{
				alt44=2;
				}
				break;
			case INTEQ:
				{
				alt44=3;
				}
				break;
			case 91:
				{
				alt44=4;
				}
				break;
			case 92:
				{
				alt44=5;
				}
				break;
			case TRUE:
				{
				alt44=6;
				}
				break;
			case BVAR:
				{
				alt44=7;
				}
				break;
			case 99:
				{
				alt44=8;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 44, 0, input);
				throw nvae;
			}
			switch (alt44) {
				case 1 :
					// ImpSyntHoleFinder.g:499:7: ^( ATOMBOOL boolExp )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					ATOMBOOL391=(CommonTree)match(input,ATOMBOOL,FOLLOW_ATOMBOOL_in_atomBoolExp3414); 
					ATOMBOOL391_tree = (CommonTree)adaptor.dupNode(ATOMBOOL391);


					root_1 = (CommonTree)adaptor.becomeRoot(ATOMBOOL391_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_boolExp_in_atomBoolExp3416);
					boolExp392=boolExp();
					state._fsp--;

					adaptor.addChild(root_1, boolExp392.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:500:5: ^( LOCEQ locExp locExp )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					LOCEQ393=(CommonTree)match(input,LOCEQ,FOLLOW_LOCEQ_in_atomBoolExp3424); 
					LOCEQ393_tree = (CommonTree)adaptor.dupNode(LOCEQ393);


					root_1 = (CommonTree)adaptor.becomeRoot(LOCEQ393_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_locExp_in_atomBoolExp3426);
					locExp394=locExp();
					state._fsp--;

					adaptor.addChild(root_1, locExp394.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_locExp_in_atomBoolExp3428);
					locExp395=locExp();
					state._fsp--;

					adaptor.addChild(root_1, locExp395.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 3 :
					// ImpSyntHoleFinder.g:501:5: ^( INTEQ intExp intExp )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					INTEQ396=(CommonTree)match(input,INTEQ,FOLLOW_INTEQ_in_atomBoolExp3436); 
					INTEQ396_tree = (CommonTree)adaptor.dupNode(INTEQ396);


					root_1 = (CommonTree)adaptor.becomeRoot(INTEQ396_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_intExp_in_atomBoolExp3438);
					intExp397=intExp();
					state._fsp--;

					adaptor.addChild(root_1, intExp397.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_intExp_in_atomBoolExp3440);
					intExp398=intExp();
					state._fsp--;

					adaptor.addChild(root_1, intExp398.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 4 :
					// ImpSyntHoleFinder.g:502:5: ^( '<' intExp intExp )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					char_literal399=(CommonTree)match(input,91,FOLLOW_91_in_atomBoolExp3448); 
					char_literal399_tree = (CommonTree)adaptor.dupNode(char_literal399);


					root_1 = (CommonTree)adaptor.becomeRoot(char_literal399_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_intExp_in_atomBoolExp3450);
					intExp400=intExp();
					state._fsp--;

					adaptor.addChild(root_1, intExp400.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_intExp_in_atomBoolExp3452);
					intExp401=intExp();
					state._fsp--;

					adaptor.addChild(root_1, intExp401.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 5 :
					// ImpSyntHoleFinder.g:503:5: ^( '<=' intExp intExp )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					string_literal402=(CommonTree)match(input,92,FOLLOW_92_in_atomBoolExp3460); 
					string_literal402_tree = (CommonTree)adaptor.dupNode(string_literal402);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal402_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_intExp_in_atomBoolExp3462);
					intExp403=intExp();
					state._fsp--;

					adaptor.addChild(root_1, intExp403.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_intExp_in_atomBoolExp3464);
					intExp404=intExp();
					state._fsp--;

					adaptor.addChild(root_1, intExp404.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 6 :
					// ImpSyntHoleFinder.g:504:5: TRUE
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					TRUE405=(CommonTree)match(input,TRUE,FOLLOW_TRUE_in_atomBoolExp3471); 
					TRUE405_tree = (CommonTree)adaptor.dupNode(TRUE405);


					adaptor.addChild(root_0, TRUE405_tree);

					}
					break;
				case 7 :
					// ImpSyntHoleFinder.g:505:5: bVar
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_bVar_in_atomBoolExp3477);
					bVar406=bVar();
					state._fsp--;

					adaptor.addChild(root_0, bVar406.getTree());

					}
					break;
				case 8 :
					// ImpSyntHoleFinder.g:506:5: ^( 'cond' atomIntExp )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					string_literal407=(CommonTree)match(input,99,FOLLOW_99_in_atomBoolExp3484); 
					string_literal407_tree = (CommonTree)adaptor.dupNode(string_literal407);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal407_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntExp_in_atomBoolExp3486);
					atomIntExp408=atomIntExp();
					state._fsp--;

					adaptor.addChild(root_1, atomIntExp408.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					unknownConds.add((atomIntExp408!=null?((CommonTree)atomIntExp408.getTree()):null));
					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atomBoolExp"


	public static class dirDeref_return extends TreeRuleReturnScope {
		public String value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "dirDeref"
	// ImpSyntHoleFinder.g:509:1: dirDeref returns [String value] : ^( '.' lVar dir ) ;
	public final ImpSyntHoleFinder.dirDeref_return dirDeref() throws RecognitionException {
		ImpSyntHoleFinder.dirDeref_return retval = new ImpSyntHoleFinder.dirDeref_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree char_literal409=null;
		TreeRuleReturnScope lVar410 =null;
		TreeRuleReturnScope dir411 =null;

		CommonTree char_literal409_tree=null;

		try {
			// ImpSyntHoleFinder.g:510:5: ( ^( '.' lVar dir ) )
			// ImpSyntHoleFinder.g:510:9: ^( '.' lVar dir )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			char_literal409=(CommonTree)match(input,88,FOLLOW_88_in_dirDeref3513); 
			char_literal409_tree = (CommonTree)adaptor.dupNode(char_literal409);


			root_1 = (CommonTree)adaptor.becomeRoot(char_literal409_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_lVar_in_dirDeref3515);
			lVar410=lVar();
			state._fsp--;

			adaptor.addChild(root_1, lVar410.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_dir_in_dirDeref3517);
			dir411=dir();
			state._fsp--;

			adaptor.addChild(root_1, dir411.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dirDeref"


	public static class dataDeref_return extends TreeRuleReturnScope {
		public String value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "dataDeref"
	// ImpSyntHoleFinder.g:513:1: dataDeref returns [String value] : ^( '.' lVar field ) ;
	public final ImpSyntHoleFinder.dataDeref_return dataDeref() throws RecognitionException {
		ImpSyntHoleFinder.dataDeref_return retval = new ImpSyntHoleFinder.dataDeref_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree char_literal412=null;
		TreeRuleReturnScope lVar413 =null;
		TreeRuleReturnScope field414 =null;

		CommonTree char_literal412_tree=null;

		try {
			// ImpSyntHoleFinder.g:514:5: ( ^( '.' lVar field ) )
			// ImpSyntHoleFinder.g:514:9: ^( '.' lVar field )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			char_literal412=(CommonTree)match(input,88,FOLLOW_88_in_dataDeref3540); 
			char_literal412_tree = (CommonTree)adaptor.dupNode(char_literal412);


			root_1 = (CommonTree)adaptor.becomeRoot(char_literal412_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_lVar_in_dataDeref3542);
			lVar413=lVar();
			state._fsp--;

			adaptor.addChild(root_1, lVar413.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_field_in_dataDeref3544);
			field414=field();
			state._fsp--;

			adaptor.addChild(root_1, field414.getTree());

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dataDeref"


	public static class iVar_return extends TreeRuleReturnScope {
		public String value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "iVar"
	// ImpSyntHoleFinder.g:517:1: iVar returns [String value] : ( ^( IVAR ID ) | ^( IVAR a= QMARK ) );
	public final ImpSyntHoleFinder.iVar_return iVar() throws RecognitionException {
		ImpSyntHoleFinder.iVar_return retval = new ImpSyntHoleFinder.iVar_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree a=null;
		CommonTree IVAR415=null;
		CommonTree ID416=null;
		CommonTree IVAR417=null;

		CommonTree a_tree=null;
		CommonTree IVAR415_tree=null;
		CommonTree ID416_tree=null;
		CommonTree IVAR417_tree=null;

		try {
			// ImpSyntHoleFinder.g:518:5: ( ^( IVAR ID ) | ^( IVAR a= QMARK ) )
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==IVAR) ) {
				int LA45_1 = input.LA(2);
				if ( (LA45_1==DOWN) ) {
					int LA45_2 = input.LA(3);
					if ( (LA45_2==ID) ) {
						alt45=1;
					}
					else if ( (LA45_2==QMARK) ) {
						alt45=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 45, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 45, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}

			switch (alt45) {
				case 1 :
					// ImpSyntHoleFinder.g:518:9: ^( IVAR ID )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					IVAR415=(CommonTree)match(input,IVAR,FOLLOW_IVAR_in_iVar3569); 
					IVAR415_tree = (CommonTree)adaptor.dupNode(IVAR415);


					root_1 = (CommonTree)adaptor.becomeRoot(IVAR415_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					ID416=(CommonTree)match(input,ID,FOLLOW_ID_in_iVar3571); 
					ID416_tree = (CommonTree)adaptor.dupNode(ID416);


					adaptor.addChild(root_1, ID416_tree);

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:519:8: ^( IVAR a= QMARK )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					IVAR417=(CommonTree)match(input,IVAR,FOLLOW_IVAR_in_iVar3582); 
					IVAR417_tree = (CommonTree)adaptor.dupNode(IVAR417);


					root_1 = (CommonTree)adaptor.becomeRoot(IVAR417_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					a=(CommonTree)match(input,QMARK,FOLLOW_QMARK_in_iVar3586); 
					a_tree = (CommonTree)adaptor.dupNode(a);


					adaptor.addChild(root_1, a_tree);

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					unknownInts.add(new Integer(order++));
					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "iVar"


	public static class lVar_return extends TreeRuleReturnScope {
		public String value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "lVar"
	// ImpSyntHoleFinder.g:522:1: lVar returns [String value] : ( ^( LVAR ID ) | ^( LVAR a= QQMARK ) );
	public final ImpSyntHoleFinder.lVar_return lVar() throws RecognitionException {
		ImpSyntHoleFinder.lVar_return retval = new ImpSyntHoleFinder.lVar_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree a=null;
		CommonTree LVAR418=null;
		CommonTree ID419=null;
		CommonTree LVAR420=null;

		CommonTree a_tree=null;
		CommonTree LVAR418_tree=null;
		CommonTree ID419_tree=null;
		CommonTree LVAR420_tree=null;

		try {
			// ImpSyntHoleFinder.g:523:5: ( ^( LVAR ID ) | ^( LVAR a= QQMARK ) )
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==LVAR) ) {
				int LA46_1 = input.LA(2);
				if ( (LA46_1==DOWN) ) {
					int LA46_2 = input.LA(3);
					if ( (LA46_2==ID) ) {
						alt46=1;
					}
					else if ( (LA46_2==QQMARK) ) {
						alt46=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 46, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 46, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}

			switch (alt46) {
				case 1 :
					// ImpSyntHoleFinder.g:523:9: ^( LVAR ID )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					LVAR418=(CommonTree)match(input,LVAR,FOLLOW_LVAR_in_lVar3613); 
					LVAR418_tree = (CommonTree)adaptor.dupNode(LVAR418);


					root_1 = (CommonTree)adaptor.becomeRoot(LVAR418_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					ID419=(CommonTree)match(input,ID,FOLLOW_ID_in_lVar3615); 
					ID419_tree = (CommonTree)adaptor.dupNode(ID419);


					adaptor.addChild(root_1, ID419_tree);

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:524:8: ^( LVAR a= QQMARK )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					LVAR420=(CommonTree)match(input,LVAR,FOLLOW_LVAR_in_lVar3626); 
					LVAR420_tree = (CommonTree)adaptor.dupNode(LVAR420);


					root_1 = (CommonTree)adaptor.becomeRoot(LVAR420_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					a=(CommonTree)match(input,QQMARK,FOLLOW_QQMARK_in_lVar3630); 
					a_tree = (CommonTree)adaptor.dupNode(a);


					adaptor.addChild(root_1, a_tree);

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					unknownLocs.add(new Integer(order++));
					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lVar"


	public static class bVar_return extends TreeRuleReturnScope {
		public String value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "bVar"
	// ImpSyntHoleFinder.g:527:1: bVar returns [String value] : ( ^( BVAR ID ) | ^( BVAR QMARK ) );
	public final ImpSyntHoleFinder.bVar_return bVar() throws RecognitionException {
		ImpSyntHoleFinder.bVar_return retval = new ImpSyntHoleFinder.bVar_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree BVAR421=null;
		CommonTree ID422=null;
		CommonTree BVAR423=null;
		CommonTree QMARK424=null;

		CommonTree BVAR421_tree=null;
		CommonTree ID422_tree=null;
		CommonTree BVAR423_tree=null;
		CommonTree QMARK424_tree=null;

		try {
			// ImpSyntHoleFinder.g:528:5: ( ^( BVAR ID ) | ^( BVAR QMARK ) )
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==BVAR) ) {
				int LA47_1 = input.LA(2);
				if ( (LA47_1==DOWN) ) {
					int LA47_2 = input.LA(3);
					if ( (LA47_2==ID) ) {
						alt47=1;
					}
					else if ( (LA47_2==QMARK) ) {
						alt47=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 47, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 47, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}

			switch (alt47) {
				case 1 :
					// ImpSyntHoleFinder.g:528:9: ^( BVAR ID )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					BVAR421=(CommonTree)match(input,BVAR,FOLLOW_BVAR_in_bVar3661); 
					BVAR421_tree = (CommonTree)adaptor.dupNode(BVAR421);


					root_1 = (CommonTree)adaptor.becomeRoot(BVAR421_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					ID422=(CommonTree)match(input,ID,FOLLOW_ID_in_bVar3663); 
					ID422_tree = (CommonTree)adaptor.dupNode(ID422);


					adaptor.addChild(root_1, ID422_tree);

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:529:8: ^( BVAR QMARK )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					BVAR423=(CommonTree)match(input,BVAR,FOLLOW_BVAR_in_bVar3674); 
					BVAR423_tree = (CommonTree)adaptor.dupNode(BVAR423);


					root_1 = (CommonTree)adaptor.becomeRoot(BVAR423_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					QMARK424=(CommonTree)match(input,QMARK,FOLLOW_QMARK_in_bVar3676); 
					QMARK424_tree = (CommonTree)adaptor.dupNode(QMARK424);


					adaptor.addChild(root_1, QMARK424_tree);

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					}
					break;

			}
			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bVar"


	public static class sVar_return extends TreeRuleReturnScope {
		public String value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "sVar"
	// ImpSyntHoleFinder.g:532:1: sVar returns [String value] : ^( SVAR ID ) ;
	public final ImpSyntHoleFinder.sVar_return sVar() throws RecognitionException {
		ImpSyntHoleFinder.sVar_return retval = new ImpSyntHoleFinder.sVar_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree SVAR425=null;
		CommonTree ID426=null;

		CommonTree SVAR425_tree=null;
		CommonTree ID426_tree=null;

		try {
			// ImpSyntHoleFinder.g:533:5: ( ^( SVAR ID ) )
			// ImpSyntHoleFinder.g:533:9: ^( SVAR ID )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			SVAR425=(CommonTree)match(input,SVAR,FOLLOW_SVAR_in_sVar3701); 
			SVAR425_tree = (CommonTree)adaptor.dupNode(SVAR425);


			root_1 = (CommonTree)adaptor.becomeRoot(SVAR425_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID426=(CommonTree)match(input,ID,FOLLOW_ID_in_sVar3703); 
			ID426_tree = (CommonTree)adaptor.dupNode(ID426);


			adaptor.addChild(root_1, ID426_tree);

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sVar"


	public static class lsVar_return extends TreeRuleReturnScope {
		public String value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "lsVar"
	// ImpSyntHoleFinder.g:536:1: lsVar returns [String value] : ^( LSVAR ID ) ;
	public final ImpSyntHoleFinder.lsVar_return lsVar() throws RecognitionException {
		ImpSyntHoleFinder.lsVar_return retval = new ImpSyntHoleFinder.lsVar_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree LSVAR427=null;
		CommonTree ID428=null;

		CommonTree LSVAR427_tree=null;
		CommonTree ID428_tree=null;

		try {
			// ImpSyntHoleFinder.g:537:5: ( ^( LSVAR ID ) )
			// ImpSyntHoleFinder.g:537:9: ^( LSVAR ID )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			LSVAR427=(CommonTree)match(input,LSVAR,FOLLOW_LSVAR_in_lsVar3732); 
			LSVAR427_tree = (CommonTree)adaptor.dupNode(LSVAR427);


			root_1 = (CommonTree)adaptor.becomeRoot(LSVAR427_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID428=(CommonTree)match(input,ID,FOLLOW_ID_in_lsVar3734); 
			ID428_tree = (CommonTree)adaptor.dupNode(ID428);


			adaptor.addChild(root_1, ID428_tree);

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lsVar"


	public static class msVar_return extends TreeRuleReturnScope {
		public String value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "msVar"
	// ImpSyntHoleFinder.g:540:1: msVar returns [String value] : ^( MSVAR ID ) ;
	public final ImpSyntHoleFinder.msVar_return msVar() throws RecognitionException {
		ImpSyntHoleFinder.msVar_return retval = new ImpSyntHoleFinder.msVar_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree MSVAR429=null;
		CommonTree ID430=null;

		CommonTree MSVAR429_tree=null;
		CommonTree ID430_tree=null;

		try {
			// ImpSyntHoleFinder.g:541:5: ( ^( MSVAR ID ) )
			// ImpSyntHoleFinder.g:541:9: ^( MSVAR ID )
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			{
			CommonTree _save_last_1 = _last;
			CommonTree _first_1 = null;
			CommonTree root_1 = (CommonTree)adaptor.nil();
			_last = (CommonTree)input.LT(1);
			MSVAR429=(CommonTree)match(input,MSVAR,FOLLOW_MSVAR_in_msVar3759); 
			MSVAR429_tree = (CommonTree)adaptor.dupNode(MSVAR429);


			root_1 = (CommonTree)adaptor.becomeRoot(MSVAR429_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID430=(CommonTree)match(input,ID,FOLLOW_ID_in_msVar3761); 
			ID430_tree = (CommonTree)adaptor.dupNode(ID430);


			adaptor.addChild(root_1, ID430_tree);

			match(input, Token.UP, null); 
			adaptor.addChild(root_0, root_1);
			_last = _save_last_1;
			}


			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "msVar"


	public static class dir_return extends TreeRuleReturnScope {
		public String value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "dir"
	// ImpSyntHoleFinder.g:544:1: dir returns [String value] : ( ID | QMARK );
	public final ImpSyntHoleFinder.dir_return dir() throws RecognitionException {
		ImpSyntHoleFinder.dir_return retval = new ImpSyntHoleFinder.dir_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree set431=null;

		CommonTree set431_tree=null;

		try {
			// ImpSyntHoleFinder.g:545:5: ( ID | QMARK )
			// ImpSyntHoleFinder.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			set431=(CommonTree)input.LT(1);
			if ( input.LA(1)==ID||input.LA(1)==QMARK ) {
				input.consume();
				set431_tree = (CommonTree)adaptor.dupNode(set431);


				adaptor.addChild(root_0, set431_tree);

				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

			 

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dir"


	public static class field_return extends TreeRuleReturnScope {
		public String value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "field"
	// ImpSyntHoleFinder.g:549:1: field returns [String value] : ID ;
	public final ImpSyntHoleFinder.field_return field() throws RecognitionException {
		ImpSyntHoleFinder.field_return retval = new ImpSyntHoleFinder.field_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree ID432=null;

		CommonTree ID432_tree=null;

		try {
			// ImpSyntHoleFinder.g:550:5: ( ID )
			// ImpSyntHoleFinder.g:550:9: ID
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			ID432=(CommonTree)match(input,ID,FOLLOW_ID_in_field3818); 
			ID432_tree = (CommonTree)adaptor.dupNode(ID432);


			adaptor.addChild(root_0, ID432_tree);

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "field"


	public static class func_return extends TreeRuleReturnScope {
		public String value;
		CommonTree tree;
		@Override
		public CommonTree getTree() { return tree; }
	};


	// $ANTLR start "func"
	// ImpSyntHoleFinder.g:553:1: func returns [String value] : ID ;
	public final ImpSyntHoleFinder.func_return func() throws RecognitionException {
		ImpSyntHoleFinder.func_return retval = new ImpSyntHoleFinder.func_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree ID433=null;

		CommonTree ID433_tree=null;

		try {
			// ImpSyntHoleFinder.g:554:5: ( ID )
			// ImpSyntHoleFinder.g:554:9: ID
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			ID433=(CommonTree)match(input,ID,FOLLOW_ID_in_func3839); 
			ID433_tree = (CommonTree)adaptor.dupNode(ID433);


			adaptor.addChild(root_0, ID433_tree);

			}

			retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "func"

	// Delegated rules



	public static final BitSet FOLLOW_PROG_in_program72 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_recDecl_in_program74 = new BitSet(new long[]{0x0000804000008008L,0x0801080300000000L,0x0000000000004620L});
	public static final BitSet FOLLOW_formDecl_in_program77 = new BitSet(new long[]{0x0000804000008008L,0x0000080000000000L});
	public static final BitSet FOLLOW_methodDef_in_program82 = new BitSet(new long[]{0x0000804000008008L});
	public static final BitSet FOLLOW_predDecl_in_recDecl114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_intFuncDecl_in_recDecl126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binIntFuncDecl_in_recDecl134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lsetFuncDecl_in_recDecl146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_setFuncDecl_in_recDecl158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_msetFuncDecl_in_recDecl170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relDecl_in_recDecl180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binSetFuncDecl_in_recDecl188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_138_in_relDecl214 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_relDecl220 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_relDecl228 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_relDecl236 = new BitSet(new long[]{0x08881E1F45890100L,0xC0C0000018020587L,0x0000000001018000L});
	public static final BitSet FOLLOW_formula_in_relDecl244 = new BitSet(new long[]{0x08881E1F45890108L,0xC0C0000018020587L,0x0000000001018000L});
	public static final BitSet FOLLOW_formula_in_relDecl253 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_137_in_predDecl280 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_predDecl286 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_predDecl292 = new BitSet(new long[]{0x08881E1F45890100L,0xC0C0000018020587L,0x0000000001018000L});
	public static final BitSet FOLLOW_formula_in_predDecl300 = new BitSet(new long[]{0x08881E1F45890108L,0xC0C0000018020587L,0x0000000001018000L});
	public static final BitSet FOLLOW_formula_in_predDecl309 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_112_in_intFuncDecl336 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_intFuncDecl342 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_intFuncDecl348 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_intDef_in_intFuncDecl356 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_96_in_binIntFuncDecl381 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_binIntFuncDecl387 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_binIntFuncDecl395 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_binIntFuncDecl403 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_intDef_in_binIntFuncDecl411 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_100_in_intDef436 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_intCase_in_intDef438 = new BitSet(new long[]{0x080000A080003200L,0x0000000420A10008L});
	public static final BitSet FOLLOW_intTerm_in_intDef441 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_98_in_intCase460 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_formula_in_intCase462 = new BitSet(new long[]{0x080000A080003200L,0x0000000020A10008L});
	public static final BitSet FOLLOW_intTerm_in_intCase464 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_123_in_lsetFuncDecl485 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_lsetFuncDecl491 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_lsetFuncDecl497 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_lsetDef_in_lsetFuncDecl505 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_100_in_lsetDef530 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lsetCase_in_lsetDef532 = new BitSet(new long[]{0x0800400000000000L,0x3100008400000001L,0x0000000000000001L});
	public static final BitSet FOLLOW_lsetTerm_in_lsetDef535 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_98_in_lsetCase554 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_formula_in_lsetCase556 = new BitSet(new long[]{0x0800400000000000L,0x3100008000000001L,0x0000000000000001L});
	public static final BitSet FOLLOW_lsetTerm_in_lsetCase558 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_142_in_setFuncDecl579 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_setFuncDecl585 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_setFuncDecl591 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_setDef_in_setFuncDecl599 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_97_in_binSetFuncDecl624 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_binSetFuncDecl630 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_binSetFuncDecl638 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_binSetFuncDecl646 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_setDef_in_binSetFuncDecl654 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_100_in_setDef679 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_setCase_in_setDef681 = new BitSet(new long[]{0x0800000000000000L,0x0002020400008001L,0x00000000001A0000L});
	public static final BitSet FOLLOW_setTerm_in_setDef684 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_98_in_setCase703 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_formula_in_setCase705 = new BitSet(new long[]{0x0800000000000000L,0x0002020000008001L,0x00000000001A0000L});
	public static final BitSet FOLLOW_setTerm_in_setCase707 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_133_in_msetFuncDecl728 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_msetFuncDecl734 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_msetFuncDecl740 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_msetDef_in_msetFuncDecl748 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_100_in_msetDef773 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_msetCase_in_msetDef775 = new BitSet(new long[]{0x0820000000000000L,0x0000010400000001L,0x00000000000001C8L});
	public static final BitSet FOLLOW_msetTerm_in_msetDef778 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_98_in_msetCase797 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_formula_in_msetCase799 = new BitSet(new long[]{0x0820000000000000L,0x0000010000000001L,0x00000000000001C8L});
	public static final BitSet FOLLOW_msetTerm_in_msetCase801 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_107_in_formDecl818 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_formDecl820 = new BitSet(new long[]{0x08881E1F45890100L,0xC0C0000018020587L,0x0000000001018000L});
	public static final BitSet FOLLOW_formula_in_formDecl828 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_type_in_methodDef847 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_methodDef856 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_methodArgs_in_methodDef865 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_requires_in_methodDef874 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_ensures_in_methodDef883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_methodBody_in_methodDef893 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ARGS_in_methodArgs932 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_arg_in_methodArgs943 = new BitSet(new long[]{0x0000804000008008L});
	public static final BitSet FOLLOW_ITYPE_in_arg972 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_iVar_in_arg974 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTYPE_in_arg984 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lVar_in_arg986 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BTYPE_in_arg996 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_bVar_in_arg998 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_139_in_requires1054 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_formula_in_requires1058 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_106_in_ensures1077 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_formula_in_ensures1081 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SEQ_in_methodBody1107 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_methodBody1109 = new BitSet(new long[]{0x00440000304004C8L,0x0200800000004040L,0x0000000000440000L});
	public static final BitSet FOLLOW_whileLoop_in_statement1135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_in_statement1141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_statement1145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ATOMSTMT_in_statement1152 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_methodBody_in_statement1154 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_functionCall_in_mainBody1184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileLoop_in_mainBody1194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_150_in_whileLoop1220 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_boolExp_in_whileLoop1222 = new BitSet(new long[]{0x00440000304004C0L,0x0200800000004040L,0x0000000000440000L});
	public static final BitSet FOLLOW_statement_in_whileLoop1224 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_121_in_whileLoop1236 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_whileLoop1238 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_INT_in_whileLoop1240 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_INT_in_whileLoop1242 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_146_in_whileLoop1256 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_whileLoop1258 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_INT_in_whileLoop1260 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_INT_in_whileLoop1262 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_111_in_conditional1291 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_boolExp_in_conditional1294 = new BitSet(new long[]{0x00440000304004C0L,0x0200800000004040L,0x0000000000440000L});
	public static final BitSet FOLLOW_statement_in_conditional1296 = new BitSet(new long[]{0x0000000000000008L,0x0000004000000000L});
	public static final BitSet FOLLOW_el_in_conditional1298 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_102_in_el1326 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_el1328 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_in_command1347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mutation_in_command1355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_malloc_in_command1363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_free_in_command1371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assume_in_command1379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_command1387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ret_in_command1395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unknownStmt_in_command1403 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STMT_in_unknownStmt1423 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomIntExp_in_unknownStmt1425 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSGN_in_assignment1446 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ITYPE_in_assignment1448 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_iVar_in_assignment1450 = new BitSet(new long[]{0x0000008000200000L,0x0000000000A00000L});
	public static final BitSet FOLLOW_intExp_in_assignment1452 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSGN_in_assignment1464 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LTYPE_in_assignment1466 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_assignment1468 = new BitSet(new long[]{0x0301000000000000L});
	public static final BitSet FOLLOW_locExp_in_assignment1470 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSGN_in_assignment1482 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_BTYPE_in_assignment1484 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_bVar_in_assignment1486 = new BitSet(new long[]{0x1400020102010110L,0x0000000818020000L});
	public static final BitSet FOLLOW_boolExp_in_assignment1488 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DEREFASSGN_in_assignment1500 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ITYPE_in_assignment1502 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_iVar_in_assignment1504 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_dataDeref_in_assignment1506 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DEREFASSGN_in_assignment1518 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LTYPE_in_assignment1520 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_assignment1522 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_dirDeref_in_assignment1524 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MUTATE_in_mutation1546 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LTYPE_in_mutation1548 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_dirDeref_in_mutation1550 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_mutation1552 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MUTATE_in_mutation1562 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ITYPE_in_mutation1564 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_dataDeref_in_mutation1566 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_iVar_in_mutation1568 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RET_in_ret1591 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LTYPE_in_ret1593 = new BitSet(new long[]{0x0301000000000000L});
	public static final BitSet FOLLOW_locExp_in_ret1595 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RET_in_ret1605 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ITYPE_in_ret1607 = new BitSet(new long[]{0x0000008000200000L});
	public static final BitSet FOLLOW_atomIntExp_in_ret1609 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RET_in_ret1619 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_BTYPE_in_ret1621 = new BitSet(new long[]{0x0000020100010100L,0x0000000818020000L});
	public static final BitSet FOLLOW_atomBoolExp_in_ret1623 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MALLOC_in_malloc1644 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lVar_in_malloc1646 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FREE_in_free1667 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lVar_in_free1669 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSUME_in_assume1688 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_boolExp_in_assume1690 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_func_in_functionCall1711 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LTYPE_in_functionCall1713 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_functionCall1727 = new BitSet(new long[]{0x0001008000000000L});
	public static final BitSet FOLLOW_vars_in_functionCall1729 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_func_in_functionCall1746 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ITYPE_in_functionCall1748 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_iVar_in_functionCall1758 = new BitSet(new long[]{0x0001008000000000L});
	public static final BitSet FOLLOW_vars_in_functionCall1760 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_func_in_functionCall1774 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_BTYPE_in_functionCall1776 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_bVar_in_functionCall1778 = new BitSet(new long[]{0x0001008000000000L});
	public static final BitSet FOLLOW_vars_in_functionCall1780 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_lVar_in_vars1802 = new BitSet(new long[]{0x0001008000000002L});
	public static final BitSet FOLLOW_iVar_in_vars1806 = new BitSet(new long[]{0x0001008000000002L});
	public static final BitSet FOLLOW_LVARS_in_lVars1827 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lVar_in_lVars1830 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_IVARS_in_iVars1851 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_iVar_in_iVars1853 = new BitSet(new long[]{0x0000008000000008L});
	public static final BitSet FOLLOW_BVARS_in_bVars1875 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_bVar_in_bVars1877 = new BitSet(new long[]{0x0000000000010008L});
	public static final BitSet FOLLOW_atomForm_in_formula1898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binaryConnector_in_formula1907 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomForm_in_formula1909 = new BitSet(new long[]{0x0800000001010100L,0x0000000000020007L});
	public static final BitSet FOLLOW_atomForm_in_formula1911 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEG_in_formula1921 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomForm_in_formula1923 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_pointsTo_in_formula1932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOCEQ_in_formula1941 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_locTerm_in_formula1943 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_formula1945 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTEQ_in_formula1955 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula1957 = new BitSet(new long[]{0x080000A080003200L,0x0000000000010008L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula1959 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_91_in_formula1969 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula1971 = new BitSet(new long[]{0x080000A080003200L,0x0000000000010008L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula1973 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_92_in_formula1983 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula1985 = new BitSet(new long[]{0x080000A080003200L,0x0000000000010008L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula1987 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SETEQ_in_formula1997 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula1999 = new BitSet(new long[]{0x0000000000000000L,0x0000020000008001L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula2001 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LSETEQ_in_formula2011 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomLsetTerm_in_formula2013 = new BitSet(new long[]{0x0000400000000000L,0x0000008000000001L});
	public static final BitSet FOLLOW_atomLsetTerm_in_formula2015 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MSETEQ_in_formula2025 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomMsetTerm_in_formula2027 = new BitSet(new long[]{0x0020000000000000L,0x0000010000000001L});
	public static final BitSet FOLLOW_atomMsetTerm_in_formula2029 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTMEM_in_formula2039 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula2041 = new BitSet(new long[]{0x0000000000000000L,0x0000020000008001L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula2043 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOCMEM_in_formula2053 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_locTerm_in_formula2055 = new BitSet(new long[]{0x0000400000000000L,0x0000008000000001L});
	public static final BitSet FOLLOW_atomLsetTerm_in_formula2057 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTMMEM_in_formula2067 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula2069 = new BitSet(new long[]{0x0020000000000000L,0x0000010000000001L});
	public static final BitSet FOLLOW_atomMsetTerm_in_formula2071 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTSUBSET_in_formula2081 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula2083 = new BitSet(new long[]{0x0000000000000000L,0x0000020000008001L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula2085 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_126_in_formula2095 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula2097 = new BitSet(new long[]{0x0000000000000000L,0x0000020000008001L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula2099 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_118_in_formula2109 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula2111 = new BitSet(new long[]{0x0000000000000000L,0x0000020000008001L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula2113 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_127_in_formula2123 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula2125 = new BitSet(new long[]{0x0000000000000000L,0x0000020000008001L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula2127 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_144_in_formula2137 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula2139 = new BitSet(new long[]{0x080000A080003200L,0x0000000000010008L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula2141 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_119_in_formula2151 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula2153 = new BitSet(new long[]{0x0000000000000000L,0x0000020000008001L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula2155 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_143_in_formula2165 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula2167 = new BitSet(new long[]{0x080000A080003200L,0x0000000000010008L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula2169 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOCSUBSET_in_formula2179 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomLsetTerm_in_formula2181 = new BitSet(new long[]{0x0000400000000000L,0x0000008000000001L});
	public static final BitSet FOLLOW_atomLsetTerm_in_formula2183 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTMSUBSET_in_formula2193 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomMsetTerm_in_formula2195 = new BitSet(new long[]{0x0020000000000000L,0x0000010000000001L});
	public static final BitSet FOLLOW_atomMsetTerm_in_formula2197 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ATOMBOOL_in_atomForm2275 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_formula_in_atomForm2277 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TRUE_in_atomForm2286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EMP_in_atomForm2294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RESULTFORM_in_atomForm2302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bVar_in_atomForm2310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relRec_in_atomForm2318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rec_in_atomForm2326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLD_in_atomForm2335 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_formula_in_atomForm2337 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_152_in_pointsTo2356 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_locTerm_in_pointsTo2358 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_fieldVal_in_pointsTo2360 = new BitSet(new long[]{0x0000000000000008L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_fieldVal2382 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ITYPE_in_fieldVal2384 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_field_in_fieldVal2386 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_iVar_in_fieldVal2388 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_89_in_fieldVal2399 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LTYPE_in_fieldVal2401 = new BitSet(new long[]{0x4000000020000000L});
	public static final BitSet FOLLOW_dir_in_fieldVal2403 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_fieldVal2405 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_89_in_fieldVal2416 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SLTYPE_in_fieldVal2418 = new BitSet(new long[]{0x4000000020000000L});
	public static final BitSet FOLLOW_dir_in_fieldVal2420 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_fieldVal2422 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_89_in_fieldVal2433 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ITYPE_in_fieldVal2435 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_field_in_fieldVal2437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_149_in_fieldVal2439 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_iVar_in_fieldVal2441 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_89_in_fieldVal2452 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LTYPE_in_fieldVal2454 = new BitSet(new long[]{0x4000000020000000L});
	public static final BitSet FOLLOW_dir_in_fieldVal2456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_149_in_fieldVal2458 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_fieldVal2460 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NIL_in_locTerm2483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RESULTLOC_in_locTerm2492 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lVar_in_locTerm2501 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLD_in_locTerm2510 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_locTerm_in_locTerm2514 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_atomIntTerm_in_intTerm2534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_intTerm2543 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomIntTerm_in_intTerm2545 = new BitSet(new long[]{0x080000A080003200L,0x0000000000010008L});
	public static final BitSet FOLLOW_atomIntTerm_in_intTerm2547 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_87_in_intTerm2557 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomIntTerm_in_intTerm2559 = new BitSet(new long[]{0x080000A080003200L,0x0000000000010008L});
	public static final BitSet FOLLOW_atomIntTerm_in_intTerm2561 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_93_in_intTerm2571 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomForm_in_intTerm2573 = new BitSet(new long[]{0x080000A080003200L,0x0000000000010008L});
	public static final BitSet FOLLOW_atomIntTerm_in_intTerm2575 = new BitSet(new long[]{0x080000A080003200L,0x0000000000010008L});
	public static final BitSet FOLLOW_atomIntTerm_in_intTerm2577 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ATOMINT_in_atomIntTerm2596 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_intTerm_in_atomIntTerm2598 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INT_in_atomIntTerm2607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RESULTINT_in_atomIntTerm2615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iVar_in_atomIntTerm2623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iRec_in_atomIntTerm2631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_biRec_in_atomIntTerm2639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOT_in_atomIntTerm2647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOP_in_atomIntTerm2655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLD_in_atomIntTerm2664 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_intTerm_in_atomIntTerm2666 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_atomLsetTerm_in_lsetTerm2686 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_125_in_lsetTerm2695 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_locTerm_in_lsetTerm2697 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_128_in_lsetTerm2707 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lsetTerm_in_lsetTerm2709 = new BitSet(new long[]{0x0800400000000000L,0x3100008000000001L,0x0000000000000001L});
	public static final BitSet FOLLOW_lsetTerm_in_lsetTerm2711 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_120_in_lsetTerm2721 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lsetTerm_in_lsetTerm2723 = new BitSet(new long[]{0x0800400000000000L,0x3100008000000001L,0x0000000000000001L});
	public static final BitSet FOLLOW_lsetTerm_in_lsetTerm2725 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_124_in_lsetTerm2735 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lsetTerm_in_lsetTerm2737 = new BitSet(new long[]{0x0800400000000000L,0x3100008000000001L,0x0000000000000001L});
	public static final BitSet FOLLOW_lsetTerm_in_lsetTerm2739 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OLD_in_lsetTerm2749 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lsetTerm_in_lsetTerm2751 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_103_in_atomLsetTerm2769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lsVar_in_atomLsetTerm2777 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rec_in_atomLsetTerm2785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomSetTerm_in_setTerm2804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_147_in_setTerm2813 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_intTerm_in_setTerm2815 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_148_in_setTerm2825 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_setTerm_in_setTerm2827 = new BitSet(new long[]{0x0800000000000000L,0x0002020000008001L,0x00000000001A0000L});
	public static final BitSet FOLLOW_setTerm_in_setTerm2829 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_113_in_setTerm2839 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_setTerm_in_setTerm2841 = new BitSet(new long[]{0x0800000000000000L,0x0002020000008001L,0x00000000001A0000L});
	public static final BitSet FOLLOW_setTerm_in_setTerm2843 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_145_in_setTerm2853 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_setTerm_in_setTerm2855 = new BitSet(new long[]{0x0800000000000000L,0x0002020000008001L,0x00000000001A0000L});
	public static final BitSet FOLLOW_setTerm_in_setTerm2857 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OLD_in_setTerm2867 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_setTerm_in_setTerm2869 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_105_in_atomSetTerm2887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sVar_in_atomSetTerm2895 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rec_in_atomSetTerm2903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomMsetTerm_in_msetTerm2922 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_135_in_msetTerm2931 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_intTerm_in_msetTerm2933 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_136_in_msetTerm2943 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_msetTerm_in_msetTerm2945 = new BitSet(new long[]{0x0820000000000000L,0x0000010000000001L,0x00000000000001C8L});
	public static final BitSet FOLLOW_msetTerm_in_msetTerm2947 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_131_in_msetTerm2957 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_msetTerm_in_msetTerm2959 = new BitSet(new long[]{0x0820000000000000L,0x0000010000000001L,0x00000000000001C8L});
	public static final BitSet FOLLOW_msetTerm_in_msetTerm2961 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_134_in_msetTerm2971 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_msetTerm_in_msetTerm2973 = new BitSet(new long[]{0x0820000000000000L,0x0000010000000001L,0x00000000000001C8L});
	public static final BitSet FOLLOW_msetTerm_in_msetTerm2975 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OLD_in_msetTerm2985 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_msetTerm_in_msetTerm2987 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_104_in_atomMsetTerm3005 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_msVar_in_atomMsetTerm3013 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rec_in_atomMsetTerm3021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RELREC_in_relRec3041 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_relRec3043 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_relRec3045 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_relRec3049 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_REC_in_rec3070 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_rec3072 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_rec3074 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IREC_in_iRec3095 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_iRec3097 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_iRec3099 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BIREC_in_biRec3118 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_biRec3120 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_biRec3122 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_biRec3126 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SREC_in_sRec3147 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_sRec3149 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_sRec3151 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BSREC_in_bsRec3172 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_bsRec3174 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_bsRec3176 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_bsRec3180 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LSREC_in_lsRec3201 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_lsRec3203 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_lsRec3205 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MSREC_in_msRec3224 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_msRec3226 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_msRec3228 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_atomIntExp_in_intExp3246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_intExp3256 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_intExp_in_intExp3264 = new BitSet(new long[]{0x0000008000200000L,0x0000000000A00000L});
	public static final BitSet FOLLOW_intExp_in_intExp3266 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CONS_in_atomIntExp3291 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_atomIntExp3293 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_iVar_in_atomIntExp3302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NIL_in_locExp3319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEW_in_locExp3327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lVar_in_locExp3337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomBoolExp_in_boolExp3354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_boolExp3364 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomBoolExp_in_boolExp3376 = new BitSet(new long[]{0x0000020100010100L,0x0000000818020000L});
	public static final BitSet FOLLOW_atomBoolExp_in_boolExp3378 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOT_in_boolExp3389 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomBoolExp_in_boolExp3391 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ATOMBOOL_in_atomBoolExp3414 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_boolExp_in_atomBoolExp3416 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOCEQ_in_atomBoolExp3424 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_locExp_in_atomBoolExp3426 = new BitSet(new long[]{0x0301000000000000L});
	public static final BitSet FOLLOW_locExp_in_atomBoolExp3428 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTEQ_in_atomBoolExp3436 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_intExp_in_atomBoolExp3438 = new BitSet(new long[]{0x0000008000200000L,0x0000000000A00000L});
	public static final BitSet FOLLOW_intExp_in_atomBoolExp3440 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_91_in_atomBoolExp3448 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_intExp_in_atomBoolExp3450 = new BitSet(new long[]{0x0000008000200000L,0x0000000000A00000L});
	public static final BitSet FOLLOW_intExp_in_atomBoolExp3452 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_92_in_atomBoolExp3460 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_intExp_in_atomBoolExp3462 = new BitSet(new long[]{0x0000008000200000L,0x0000000000A00000L});
	public static final BitSet FOLLOW_intExp_in_atomBoolExp3464 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TRUE_in_atomBoolExp3471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bVar_in_atomBoolExp3477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_99_in_atomBoolExp3484 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomIntExp_in_atomBoolExp3486 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_88_in_dirDeref3513 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lVar_in_dirDeref3515 = new BitSet(new long[]{0x4000000020000000L});
	public static final BitSet FOLLOW_dir_in_dirDeref3517 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_88_in_dataDeref3540 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lVar_in_dataDeref3542 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_field_in_dataDeref3544 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IVAR_in_iVar3569 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_iVar3571 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IVAR_in_iVar3582 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QMARK_in_iVar3586 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LVAR_in_lVar3613 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_lVar3615 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LVAR_in_lVar3626 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QQMARK_in_lVar3630 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BVAR_in_bVar3661 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_bVar3663 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BVAR_in_bVar3674 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QMARK_in_bVar3676 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SVAR_in_sVar3701 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_sVar3703 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LSVAR_in_lsVar3732 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_lsVar3734 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MSVAR_in_msVar3759 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_msVar3761 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_field3818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_func3839 = new BitSet(new long[]{0x0000000000000002L});
}
