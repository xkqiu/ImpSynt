// $ANTLR 3.5.2 ImpSyntHoleFinder.g 2017-04-11 00:08:11

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
	// ImpSyntHoleFinder.g:212:1: whileLoop : ( ^( 'while' boolExp statement ) | ^( 'loop' INT ) | ^( 'simple-loop' INT ) );
	public final ImpSyntHoleFinder.whileLoop_return whileLoop() throws RecognitionException {
		ImpSyntHoleFinder.whileLoop_return retval = new ImpSyntHoleFinder.whileLoop_return();
		retval.start = input.LT(1);

		CommonTree root_0 = null;

		CommonTree _first_0 = null;
		CommonTree _last = null;


		CommonTree string_literal84=null;
		CommonTree string_literal87=null;
		CommonTree INT88=null;
		CommonTree string_literal89=null;
		CommonTree INT90=null;
		TreeRuleReturnScope boolExp85 =null;
		TreeRuleReturnScope statement86 =null;

		CommonTree string_literal84_tree=null;
		CommonTree string_literal87_tree=null;
		CommonTree INT88_tree=null;
		CommonTree string_literal89_tree=null;
		CommonTree INT90_tree=null;

		try {
			// ImpSyntHoleFinder.g:213:5: ( ^( 'while' boolExp statement ) | ^( 'loop' INT ) | ^( 'simple-loop' INT ) )
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
					// ImpSyntHoleFinder.g:215:9: ^( 'loop' INT )
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

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					unknownLoops.add(retval.tree); loopLocs.add(Integer.valueOf(bbSize));
					}
					break;
				case 3 :
					// ImpSyntHoleFinder.g:216:9: ^( 'simple-loop' INT )
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					{
					CommonTree _save_last_1 = _last;
					CommonTree _first_1 = null;
					CommonTree root_1 = (CommonTree)adaptor.nil();
					_last = (CommonTree)input.LT(1);
					string_literal89=(CommonTree)match(input,146,FOLLOW_146_in_whileLoop1252); 
					string_literal89_tree = (CommonTree)adaptor.dupNode(string_literal89);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal89_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					INT90=(CommonTree)match(input,INT,FOLLOW_INT_in_whileLoop1254); 
					INT90_tree = (CommonTree)adaptor.dupNode(INT90);


					adaptor.addChild(root_1, INT90_tree);

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


		CommonTree string_literal91=null;
		TreeRuleReturnScope boolExp92 =null;
		TreeRuleReturnScope statement93 =null;
		TreeRuleReturnScope el94 =null;

		CommonTree string_literal91_tree=null;

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
			string_literal91=(CommonTree)match(input,111,FOLLOW_111_in_conditional1283); 
			string_literal91_tree = (CommonTree)adaptor.dupNode(string_literal91);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal91_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_boolExp_in_conditional1286);
			boolExp92=boolExp();
			state._fsp--;

			adaptor.addChild(root_1, boolExp92.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_statement_in_conditional1288);
			statement93=statement();
			state._fsp--;

			adaptor.addChild(root_1, statement93.getTree());

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
					pushFollow(FOLLOW_el_in_conditional1290);
					el94=el();
					state._fsp--;

					adaptor.addChild(root_1, el94.getTree());

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


		CommonTree string_literal95=null;
		TreeRuleReturnScope statement96 =null;

		CommonTree string_literal95_tree=null;

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
			string_literal95=(CommonTree)match(input,102,FOLLOW_102_in_el1318); 
			string_literal95_tree = (CommonTree)adaptor.dupNode(string_literal95);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal95_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_statement_in_el1320);
			statement96=statement();
			state._fsp--;

			adaptor.addChild(root_1, statement96.getTree());

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


		TreeRuleReturnScope assignment97 =null;
		TreeRuleReturnScope mutation98 =null;
		TreeRuleReturnScope malloc99 =null;
		TreeRuleReturnScope free100 =null;
		TreeRuleReturnScope assume101 =null;
		TreeRuleReturnScope functionCall102 =null;
		TreeRuleReturnScope ret103 =null;
		TreeRuleReturnScope unknownStmt104 =null;


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
					pushFollow(FOLLOW_assignment_in_command1339);
					assignment97=assignment();
					state._fsp--;

					adaptor.addChild(root_0, assignment97.getTree());

					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:232:7: mutation
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_mutation_in_command1347);
					mutation98=mutation();
					state._fsp--;

					adaptor.addChild(root_0, mutation98.getTree());

					}
					break;
				case 3 :
					// ImpSyntHoleFinder.g:233:7: malloc
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_malloc_in_command1355);
					malloc99=malloc();
					state._fsp--;

					adaptor.addChild(root_0, malloc99.getTree());

					}
					break;
				case 4 :
					// ImpSyntHoleFinder.g:234:7: free
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_free_in_command1363);
					free100=free();
					state._fsp--;

					adaptor.addChild(root_0, free100.getTree());

					}
					break;
				case 5 :
					// ImpSyntHoleFinder.g:235:7: assume
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_assume_in_command1371);
					assume101=assume();
					state._fsp--;

					adaptor.addChild(root_0, assume101.getTree());

					}
					break;
				case 6 :
					// ImpSyntHoleFinder.g:236:7: functionCall
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_functionCall_in_command1379);
					functionCall102=functionCall();
					state._fsp--;

					adaptor.addChild(root_0, functionCall102.getTree());

					}
					break;
				case 7 :
					// ImpSyntHoleFinder.g:237:7: ret
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_ret_in_command1387);
					ret103=ret();
					state._fsp--;

					adaptor.addChild(root_0, ret103.getTree());

					}
					break;
				case 8 :
					// ImpSyntHoleFinder.g:238:7: unknownStmt
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_unknownStmt_in_command1395);
					unknownStmt104=unknownStmt();
					state._fsp--;

					adaptor.addChild(root_0, unknownStmt104.getTree());

					unknownStmts.add((unknownStmt104!=null?((CommonTree)unknownStmt104.getTree()):null));
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


		CommonTree STMT105=null;
		TreeRuleReturnScope atomIntExp106 =null;

		CommonTree STMT105_tree=null;

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
			STMT105=(CommonTree)match(input,STMT,FOLLOW_STMT_in_unknownStmt1415); 
			STMT105_tree = (CommonTree)adaptor.dupNode(STMT105);


			root_1 = (CommonTree)adaptor.becomeRoot(STMT105_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_atomIntExp_in_unknownStmt1417);
			atomIntExp106=atomIntExp();
			state._fsp--;

			adaptor.addChild(root_1, atomIntExp106.getTree());

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


		CommonTree ASSGN107=null;
		CommonTree ITYPE108=null;
		CommonTree ASSGN111=null;
		CommonTree LTYPE112=null;
		CommonTree ASSGN115=null;
		CommonTree BTYPE116=null;
		CommonTree DEREFASSGN119=null;
		CommonTree ITYPE120=null;
		CommonTree DEREFASSGN123=null;
		CommonTree LTYPE124=null;
		TreeRuleReturnScope iVar109 =null;
		TreeRuleReturnScope intExp110 =null;
		TreeRuleReturnScope lVar113 =null;
		TreeRuleReturnScope locExp114 =null;
		TreeRuleReturnScope bVar117 =null;
		TreeRuleReturnScope boolExp118 =null;
		TreeRuleReturnScope iVar121 =null;
		TreeRuleReturnScope dataDeref122 =null;
		TreeRuleReturnScope lVar125 =null;
		TreeRuleReturnScope dirDeref126 =null;

		CommonTree ASSGN107_tree=null;
		CommonTree ITYPE108_tree=null;
		CommonTree ASSGN111_tree=null;
		CommonTree LTYPE112_tree=null;
		CommonTree ASSGN115_tree=null;
		CommonTree BTYPE116_tree=null;
		CommonTree DEREFASSGN119_tree=null;
		CommonTree ITYPE120_tree=null;
		CommonTree DEREFASSGN123_tree=null;
		CommonTree LTYPE124_tree=null;

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
					ASSGN107=(CommonTree)match(input,ASSGN,FOLLOW_ASSGN_in_assignment1438); 
					ASSGN107_tree = (CommonTree)adaptor.dupNode(ASSGN107);


					root_1 = (CommonTree)adaptor.becomeRoot(ASSGN107_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					ITYPE108=(CommonTree)match(input,ITYPE,FOLLOW_ITYPE_in_assignment1440); 
					ITYPE108_tree = (CommonTree)adaptor.dupNode(ITYPE108);


					adaptor.addChild(root_1, ITYPE108_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_iVar_in_assignment1442);
					iVar109=iVar();
					state._fsp--;

					adaptor.addChild(root_1, iVar109.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_intExp_in_assignment1444);
					intExp110=intExp();
					state._fsp--;

					adaptor.addChild(root_1, intExp110.getTree());

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
					ASSGN111=(CommonTree)match(input,ASSGN,FOLLOW_ASSGN_in_assignment1456); 
					ASSGN111_tree = (CommonTree)adaptor.dupNode(ASSGN111);


					root_1 = (CommonTree)adaptor.becomeRoot(ASSGN111_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					LTYPE112=(CommonTree)match(input,LTYPE,FOLLOW_LTYPE_in_assignment1458); 
					LTYPE112_tree = (CommonTree)adaptor.dupNode(LTYPE112);


					adaptor.addChild(root_1, LTYPE112_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lVar_in_assignment1460);
					lVar113=lVar();
					state._fsp--;

					adaptor.addChild(root_1, lVar113.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_locExp_in_assignment1462);
					locExp114=locExp();
					state._fsp--;

					adaptor.addChild(root_1, locExp114.getTree());

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
					ASSGN115=(CommonTree)match(input,ASSGN,FOLLOW_ASSGN_in_assignment1474); 
					ASSGN115_tree = (CommonTree)adaptor.dupNode(ASSGN115);


					root_1 = (CommonTree)adaptor.becomeRoot(ASSGN115_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					BTYPE116=(CommonTree)match(input,BTYPE,FOLLOW_BTYPE_in_assignment1476); 
					BTYPE116_tree = (CommonTree)adaptor.dupNode(BTYPE116);


					adaptor.addChild(root_1, BTYPE116_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_bVar_in_assignment1478);
					bVar117=bVar();
					state._fsp--;

					adaptor.addChild(root_1, bVar117.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_boolExp_in_assignment1480);
					boolExp118=boolExp();
					state._fsp--;

					adaptor.addChild(root_1, boolExp118.getTree());

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
					DEREFASSGN119=(CommonTree)match(input,DEREFASSGN,FOLLOW_DEREFASSGN_in_assignment1492); 
					DEREFASSGN119_tree = (CommonTree)adaptor.dupNode(DEREFASSGN119);


					root_1 = (CommonTree)adaptor.becomeRoot(DEREFASSGN119_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					ITYPE120=(CommonTree)match(input,ITYPE,FOLLOW_ITYPE_in_assignment1494); 
					ITYPE120_tree = (CommonTree)adaptor.dupNode(ITYPE120);


					adaptor.addChild(root_1, ITYPE120_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_iVar_in_assignment1496);
					iVar121=iVar();
					state._fsp--;

					adaptor.addChild(root_1, iVar121.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_dataDeref_in_assignment1498);
					dataDeref122=dataDeref();
					state._fsp--;

					adaptor.addChild(root_1, dataDeref122.getTree());

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
					DEREFASSGN123=(CommonTree)match(input,DEREFASSGN,FOLLOW_DEREFASSGN_in_assignment1510); 
					DEREFASSGN123_tree = (CommonTree)adaptor.dupNode(DEREFASSGN123);


					root_1 = (CommonTree)adaptor.becomeRoot(DEREFASSGN123_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					LTYPE124=(CommonTree)match(input,LTYPE,FOLLOW_LTYPE_in_assignment1512); 
					LTYPE124_tree = (CommonTree)adaptor.dupNode(LTYPE124);


					adaptor.addChild(root_1, LTYPE124_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lVar_in_assignment1514);
					lVar125=lVar();
					state._fsp--;

					adaptor.addChild(root_1, lVar125.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_dirDeref_in_assignment1516);
					dirDeref126=dirDeref();
					state._fsp--;

					adaptor.addChild(root_1, dirDeref126.getTree());

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


		CommonTree MUTATE127=null;
		CommonTree LTYPE128=null;
		CommonTree MUTATE131=null;
		CommonTree ITYPE132=null;
		TreeRuleReturnScope dirDeref129 =null;
		TreeRuleReturnScope lVar130 =null;
		TreeRuleReturnScope dataDeref133 =null;
		TreeRuleReturnScope iVar134 =null;

		CommonTree MUTATE127_tree=null;
		CommonTree LTYPE128_tree=null;
		CommonTree MUTATE131_tree=null;
		CommonTree ITYPE132_tree=null;

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
					MUTATE127=(CommonTree)match(input,MUTATE,FOLLOW_MUTATE_in_mutation1538); 
					MUTATE127_tree = (CommonTree)adaptor.dupNode(MUTATE127);


					root_1 = (CommonTree)adaptor.becomeRoot(MUTATE127_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					LTYPE128=(CommonTree)match(input,LTYPE,FOLLOW_LTYPE_in_mutation1540); 
					LTYPE128_tree = (CommonTree)adaptor.dupNode(LTYPE128);


					adaptor.addChild(root_1, LTYPE128_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_dirDeref_in_mutation1542);
					dirDeref129=dirDeref();
					state._fsp--;

					adaptor.addChild(root_1, dirDeref129.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lVar_in_mutation1544);
					lVar130=lVar();
					state._fsp--;

					adaptor.addChild(root_1, lVar130.getTree());

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
					MUTATE131=(CommonTree)match(input,MUTATE,FOLLOW_MUTATE_in_mutation1554); 
					MUTATE131_tree = (CommonTree)adaptor.dupNode(MUTATE131);


					root_1 = (CommonTree)adaptor.becomeRoot(MUTATE131_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					ITYPE132=(CommonTree)match(input,ITYPE,FOLLOW_ITYPE_in_mutation1556); 
					ITYPE132_tree = (CommonTree)adaptor.dupNode(ITYPE132);


					adaptor.addChild(root_1, ITYPE132_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_dataDeref_in_mutation1558);
					dataDeref133=dataDeref();
					state._fsp--;

					adaptor.addChild(root_1, dataDeref133.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_iVar_in_mutation1560);
					iVar134=iVar();
					state._fsp--;

					adaptor.addChild(root_1, iVar134.getTree());

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


		CommonTree RET135=null;
		CommonTree LTYPE136=null;
		CommonTree RET138=null;
		CommonTree ITYPE139=null;
		CommonTree RET141=null;
		CommonTree BTYPE142=null;
		TreeRuleReturnScope locExp137 =null;
		TreeRuleReturnScope atomIntExp140 =null;
		TreeRuleReturnScope atomBoolExp143 =null;

		CommonTree RET135_tree=null;
		CommonTree LTYPE136_tree=null;
		CommonTree RET138_tree=null;
		CommonTree ITYPE139_tree=null;
		CommonTree RET141_tree=null;
		CommonTree BTYPE142_tree=null;

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
					RET135=(CommonTree)match(input,RET,FOLLOW_RET_in_ret1583); 
					RET135_tree = (CommonTree)adaptor.dupNode(RET135);


					root_1 = (CommonTree)adaptor.becomeRoot(RET135_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					LTYPE136=(CommonTree)match(input,LTYPE,FOLLOW_LTYPE_in_ret1585); 
					LTYPE136_tree = (CommonTree)adaptor.dupNode(LTYPE136);


					adaptor.addChild(root_1, LTYPE136_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_locExp_in_ret1587);
					locExp137=locExp();
					state._fsp--;

					adaptor.addChild(root_1, locExp137.getTree());

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
					RET138=(CommonTree)match(input,RET,FOLLOW_RET_in_ret1597); 
					RET138_tree = (CommonTree)adaptor.dupNode(RET138);


					root_1 = (CommonTree)adaptor.becomeRoot(RET138_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					ITYPE139=(CommonTree)match(input,ITYPE,FOLLOW_ITYPE_in_ret1599); 
					ITYPE139_tree = (CommonTree)adaptor.dupNode(ITYPE139);


					adaptor.addChild(root_1, ITYPE139_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntExp_in_ret1601);
					atomIntExp140=atomIntExp();
					state._fsp--;

					adaptor.addChild(root_1, atomIntExp140.getTree());

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
					RET141=(CommonTree)match(input,RET,FOLLOW_RET_in_ret1611); 
					RET141_tree = (CommonTree)adaptor.dupNode(RET141);


					root_1 = (CommonTree)adaptor.becomeRoot(RET141_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					BTYPE142=(CommonTree)match(input,BTYPE,FOLLOW_BTYPE_in_ret1613); 
					BTYPE142_tree = (CommonTree)adaptor.dupNode(BTYPE142);


					adaptor.addChild(root_1, BTYPE142_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomBoolExp_in_ret1615);
					atomBoolExp143=atomBoolExp();
					state._fsp--;

					adaptor.addChild(root_1, atomBoolExp143.getTree());

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


		CommonTree MALLOC144=null;
		TreeRuleReturnScope lVar145 =null;

		CommonTree MALLOC144_tree=null;

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
			MALLOC144=(CommonTree)match(input,MALLOC,FOLLOW_MALLOC_in_malloc1636); 
			MALLOC144_tree = (CommonTree)adaptor.dupNode(MALLOC144);


			root_1 = (CommonTree)adaptor.becomeRoot(MALLOC144_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_lVar_in_malloc1638);
			lVar145=lVar();
			state._fsp--;

			adaptor.addChild(root_1, lVar145.getTree());

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


		CommonTree FREE146=null;
		TreeRuleReturnScope lVar147 =null;

		CommonTree FREE146_tree=null;

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
			FREE146=(CommonTree)match(input,FREE,FOLLOW_FREE_in_free1659); 
			FREE146_tree = (CommonTree)adaptor.dupNode(FREE146);


			root_1 = (CommonTree)adaptor.becomeRoot(FREE146_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_lVar_in_free1661);
			lVar147=lVar();
			state._fsp--;

			adaptor.addChild(root_1, lVar147.getTree());

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


		CommonTree ASSUME148=null;
		TreeRuleReturnScope boolExp149 =null;

		CommonTree ASSUME148_tree=null;

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
			ASSUME148=(CommonTree)match(input,ASSUME,FOLLOW_ASSUME_in_assume1680); 
			ASSUME148_tree = (CommonTree)adaptor.dupNode(ASSUME148);


			root_1 = (CommonTree)adaptor.becomeRoot(ASSUME148_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_boolExp_in_assume1682);
			boolExp149=boolExp();
			state._fsp--;

			adaptor.addChild(root_1, boolExp149.getTree());

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


		CommonTree LTYPE151=null;
		CommonTree ITYPE155=null;
		CommonTree BTYPE159=null;
		TreeRuleReturnScope func150 =null;
		TreeRuleReturnScope lVar152 =null;
		TreeRuleReturnScope vars153 =null;
		TreeRuleReturnScope func154 =null;
		TreeRuleReturnScope iVar156 =null;
		TreeRuleReturnScope vars157 =null;
		TreeRuleReturnScope func158 =null;
		TreeRuleReturnScope bVar160 =null;
		TreeRuleReturnScope vars161 =null;

		CommonTree LTYPE151_tree=null;
		CommonTree ITYPE155_tree=null;
		CommonTree BTYPE159_tree=null;

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
					pushFollow(FOLLOW_func_in_functionCall1703);
					func150=func();
					state._fsp--;

					root_1 = (CommonTree)adaptor.becomeRoot(func150.getTree(), root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					LTYPE151=(CommonTree)match(input,LTYPE,FOLLOW_LTYPE_in_functionCall1705); 
					LTYPE151_tree = (CommonTree)adaptor.dupNode(LTYPE151);


					adaptor.addChild(root_1, LTYPE151_tree);

					inFunction=true;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lVar_in_functionCall1719);
					lVar152=lVar();
					state._fsp--;

					adaptor.addChild(root_1, lVar152.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_vars_in_functionCall1721);
					vars153=vars();
					state._fsp--;

					adaptor.addChild(root_1, vars153.getTree());


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
					pushFollow(FOLLOW_func_in_functionCall1738);
					func154=func();
					state._fsp--;

					root_1 = (CommonTree)adaptor.becomeRoot(func154.getTree(), root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					ITYPE155=(CommonTree)match(input,ITYPE,FOLLOW_ITYPE_in_functionCall1740); 
					ITYPE155_tree = (CommonTree)adaptor.dupNode(ITYPE155);


					adaptor.addChild(root_1, ITYPE155_tree);

					inFunction=true;
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_iVar_in_functionCall1750);
					iVar156=iVar();
					state._fsp--;

					adaptor.addChild(root_1, iVar156.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_vars_in_functionCall1752);
					vars157=vars();
					state._fsp--;

					adaptor.addChild(root_1, vars157.getTree());


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
					pushFollow(FOLLOW_func_in_functionCall1766);
					func158=func();
					state._fsp--;

					root_1 = (CommonTree)adaptor.becomeRoot(func158.getTree(), root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					BTYPE159=(CommonTree)match(input,BTYPE,FOLLOW_BTYPE_in_functionCall1768); 
					BTYPE159_tree = (CommonTree)adaptor.dupNode(BTYPE159);


					adaptor.addChild(root_1, BTYPE159_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_bVar_in_functionCall1770);
					bVar160=bVar();
					state._fsp--;

					adaptor.addChild(root_1, bVar160.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_vars_in_functionCall1772);
					vars161=vars();
					state._fsp--;

					adaptor.addChild(root_1, vars161.getTree());

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


		TreeRuleReturnScope lVar162 =null;
		TreeRuleReturnScope iVar163 =null;


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
					pushFollow(FOLLOW_lVar_in_vars1794);
					lVar162=lVar();
					state._fsp--;

					adaptor.addChild(root_0, lVar162.getTree());

					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:300:18: iVar
					{
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_iVar_in_vars1798);
					iVar163=iVar();
					state._fsp--;

					adaptor.addChild(root_0, iVar163.getTree());

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


		CommonTree LVARS164=null;
		TreeRuleReturnScope lVar165 =null;

		CommonTree LVARS164_tree=null;

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
			LVARS164=(CommonTree)match(input,LVARS,FOLLOW_LVARS_in_lVars1819); 
			LVARS164_tree = (CommonTree)adaptor.dupNode(LVARS164);


			root_1 = (CommonTree)adaptor.becomeRoot(LVARS164_tree, root_1);

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
					pushFollow(FOLLOW_lVar_in_lVars1822);
					lVar165=lVar();
					state._fsp--;

					adaptor.addChild(root_1, lVar165.getTree());

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


		CommonTree IVARS166=null;
		TreeRuleReturnScope iVar167 =null;

		CommonTree IVARS166_tree=null;

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
			IVARS166=(CommonTree)match(input,IVARS,FOLLOW_IVARS_in_iVars1843); 
			IVARS166_tree = (CommonTree)adaptor.dupNode(IVARS166);


			root_1 = (CommonTree)adaptor.becomeRoot(IVARS166_tree, root_1);

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
					pushFollow(FOLLOW_iVar_in_iVars1845);
					iVar167=iVar();
					state._fsp--;

					adaptor.addChild(root_1, iVar167.getTree());

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


		CommonTree BVARS168=null;
		TreeRuleReturnScope bVar169 =null;

		CommonTree BVARS168_tree=null;

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
			BVARS168=(CommonTree)match(input,BVARS,FOLLOW_BVARS_in_bVars1867); 
			BVARS168_tree = (CommonTree)adaptor.dupNode(BVARS168);


			root_1 = (CommonTree)adaptor.becomeRoot(BVARS168_tree, root_1);

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
					pushFollow(FOLLOW_bVar_in_bVars1869);
					bVar169=bVar();
					state._fsp--;

					adaptor.addChild(root_1, bVar169.getTree());

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


		CommonTree NEG174=null;
		CommonTree LOCEQ177=null;
		CommonTree INTEQ180=null;
		CommonTree char_literal183=null;
		CommonTree string_literal186=null;
		CommonTree SETEQ189=null;
		CommonTree LSETEQ192=null;
		CommonTree MSETEQ195=null;
		CommonTree INTMEM198=null;
		CommonTree LOCMEM201=null;
		CommonTree INTMMEM204=null;
		CommonTree INTSUBSET207=null;
		CommonTree string_literal210=null;
		CommonTree string_literal213=null;
		CommonTree string_literal216=null;
		CommonTree string_literal219=null;
		CommonTree string_literal222=null;
		CommonTree string_literal225=null;
		CommonTree LOCSUBSET228=null;
		CommonTree INTMSUBSET231=null;
		TreeRuleReturnScope atomForm170 =null;
		TreeRuleReturnScope binaryConnector171 =null;
		TreeRuleReturnScope atomForm172 =null;
		TreeRuleReturnScope atomForm173 =null;
		TreeRuleReturnScope atomForm175 =null;
		TreeRuleReturnScope pointsTo176 =null;
		TreeRuleReturnScope locTerm178 =null;
		TreeRuleReturnScope locTerm179 =null;
		TreeRuleReturnScope atomIntTerm181 =null;
		TreeRuleReturnScope atomIntTerm182 =null;
		TreeRuleReturnScope atomIntTerm184 =null;
		TreeRuleReturnScope atomIntTerm185 =null;
		TreeRuleReturnScope atomIntTerm187 =null;
		TreeRuleReturnScope atomIntTerm188 =null;
		TreeRuleReturnScope atomSetTerm190 =null;
		TreeRuleReturnScope atomSetTerm191 =null;
		TreeRuleReturnScope atomLsetTerm193 =null;
		TreeRuleReturnScope atomLsetTerm194 =null;
		TreeRuleReturnScope atomMsetTerm196 =null;
		TreeRuleReturnScope atomMsetTerm197 =null;
		TreeRuleReturnScope atomIntTerm199 =null;
		TreeRuleReturnScope atomSetTerm200 =null;
		TreeRuleReturnScope locTerm202 =null;
		TreeRuleReturnScope atomLsetTerm203 =null;
		TreeRuleReturnScope atomIntTerm205 =null;
		TreeRuleReturnScope atomMsetTerm206 =null;
		TreeRuleReturnScope atomSetTerm208 =null;
		TreeRuleReturnScope atomSetTerm209 =null;
		TreeRuleReturnScope atomSetTerm211 =null;
		TreeRuleReturnScope atomSetTerm212 =null;
		TreeRuleReturnScope atomSetTerm214 =null;
		TreeRuleReturnScope atomSetTerm215 =null;
		TreeRuleReturnScope atomIntTerm217 =null;
		TreeRuleReturnScope atomSetTerm218 =null;
		TreeRuleReturnScope atomSetTerm220 =null;
		TreeRuleReturnScope atomIntTerm221 =null;
		TreeRuleReturnScope atomIntTerm223 =null;
		TreeRuleReturnScope atomSetTerm224 =null;
		TreeRuleReturnScope atomSetTerm226 =null;
		TreeRuleReturnScope atomIntTerm227 =null;
		TreeRuleReturnScope atomLsetTerm229 =null;
		TreeRuleReturnScope atomLsetTerm230 =null;
		TreeRuleReturnScope atomMsetTerm232 =null;
		TreeRuleReturnScope atomMsetTerm233 =null;

		CommonTree NEG174_tree=null;
		CommonTree LOCEQ177_tree=null;
		CommonTree INTEQ180_tree=null;
		CommonTree char_literal183_tree=null;
		CommonTree string_literal186_tree=null;
		CommonTree SETEQ189_tree=null;
		CommonTree LSETEQ192_tree=null;
		CommonTree MSETEQ195_tree=null;
		CommonTree INTMEM198_tree=null;
		CommonTree LOCMEM201_tree=null;
		CommonTree INTMMEM204_tree=null;
		CommonTree INTSUBSET207_tree=null;
		CommonTree string_literal210_tree=null;
		CommonTree string_literal213_tree=null;
		CommonTree string_literal216_tree=null;
		CommonTree string_literal219_tree=null;
		CommonTree string_literal222_tree=null;
		CommonTree string_literal225_tree=null;
		CommonTree LOCSUBSET228_tree=null;
		CommonTree INTMSUBSET231_tree=null;

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
					pushFollow(FOLLOW_atomForm_in_formula1890);
					atomForm170=atomForm();
					state._fsp--;

					adaptor.addChild(root_0, atomForm170.getTree());

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
					pushFollow(FOLLOW_binaryConnector_in_formula1899);
					binaryConnector171=binaryConnector();
					state._fsp--;

					root_1 = (CommonTree)adaptor.becomeRoot(binaryConnector171.getTree(), root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomForm_in_formula1901);
					atomForm172=atomForm();
					state._fsp--;

					adaptor.addChild(root_1, atomForm172.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomForm_in_formula1903);
					atomForm173=atomForm();
					state._fsp--;

					adaptor.addChild(root_1, atomForm173.getTree());

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
					NEG174=(CommonTree)match(input,NEG,FOLLOW_NEG_in_formula1913); 
					NEG174_tree = (CommonTree)adaptor.dupNode(NEG174);


					root_1 = (CommonTree)adaptor.becomeRoot(NEG174_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomForm_in_formula1915);
					atomForm175=atomForm();
					state._fsp--;

					adaptor.addChild(root_1, atomForm175.getTree());

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
					pushFollow(FOLLOW_pointsTo_in_formula1924);
					pointsTo176=pointsTo();
					state._fsp--;

					adaptor.addChild(root_0, pointsTo176.getTree());

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
					LOCEQ177=(CommonTree)match(input,LOCEQ,FOLLOW_LOCEQ_in_formula1933); 
					LOCEQ177_tree = (CommonTree)adaptor.dupNode(LOCEQ177);


					root_1 = (CommonTree)adaptor.becomeRoot(LOCEQ177_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_locTerm_in_formula1935);
					locTerm178=locTerm();
					state._fsp--;

					adaptor.addChild(root_1, locTerm178.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_locTerm_in_formula1937);
					locTerm179=locTerm();
					state._fsp--;

					adaptor.addChild(root_1, locTerm179.getTree());

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
					INTEQ180=(CommonTree)match(input,INTEQ,FOLLOW_INTEQ_in_formula1947); 
					INTEQ180_tree = (CommonTree)adaptor.dupNode(INTEQ180);


					root_1 = (CommonTree)adaptor.becomeRoot(INTEQ180_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_formula1949);
					atomIntTerm181=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm181.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_formula1951);
					atomIntTerm182=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm182.getTree());

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
					char_literal183=(CommonTree)match(input,91,FOLLOW_91_in_formula1961); 
					char_literal183_tree = (CommonTree)adaptor.dupNode(char_literal183);


					root_1 = (CommonTree)adaptor.becomeRoot(char_literal183_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_formula1963);
					atomIntTerm184=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm184.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_formula1965);
					atomIntTerm185=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm185.getTree());

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
					string_literal186=(CommonTree)match(input,92,FOLLOW_92_in_formula1975); 
					string_literal186_tree = (CommonTree)adaptor.dupNode(string_literal186);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal186_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_formula1977);
					atomIntTerm187=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm187.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_formula1979);
					atomIntTerm188=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm188.getTree());

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
					SETEQ189=(CommonTree)match(input,SETEQ,FOLLOW_SETEQ_in_formula1989); 
					SETEQ189_tree = (CommonTree)adaptor.dupNode(SETEQ189);


					root_1 = (CommonTree)adaptor.becomeRoot(SETEQ189_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomSetTerm_in_formula1991);
					atomSetTerm190=atomSetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomSetTerm190.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomSetTerm_in_formula1993);
					atomSetTerm191=atomSetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomSetTerm191.getTree());

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
					LSETEQ192=(CommonTree)match(input,LSETEQ,FOLLOW_LSETEQ_in_formula2003); 
					LSETEQ192_tree = (CommonTree)adaptor.dupNode(LSETEQ192);


					root_1 = (CommonTree)adaptor.becomeRoot(LSETEQ192_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomLsetTerm_in_formula2005);
					atomLsetTerm193=atomLsetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomLsetTerm193.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomLsetTerm_in_formula2007);
					atomLsetTerm194=atomLsetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomLsetTerm194.getTree());

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
					MSETEQ195=(CommonTree)match(input,MSETEQ,FOLLOW_MSETEQ_in_formula2017); 
					MSETEQ195_tree = (CommonTree)adaptor.dupNode(MSETEQ195);


					root_1 = (CommonTree)adaptor.becomeRoot(MSETEQ195_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomMsetTerm_in_formula2019);
					atomMsetTerm196=atomMsetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomMsetTerm196.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomMsetTerm_in_formula2021);
					atomMsetTerm197=atomMsetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomMsetTerm197.getTree());

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
					INTMEM198=(CommonTree)match(input,INTMEM,FOLLOW_INTMEM_in_formula2031); 
					INTMEM198_tree = (CommonTree)adaptor.dupNode(INTMEM198);


					root_1 = (CommonTree)adaptor.becomeRoot(INTMEM198_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_formula2033);
					atomIntTerm199=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm199.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomSetTerm_in_formula2035);
					atomSetTerm200=atomSetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomSetTerm200.getTree());

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
					LOCMEM201=(CommonTree)match(input,LOCMEM,FOLLOW_LOCMEM_in_formula2045); 
					LOCMEM201_tree = (CommonTree)adaptor.dupNode(LOCMEM201);


					root_1 = (CommonTree)adaptor.becomeRoot(LOCMEM201_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_locTerm_in_formula2047);
					locTerm202=locTerm();
					state._fsp--;

					adaptor.addChild(root_1, locTerm202.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomLsetTerm_in_formula2049);
					atomLsetTerm203=atomLsetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomLsetTerm203.getTree());

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
					INTMMEM204=(CommonTree)match(input,INTMMEM,FOLLOW_INTMMEM_in_formula2059); 
					INTMMEM204_tree = (CommonTree)adaptor.dupNode(INTMMEM204);


					root_1 = (CommonTree)adaptor.becomeRoot(INTMMEM204_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_formula2061);
					atomIntTerm205=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm205.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomMsetTerm_in_formula2063);
					atomMsetTerm206=atomMsetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomMsetTerm206.getTree());

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
					INTSUBSET207=(CommonTree)match(input,INTSUBSET,FOLLOW_INTSUBSET_in_formula2073); 
					INTSUBSET207_tree = (CommonTree)adaptor.dupNode(INTSUBSET207);


					root_1 = (CommonTree)adaptor.becomeRoot(INTSUBSET207_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomSetTerm_in_formula2075);
					atomSetTerm208=atomSetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomSetTerm208.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomSetTerm_in_formula2077);
					atomSetTerm209=atomSetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomSetTerm209.getTree());

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
					string_literal210=(CommonTree)match(input,126,FOLLOW_126_in_formula2087); 
					string_literal210_tree = (CommonTree)adaptor.dupNode(string_literal210);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal210_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomSetTerm_in_formula2089);
					atomSetTerm211=atomSetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomSetTerm211.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomSetTerm_in_formula2091);
					atomSetTerm212=atomSetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomSetTerm212.getTree());

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
					string_literal213=(CommonTree)match(input,118,FOLLOW_118_in_formula2101); 
					string_literal213_tree = (CommonTree)adaptor.dupNode(string_literal213);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal213_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomSetTerm_in_formula2103);
					atomSetTerm214=atomSetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomSetTerm214.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomSetTerm_in_formula2105);
					atomSetTerm215=atomSetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomSetTerm215.getTree());

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
					string_literal216=(CommonTree)match(input,127,FOLLOW_127_in_formula2115); 
					string_literal216_tree = (CommonTree)adaptor.dupNode(string_literal216);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal216_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_formula2117);
					atomIntTerm217=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm217.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomSetTerm_in_formula2119);
					atomSetTerm218=atomSetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomSetTerm218.getTree());

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
					string_literal219=(CommonTree)match(input,144,FOLLOW_144_in_formula2129); 
					string_literal219_tree = (CommonTree)adaptor.dupNode(string_literal219);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal219_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomSetTerm_in_formula2131);
					atomSetTerm220=atomSetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomSetTerm220.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_formula2133);
					atomIntTerm221=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm221.getTree());

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
					string_literal222=(CommonTree)match(input,119,FOLLOW_119_in_formula2143); 
					string_literal222_tree = (CommonTree)adaptor.dupNode(string_literal222);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal222_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_formula2145);
					atomIntTerm223=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm223.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomSetTerm_in_formula2147);
					atomSetTerm224=atomSetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomSetTerm224.getTree());

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
					string_literal225=(CommonTree)match(input,143,FOLLOW_143_in_formula2157); 
					string_literal225_tree = (CommonTree)adaptor.dupNode(string_literal225);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal225_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomSetTerm_in_formula2159);
					atomSetTerm226=atomSetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomSetTerm226.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_formula2161);
					atomIntTerm227=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm227.getTree());

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
					LOCSUBSET228=(CommonTree)match(input,LOCSUBSET,FOLLOW_LOCSUBSET_in_formula2171); 
					LOCSUBSET228_tree = (CommonTree)adaptor.dupNode(LOCSUBSET228);


					root_1 = (CommonTree)adaptor.becomeRoot(LOCSUBSET228_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomLsetTerm_in_formula2173);
					atomLsetTerm229=atomLsetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomLsetTerm229.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomLsetTerm_in_formula2175);
					atomLsetTerm230=atomLsetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomLsetTerm230.getTree());

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
					INTMSUBSET231=(CommonTree)match(input,INTMSUBSET,FOLLOW_INTMSUBSET_in_formula2185); 
					INTMSUBSET231_tree = (CommonTree)adaptor.dupNode(INTMSUBSET231);


					root_1 = (CommonTree)adaptor.becomeRoot(INTMSUBSET231_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomMsetTerm_in_formula2187);
					atomMsetTerm232=atomMsetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomMsetTerm232.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomMsetTerm_in_formula2189);
					atomMsetTerm233=atomMsetTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomMsetTerm233.getTree());

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


		CommonTree set234=null;

		CommonTree set234_tree=null;

		try {
			// ImpSyntHoleFinder.g:342:5: ( CONJ | DISJ | IMPLIES | EQUIV | SEPCONJ | SEPIMPL )
			// ImpSyntHoleFinder.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			set234=(CommonTree)input.LT(1);
			if ( input.LA(1)==CONJ||input.LA(1)==DISJ||input.LA(1)==EQUIV||input.LA(1)==IMPLIES||(input.LA(1) >= SEPCONJ && input.LA(1) <= SEPIMPL) ) {
				input.consume();
				set234_tree = (CommonTree)adaptor.dupNode(set234);


				adaptor.addChild(root_0, set234_tree);

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


		CommonTree ATOMBOOL235=null;
		CommonTree TRUE237=null;
		CommonTree EMP238=null;
		CommonTree RESULTFORM239=null;
		CommonTree OLD243=null;
		TreeRuleReturnScope formula236 =null;
		TreeRuleReturnScope bVar240 =null;
		TreeRuleReturnScope relRec241 =null;
		TreeRuleReturnScope rec242 =null;
		TreeRuleReturnScope formula244 =null;

		CommonTree ATOMBOOL235_tree=null;
		CommonTree TRUE237_tree=null;
		CommonTree EMP238_tree=null;
		CommonTree RESULTFORM239_tree=null;
		CommonTree OLD243_tree=null;

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
					ATOMBOOL235=(CommonTree)match(input,ATOMBOOL,FOLLOW_ATOMBOOL_in_atomForm2267); 
					ATOMBOOL235_tree = (CommonTree)adaptor.dupNode(ATOMBOOL235);


					root_1 = (CommonTree)adaptor.becomeRoot(ATOMBOOL235_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_formula_in_atomForm2269);
					formula236=formula();
					state._fsp--;

					adaptor.addChild(root_1, formula236.getTree());

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
					TRUE237=(CommonTree)match(input,TRUE,FOLLOW_TRUE_in_atomForm2278); 
					TRUE237_tree = (CommonTree)adaptor.dupNode(TRUE237);


					adaptor.addChild(root_0, TRUE237_tree);

					}
					break;
				case 3 :
					// ImpSyntHoleFinder.g:353:7: EMP
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					EMP238=(CommonTree)match(input,EMP,FOLLOW_EMP_in_atomForm2286); 
					EMP238_tree = (CommonTree)adaptor.dupNode(EMP238);


					adaptor.addChild(root_0, EMP238_tree);

					}
					break;
				case 4 :
					// ImpSyntHoleFinder.g:354:7: RESULTFORM
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					RESULTFORM239=(CommonTree)match(input,RESULTFORM,FOLLOW_RESULTFORM_in_atomForm2294); 
					RESULTFORM239_tree = (CommonTree)adaptor.dupNode(RESULTFORM239);


					adaptor.addChild(root_0, RESULTFORM239_tree);

					}
					break;
				case 5 :
					// ImpSyntHoleFinder.g:355:7: bVar
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_bVar_in_atomForm2302);
					bVar240=bVar();
					state._fsp--;

					adaptor.addChild(root_0, bVar240.getTree());

					}
					break;
				case 6 :
					// ImpSyntHoleFinder.g:356:7: relRec
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_relRec_in_atomForm2310);
					relRec241=relRec();
					state._fsp--;

					adaptor.addChild(root_0, relRec241.getTree());

					}
					break;
				case 7 :
					// ImpSyntHoleFinder.g:357:7: rec
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_rec_in_atomForm2318);
					rec242=rec();
					state._fsp--;

					adaptor.addChild(root_0, rec242.getTree());

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
					OLD243=(CommonTree)match(input,OLD,FOLLOW_OLD_in_atomForm2327); 
					OLD243_tree = (CommonTree)adaptor.dupNode(OLD243);


					root_1 = (CommonTree)adaptor.becomeRoot(OLD243_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_formula_in_atomForm2329);
					formula244=formula();
					state._fsp--;

					adaptor.addChild(root_1, formula244.getTree());

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


		CommonTree string_literal245=null;
		TreeRuleReturnScope locTerm246 =null;
		TreeRuleReturnScope fieldVal247 =null;

		CommonTree string_literal245_tree=null;

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
			string_literal245=(CommonTree)match(input,152,FOLLOW_152_in_pointsTo2348); 
			string_literal245_tree = (CommonTree)adaptor.dupNode(string_literal245);


			root_1 = (CommonTree)adaptor.becomeRoot(string_literal245_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_locTerm_in_pointsTo2350);
			locTerm246=locTerm();
			state._fsp--;

			adaptor.addChild(root_1, locTerm246.getTree());

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
					pushFollow(FOLLOW_fieldVal_in_pointsTo2352);
					fieldVal247=fieldVal();
					state._fsp--;

					adaptor.addChild(root_1, fieldVal247.getTree());

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


		CommonTree char_literal248=null;
		CommonTree ITYPE249=null;
		CommonTree char_literal252=null;
		CommonTree LTYPE253=null;
		CommonTree char_literal256=null;
		CommonTree SLTYPE257=null;
		CommonTree char_literal260=null;
		CommonTree ITYPE261=null;
		CommonTree string_literal263=null;
		CommonTree char_literal265=null;
		CommonTree LTYPE266=null;
		CommonTree string_literal268=null;
		TreeRuleReturnScope field250 =null;
		TreeRuleReturnScope iVar251 =null;
		TreeRuleReturnScope dir254 =null;
		TreeRuleReturnScope lVar255 =null;
		TreeRuleReturnScope dir258 =null;
		TreeRuleReturnScope lVar259 =null;
		TreeRuleReturnScope field262 =null;
		TreeRuleReturnScope iVar264 =null;
		TreeRuleReturnScope dir267 =null;
		TreeRuleReturnScope lVar269 =null;

		CommonTree char_literal248_tree=null;
		CommonTree ITYPE249_tree=null;
		CommonTree char_literal252_tree=null;
		CommonTree LTYPE253_tree=null;
		CommonTree char_literal256_tree=null;
		CommonTree SLTYPE257_tree=null;
		CommonTree char_literal260_tree=null;
		CommonTree ITYPE261_tree=null;
		CommonTree string_literal263_tree=null;
		CommonTree char_literal265_tree=null;
		CommonTree LTYPE266_tree=null;
		CommonTree string_literal268_tree=null;

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
					char_literal248=(CommonTree)match(input,89,FOLLOW_89_in_fieldVal2374); 
					char_literal248_tree = (CommonTree)adaptor.dupNode(char_literal248);


					root_1 = (CommonTree)adaptor.becomeRoot(char_literal248_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					ITYPE249=(CommonTree)match(input,ITYPE,FOLLOW_ITYPE_in_fieldVal2376); 
					ITYPE249_tree = (CommonTree)adaptor.dupNode(ITYPE249);


					adaptor.addChild(root_1, ITYPE249_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_field_in_fieldVal2378);
					field250=field();
					state._fsp--;

					adaptor.addChild(root_1, field250.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_iVar_in_fieldVal2380);
					iVar251=iVar();
					state._fsp--;

					adaptor.addChild(root_1, iVar251.getTree());

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
					char_literal252=(CommonTree)match(input,89,FOLLOW_89_in_fieldVal2391); 
					char_literal252_tree = (CommonTree)adaptor.dupNode(char_literal252);


					root_1 = (CommonTree)adaptor.becomeRoot(char_literal252_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					LTYPE253=(CommonTree)match(input,LTYPE,FOLLOW_LTYPE_in_fieldVal2393); 
					LTYPE253_tree = (CommonTree)adaptor.dupNode(LTYPE253);


					adaptor.addChild(root_1, LTYPE253_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_dir_in_fieldVal2395);
					dir254=dir();
					state._fsp--;

					adaptor.addChild(root_1, dir254.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lVar_in_fieldVal2397);
					lVar255=lVar();
					state._fsp--;

					adaptor.addChild(root_1, lVar255.getTree());

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
					char_literal256=(CommonTree)match(input,89,FOLLOW_89_in_fieldVal2408); 
					char_literal256_tree = (CommonTree)adaptor.dupNode(char_literal256);


					root_1 = (CommonTree)adaptor.becomeRoot(char_literal256_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					SLTYPE257=(CommonTree)match(input,SLTYPE,FOLLOW_SLTYPE_in_fieldVal2410); 
					SLTYPE257_tree = (CommonTree)adaptor.dupNode(SLTYPE257);


					adaptor.addChild(root_1, SLTYPE257_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_dir_in_fieldVal2412);
					dir258=dir();
					state._fsp--;

					adaptor.addChild(root_1, dir258.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lVar_in_fieldVal2414);
					lVar259=lVar();
					state._fsp--;

					adaptor.addChild(root_1, lVar259.getTree());

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
					char_literal260=(CommonTree)match(input,89,FOLLOW_89_in_fieldVal2425); 
					char_literal260_tree = (CommonTree)adaptor.dupNode(char_literal260);


					root_1 = (CommonTree)adaptor.becomeRoot(char_literal260_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					ITYPE261=(CommonTree)match(input,ITYPE,FOLLOW_ITYPE_in_fieldVal2427); 
					ITYPE261_tree = (CommonTree)adaptor.dupNode(ITYPE261);


					adaptor.addChild(root_1, ITYPE261_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_field_in_fieldVal2429);
					field262=field();
					state._fsp--;

					adaptor.addChild(root_1, field262.getTree());

					_last = (CommonTree)input.LT(1);
					string_literal263=(CommonTree)match(input,149,FOLLOW_149_in_fieldVal2431); 
					string_literal263_tree = (CommonTree)adaptor.dupNode(string_literal263);


					adaptor.addChild(root_1, string_literal263_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_iVar_in_fieldVal2433);
					iVar264=iVar();
					state._fsp--;

					adaptor.addChild(root_1, iVar264.getTree());

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
					char_literal265=(CommonTree)match(input,89,FOLLOW_89_in_fieldVal2444); 
					char_literal265_tree = (CommonTree)adaptor.dupNode(char_literal265);


					root_1 = (CommonTree)adaptor.becomeRoot(char_literal265_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					LTYPE266=(CommonTree)match(input,LTYPE,FOLLOW_LTYPE_in_fieldVal2446); 
					LTYPE266_tree = (CommonTree)adaptor.dupNode(LTYPE266);


					adaptor.addChild(root_1, LTYPE266_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_dir_in_fieldVal2448);
					dir267=dir();
					state._fsp--;

					adaptor.addChild(root_1, dir267.getTree());

					_last = (CommonTree)input.LT(1);
					string_literal268=(CommonTree)match(input,149,FOLLOW_149_in_fieldVal2450); 
					string_literal268_tree = (CommonTree)adaptor.dupNode(string_literal268);


					adaptor.addChild(root_1, string_literal268_tree);

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lVar_in_fieldVal2452);
					lVar269=lVar();
					state._fsp--;

					adaptor.addChild(root_1, lVar269.getTree());

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


		CommonTree NIL270=null;
		CommonTree RESULTLOC271=null;
		CommonTree OLD273=null;
		TreeRuleReturnScope n =null;
		TreeRuleReturnScope lVar272 =null;

		CommonTree NIL270_tree=null;
		CommonTree RESULTLOC271_tree=null;
		CommonTree OLD273_tree=null;

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
					NIL270=(CommonTree)match(input,NIL,FOLLOW_NIL_in_locTerm2475); 
					NIL270_tree = (CommonTree)adaptor.dupNode(NIL270);


					adaptor.addChild(root_0, NIL270_tree);

					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:375:7: RESULTLOC
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					RESULTLOC271=(CommonTree)match(input,RESULTLOC,FOLLOW_RESULTLOC_in_locTerm2484); 
					RESULTLOC271_tree = (CommonTree)adaptor.dupNode(RESULTLOC271);


					adaptor.addChild(root_0, RESULTLOC271_tree);

					}
					break;
				case 3 :
					// ImpSyntHoleFinder.g:376:7: lVar
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lVar_in_locTerm2493);
					lVar272=lVar();
					state._fsp--;

					adaptor.addChild(root_0, lVar272.getTree());

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
					OLD273=(CommonTree)match(input,OLD,FOLLOW_OLD_in_locTerm2502); 
					OLD273_tree = (CommonTree)adaptor.dupNode(OLD273);


					root_1 = (CommonTree)adaptor.becomeRoot(OLD273_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_locTerm_in_locTerm2506);
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


		CommonTree char_literal275=null;
		CommonTree char_literal278=null;
		CommonTree char_literal281=null;
		TreeRuleReturnScope atomIntTerm274 =null;
		TreeRuleReturnScope atomIntTerm276 =null;
		TreeRuleReturnScope atomIntTerm277 =null;
		TreeRuleReturnScope atomIntTerm279 =null;
		TreeRuleReturnScope atomIntTerm280 =null;
		TreeRuleReturnScope atomForm282 =null;
		TreeRuleReturnScope atomIntTerm283 =null;
		TreeRuleReturnScope atomIntTerm284 =null;

		CommonTree char_literal275_tree=null;
		CommonTree char_literal278_tree=null;
		CommonTree char_literal281_tree=null;

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
					pushFollow(FOLLOW_atomIntTerm_in_intTerm2526);
					atomIntTerm274=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_0, atomIntTerm274.getTree());

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
					char_literal275=(CommonTree)match(input,85,FOLLOW_85_in_intTerm2535); 
					char_literal275_tree = (CommonTree)adaptor.dupNode(char_literal275);


					root_1 = (CommonTree)adaptor.becomeRoot(char_literal275_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_intTerm2537);
					atomIntTerm276=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm276.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_intTerm2539);
					atomIntTerm277=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm277.getTree());

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
					char_literal278=(CommonTree)match(input,87,FOLLOW_87_in_intTerm2549); 
					char_literal278_tree = (CommonTree)adaptor.dupNode(char_literal278);


					root_1 = (CommonTree)adaptor.becomeRoot(char_literal278_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_intTerm2551);
					atomIntTerm279=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm279.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_intTerm2553);
					atomIntTerm280=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm280.getTree());

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
					char_literal281=(CommonTree)match(input,93,FOLLOW_93_in_intTerm2563); 
					char_literal281_tree = (CommonTree)adaptor.dupNode(char_literal281);


					root_1 = (CommonTree)adaptor.becomeRoot(char_literal281_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomForm_in_intTerm2565);
					atomForm282=atomForm();
					state._fsp--;

					adaptor.addChild(root_1, atomForm282.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_intTerm2567);
					atomIntTerm283=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm283.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntTerm_in_intTerm2569);
					atomIntTerm284=atomIntTerm();
					state._fsp--;

					adaptor.addChild(root_1, atomIntTerm284.getTree());

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


		CommonTree ATOMINT285=null;
		CommonTree INT287=null;
		CommonTree RESULTINT288=null;
		CommonTree BOT292=null;
		CommonTree TOP293=null;
		CommonTree OLD294=null;
		TreeRuleReturnScope intTerm286 =null;
		TreeRuleReturnScope iVar289 =null;
		TreeRuleReturnScope iRec290 =null;
		TreeRuleReturnScope biRec291 =null;
		TreeRuleReturnScope intTerm295 =null;

		CommonTree ATOMINT285_tree=null;
		CommonTree INT287_tree=null;
		CommonTree RESULTINT288_tree=null;
		CommonTree BOT292_tree=null;
		CommonTree TOP293_tree=null;
		CommonTree OLD294_tree=null;

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
					ATOMINT285=(CommonTree)match(input,ATOMINT,FOLLOW_ATOMINT_in_atomIntTerm2588); 
					ATOMINT285_tree = (CommonTree)adaptor.dupNode(ATOMINT285);


					root_1 = (CommonTree)adaptor.becomeRoot(ATOMINT285_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_intTerm_in_atomIntTerm2590);
					intTerm286=intTerm();
					state._fsp--;

					adaptor.addChild(root_1, intTerm286.getTree());

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
					INT287=(CommonTree)match(input,INT,FOLLOW_INT_in_atomIntTerm2599); 
					INT287_tree = (CommonTree)adaptor.dupNode(INT287);


					adaptor.addChild(root_0, INT287_tree);

					}
					break;
				case 3 :
					// ImpSyntHoleFinder.g:390:7: RESULTINT
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					RESULTINT288=(CommonTree)match(input,RESULTINT,FOLLOW_RESULTINT_in_atomIntTerm2607); 
					RESULTINT288_tree = (CommonTree)adaptor.dupNode(RESULTINT288);


					adaptor.addChild(root_0, RESULTINT288_tree);

					}
					break;
				case 4 :
					// ImpSyntHoleFinder.g:391:7: iVar
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_iVar_in_atomIntTerm2615);
					iVar289=iVar();
					state._fsp--;

					adaptor.addChild(root_0, iVar289.getTree());

					}
					break;
				case 5 :
					// ImpSyntHoleFinder.g:392:7: iRec
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_iRec_in_atomIntTerm2623);
					iRec290=iRec();
					state._fsp--;

					adaptor.addChild(root_0, iRec290.getTree());

					}
					break;
				case 6 :
					// ImpSyntHoleFinder.g:393:7: biRec
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_biRec_in_atomIntTerm2631);
					biRec291=biRec();
					state._fsp--;

					adaptor.addChild(root_0, biRec291.getTree());

					}
					break;
				case 7 :
					// ImpSyntHoleFinder.g:394:7: BOT
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					BOT292=(CommonTree)match(input,BOT,FOLLOW_BOT_in_atomIntTerm2639); 
					BOT292_tree = (CommonTree)adaptor.dupNode(BOT292);


					adaptor.addChild(root_0, BOT292_tree);

					}
					break;
				case 8 :
					// ImpSyntHoleFinder.g:395:7: TOP
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					TOP293=(CommonTree)match(input,TOP,FOLLOW_TOP_in_atomIntTerm2647); 
					TOP293_tree = (CommonTree)adaptor.dupNode(TOP293);


					adaptor.addChild(root_0, TOP293_tree);

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
					OLD294=(CommonTree)match(input,OLD,FOLLOW_OLD_in_atomIntTerm2656); 
					OLD294_tree = (CommonTree)adaptor.dupNode(OLD294);


					root_1 = (CommonTree)adaptor.becomeRoot(OLD294_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_intTerm_in_atomIntTerm2658);
					intTerm295=intTerm();
					state._fsp--;

					adaptor.addChild(root_1, intTerm295.getTree());

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


		CommonTree string_literal297=null;
		CommonTree string_literal299=null;
		CommonTree string_literal302=null;
		CommonTree string_literal305=null;
		CommonTree OLD308=null;
		TreeRuleReturnScope atomLsetTerm296 =null;
		TreeRuleReturnScope locTerm298 =null;
		TreeRuleReturnScope lsetTerm300 =null;
		TreeRuleReturnScope lsetTerm301 =null;
		TreeRuleReturnScope lsetTerm303 =null;
		TreeRuleReturnScope lsetTerm304 =null;
		TreeRuleReturnScope lsetTerm306 =null;
		TreeRuleReturnScope lsetTerm307 =null;
		TreeRuleReturnScope lsetTerm309 =null;

		CommonTree string_literal297_tree=null;
		CommonTree string_literal299_tree=null;
		CommonTree string_literal302_tree=null;
		CommonTree string_literal305_tree=null;
		CommonTree OLD308_tree=null;

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
					pushFollow(FOLLOW_atomLsetTerm_in_lsetTerm2678);
					atomLsetTerm296=atomLsetTerm();
					state._fsp--;

					adaptor.addChild(root_0, atomLsetTerm296.getTree());

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
					string_literal297=(CommonTree)match(input,125,FOLLOW_125_in_lsetTerm2687); 
					string_literal297_tree = (CommonTree)adaptor.dupNode(string_literal297);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal297_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_locTerm_in_lsetTerm2689);
					locTerm298=locTerm();
					state._fsp--;

					adaptor.addChild(root_1, locTerm298.getTree());

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
					string_literal299=(CommonTree)match(input,128,FOLLOW_128_in_lsetTerm2699); 
					string_literal299_tree = (CommonTree)adaptor.dupNode(string_literal299);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal299_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lsetTerm_in_lsetTerm2701);
					lsetTerm300=lsetTerm();
					state._fsp--;

					adaptor.addChild(root_1, lsetTerm300.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lsetTerm_in_lsetTerm2703);
					lsetTerm301=lsetTerm();
					state._fsp--;

					adaptor.addChild(root_1, lsetTerm301.getTree());

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
					string_literal302=(CommonTree)match(input,120,FOLLOW_120_in_lsetTerm2713); 
					string_literal302_tree = (CommonTree)adaptor.dupNode(string_literal302);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal302_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lsetTerm_in_lsetTerm2715);
					lsetTerm303=lsetTerm();
					state._fsp--;

					adaptor.addChild(root_1, lsetTerm303.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lsetTerm_in_lsetTerm2717);
					lsetTerm304=lsetTerm();
					state._fsp--;

					adaptor.addChild(root_1, lsetTerm304.getTree());

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
					string_literal305=(CommonTree)match(input,124,FOLLOW_124_in_lsetTerm2727); 
					string_literal305_tree = (CommonTree)adaptor.dupNode(string_literal305);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal305_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lsetTerm_in_lsetTerm2729);
					lsetTerm306=lsetTerm();
					state._fsp--;

					adaptor.addChild(root_1, lsetTerm306.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lsetTerm_in_lsetTerm2731);
					lsetTerm307=lsetTerm();
					state._fsp--;

					adaptor.addChild(root_1, lsetTerm307.getTree());

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
					OLD308=(CommonTree)match(input,OLD,FOLLOW_OLD_in_lsetTerm2741); 
					OLD308_tree = (CommonTree)adaptor.dupNode(OLD308);


					root_1 = (CommonTree)adaptor.becomeRoot(OLD308_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lsetTerm_in_lsetTerm2743);
					lsetTerm309=lsetTerm();
					state._fsp--;

					adaptor.addChild(root_1, lsetTerm309.getTree());

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


		CommonTree string_literal310=null;
		TreeRuleReturnScope lsVar311 =null;
		TreeRuleReturnScope rec312 =null;

		CommonTree string_literal310_tree=null;

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
					string_literal310=(CommonTree)match(input,103,FOLLOW_103_in_atomLsetTerm2761); 
					string_literal310_tree = (CommonTree)adaptor.dupNode(string_literal310);


					adaptor.addChild(root_0, string_literal310_tree);

					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:410:7: lsVar
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lsVar_in_atomLsetTerm2769);
					lsVar311=lsVar();
					state._fsp--;

					adaptor.addChild(root_0, lsVar311.getTree());

					}
					break;
				case 3 :
					// ImpSyntHoleFinder.g:411:7: rec
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_rec_in_atomLsetTerm2777);
					rec312=rec();
					state._fsp--;

					adaptor.addChild(root_0, rec312.getTree());

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


		CommonTree string_literal314=null;
		CommonTree string_literal316=null;
		CommonTree string_literal319=null;
		CommonTree string_literal322=null;
		CommonTree OLD325=null;
		TreeRuleReturnScope atomSetTerm313 =null;
		TreeRuleReturnScope intTerm315 =null;
		TreeRuleReturnScope setTerm317 =null;
		TreeRuleReturnScope setTerm318 =null;
		TreeRuleReturnScope setTerm320 =null;
		TreeRuleReturnScope setTerm321 =null;
		TreeRuleReturnScope setTerm323 =null;
		TreeRuleReturnScope setTerm324 =null;
		TreeRuleReturnScope setTerm326 =null;

		CommonTree string_literal314_tree=null;
		CommonTree string_literal316_tree=null;
		CommonTree string_literal319_tree=null;
		CommonTree string_literal322_tree=null;
		CommonTree OLD325_tree=null;

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
					pushFollow(FOLLOW_atomSetTerm_in_setTerm2796);
					atomSetTerm313=atomSetTerm();
					state._fsp--;

					adaptor.addChild(root_0, atomSetTerm313.getTree());

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
					string_literal314=(CommonTree)match(input,147,FOLLOW_147_in_setTerm2805); 
					string_literal314_tree = (CommonTree)adaptor.dupNode(string_literal314);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal314_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_intTerm_in_setTerm2807);
					intTerm315=intTerm();
					state._fsp--;

					adaptor.addChild(root_1, intTerm315.getTree());

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
					string_literal316=(CommonTree)match(input,148,FOLLOW_148_in_setTerm2817); 
					string_literal316_tree = (CommonTree)adaptor.dupNode(string_literal316);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal316_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_setTerm_in_setTerm2819);
					setTerm317=setTerm();
					state._fsp--;

					adaptor.addChild(root_1, setTerm317.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_setTerm_in_setTerm2821);
					setTerm318=setTerm();
					state._fsp--;

					adaptor.addChild(root_1, setTerm318.getTree());

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
					string_literal319=(CommonTree)match(input,113,FOLLOW_113_in_setTerm2831); 
					string_literal319_tree = (CommonTree)adaptor.dupNode(string_literal319);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal319_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_setTerm_in_setTerm2833);
					setTerm320=setTerm();
					state._fsp--;

					adaptor.addChild(root_1, setTerm320.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_setTerm_in_setTerm2835);
					setTerm321=setTerm();
					state._fsp--;

					adaptor.addChild(root_1, setTerm321.getTree());

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
					string_literal322=(CommonTree)match(input,145,FOLLOW_145_in_setTerm2845); 
					string_literal322_tree = (CommonTree)adaptor.dupNode(string_literal322);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal322_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_setTerm_in_setTerm2847);
					setTerm323=setTerm();
					state._fsp--;

					adaptor.addChild(root_1, setTerm323.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_setTerm_in_setTerm2849);
					setTerm324=setTerm();
					state._fsp--;

					adaptor.addChild(root_1, setTerm324.getTree());

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
					OLD325=(CommonTree)match(input,OLD,FOLLOW_OLD_in_setTerm2859); 
					OLD325_tree = (CommonTree)adaptor.dupNode(OLD325);


					root_1 = (CommonTree)adaptor.becomeRoot(OLD325_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_setTerm_in_setTerm2861);
					setTerm326=setTerm();
					state._fsp--;

					adaptor.addChild(root_1, setTerm326.getTree());

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


		CommonTree string_literal327=null;
		TreeRuleReturnScope sVar328 =null;
		TreeRuleReturnScope rec329 =null;

		CommonTree string_literal327_tree=null;

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
					string_literal327=(CommonTree)match(input,105,FOLLOW_105_in_atomSetTerm2879); 
					string_literal327_tree = (CommonTree)adaptor.dupNode(string_literal327);


					adaptor.addChild(root_0, string_literal327_tree);

					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:425:7: sVar
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_sVar_in_atomSetTerm2887);
					sVar328=sVar();
					state._fsp--;

					adaptor.addChild(root_0, sVar328.getTree());

					}
					break;
				case 3 :
					// ImpSyntHoleFinder.g:426:7: rec
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_rec_in_atomSetTerm2895);
					rec329=rec();
					state._fsp--;

					adaptor.addChild(root_0, rec329.getTree());

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


		CommonTree string_literal331=null;
		CommonTree string_literal333=null;
		CommonTree string_literal336=null;
		CommonTree string_literal339=null;
		CommonTree OLD342=null;
		TreeRuleReturnScope atomMsetTerm330 =null;
		TreeRuleReturnScope intTerm332 =null;
		TreeRuleReturnScope msetTerm334 =null;
		TreeRuleReturnScope msetTerm335 =null;
		TreeRuleReturnScope msetTerm337 =null;
		TreeRuleReturnScope msetTerm338 =null;
		TreeRuleReturnScope msetTerm340 =null;
		TreeRuleReturnScope msetTerm341 =null;
		TreeRuleReturnScope msetTerm343 =null;

		CommonTree string_literal331_tree=null;
		CommonTree string_literal333_tree=null;
		CommonTree string_literal336_tree=null;
		CommonTree string_literal339_tree=null;
		CommonTree OLD342_tree=null;

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
					pushFollow(FOLLOW_atomMsetTerm_in_msetTerm2914);
					atomMsetTerm330=atomMsetTerm();
					state._fsp--;

					adaptor.addChild(root_0, atomMsetTerm330.getTree());

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
					string_literal331=(CommonTree)match(input,135,FOLLOW_135_in_msetTerm2923); 
					string_literal331_tree = (CommonTree)adaptor.dupNode(string_literal331);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal331_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_intTerm_in_msetTerm2925);
					intTerm332=intTerm();
					state._fsp--;

					adaptor.addChild(root_1, intTerm332.getTree());

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
					string_literal333=(CommonTree)match(input,136,FOLLOW_136_in_msetTerm2935); 
					string_literal333_tree = (CommonTree)adaptor.dupNode(string_literal333);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal333_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_msetTerm_in_msetTerm2937);
					msetTerm334=msetTerm();
					state._fsp--;

					adaptor.addChild(root_1, msetTerm334.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_msetTerm_in_msetTerm2939);
					msetTerm335=msetTerm();
					state._fsp--;

					adaptor.addChild(root_1, msetTerm335.getTree());

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
					string_literal336=(CommonTree)match(input,131,FOLLOW_131_in_msetTerm2949); 
					string_literal336_tree = (CommonTree)adaptor.dupNode(string_literal336);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal336_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_msetTerm_in_msetTerm2951);
					msetTerm337=msetTerm();
					state._fsp--;

					adaptor.addChild(root_1, msetTerm337.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_msetTerm_in_msetTerm2953);
					msetTerm338=msetTerm();
					state._fsp--;

					adaptor.addChild(root_1, msetTerm338.getTree());

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
					string_literal339=(CommonTree)match(input,134,FOLLOW_134_in_msetTerm2963); 
					string_literal339_tree = (CommonTree)adaptor.dupNode(string_literal339);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal339_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_msetTerm_in_msetTerm2965);
					msetTerm340=msetTerm();
					state._fsp--;

					adaptor.addChild(root_1, msetTerm340.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_msetTerm_in_msetTerm2967);
					msetTerm341=msetTerm();
					state._fsp--;

					adaptor.addChild(root_1, msetTerm341.getTree());

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
					OLD342=(CommonTree)match(input,OLD,FOLLOW_OLD_in_msetTerm2977); 
					OLD342_tree = (CommonTree)adaptor.dupNode(OLD342);


					root_1 = (CommonTree)adaptor.becomeRoot(OLD342_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_msetTerm_in_msetTerm2979);
					msetTerm343=msetTerm();
					state._fsp--;

					adaptor.addChild(root_1, msetTerm343.getTree());

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


		CommonTree string_literal344=null;
		TreeRuleReturnScope msVar345 =null;
		TreeRuleReturnScope rec346 =null;

		CommonTree string_literal344_tree=null;

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
					string_literal344=(CommonTree)match(input,104,FOLLOW_104_in_atomMsetTerm2997); 
					string_literal344_tree = (CommonTree)adaptor.dupNode(string_literal344);


					adaptor.addChild(root_0, string_literal344_tree);

					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:440:7: msVar
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_msVar_in_atomMsetTerm3005);
					msVar345=msVar();
					state._fsp--;

					adaptor.addChild(root_0, msVar345.getTree());

					}
					break;
				case 3 :
					// ImpSyntHoleFinder.g:441:7: rec
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_rec_in_atomMsetTerm3013);
					rec346=rec();
					state._fsp--;

					adaptor.addChild(root_0, rec346.getTree());

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


		CommonTree RELREC347=null;
		CommonTree ID348=null;
		TreeRuleReturnScope p =null;
		TreeRuleReturnScope locTerm349 =null;

		CommonTree RELREC347_tree=null;
		CommonTree ID348_tree=null;

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
			RELREC347=(CommonTree)match(input,RELREC,FOLLOW_RELREC_in_relRec3033); 
			RELREC347_tree = (CommonTree)adaptor.dupNode(RELREC347);


			root_1 = (CommonTree)adaptor.becomeRoot(RELREC347_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID348=(CommonTree)match(input,ID,FOLLOW_ID_in_relRec3035); 
			ID348_tree = (CommonTree)adaptor.dupNode(ID348);


			adaptor.addChild(root_1, ID348_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_locTerm_in_relRec3037);
			locTerm349=locTerm();
			state._fsp--;

			adaptor.addChild(root_1, locTerm349.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_locTerm_in_relRec3041);
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


		CommonTree REC350=null;
		CommonTree ID351=null;
		TreeRuleReturnScope locTerm352 =null;

		CommonTree REC350_tree=null;
		CommonTree ID351_tree=null;

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
			REC350=(CommonTree)match(input,REC,FOLLOW_REC_in_rec3062); 
			REC350_tree = (CommonTree)adaptor.dupNode(REC350);


			root_1 = (CommonTree)adaptor.becomeRoot(REC350_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID351=(CommonTree)match(input,ID,FOLLOW_ID_in_rec3064); 
			ID351_tree = (CommonTree)adaptor.dupNode(ID351);


			adaptor.addChild(root_1, ID351_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_locTerm_in_rec3066);
			locTerm352=locTerm();
			state._fsp--;

			adaptor.addChild(root_1, locTerm352.getTree());

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


		CommonTree IREC353=null;
		CommonTree ID354=null;
		TreeRuleReturnScope locTerm355 =null;

		CommonTree IREC353_tree=null;
		CommonTree ID354_tree=null;

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
			IREC353=(CommonTree)match(input,IREC,FOLLOW_IREC_in_iRec3087); 
			IREC353_tree = (CommonTree)adaptor.dupNode(IREC353);


			root_1 = (CommonTree)adaptor.becomeRoot(IREC353_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID354=(CommonTree)match(input,ID,FOLLOW_ID_in_iRec3089); 
			ID354_tree = (CommonTree)adaptor.dupNode(ID354);


			adaptor.addChild(root_1, ID354_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_locTerm_in_iRec3091);
			locTerm355=locTerm();
			state._fsp--;

			adaptor.addChild(root_1, locTerm355.getTree());

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


		CommonTree BIREC356=null;
		CommonTree ID357=null;
		TreeRuleReturnScope p =null;
		TreeRuleReturnScope locTerm358 =null;

		CommonTree BIREC356_tree=null;
		CommonTree ID357_tree=null;

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
			BIREC356=(CommonTree)match(input,BIREC,FOLLOW_BIREC_in_biRec3110); 
			BIREC356_tree = (CommonTree)adaptor.dupNode(BIREC356);


			root_1 = (CommonTree)adaptor.becomeRoot(BIREC356_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID357=(CommonTree)match(input,ID,FOLLOW_ID_in_biRec3112); 
			ID357_tree = (CommonTree)adaptor.dupNode(ID357);


			adaptor.addChild(root_1, ID357_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_locTerm_in_biRec3114);
			locTerm358=locTerm();
			state._fsp--;

			adaptor.addChild(root_1, locTerm358.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_locTerm_in_biRec3118);
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


		CommonTree SREC359=null;
		CommonTree ID360=null;
		TreeRuleReturnScope locTerm361 =null;

		CommonTree SREC359_tree=null;
		CommonTree ID360_tree=null;

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
			SREC359=(CommonTree)match(input,SREC,FOLLOW_SREC_in_sRec3139); 
			SREC359_tree = (CommonTree)adaptor.dupNode(SREC359);


			root_1 = (CommonTree)adaptor.becomeRoot(SREC359_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID360=(CommonTree)match(input,ID,FOLLOW_ID_in_sRec3141); 
			ID360_tree = (CommonTree)adaptor.dupNode(ID360);


			adaptor.addChild(root_1, ID360_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_locTerm_in_sRec3143);
			locTerm361=locTerm();
			state._fsp--;

			adaptor.addChild(root_1, locTerm361.getTree());

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


		CommonTree BSREC362=null;
		CommonTree ID363=null;
		TreeRuleReturnScope p =null;
		TreeRuleReturnScope locTerm364 =null;

		CommonTree BSREC362_tree=null;
		CommonTree ID363_tree=null;

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
			BSREC362=(CommonTree)match(input,BSREC,FOLLOW_BSREC_in_bsRec3164); 
			BSREC362_tree = (CommonTree)adaptor.dupNode(BSREC362);


			root_1 = (CommonTree)adaptor.becomeRoot(BSREC362_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID363=(CommonTree)match(input,ID,FOLLOW_ID_in_bsRec3166); 
			ID363_tree = (CommonTree)adaptor.dupNode(ID363);


			adaptor.addChild(root_1, ID363_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_locTerm_in_bsRec3168);
			locTerm364=locTerm();
			state._fsp--;

			adaptor.addChild(root_1, locTerm364.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_locTerm_in_bsRec3172);
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


		CommonTree LSREC365=null;
		CommonTree ID366=null;
		TreeRuleReturnScope locTerm367 =null;

		CommonTree LSREC365_tree=null;
		CommonTree ID366_tree=null;

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
			LSREC365=(CommonTree)match(input,LSREC,FOLLOW_LSREC_in_lsRec3193); 
			LSREC365_tree = (CommonTree)adaptor.dupNode(LSREC365);


			root_1 = (CommonTree)adaptor.becomeRoot(LSREC365_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID366=(CommonTree)match(input,ID,FOLLOW_ID_in_lsRec3195); 
			ID366_tree = (CommonTree)adaptor.dupNode(ID366);


			adaptor.addChild(root_1, ID366_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_locTerm_in_lsRec3197);
			locTerm367=locTerm();
			state._fsp--;

			adaptor.addChild(root_1, locTerm367.getTree());

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


		CommonTree MSREC368=null;
		CommonTree ID369=null;
		TreeRuleReturnScope locTerm370 =null;

		CommonTree MSREC368_tree=null;
		CommonTree ID369_tree=null;

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
			MSREC368=(CommonTree)match(input,MSREC,FOLLOW_MSREC_in_msRec3216); 
			MSREC368_tree = (CommonTree)adaptor.dupNode(MSREC368);


			root_1 = (CommonTree)adaptor.becomeRoot(MSREC368_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID369=(CommonTree)match(input,ID,FOLLOW_ID_in_msRec3218); 
			ID369_tree = (CommonTree)adaptor.dupNode(ID369);


			adaptor.addChild(root_1, ID369_tree);

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_locTerm_in_msRec3220);
			locTerm370=locTerm();
			state._fsp--;

			adaptor.addChild(root_1, locTerm370.getTree());

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


		CommonTree set372=null;
		TreeRuleReturnScope atomIntExp371 =null;
		TreeRuleReturnScope intExp373 =null;
		TreeRuleReturnScope intExp374 =null;

		CommonTree set372_tree=null;

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
					pushFollow(FOLLOW_atomIntExp_in_intExp3238);
					atomIntExp371=atomIntExp();
					state._fsp--;

					adaptor.addChild(root_0, atomIntExp371.getTree());

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
					set372=(CommonTree)input.LT(1);
					if ( input.LA(1)==85||input.LA(1)==87 ) {
						input.consume();
						set372_tree = (CommonTree)adaptor.dupNode(set372);


						root_1 = (CommonTree)adaptor.becomeRoot(set372_tree, root_1);

						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_intExp_in_intExp3256);
					intExp373=intExp();
					state._fsp--;

					adaptor.addChild(root_1, intExp373.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_intExp_in_intExp3258);
					intExp374=intExp();
					state._fsp--;

					adaptor.addChild(root_1, intExp374.getTree());

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


		CommonTree CONS375=null;
		CommonTree INT376=null;
		TreeRuleReturnScope iVar377 =null;

		CommonTree CONS375_tree=null;
		CommonTree INT376_tree=null;

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
					CONS375=(CommonTree)match(input,CONS,FOLLOW_CONS_in_atomIntExp3283); 
					CONS375_tree = (CommonTree)adaptor.dupNode(CONS375);


					root_1 = (CommonTree)adaptor.becomeRoot(CONS375_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					INT376=(CommonTree)match(input,INT,FOLLOW_INT_in_atomIntExp3285); 
					INT376_tree = (CommonTree)adaptor.dupNode(INT376);


					adaptor.addChild(root_1, INT376_tree);

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
					pushFollow(FOLLOW_iVar_in_atomIntExp3294);
					iVar377=iVar();
					state._fsp--;

					adaptor.addChild(root_0, iVar377.getTree());

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


		CommonTree NIL378=null;
		CommonTree NEW379=null;
		TreeRuleReturnScope lVar380 =null;

		CommonTree NIL378_tree=null;
		CommonTree NEW379_tree=null;

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
					NIL378=(CommonTree)match(input,NIL,FOLLOW_NIL_in_locExp3311); 
					NIL378_tree = (CommonTree)adaptor.dupNode(NIL378);


					adaptor.addChild(root_0, NIL378_tree);

					}
					break;
				case 2 :
					// ImpSyntHoleFinder.g:488:7: NEW
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					NEW379=(CommonTree)match(input,NEW,FOLLOW_NEW_in_locExp3319); 
					NEW379_tree = (CommonTree)adaptor.dupNode(NEW379);


					adaptor.addChild(root_0, NEW379_tree);

					unknownNew.add(new Integer(1));
					}
					break;
				case 3 :
					// ImpSyntHoleFinder.g:489:7: lVar
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_lVar_in_locExp3329);
					lVar380=lVar();
					state._fsp--;

					adaptor.addChild(root_0, lVar380.getTree());

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


		CommonTree set382=null;
		CommonTree NOT385=null;
		TreeRuleReturnScope atomBoolExp381 =null;
		TreeRuleReturnScope atomBoolExp383 =null;
		TreeRuleReturnScope atomBoolExp384 =null;
		TreeRuleReturnScope atomBoolExp386 =null;

		CommonTree set382_tree=null;
		CommonTree NOT385_tree=null;

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
					pushFollow(FOLLOW_atomBoolExp_in_boolExp3346);
					atomBoolExp381=atomBoolExp();
					state._fsp--;

					adaptor.addChild(root_0, atomBoolExp381.getTree());

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
					set382=(CommonTree)input.LT(1);
					if ( input.LA(1)==AND||input.LA(1)==EQUALS||input.LA(1)==OR ) {
						input.consume();
						set382_tree = (CommonTree)adaptor.dupNode(set382);


						root_1 = (CommonTree)adaptor.becomeRoot(set382_tree, root_1);

						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomBoolExp_in_boolExp3368);
					atomBoolExp383=atomBoolExp();
					state._fsp--;

					adaptor.addChild(root_1, atomBoolExp383.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomBoolExp_in_boolExp3370);
					atomBoolExp384=atomBoolExp();
					state._fsp--;

					adaptor.addChild(root_1, atomBoolExp384.getTree());

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
					NOT385=(CommonTree)match(input,NOT,FOLLOW_NOT_in_boolExp3381); 
					NOT385_tree = (CommonTree)adaptor.dupNode(NOT385);


					root_1 = (CommonTree)adaptor.becomeRoot(NOT385_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomBoolExp_in_boolExp3383);
					atomBoolExp386=atomBoolExp();
					state._fsp--;

					adaptor.addChild(root_1, atomBoolExp386.getTree());

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


		CommonTree ATOMBOOL387=null;
		CommonTree LOCEQ389=null;
		CommonTree INTEQ392=null;
		CommonTree char_literal395=null;
		CommonTree string_literal398=null;
		CommonTree TRUE401=null;
		CommonTree string_literal403=null;
		TreeRuleReturnScope boolExp388 =null;
		TreeRuleReturnScope locExp390 =null;
		TreeRuleReturnScope locExp391 =null;
		TreeRuleReturnScope intExp393 =null;
		TreeRuleReturnScope intExp394 =null;
		TreeRuleReturnScope intExp396 =null;
		TreeRuleReturnScope intExp397 =null;
		TreeRuleReturnScope intExp399 =null;
		TreeRuleReturnScope intExp400 =null;
		TreeRuleReturnScope bVar402 =null;
		TreeRuleReturnScope atomIntExp404 =null;

		CommonTree ATOMBOOL387_tree=null;
		CommonTree LOCEQ389_tree=null;
		CommonTree INTEQ392_tree=null;
		CommonTree char_literal395_tree=null;
		CommonTree string_literal398_tree=null;
		CommonTree TRUE401_tree=null;
		CommonTree string_literal403_tree=null;

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
					ATOMBOOL387=(CommonTree)match(input,ATOMBOOL,FOLLOW_ATOMBOOL_in_atomBoolExp3406); 
					ATOMBOOL387_tree = (CommonTree)adaptor.dupNode(ATOMBOOL387);


					root_1 = (CommonTree)adaptor.becomeRoot(ATOMBOOL387_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_boolExp_in_atomBoolExp3408);
					boolExp388=boolExp();
					state._fsp--;

					adaptor.addChild(root_1, boolExp388.getTree());

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
					LOCEQ389=(CommonTree)match(input,LOCEQ,FOLLOW_LOCEQ_in_atomBoolExp3416); 
					LOCEQ389_tree = (CommonTree)adaptor.dupNode(LOCEQ389);


					root_1 = (CommonTree)adaptor.becomeRoot(LOCEQ389_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_locExp_in_atomBoolExp3418);
					locExp390=locExp();
					state._fsp--;

					adaptor.addChild(root_1, locExp390.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_locExp_in_atomBoolExp3420);
					locExp391=locExp();
					state._fsp--;

					adaptor.addChild(root_1, locExp391.getTree());

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
					INTEQ392=(CommonTree)match(input,INTEQ,FOLLOW_INTEQ_in_atomBoolExp3428); 
					INTEQ392_tree = (CommonTree)adaptor.dupNode(INTEQ392);


					root_1 = (CommonTree)adaptor.becomeRoot(INTEQ392_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_intExp_in_atomBoolExp3430);
					intExp393=intExp();
					state._fsp--;

					adaptor.addChild(root_1, intExp393.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_intExp_in_atomBoolExp3432);
					intExp394=intExp();
					state._fsp--;

					adaptor.addChild(root_1, intExp394.getTree());

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
					char_literal395=(CommonTree)match(input,91,FOLLOW_91_in_atomBoolExp3440); 
					char_literal395_tree = (CommonTree)adaptor.dupNode(char_literal395);


					root_1 = (CommonTree)adaptor.becomeRoot(char_literal395_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_intExp_in_atomBoolExp3442);
					intExp396=intExp();
					state._fsp--;

					adaptor.addChild(root_1, intExp396.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_intExp_in_atomBoolExp3444);
					intExp397=intExp();
					state._fsp--;

					adaptor.addChild(root_1, intExp397.getTree());

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
					string_literal398=(CommonTree)match(input,92,FOLLOW_92_in_atomBoolExp3452); 
					string_literal398_tree = (CommonTree)adaptor.dupNode(string_literal398);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal398_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_intExp_in_atomBoolExp3454);
					intExp399=intExp();
					state._fsp--;

					adaptor.addChild(root_1, intExp399.getTree());

					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_intExp_in_atomBoolExp3456);
					intExp400=intExp();
					state._fsp--;

					adaptor.addChild(root_1, intExp400.getTree());

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
					TRUE401=(CommonTree)match(input,TRUE,FOLLOW_TRUE_in_atomBoolExp3463); 
					TRUE401_tree = (CommonTree)adaptor.dupNode(TRUE401);


					adaptor.addChild(root_0, TRUE401_tree);

					}
					break;
				case 7 :
					// ImpSyntHoleFinder.g:505:5: bVar
					{
					root_0 = (CommonTree)adaptor.nil();


					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_bVar_in_atomBoolExp3469);
					bVar402=bVar();
					state._fsp--;

					adaptor.addChild(root_0, bVar402.getTree());

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
					string_literal403=(CommonTree)match(input,99,FOLLOW_99_in_atomBoolExp3476); 
					string_literal403_tree = (CommonTree)adaptor.dupNode(string_literal403);


					root_1 = (CommonTree)adaptor.becomeRoot(string_literal403_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					pushFollow(FOLLOW_atomIntExp_in_atomBoolExp3478);
					atomIntExp404=atomIntExp();
					state._fsp--;

					adaptor.addChild(root_1, atomIntExp404.getTree());

					match(input, Token.UP, null); 
					adaptor.addChild(root_0, root_1);
					_last = _save_last_1;
					}


					unknownConds.add((atomIntExp404!=null?((CommonTree)atomIntExp404.getTree()):null));
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


		CommonTree char_literal405=null;
		TreeRuleReturnScope lVar406 =null;
		TreeRuleReturnScope dir407 =null;

		CommonTree char_literal405_tree=null;

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
			char_literal405=(CommonTree)match(input,88,FOLLOW_88_in_dirDeref3505); 
			char_literal405_tree = (CommonTree)adaptor.dupNode(char_literal405);


			root_1 = (CommonTree)adaptor.becomeRoot(char_literal405_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_lVar_in_dirDeref3507);
			lVar406=lVar();
			state._fsp--;

			adaptor.addChild(root_1, lVar406.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_dir_in_dirDeref3509);
			dir407=dir();
			state._fsp--;

			adaptor.addChild(root_1, dir407.getTree());

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


		CommonTree char_literal408=null;
		TreeRuleReturnScope lVar409 =null;
		TreeRuleReturnScope field410 =null;

		CommonTree char_literal408_tree=null;

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
			char_literal408=(CommonTree)match(input,88,FOLLOW_88_in_dataDeref3532); 
			char_literal408_tree = (CommonTree)adaptor.dupNode(char_literal408);


			root_1 = (CommonTree)adaptor.becomeRoot(char_literal408_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_lVar_in_dataDeref3534);
			lVar409=lVar();
			state._fsp--;

			adaptor.addChild(root_1, lVar409.getTree());

			_last = (CommonTree)input.LT(1);
			pushFollow(FOLLOW_field_in_dataDeref3536);
			field410=field();
			state._fsp--;

			adaptor.addChild(root_1, field410.getTree());

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
		CommonTree IVAR411=null;
		CommonTree ID412=null;
		CommonTree IVAR413=null;

		CommonTree a_tree=null;
		CommonTree IVAR411_tree=null;
		CommonTree ID412_tree=null;
		CommonTree IVAR413_tree=null;

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
					IVAR411=(CommonTree)match(input,IVAR,FOLLOW_IVAR_in_iVar3561); 
					IVAR411_tree = (CommonTree)adaptor.dupNode(IVAR411);


					root_1 = (CommonTree)adaptor.becomeRoot(IVAR411_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					ID412=(CommonTree)match(input,ID,FOLLOW_ID_in_iVar3563); 
					ID412_tree = (CommonTree)adaptor.dupNode(ID412);


					adaptor.addChild(root_1, ID412_tree);

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
					IVAR413=(CommonTree)match(input,IVAR,FOLLOW_IVAR_in_iVar3574); 
					IVAR413_tree = (CommonTree)adaptor.dupNode(IVAR413);


					root_1 = (CommonTree)adaptor.becomeRoot(IVAR413_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					a=(CommonTree)match(input,QMARK,FOLLOW_QMARK_in_iVar3578); 
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
		CommonTree LVAR414=null;
		CommonTree ID415=null;
		CommonTree LVAR416=null;

		CommonTree a_tree=null;
		CommonTree LVAR414_tree=null;
		CommonTree ID415_tree=null;
		CommonTree LVAR416_tree=null;

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
					LVAR414=(CommonTree)match(input,LVAR,FOLLOW_LVAR_in_lVar3605); 
					LVAR414_tree = (CommonTree)adaptor.dupNode(LVAR414);


					root_1 = (CommonTree)adaptor.becomeRoot(LVAR414_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					ID415=(CommonTree)match(input,ID,FOLLOW_ID_in_lVar3607); 
					ID415_tree = (CommonTree)adaptor.dupNode(ID415);


					adaptor.addChild(root_1, ID415_tree);

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
					LVAR416=(CommonTree)match(input,LVAR,FOLLOW_LVAR_in_lVar3618); 
					LVAR416_tree = (CommonTree)adaptor.dupNode(LVAR416);


					root_1 = (CommonTree)adaptor.becomeRoot(LVAR416_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					a=(CommonTree)match(input,QQMARK,FOLLOW_QQMARK_in_lVar3622); 
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


		CommonTree BVAR417=null;
		CommonTree ID418=null;
		CommonTree BVAR419=null;
		CommonTree QMARK420=null;

		CommonTree BVAR417_tree=null;
		CommonTree ID418_tree=null;
		CommonTree BVAR419_tree=null;
		CommonTree QMARK420_tree=null;

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
					BVAR417=(CommonTree)match(input,BVAR,FOLLOW_BVAR_in_bVar3653); 
					BVAR417_tree = (CommonTree)adaptor.dupNode(BVAR417);


					root_1 = (CommonTree)adaptor.becomeRoot(BVAR417_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					ID418=(CommonTree)match(input,ID,FOLLOW_ID_in_bVar3655); 
					ID418_tree = (CommonTree)adaptor.dupNode(ID418);


					adaptor.addChild(root_1, ID418_tree);

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
					BVAR419=(CommonTree)match(input,BVAR,FOLLOW_BVAR_in_bVar3666); 
					BVAR419_tree = (CommonTree)adaptor.dupNode(BVAR419);


					root_1 = (CommonTree)adaptor.becomeRoot(BVAR419_tree, root_1);

					match(input, Token.DOWN, null); 
					_last = (CommonTree)input.LT(1);
					QMARK420=(CommonTree)match(input,QMARK,FOLLOW_QMARK_in_bVar3668); 
					QMARK420_tree = (CommonTree)adaptor.dupNode(QMARK420);


					adaptor.addChild(root_1, QMARK420_tree);

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


		CommonTree SVAR421=null;
		CommonTree ID422=null;

		CommonTree SVAR421_tree=null;
		CommonTree ID422_tree=null;

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
			SVAR421=(CommonTree)match(input,SVAR,FOLLOW_SVAR_in_sVar3693); 
			SVAR421_tree = (CommonTree)adaptor.dupNode(SVAR421);


			root_1 = (CommonTree)adaptor.becomeRoot(SVAR421_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID422=(CommonTree)match(input,ID,FOLLOW_ID_in_sVar3695); 
			ID422_tree = (CommonTree)adaptor.dupNode(ID422);


			adaptor.addChild(root_1, ID422_tree);

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


		CommonTree LSVAR423=null;
		CommonTree ID424=null;

		CommonTree LSVAR423_tree=null;
		CommonTree ID424_tree=null;

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
			LSVAR423=(CommonTree)match(input,LSVAR,FOLLOW_LSVAR_in_lsVar3724); 
			LSVAR423_tree = (CommonTree)adaptor.dupNode(LSVAR423);


			root_1 = (CommonTree)adaptor.becomeRoot(LSVAR423_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID424=(CommonTree)match(input,ID,FOLLOW_ID_in_lsVar3726); 
			ID424_tree = (CommonTree)adaptor.dupNode(ID424);


			adaptor.addChild(root_1, ID424_tree);

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


		CommonTree MSVAR425=null;
		CommonTree ID426=null;

		CommonTree MSVAR425_tree=null;
		CommonTree ID426_tree=null;

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
			MSVAR425=(CommonTree)match(input,MSVAR,FOLLOW_MSVAR_in_msVar3751); 
			MSVAR425_tree = (CommonTree)adaptor.dupNode(MSVAR425);


			root_1 = (CommonTree)adaptor.becomeRoot(MSVAR425_tree, root_1);

			match(input, Token.DOWN, null); 
			_last = (CommonTree)input.LT(1);
			ID426=(CommonTree)match(input,ID,FOLLOW_ID_in_msVar3753); 
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


		CommonTree set427=null;

		CommonTree set427_tree=null;

		try {
			// ImpSyntHoleFinder.g:545:5: ( ID | QMARK )
			// ImpSyntHoleFinder.g:
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			set427=(CommonTree)input.LT(1);
			if ( input.LA(1)==ID||input.LA(1)==QMARK ) {
				input.consume();
				set427_tree = (CommonTree)adaptor.dupNode(set427);


				adaptor.addChild(root_0, set427_tree);

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


		CommonTree ID428=null;

		CommonTree ID428_tree=null;

		try {
			// ImpSyntHoleFinder.g:550:5: ( ID )
			// ImpSyntHoleFinder.g:550:9: ID
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			ID428=(CommonTree)match(input,ID,FOLLOW_ID_in_field3810); 
			ID428_tree = (CommonTree)adaptor.dupNode(ID428);


			adaptor.addChild(root_0, ID428_tree);

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


		CommonTree ID429=null;

		CommonTree ID429_tree=null;

		try {
			// ImpSyntHoleFinder.g:554:5: ( ID )
			// ImpSyntHoleFinder.g:554:9: ID
			{
			root_0 = (CommonTree)adaptor.nil();


			_last = (CommonTree)input.LT(1);
			ID429=(CommonTree)match(input,ID,FOLLOW_ID_in_func3831); 
			ID429_tree = (CommonTree)adaptor.dupNode(ID429);


			adaptor.addChild(root_0, ID429_tree);

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
	public static final BitSet FOLLOW_INT_in_whileLoop1238 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_146_in_whileLoop1252 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_whileLoop1254 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_111_in_conditional1283 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_boolExp_in_conditional1286 = new BitSet(new long[]{0x00440000304004C0L,0x0200800000004040L,0x0000000000440000L});
	public static final BitSet FOLLOW_statement_in_conditional1288 = new BitSet(new long[]{0x0000000000000008L,0x0000004000000000L});
	public static final BitSet FOLLOW_el_in_conditional1290 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_102_in_el1318 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_el1320 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_in_command1339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mutation_in_command1347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_malloc_in_command1355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_free_in_command1363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assume_in_command1371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_command1379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ret_in_command1387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unknownStmt_in_command1395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STMT_in_unknownStmt1415 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomIntExp_in_unknownStmt1417 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSGN_in_assignment1438 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ITYPE_in_assignment1440 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_iVar_in_assignment1442 = new BitSet(new long[]{0x0000008000200000L,0x0000000000A00000L});
	public static final BitSet FOLLOW_intExp_in_assignment1444 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSGN_in_assignment1456 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LTYPE_in_assignment1458 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_assignment1460 = new BitSet(new long[]{0x0301000000000000L});
	public static final BitSet FOLLOW_locExp_in_assignment1462 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSGN_in_assignment1474 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_BTYPE_in_assignment1476 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_bVar_in_assignment1478 = new BitSet(new long[]{0x1400020102010110L,0x0000000818020000L});
	public static final BitSet FOLLOW_boolExp_in_assignment1480 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DEREFASSGN_in_assignment1492 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ITYPE_in_assignment1494 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_iVar_in_assignment1496 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_dataDeref_in_assignment1498 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DEREFASSGN_in_assignment1510 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LTYPE_in_assignment1512 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_assignment1514 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_dirDeref_in_assignment1516 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MUTATE_in_mutation1538 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LTYPE_in_mutation1540 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_dirDeref_in_mutation1542 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_mutation1544 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MUTATE_in_mutation1554 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ITYPE_in_mutation1556 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_dataDeref_in_mutation1558 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_iVar_in_mutation1560 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RET_in_ret1583 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LTYPE_in_ret1585 = new BitSet(new long[]{0x0301000000000000L});
	public static final BitSet FOLLOW_locExp_in_ret1587 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RET_in_ret1597 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ITYPE_in_ret1599 = new BitSet(new long[]{0x0000008000200000L});
	public static final BitSet FOLLOW_atomIntExp_in_ret1601 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RET_in_ret1611 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_BTYPE_in_ret1613 = new BitSet(new long[]{0x0000020100010100L,0x0000000818020000L});
	public static final BitSet FOLLOW_atomBoolExp_in_ret1615 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MALLOC_in_malloc1636 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lVar_in_malloc1638 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FREE_in_free1659 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lVar_in_free1661 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSUME_in_assume1680 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_boolExp_in_assume1682 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_func_in_functionCall1703 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LTYPE_in_functionCall1705 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_functionCall1719 = new BitSet(new long[]{0x0001008000000000L});
	public static final BitSet FOLLOW_vars_in_functionCall1721 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_func_in_functionCall1738 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ITYPE_in_functionCall1740 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_iVar_in_functionCall1750 = new BitSet(new long[]{0x0001008000000000L});
	public static final BitSet FOLLOW_vars_in_functionCall1752 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_func_in_functionCall1766 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_BTYPE_in_functionCall1768 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_bVar_in_functionCall1770 = new BitSet(new long[]{0x0001008000000000L});
	public static final BitSet FOLLOW_vars_in_functionCall1772 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_lVar_in_vars1794 = new BitSet(new long[]{0x0001008000000002L});
	public static final BitSet FOLLOW_iVar_in_vars1798 = new BitSet(new long[]{0x0001008000000002L});
	public static final BitSet FOLLOW_LVARS_in_lVars1819 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lVar_in_lVars1822 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_IVARS_in_iVars1843 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_iVar_in_iVars1845 = new BitSet(new long[]{0x0000008000000008L});
	public static final BitSet FOLLOW_BVARS_in_bVars1867 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_bVar_in_bVars1869 = new BitSet(new long[]{0x0000000000010008L});
	public static final BitSet FOLLOW_atomForm_in_formula1890 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binaryConnector_in_formula1899 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomForm_in_formula1901 = new BitSet(new long[]{0x0800000001010100L,0x0000000000020007L});
	public static final BitSet FOLLOW_atomForm_in_formula1903 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEG_in_formula1913 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomForm_in_formula1915 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_pointsTo_in_formula1924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOCEQ_in_formula1933 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_locTerm_in_formula1935 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_formula1937 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTEQ_in_formula1947 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula1949 = new BitSet(new long[]{0x080000A080003200L,0x0000000000010008L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula1951 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_91_in_formula1961 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula1963 = new BitSet(new long[]{0x080000A080003200L,0x0000000000010008L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula1965 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_92_in_formula1975 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula1977 = new BitSet(new long[]{0x080000A080003200L,0x0000000000010008L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula1979 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SETEQ_in_formula1989 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula1991 = new BitSet(new long[]{0x0000000000000000L,0x0000020000008001L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula1993 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LSETEQ_in_formula2003 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomLsetTerm_in_formula2005 = new BitSet(new long[]{0x0000400000000000L,0x0000008000000001L});
	public static final BitSet FOLLOW_atomLsetTerm_in_formula2007 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MSETEQ_in_formula2017 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomMsetTerm_in_formula2019 = new BitSet(new long[]{0x0020000000000000L,0x0000010000000001L});
	public static final BitSet FOLLOW_atomMsetTerm_in_formula2021 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTMEM_in_formula2031 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula2033 = new BitSet(new long[]{0x0000000000000000L,0x0000020000008001L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula2035 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOCMEM_in_formula2045 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_locTerm_in_formula2047 = new BitSet(new long[]{0x0000400000000000L,0x0000008000000001L});
	public static final BitSet FOLLOW_atomLsetTerm_in_formula2049 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTMMEM_in_formula2059 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula2061 = new BitSet(new long[]{0x0020000000000000L,0x0000010000000001L});
	public static final BitSet FOLLOW_atomMsetTerm_in_formula2063 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTSUBSET_in_formula2073 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula2075 = new BitSet(new long[]{0x0000000000000000L,0x0000020000008001L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula2077 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_126_in_formula2087 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula2089 = new BitSet(new long[]{0x0000000000000000L,0x0000020000008001L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula2091 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_118_in_formula2101 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula2103 = new BitSet(new long[]{0x0000000000000000L,0x0000020000008001L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula2105 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_127_in_formula2115 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula2117 = new BitSet(new long[]{0x0000000000000000L,0x0000020000008001L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula2119 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_144_in_formula2129 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula2131 = new BitSet(new long[]{0x080000A080003200L,0x0000000000010008L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula2133 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_119_in_formula2143 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula2145 = new BitSet(new long[]{0x0000000000000000L,0x0000020000008001L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula2147 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_143_in_formula2157 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula2159 = new BitSet(new long[]{0x080000A080003200L,0x0000000000010008L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula2161 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOCSUBSET_in_formula2171 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomLsetTerm_in_formula2173 = new BitSet(new long[]{0x0000400000000000L,0x0000008000000001L});
	public static final BitSet FOLLOW_atomLsetTerm_in_formula2175 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTMSUBSET_in_formula2185 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomMsetTerm_in_formula2187 = new BitSet(new long[]{0x0020000000000000L,0x0000010000000001L});
	public static final BitSet FOLLOW_atomMsetTerm_in_formula2189 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ATOMBOOL_in_atomForm2267 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_formula_in_atomForm2269 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TRUE_in_atomForm2278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EMP_in_atomForm2286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RESULTFORM_in_atomForm2294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bVar_in_atomForm2302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relRec_in_atomForm2310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rec_in_atomForm2318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLD_in_atomForm2327 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_formula_in_atomForm2329 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_152_in_pointsTo2348 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_locTerm_in_pointsTo2350 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_fieldVal_in_pointsTo2352 = new BitSet(new long[]{0x0000000000000008L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_fieldVal2374 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ITYPE_in_fieldVal2376 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_field_in_fieldVal2378 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_iVar_in_fieldVal2380 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_89_in_fieldVal2391 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LTYPE_in_fieldVal2393 = new BitSet(new long[]{0x4000000020000000L});
	public static final BitSet FOLLOW_dir_in_fieldVal2395 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_fieldVal2397 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_89_in_fieldVal2408 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SLTYPE_in_fieldVal2410 = new BitSet(new long[]{0x4000000020000000L});
	public static final BitSet FOLLOW_dir_in_fieldVal2412 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_fieldVal2414 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_89_in_fieldVal2425 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ITYPE_in_fieldVal2427 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_field_in_fieldVal2429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_149_in_fieldVal2431 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_iVar_in_fieldVal2433 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_89_in_fieldVal2444 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LTYPE_in_fieldVal2446 = new BitSet(new long[]{0x4000000020000000L});
	public static final BitSet FOLLOW_dir_in_fieldVal2448 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_149_in_fieldVal2450 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_fieldVal2452 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NIL_in_locTerm2475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RESULTLOC_in_locTerm2484 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lVar_in_locTerm2493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLD_in_locTerm2502 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_locTerm_in_locTerm2506 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_atomIntTerm_in_intTerm2526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_intTerm2535 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomIntTerm_in_intTerm2537 = new BitSet(new long[]{0x080000A080003200L,0x0000000000010008L});
	public static final BitSet FOLLOW_atomIntTerm_in_intTerm2539 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_87_in_intTerm2549 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomIntTerm_in_intTerm2551 = new BitSet(new long[]{0x080000A080003200L,0x0000000000010008L});
	public static final BitSet FOLLOW_atomIntTerm_in_intTerm2553 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_93_in_intTerm2563 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomForm_in_intTerm2565 = new BitSet(new long[]{0x080000A080003200L,0x0000000000010008L});
	public static final BitSet FOLLOW_atomIntTerm_in_intTerm2567 = new BitSet(new long[]{0x080000A080003200L,0x0000000000010008L});
	public static final BitSet FOLLOW_atomIntTerm_in_intTerm2569 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ATOMINT_in_atomIntTerm2588 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_intTerm_in_atomIntTerm2590 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INT_in_atomIntTerm2599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RESULTINT_in_atomIntTerm2607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iVar_in_atomIntTerm2615 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iRec_in_atomIntTerm2623 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_biRec_in_atomIntTerm2631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOT_in_atomIntTerm2639 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOP_in_atomIntTerm2647 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLD_in_atomIntTerm2656 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_intTerm_in_atomIntTerm2658 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_atomLsetTerm_in_lsetTerm2678 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_125_in_lsetTerm2687 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_locTerm_in_lsetTerm2689 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_128_in_lsetTerm2699 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lsetTerm_in_lsetTerm2701 = new BitSet(new long[]{0x0800400000000000L,0x3100008000000001L,0x0000000000000001L});
	public static final BitSet FOLLOW_lsetTerm_in_lsetTerm2703 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_120_in_lsetTerm2713 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lsetTerm_in_lsetTerm2715 = new BitSet(new long[]{0x0800400000000000L,0x3100008000000001L,0x0000000000000001L});
	public static final BitSet FOLLOW_lsetTerm_in_lsetTerm2717 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_124_in_lsetTerm2727 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lsetTerm_in_lsetTerm2729 = new BitSet(new long[]{0x0800400000000000L,0x3100008000000001L,0x0000000000000001L});
	public static final BitSet FOLLOW_lsetTerm_in_lsetTerm2731 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OLD_in_lsetTerm2741 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lsetTerm_in_lsetTerm2743 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_103_in_atomLsetTerm2761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lsVar_in_atomLsetTerm2769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rec_in_atomLsetTerm2777 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomSetTerm_in_setTerm2796 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_147_in_setTerm2805 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_intTerm_in_setTerm2807 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_148_in_setTerm2817 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_setTerm_in_setTerm2819 = new BitSet(new long[]{0x0800000000000000L,0x0002020000008001L,0x00000000001A0000L});
	public static final BitSet FOLLOW_setTerm_in_setTerm2821 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_113_in_setTerm2831 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_setTerm_in_setTerm2833 = new BitSet(new long[]{0x0800000000000000L,0x0002020000008001L,0x00000000001A0000L});
	public static final BitSet FOLLOW_setTerm_in_setTerm2835 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_145_in_setTerm2845 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_setTerm_in_setTerm2847 = new BitSet(new long[]{0x0800000000000000L,0x0002020000008001L,0x00000000001A0000L});
	public static final BitSet FOLLOW_setTerm_in_setTerm2849 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OLD_in_setTerm2859 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_setTerm_in_setTerm2861 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_105_in_atomSetTerm2879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sVar_in_atomSetTerm2887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rec_in_atomSetTerm2895 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomMsetTerm_in_msetTerm2914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_135_in_msetTerm2923 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_intTerm_in_msetTerm2925 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_136_in_msetTerm2935 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_msetTerm_in_msetTerm2937 = new BitSet(new long[]{0x0820000000000000L,0x0000010000000001L,0x00000000000001C8L});
	public static final BitSet FOLLOW_msetTerm_in_msetTerm2939 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_131_in_msetTerm2949 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_msetTerm_in_msetTerm2951 = new BitSet(new long[]{0x0820000000000000L,0x0000010000000001L,0x00000000000001C8L});
	public static final BitSet FOLLOW_msetTerm_in_msetTerm2953 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_134_in_msetTerm2963 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_msetTerm_in_msetTerm2965 = new BitSet(new long[]{0x0820000000000000L,0x0000010000000001L,0x00000000000001C8L});
	public static final BitSet FOLLOW_msetTerm_in_msetTerm2967 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OLD_in_msetTerm2977 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_msetTerm_in_msetTerm2979 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_104_in_atomMsetTerm2997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_msVar_in_atomMsetTerm3005 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rec_in_atomMsetTerm3013 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RELREC_in_relRec3033 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_relRec3035 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_relRec3037 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_relRec3041 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_REC_in_rec3062 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_rec3064 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_rec3066 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IREC_in_iRec3087 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_iRec3089 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_iRec3091 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BIREC_in_biRec3110 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_biRec3112 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_biRec3114 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_biRec3118 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SREC_in_sRec3139 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_sRec3141 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_sRec3143 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BSREC_in_bsRec3164 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_bsRec3166 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_bsRec3168 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_bsRec3172 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LSREC_in_lsRec3193 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_lsRec3195 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_lsRec3197 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MSREC_in_msRec3216 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_msRec3218 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_msRec3220 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_atomIntExp_in_intExp3238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_intExp3248 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_intExp_in_intExp3256 = new BitSet(new long[]{0x0000008000200000L,0x0000000000A00000L});
	public static final BitSet FOLLOW_intExp_in_intExp3258 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CONS_in_atomIntExp3283 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_atomIntExp3285 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_iVar_in_atomIntExp3294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NIL_in_locExp3311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEW_in_locExp3319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lVar_in_locExp3329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomBoolExp_in_boolExp3346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_boolExp3356 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomBoolExp_in_boolExp3368 = new BitSet(new long[]{0x0000020100010100L,0x0000000818020000L});
	public static final BitSet FOLLOW_atomBoolExp_in_boolExp3370 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOT_in_boolExp3381 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomBoolExp_in_boolExp3383 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ATOMBOOL_in_atomBoolExp3406 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_boolExp_in_atomBoolExp3408 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOCEQ_in_atomBoolExp3416 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_locExp_in_atomBoolExp3418 = new BitSet(new long[]{0x0301000000000000L});
	public static final BitSet FOLLOW_locExp_in_atomBoolExp3420 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTEQ_in_atomBoolExp3428 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_intExp_in_atomBoolExp3430 = new BitSet(new long[]{0x0000008000200000L,0x0000000000A00000L});
	public static final BitSet FOLLOW_intExp_in_atomBoolExp3432 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_91_in_atomBoolExp3440 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_intExp_in_atomBoolExp3442 = new BitSet(new long[]{0x0000008000200000L,0x0000000000A00000L});
	public static final BitSet FOLLOW_intExp_in_atomBoolExp3444 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_92_in_atomBoolExp3452 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_intExp_in_atomBoolExp3454 = new BitSet(new long[]{0x0000008000200000L,0x0000000000A00000L});
	public static final BitSet FOLLOW_intExp_in_atomBoolExp3456 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TRUE_in_atomBoolExp3463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bVar_in_atomBoolExp3469 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_99_in_atomBoolExp3476 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomIntExp_in_atomBoolExp3478 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_88_in_dirDeref3505 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lVar_in_dirDeref3507 = new BitSet(new long[]{0x4000000020000000L});
	public static final BitSet FOLLOW_dir_in_dirDeref3509 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_88_in_dataDeref3532 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lVar_in_dataDeref3534 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_field_in_dataDeref3536 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IVAR_in_iVar3561 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_iVar3563 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IVAR_in_iVar3574 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QMARK_in_iVar3578 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LVAR_in_lVar3605 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_lVar3607 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LVAR_in_lVar3618 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QQMARK_in_lVar3622 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BVAR_in_bVar3653 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_bVar3655 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BVAR_in_bVar3666 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QMARK_in_bVar3668 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SVAR_in_sVar3693 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_sVar3695 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LSVAR_in_lsVar3724 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_lsVar3726 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MSVAR_in_msVar3751 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_msVar3753 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_field3810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_func3831 = new BitSet(new long[]{0x0000000000000002L});
}
