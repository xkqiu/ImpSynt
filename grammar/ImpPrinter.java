// $ANTLR 3.5.2 ImpPrinter.g 2017-04-11 00:07:34

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings("all")
public class ImpPrinter extends TreeParser {
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


	public ImpPrinter(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public ImpPrinter(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected StringTemplateGroup templateLib =
	  new StringTemplateGroup("ImpPrinterTemplates", AngleBracketTemplateLexer.class);

	public void setTemplateLib(StringTemplateGroup templateLib) {
	  this.templateLib = templateLib;
	}
	public StringTemplateGroup getTemplateLib() {
	  return templateLib;
	}
	/** allows convenient multi-value initialization:
	 *  "new STAttrMap().put(...).put(...)"
	 */
	@SuppressWarnings("serial")
	public static class STAttrMap extends HashMap<String, Object> {
		public STAttrMap put(String attrName, Object value) {
			super.put(attrName, value);
			return this;
		}
	}
	@Override public String[] getTokenNames() { return ImpPrinter.tokenNames; }
	@Override public String getGrammarFileName() { return "ImpPrinter.g"; }


	public static class program_return extends TreeRuleReturnScope {
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "program"
	// ImpPrinter.g:10:1: program : ^( PROG ( recDecl )* ( formDecl )* (a= methodDef )* ) -> template(a=$a.text) \"<a>\";
	public final ImpPrinter.program_return program() throws RecognitionException {
		ImpPrinter.program_return retval = new ImpPrinter.program_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope a =null;

		try {
			// ImpPrinter.g:11:5: ( ^( PROG ( recDecl )* ( formDecl )* (a= methodDef )* ) -> template(a=$a.text) \"<a>\")
			// ImpPrinter.g:11:9: ^( PROG ( recDecl )* ( formDecl )* (a= methodDef )* )
			{
			match(input,PROG,FOLLOW_PROG_in_program60); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// ImpPrinter.g:11:16: ( recDecl )*
				loop1:
				while (true) {
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( ((LA1_0 >= 96 && LA1_0 <= 97)||LA1_0==112||LA1_0==123||LA1_0==133||(LA1_0 >= 137 && LA1_0 <= 138)||LA1_0==142) ) {
						alt1=1;
					}

					switch (alt1) {
					case 1 :
						// ImpPrinter.g:11:16: recDecl
						{
						pushFollow(FOLLOW_recDecl_in_program62);
						recDecl();
						state._fsp--;

						}
						break;

					default :
						break loop1;
					}
				}

				// ImpPrinter.g:11:25: ( formDecl )*
				loop2:
				while (true) {
					int alt2=2;
					int LA2_0 = input.LA(1);
					if ( (LA2_0==107) ) {
						alt2=1;
					}

					switch (alt2) {
					case 1 :
						// ImpPrinter.g:11:25: formDecl
						{
						pushFollow(FOLLOW_formDecl_in_program65);
						formDecl();
						state._fsp--;

						}
						break;

					default :
						break loop2;
					}
				}

				// ImpPrinter.g:11:36: (a= methodDef )*
				loop3:
				while (true) {
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==BTYPE||LA3_0==ITYPE||LA3_0==LTYPE) ) {
						alt3=1;
					}

					switch (alt3) {
					case 1 :
						// ImpPrinter.g:11:36: a= methodDef
						{
						pushFollow(FOLLOW_methodDef_in_program70);
						a=methodDef();
						state._fsp--;

						}
						break;

					default :
						break loop3;
					}
				}

				match(input, Token.UP, null); 
			}

			// TEMPLATE REWRITE
			// 12:5: -> template(a=$a.text) \"<a>\"
			{
				retval.st = new StringTemplate(templateLib, "<a>",new STAttrMap().put("a", (a!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(a.start),input.getTreeAdaptor().getTokenStopIndex(a.start))):null)));
			}



			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "recDecl"
	// ImpPrinter.g:15:1: recDecl : ( predDecl | intFuncDecl | binIntFuncDecl | lsetFuncDecl | setFuncDecl | msetFuncDecl | relDecl | binSetFuncDecl ) ;
	public final ImpPrinter.recDecl_return recDecl() throws RecognitionException {
		ImpPrinter.recDecl_return retval = new ImpPrinter.recDecl_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:16:5: ( ( predDecl | intFuncDecl | binIntFuncDecl | lsetFuncDecl | setFuncDecl | msetFuncDecl | relDecl | binSetFuncDecl ) )
			// ImpPrinter.g:17:3: ( predDecl | intFuncDecl | binIntFuncDecl | lsetFuncDecl | setFuncDecl | msetFuncDecl | relDecl | binSetFuncDecl )
			{
			// ImpPrinter.g:17:3: ( predDecl | intFuncDecl | binIntFuncDecl | lsetFuncDecl | setFuncDecl | msetFuncDecl | relDecl | binSetFuncDecl )
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
					// ImpPrinter.g:17:7: predDecl
					{
					pushFollow(FOLLOW_predDecl_in_recDecl117);
					predDecl();
					state._fsp--;

					}
					break;
				case 2 :
					// ImpPrinter.g:18:11: intFuncDecl
					{
					pushFollow(FOLLOW_intFuncDecl_in_recDecl129);
					intFuncDecl();
					state._fsp--;

					}
					break;
				case 3 :
					// ImpPrinter.g:19:7: binIntFuncDecl
					{
					pushFollow(FOLLOW_binIntFuncDecl_in_recDecl137);
					binIntFuncDecl();
					state._fsp--;

					}
					break;
				case 4 :
					// ImpPrinter.g:20:11: lsetFuncDecl
					{
					pushFollow(FOLLOW_lsetFuncDecl_in_recDecl149);
					lsetFuncDecl();
					state._fsp--;

					}
					break;
				case 5 :
					// ImpPrinter.g:21:11: setFuncDecl
					{
					pushFollow(FOLLOW_setFuncDecl_in_recDecl161);
					setFuncDecl();
					state._fsp--;

					}
					break;
				case 6 :
					// ImpPrinter.g:22:11: msetFuncDecl
					{
					pushFollow(FOLLOW_msetFuncDecl_in_recDecl173);
					msetFuncDecl();
					state._fsp--;

					}
					break;
				case 7 :
					// ImpPrinter.g:23:9: relDecl
					{
					pushFollow(FOLLOW_relDecl_in_recDecl183);
					relDecl();
					state._fsp--;

					}
					break;
				case 8 :
					// ImpPrinter.g:24:7: binSetFuncDecl
					{
					pushFollow(FOLLOW_binSetFuncDecl_in_recDecl191);
					binSetFuncDecl();
					state._fsp--;

					}
					break;

			}

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "relDecl"
	// ImpPrinter.g:28:1: relDecl : ^( 'relation' ID fst= lVar snd= lVar p= formula (axm= formula )? ) ;
	public final ImpPrinter.relDecl_return relDecl() throws RecognitionException {
		ImpPrinter.relDecl_return retval = new ImpPrinter.relDecl_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope fst =null;
		TreeRuleReturnScope snd =null;
		TreeRuleReturnScope p =null;
		TreeRuleReturnScope axm =null;

		try {
			// ImpPrinter.g:29:5: ( ^( 'relation' ID fst= lVar snd= lVar p= formula (axm= formula )? ) )
			// ImpPrinter.g:30:3: ^( 'relation' ID fst= lVar snd= lVar p= formula (axm= formula )? )
			{
			match(input,138,FOLLOW_138_in_relDecl217); 
			match(input, Token.DOWN, null); 
			match(input,ID,FOLLOW_ID_in_relDecl223); 
			pushFollow(FOLLOW_lVar_in_relDecl231);
			fst=lVar();
			state._fsp--;

			pushFollow(FOLLOW_lVar_in_relDecl239);
			snd=lVar();
			state._fsp--;

			pushFollow(FOLLOW_formula_in_relDecl247);
			p=formula();
			state._fsp--;

			// ImpPrinter.g:35:5: (axm= formula )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ATOMBOOL||LA5_0==BVAR||LA5_0==CONJ||(LA5_0 >= DISJ && LA5_0 <= EMP)||LA5_0==EQUIV||LA5_0==IMPLIES||(LA5_0 >= INTEQ && LA5_0 <= INTSUBSET)||(LA5_0 >= LOCEQ && LA5_0 <= LSETEQ)||LA5_0==MSETEQ||LA5_0==NEG||LA5_0==OLD||(LA5_0 >= REC && LA5_0 <= RESULTFORM)||(LA5_0 >= SEPCONJ && LA5_0 <= SEPIMPL)||LA5_0==SETEQ||LA5_0==TRUE||(LA5_0 >= 91 && LA5_0 <= 92)||(LA5_0 >= 118 && LA5_0 <= 119)||(LA5_0 >= 126 && LA5_0 <= 127)||(LA5_0 >= 143 && LA5_0 <= 144)||LA5_0==152) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// ImpPrinter.g:35:6: axm= formula
					{
					pushFollow(FOLLOW_formula_in_relDecl256);
					axm=formula();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "predDecl"
	// ImpPrinter.g:39:1: predDecl : ^( 'pred' ID lVar p= formula (axm= formula )? ) ;
	public final ImpPrinter.predDecl_return predDecl() throws RecognitionException {
		ImpPrinter.predDecl_return retval = new ImpPrinter.predDecl_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope p =null;
		TreeRuleReturnScope axm =null;

		try {
			// ImpPrinter.g:40:5: ( ^( 'pred' ID lVar p= formula (axm= formula )? ) )
			// ImpPrinter.g:41:3: ^( 'pred' ID lVar p= formula (axm= formula )? )
			{
			match(input,137,FOLLOW_137_in_predDecl283); 
			match(input, Token.DOWN, null); 
			match(input,ID,FOLLOW_ID_in_predDecl289); 
			pushFollow(FOLLOW_lVar_in_predDecl295);
			lVar();
			state._fsp--;

			pushFollow(FOLLOW_formula_in_predDecl303);
			p=formula();
			state._fsp--;

			// ImpPrinter.g:45:5: (axm= formula )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==ATOMBOOL||LA6_0==BVAR||LA6_0==CONJ||(LA6_0 >= DISJ && LA6_0 <= EMP)||LA6_0==EQUIV||LA6_0==IMPLIES||(LA6_0 >= INTEQ && LA6_0 <= INTSUBSET)||(LA6_0 >= LOCEQ && LA6_0 <= LSETEQ)||LA6_0==MSETEQ||LA6_0==NEG||LA6_0==OLD||(LA6_0 >= REC && LA6_0 <= RESULTFORM)||(LA6_0 >= SEPCONJ && LA6_0 <= SEPIMPL)||LA6_0==SETEQ||LA6_0==TRUE||(LA6_0 >= 91 && LA6_0 <= 92)||(LA6_0 >= 118 && LA6_0 <= 119)||(LA6_0 >= 126 && LA6_0 <= 127)||(LA6_0 >= 143 && LA6_0 <= 144)||LA6_0==152) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// ImpPrinter.g:45:6: axm= formula
					{
					pushFollow(FOLLOW_formula_in_predDecl312);
					axm=formula();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "intFuncDecl"
	// ImpPrinter.g:49:1: intFuncDecl : ^( 'int-fun' ID lVar p= intDef ) ;
	public final ImpPrinter.intFuncDecl_return intFuncDecl() throws RecognitionException {
		ImpPrinter.intFuncDecl_return retval = new ImpPrinter.intFuncDecl_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope p =null;

		try {
			// ImpPrinter.g:50:5: ( ^( 'int-fun' ID lVar p= intDef ) )
			// ImpPrinter.g:51:3: ^( 'int-fun' ID lVar p= intDef )
			{
			match(input,112,FOLLOW_112_in_intFuncDecl339); 
			match(input, Token.DOWN, null); 
			match(input,ID,FOLLOW_ID_in_intFuncDecl345); 
			pushFollow(FOLLOW_lVar_in_intFuncDecl351);
			lVar();
			state._fsp--;

			pushFollow(FOLLOW_intDef_in_intFuncDecl359);
			p=intDef();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "binIntFuncDecl"
	// ImpPrinter.g:58:1: binIntFuncDecl : ^( 'bin-int-fun' ID fst= lVar snd= lVar p= intDef ) ;
	public final ImpPrinter.binIntFuncDecl_return binIntFuncDecl() throws RecognitionException {
		ImpPrinter.binIntFuncDecl_return retval = new ImpPrinter.binIntFuncDecl_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope fst =null;
		TreeRuleReturnScope snd =null;
		TreeRuleReturnScope p =null;

		try {
			// ImpPrinter.g:59:5: ( ^( 'bin-int-fun' ID fst= lVar snd= lVar p= intDef ) )
			// ImpPrinter.g:60:3: ^( 'bin-int-fun' ID fst= lVar snd= lVar p= intDef )
			{
			match(input,96,FOLLOW_96_in_binIntFuncDecl384); 
			match(input, Token.DOWN, null); 
			match(input,ID,FOLLOW_ID_in_binIntFuncDecl390); 
			pushFollow(FOLLOW_lVar_in_binIntFuncDecl398);
			fst=lVar();
			state._fsp--;

			pushFollow(FOLLOW_lVar_in_binIntFuncDecl406);
			snd=lVar();
			state._fsp--;

			pushFollow(FOLLOW_intDef_in_binIntFuncDecl414);
			p=intDef();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "intDef"
	// ImpPrinter.g:68:1: intDef : ^( 'default' ( intCase )* intTerm ) ;
	public final ImpPrinter.intDef_return intDef() throws RecognitionException {
		ImpPrinter.intDef_return retval = new ImpPrinter.intDef_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:69:5: ( ^( 'default' ( intCase )* intTerm ) )
			// ImpPrinter.g:69:9: ^( 'default' ( intCase )* intTerm )
			{
			match(input,100,FOLLOW_100_in_intDef439); 
			match(input, Token.DOWN, null); 
			// ImpPrinter.g:69:21: ( intCase )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==98) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// ImpPrinter.g:69:21: intCase
					{
					pushFollow(FOLLOW_intCase_in_intDef441);
					intCase();
					state._fsp--;

					}
					break;

				default :
					break loop7;
				}
			}

			pushFollow(FOLLOW_intTerm_in_intDef444);
			intTerm();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "intCase"
	// ImpPrinter.g:72:1: intCase : ^( 'case' formula intTerm ) ;
	public final ImpPrinter.intCase_return intCase() throws RecognitionException {
		ImpPrinter.intCase_return retval = new ImpPrinter.intCase_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:73:5: ( ^( 'case' formula intTerm ) )
			// ImpPrinter.g:73:9: ^( 'case' formula intTerm )
			{
			match(input,98,FOLLOW_98_in_intCase463); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_formula_in_intCase465);
			formula();
			state._fsp--;

			pushFollow(FOLLOW_intTerm_in_intCase467);
			intTerm();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "lsetFuncDecl"
	// ImpPrinter.g:76:1: lsetFuncDecl : ^( 'lset-fun' ID lVar p= lsetDef ) ;
	public final ImpPrinter.lsetFuncDecl_return lsetFuncDecl() throws RecognitionException {
		ImpPrinter.lsetFuncDecl_return retval = new ImpPrinter.lsetFuncDecl_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope p =null;

		try {
			// ImpPrinter.g:77:5: ( ^( 'lset-fun' ID lVar p= lsetDef ) )
			// ImpPrinter.g:78:3: ^( 'lset-fun' ID lVar p= lsetDef )
			{
			match(input,123,FOLLOW_123_in_lsetFuncDecl488); 
			match(input, Token.DOWN, null); 
			match(input,ID,FOLLOW_ID_in_lsetFuncDecl494); 
			pushFollow(FOLLOW_lVar_in_lsetFuncDecl500);
			lVar();
			state._fsp--;

			pushFollow(FOLLOW_lsetDef_in_lsetFuncDecl508);
			p=lsetDef();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "lsetDef"
	// ImpPrinter.g:85:1: lsetDef : ^( 'default' ( lsetCase )* lsetTerm ) ;
	public final ImpPrinter.lsetDef_return lsetDef() throws RecognitionException {
		ImpPrinter.lsetDef_return retval = new ImpPrinter.lsetDef_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:86:5: ( ^( 'default' ( lsetCase )* lsetTerm ) )
			// ImpPrinter.g:86:9: ^( 'default' ( lsetCase )* lsetTerm )
			{
			match(input,100,FOLLOW_100_in_lsetDef533); 
			match(input, Token.DOWN, null); 
			// ImpPrinter.g:86:21: ( lsetCase )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==98) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// ImpPrinter.g:86:21: lsetCase
					{
					pushFollow(FOLLOW_lsetCase_in_lsetDef535);
					lsetCase();
					state._fsp--;

					}
					break;

				default :
					break loop8;
				}
			}

			pushFollow(FOLLOW_lsetTerm_in_lsetDef538);
			lsetTerm();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "lsetCase"
	// ImpPrinter.g:89:1: lsetCase : ^( 'case' formula lsetTerm ) ;
	public final ImpPrinter.lsetCase_return lsetCase() throws RecognitionException {
		ImpPrinter.lsetCase_return retval = new ImpPrinter.lsetCase_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:90:5: ( ^( 'case' formula lsetTerm ) )
			// ImpPrinter.g:90:9: ^( 'case' formula lsetTerm )
			{
			match(input,98,FOLLOW_98_in_lsetCase557); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_formula_in_lsetCase559);
			formula();
			state._fsp--;

			pushFollow(FOLLOW_lsetTerm_in_lsetCase561);
			lsetTerm();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "setFuncDecl"
	// ImpPrinter.g:93:1: setFuncDecl : ^( 'set-fun' ID lVar p= setDef ) ;
	public final ImpPrinter.setFuncDecl_return setFuncDecl() throws RecognitionException {
		ImpPrinter.setFuncDecl_return retval = new ImpPrinter.setFuncDecl_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope p =null;

		try {
			// ImpPrinter.g:94:5: ( ^( 'set-fun' ID lVar p= setDef ) )
			// ImpPrinter.g:95:3: ^( 'set-fun' ID lVar p= setDef )
			{
			match(input,142,FOLLOW_142_in_setFuncDecl582); 
			match(input, Token.DOWN, null); 
			match(input,ID,FOLLOW_ID_in_setFuncDecl588); 
			pushFollow(FOLLOW_lVar_in_setFuncDecl594);
			lVar();
			state._fsp--;

			pushFollow(FOLLOW_setDef_in_setFuncDecl602);
			p=setDef();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "binSetFuncDecl"
	// ImpPrinter.g:102:1: binSetFuncDecl : ^( 'bin-set-fun' ID fst= lVar snd= lVar p= setDef ) ;
	public final ImpPrinter.binSetFuncDecl_return binSetFuncDecl() throws RecognitionException {
		ImpPrinter.binSetFuncDecl_return retval = new ImpPrinter.binSetFuncDecl_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope fst =null;
		TreeRuleReturnScope snd =null;
		TreeRuleReturnScope p =null;

		try {
			// ImpPrinter.g:103:5: ( ^( 'bin-set-fun' ID fst= lVar snd= lVar p= setDef ) )
			// ImpPrinter.g:104:3: ^( 'bin-set-fun' ID fst= lVar snd= lVar p= setDef )
			{
			match(input,97,FOLLOW_97_in_binSetFuncDecl627); 
			match(input, Token.DOWN, null); 
			match(input,ID,FOLLOW_ID_in_binSetFuncDecl633); 
			pushFollow(FOLLOW_lVar_in_binSetFuncDecl641);
			fst=lVar();
			state._fsp--;

			pushFollow(FOLLOW_lVar_in_binSetFuncDecl649);
			snd=lVar();
			state._fsp--;

			pushFollow(FOLLOW_setDef_in_binSetFuncDecl657);
			p=setDef();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "setDef"
	// ImpPrinter.g:112:1: setDef : ^( 'default' ( setCase )* setTerm ) ;
	public final ImpPrinter.setDef_return setDef() throws RecognitionException {
		ImpPrinter.setDef_return retval = new ImpPrinter.setDef_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:113:5: ( ^( 'default' ( setCase )* setTerm ) )
			// ImpPrinter.g:113:9: ^( 'default' ( setCase )* setTerm )
			{
			match(input,100,FOLLOW_100_in_setDef682); 
			match(input, Token.DOWN, null); 
			// ImpPrinter.g:113:21: ( setCase )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==98) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// ImpPrinter.g:113:21: setCase
					{
					pushFollow(FOLLOW_setCase_in_setDef684);
					setCase();
					state._fsp--;

					}
					break;

				default :
					break loop9;
				}
			}

			pushFollow(FOLLOW_setTerm_in_setDef687);
			setTerm();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "setCase"
	// ImpPrinter.g:116:1: setCase : ^( 'case' formula setTerm ) ;
	public final ImpPrinter.setCase_return setCase() throws RecognitionException {
		ImpPrinter.setCase_return retval = new ImpPrinter.setCase_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:117:5: ( ^( 'case' formula setTerm ) )
			// ImpPrinter.g:117:9: ^( 'case' formula setTerm )
			{
			match(input,98,FOLLOW_98_in_setCase706); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_formula_in_setCase708);
			formula();
			state._fsp--;

			pushFollow(FOLLOW_setTerm_in_setCase710);
			setTerm();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "msetFuncDecl"
	// ImpPrinter.g:120:1: msetFuncDecl : ^( 'mset-fun' ID lVar p= msetDef ) ;
	public final ImpPrinter.msetFuncDecl_return msetFuncDecl() throws RecognitionException {
		ImpPrinter.msetFuncDecl_return retval = new ImpPrinter.msetFuncDecl_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope p =null;

		try {
			// ImpPrinter.g:121:5: ( ^( 'mset-fun' ID lVar p= msetDef ) )
			// ImpPrinter.g:122:3: ^( 'mset-fun' ID lVar p= msetDef )
			{
			match(input,133,FOLLOW_133_in_msetFuncDecl731); 
			match(input, Token.DOWN, null); 
			match(input,ID,FOLLOW_ID_in_msetFuncDecl737); 
			pushFollow(FOLLOW_lVar_in_msetFuncDecl743);
			lVar();
			state._fsp--;

			pushFollow(FOLLOW_msetDef_in_msetFuncDecl751);
			p=msetDef();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "msetDef"
	// ImpPrinter.g:129:1: msetDef : ^( 'default' ( msetCase )* msetTerm ) ;
	public final ImpPrinter.msetDef_return msetDef() throws RecognitionException {
		ImpPrinter.msetDef_return retval = new ImpPrinter.msetDef_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:130:5: ( ^( 'default' ( msetCase )* msetTerm ) )
			// ImpPrinter.g:130:9: ^( 'default' ( msetCase )* msetTerm )
			{
			match(input,100,FOLLOW_100_in_msetDef776); 
			match(input, Token.DOWN, null); 
			// ImpPrinter.g:130:21: ( msetCase )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==98) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// ImpPrinter.g:130:21: msetCase
					{
					pushFollow(FOLLOW_msetCase_in_msetDef778);
					msetCase();
					state._fsp--;

					}
					break;

				default :
					break loop10;
				}
			}

			pushFollow(FOLLOW_msetTerm_in_msetDef781);
			msetTerm();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "msetCase"
	// ImpPrinter.g:133:1: msetCase : ^( 'case' formula msetTerm ) ;
	public final ImpPrinter.msetCase_return msetCase() throws RecognitionException {
		ImpPrinter.msetCase_return retval = new ImpPrinter.msetCase_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:134:5: ( ^( 'case' formula msetTerm ) )
			// ImpPrinter.g:134:9: ^( 'case' formula msetTerm )
			{
			match(input,98,FOLLOW_98_in_msetCase800); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_formula_in_msetCase802);
			formula();
			state._fsp--;

			pushFollow(FOLLOW_msetTerm_in_msetCase804);
			msetTerm();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "formDecl"
	// ImpPrinter.g:137:1: formDecl : ^( 'form' ID p= formula ) ;
	public final ImpPrinter.formDecl_return formDecl() throws RecognitionException {
		ImpPrinter.formDecl_return retval = new ImpPrinter.formDecl_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope p =null;

		try {
			// ImpPrinter.g:138:3: ( ^( 'form' ID p= formula ) )
			// ImpPrinter.g:138:5: ^( 'form' ID p= formula )
			{
			match(input,107,FOLLOW_107_in_formDecl821); 
			match(input, Token.DOWN, null); 
			match(input,ID,FOLLOW_ID_in_formDecl823); 
			pushFollow(FOLLOW_formula_in_formDecl831);
			p=formula();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "methodDef"
	// ImpPrinter.g:142:1: methodDef : ^( type ID methodArgs requires ensures p= methodBody ) ;
	public final ImpPrinter.methodDef_return methodDef() throws RecognitionException {
		ImpPrinter.methodDef_return retval = new ImpPrinter.methodDef_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope p =null;

		try {
			// ImpPrinter.g:143:5: ( ^( type ID methodArgs requires ensures p= methodBody ) )
			// ImpPrinter.g:143:9: ^( type ID methodArgs requires ensures p= methodBody )
			{
			pushFollow(FOLLOW_type_in_methodDef850);
			type();
			state._fsp--;

			match(input, Token.DOWN, null); 
			match(input,ID,FOLLOW_ID_in_methodDef859); 
			pushFollow(FOLLOW_methodArgs_in_methodDef868);
			methodArgs();
			state._fsp--;

			pushFollow(FOLLOW_requires_in_methodDef877);
			requires();
			state._fsp--;

			pushFollow(FOLLOW_ensures_in_methodDef886);
			ensures();
			state._fsp--;

			pushFollow(FOLLOW_methodBody_in_methodDef896);
			p=methodBody();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "methodArgs"
	// ImpPrinter.g:152:1: methodArgs : ^( ARGS ( arg )+ ) ;
	public final ImpPrinter.methodArgs_return methodArgs() throws RecognitionException {
		ImpPrinter.methodArgs_return retval = new ImpPrinter.methodArgs_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:153:5: ( ^( ARGS ( arg )+ ) )
			// ImpPrinter.g:153:9: ^( ARGS ( arg )+ )
			{
			match(input,ARGS,FOLLOW_ARGS_in_methodArgs935); 
			match(input, Token.DOWN, null); 
			// ImpPrinter.g:155:9: ( arg )+
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
					// ImpPrinter.g:155:10: arg
					{
					pushFollow(FOLLOW_arg_in_methodArgs946);
					arg();
					state._fsp--;

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

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "arg"
	// ImpPrinter.g:159:1: arg : ( ^( ITYPE iVar ) | ^( LTYPE lVar ) | ^( BTYPE bVar ) );
	public final ImpPrinter.arg_return arg() throws RecognitionException {
		ImpPrinter.arg_return retval = new ImpPrinter.arg_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:160:5: ( ^( ITYPE iVar ) | ^( LTYPE lVar ) | ^( BTYPE bVar ) )
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
					// ImpPrinter.g:160:9: ^( ITYPE iVar )
					{
					match(input,ITYPE,FOLLOW_ITYPE_in_arg975); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_iVar_in_arg977);
					iVar();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// ImpPrinter.g:161:7: ^( LTYPE lVar )
					{
					match(input,LTYPE,FOLLOW_LTYPE_in_arg987); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_lVar_in_arg989);
					lVar();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// ImpPrinter.g:162:7: ^( BTYPE bVar )
					{
					match(input,BTYPE,FOLLOW_BTYPE_in_arg999); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_bVar_in_arg1001);
					bVar();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "type"
	// ImpPrinter.g:165:1: type : ( ITYPE | LTYPE | BTYPE );
	public final ImpPrinter.type_return type() throws RecognitionException {
		ImpPrinter.type_return retval = new ImpPrinter.type_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:166:5: ( ITYPE | LTYPE | BTYPE )
			// ImpPrinter.g:
			{
			if ( input.LA(1)==BTYPE||input.LA(1)==ITYPE||input.LA(1)==LTYPE ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "requires"
	// ImpPrinter.g:171:1: requires : ^( 'requires' p= formula ) ;
	public final ImpPrinter.requires_return requires() throws RecognitionException {
		ImpPrinter.requires_return retval = new ImpPrinter.requires_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope p =null;

		try {
			// ImpPrinter.g:172:5: ( ^( 'requires' p= formula ) )
			// ImpPrinter.g:172:9: ^( 'requires' p= formula )
			{
			match(input,139,FOLLOW_139_in_requires1057); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_formula_in_requires1061);
			p=formula();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "ensures"
	// ImpPrinter.g:175:1: ensures : ^( 'ensures' p= formula ) ;
	public final ImpPrinter.ensures_return ensures() throws RecognitionException {
		ImpPrinter.ensures_return retval = new ImpPrinter.ensures_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope p =null;

		try {
			// ImpPrinter.g:176:5: ( ^( 'ensures' p= formula ) )
			// ImpPrinter.g:176:9: ^( 'ensures' p= formula )
			{
			match(input,106,FOLLOW_106_in_ensures1080); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_formula_in_ensures1084);
			p=formula();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "methodBody"
	// ImpPrinter.g:180:1: methodBody : ^( SEQ ( statement )* ) ;
	public final ImpPrinter.methodBody_return methodBody() throws RecognitionException {
		ImpPrinter.methodBody_return retval = new ImpPrinter.methodBody_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:181:5: ( ^( SEQ ( statement )* ) )
			// ImpPrinter.g:182:5: ^( SEQ ( statement )* )
			{
			match(input,SEQ,FOLLOW_SEQ_in_methodBody1110); 
			if ( input.LA(1)==Token.DOWN ) {
				match(input, Token.DOWN, null); 
				// ImpPrinter.g:182:11: ( statement )*
				loop13:
				while (true) {
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( ((LA13_0 >= ASSGN && LA13_0 <= ASSUME)||LA13_0==ATOMSTMT||LA13_0==DEREFASSGN||(LA13_0 >= FREE && LA13_0 <= ID)||LA13_0==MALLOC||LA13_0==MUTATE||LA13_0==RET||LA13_0==STMT||LA13_0==111||LA13_0==121||LA13_0==146||LA13_0==150) ) {
						alt13=1;
					}

					switch (alt13) {
					case 1 :
						// ImpPrinter.g:182:11: statement
						{
						pushFollow(FOLLOW_statement_in_methodBody1112);
						statement();
						state._fsp--;

						}
						break;

					default :
						break loop13;
					}
				}

				match(input, Token.UP, null); 
			}

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "statement"
	// ImpPrinter.g:185:1: statement : ( whileLoop | conditional | command | ^( ATOMSTMT methodBody ) ) ;
	public final ImpPrinter.statement_return statement() throws RecognitionException {
		ImpPrinter.statement_return retval = new ImpPrinter.statement_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:186:5: ( ( whileLoop | conditional | command | ^( ATOMSTMT methodBody ) ) )
			// ImpPrinter.g:186:9: ( whileLoop | conditional | command | ^( ATOMSTMT methodBody ) )
			{
			// ImpPrinter.g:186:9: ( whileLoop | conditional | command | ^( ATOMSTMT methodBody ) )
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
					// ImpPrinter.g:186:10: whileLoop
					{
					pushFollow(FOLLOW_whileLoop_in_statement1138);
					whileLoop();
					state._fsp--;

					}
					break;
				case 2 :
					// ImpPrinter.g:186:22: conditional
					{
					pushFollow(FOLLOW_conditional_in_statement1142);
					conditional();
					state._fsp--;

					}
					break;
				case 3 :
					// ImpPrinter.g:186:36: command
					{
					pushFollow(FOLLOW_command_in_statement1146);
					command();
					state._fsp--;

					}
					break;
				case 4 :
					// ImpPrinter.g:186:46: ^( ATOMSTMT methodBody )
					{
					match(input,ATOMSTMT,FOLLOW_ATOMSTMT_in_statement1151); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_methodBody_in_statement1153);
					methodBody();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "mainBody"
	// ImpPrinter.g:189:1: mainBody : ( functionCall | whileLoop );
	public final ImpPrinter.mainBody_return mainBody() throws RecognitionException {
		ImpPrinter.mainBody_return retval = new ImpPrinter.mainBody_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:190:5: ( functionCall | whileLoop )
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
					// ImpPrinter.g:191:5: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_mainBody1183);
					functionCall();
					state._fsp--;

					}
					break;
				case 2 :
					// ImpPrinter.g:192:9: whileLoop
					{
					pushFollow(FOLLOW_whileLoop_in_mainBody1193);
					whileLoop();
					state._fsp--;

					}
					break;

			}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "whileLoop"
	// ImpPrinter.g:195:1: whileLoop : ( ^( 'while' boolExp statement ) | ^( 'loop' INT ) | ^( 'simple-loop' INT ) );
	public final ImpPrinter.whileLoop_return whileLoop() throws RecognitionException {
		ImpPrinter.whileLoop_return retval = new ImpPrinter.whileLoop_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:196:5: ( ^( 'while' boolExp statement ) | ^( 'loop' INT ) | ^( 'simple-loop' INT ) )
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
					// ImpPrinter.g:197:5: ^( 'while' boolExp statement )
					{
					match(input,150,FOLLOW_150_in_whileLoop1219); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_boolExp_in_whileLoop1221);
					boolExp();
					state._fsp--;

					pushFollow(FOLLOW_statement_in_whileLoop1223);
					statement();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// ImpPrinter.g:198:9: ^( 'loop' INT )
					{
					match(input,121,FOLLOW_121_in_whileLoop1235); 
					match(input, Token.DOWN, null); 
					match(input,INT,FOLLOW_INT_in_whileLoop1237); 
					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// ImpPrinter.g:199:9: ^( 'simple-loop' INT )
					{
					match(input,146,FOLLOW_146_in_whileLoop1249); 
					match(input, Token.DOWN, null); 
					match(input,INT,FOLLOW_INT_in_whileLoop1251); 
					match(input, Token.UP, null); 

					}
					break;

			}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "conditional"
	// ImpPrinter.g:202:1: conditional : ^( 'if' boolExp statement ( el )? ) ;
	public final ImpPrinter.conditional_return conditional() throws RecognitionException {
		ImpPrinter.conditional_return retval = new ImpPrinter.conditional_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:203:5: ( ^( 'if' boolExp statement ( el )? ) )
			// ImpPrinter.g:204:5: ^( 'if' boolExp statement ( el )? )
			{
			match(input,111,FOLLOW_111_in_conditional1278); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_boolExp_in_conditional1281);
			boolExp();
			state._fsp--;

			pushFollow(FOLLOW_statement_in_conditional1283);
			statement();
			state._fsp--;

			// ImpPrinter.g:204:31: ( el )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==102) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// ImpPrinter.g:204:31: el
					{
					pushFollow(FOLLOW_el_in_conditional1285);
					el();
					state._fsp--;

					}
					break;

			}

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "el"
	// ImpPrinter.g:207:1: el : ^( 'else' statement ) ;
	public final ImpPrinter.el_return el() throws RecognitionException {
		ImpPrinter.el_return retval = new ImpPrinter.el_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:208:5: ( ^( 'else' statement ) )
			// ImpPrinter.g:209:5: ^( 'else' statement )
			{
			match(input,102,FOLLOW_102_in_el1313); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_statement_in_el1315);
			statement();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "command"
	// ImpPrinter.g:213:1: command : ( assignment | mutation | malloc | free | assume | functionCall | ret | unknownStmt );
	public final ImpPrinter.command_return command() throws RecognitionException {
		ImpPrinter.command_return retval = new ImpPrinter.command_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:214:3: ( assignment | mutation | malloc | free | assume | functionCall | ret | unknownStmt )
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
					// ImpPrinter.g:214:7: assignment
					{
					pushFollow(FOLLOW_assignment_in_command1334);
					assignment();
					state._fsp--;

					}
					break;
				case 2 :
					// ImpPrinter.g:215:7: mutation
					{
					pushFollow(FOLLOW_mutation_in_command1342);
					mutation();
					state._fsp--;

					}
					break;
				case 3 :
					// ImpPrinter.g:216:7: malloc
					{
					pushFollow(FOLLOW_malloc_in_command1350);
					malloc();
					state._fsp--;

					}
					break;
				case 4 :
					// ImpPrinter.g:217:7: free
					{
					pushFollow(FOLLOW_free_in_command1358);
					free();
					state._fsp--;

					}
					break;
				case 5 :
					// ImpPrinter.g:218:7: assume
					{
					pushFollow(FOLLOW_assume_in_command1366);
					assume();
					state._fsp--;

					}
					break;
				case 6 :
					// ImpPrinter.g:219:7: functionCall
					{
					pushFollow(FOLLOW_functionCall_in_command1374);
					functionCall();
					state._fsp--;

					}
					break;
				case 7 :
					// ImpPrinter.g:220:7: ret
					{
					pushFollow(FOLLOW_ret_in_command1382);
					ret();
					state._fsp--;

					}
					break;
				case 8 :
					// ImpPrinter.g:221:7: unknownStmt
					{
					pushFollow(FOLLOW_unknownStmt_in_command1390);
					unknownStmt();
					state._fsp--;

					}
					break;

			}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "unknownStmt"
	// ImpPrinter.g:224:1: unknownStmt : ^( STMT atomIntExp ) ;
	public final ImpPrinter.unknownStmt_return unknownStmt() throws RecognitionException {
		ImpPrinter.unknownStmt_return retval = new ImpPrinter.unknownStmt_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:225:3: ( ^( STMT atomIntExp ) )
			// ImpPrinter.g:226:3: ^( STMT atomIntExp )
			{
			match(input,STMT,FOLLOW_STMT_in_unknownStmt1408); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_atomIntExp_in_unknownStmt1410);
			atomIntExp();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "assignment"
	// ImpPrinter.g:229:1: assignment : ( ^( ASSGN ITYPE iVar intExp ) | ^( ASSGN LTYPE lVar locExp ) | ^( ASSGN BTYPE bVar boolExp ) | ^( DEREFASSGN ITYPE iVar dataDeref ) | ^( DEREFASSGN LTYPE lVar dirDeref ) );
	public final ImpPrinter.assignment_return assignment() throws RecognitionException {
		ImpPrinter.assignment_return retval = new ImpPrinter.assignment_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:230:5: ( ^( ASSGN ITYPE iVar intExp ) | ^( ASSGN LTYPE lVar locExp ) | ^( ASSGN BTYPE bVar boolExp ) | ^( DEREFASSGN ITYPE iVar dataDeref ) | ^( DEREFASSGN LTYPE lVar dirDeref ) )
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
					// ImpPrinter.g:230:9: ^( ASSGN ITYPE iVar intExp )
					{
					match(input,ASSGN,FOLLOW_ASSGN_in_assignment1431); 
					match(input, Token.DOWN, null); 
					match(input,ITYPE,FOLLOW_ITYPE_in_assignment1433); 
					pushFollow(FOLLOW_iVar_in_assignment1435);
					iVar();
					state._fsp--;

					pushFollow(FOLLOW_intExp_in_assignment1437);
					intExp();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// ImpPrinter.g:231:7: ^( ASSGN LTYPE lVar locExp )
					{
					match(input,ASSGN,FOLLOW_ASSGN_in_assignment1449); 
					match(input, Token.DOWN, null); 
					match(input,LTYPE,FOLLOW_LTYPE_in_assignment1451); 
					pushFollow(FOLLOW_lVar_in_assignment1453);
					lVar();
					state._fsp--;

					pushFollow(FOLLOW_locExp_in_assignment1455);
					locExp();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// ImpPrinter.g:232:7: ^( ASSGN BTYPE bVar boolExp )
					{
					match(input,ASSGN,FOLLOW_ASSGN_in_assignment1467); 
					match(input, Token.DOWN, null); 
					match(input,BTYPE,FOLLOW_BTYPE_in_assignment1469); 
					pushFollow(FOLLOW_bVar_in_assignment1471);
					bVar();
					state._fsp--;

					pushFollow(FOLLOW_boolExp_in_assignment1473);
					boolExp();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// ImpPrinter.g:233:7: ^( DEREFASSGN ITYPE iVar dataDeref )
					{
					match(input,DEREFASSGN,FOLLOW_DEREFASSGN_in_assignment1485); 
					match(input, Token.DOWN, null); 
					match(input,ITYPE,FOLLOW_ITYPE_in_assignment1487); 
					pushFollow(FOLLOW_iVar_in_assignment1489);
					iVar();
					state._fsp--;

					pushFollow(FOLLOW_dataDeref_in_assignment1491);
					dataDeref();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 5 :
					// ImpPrinter.g:234:7: ^( DEREFASSGN LTYPE lVar dirDeref )
					{
					match(input,DEREFASSGN,FOLLOW_DEREFASSGN_in_assignment1503); 
					match(input, Token.DOWN, null); 
					match(input,LTYPE,FOLLOW_LTYPE_in_assignment1505); 
					pushFollow(FOLLOW_lVar_in_assignment1507);
					lVar();
					state._fsp--;

					pushFollow(FOLLOW_dirDeref_in_assignment1509);
					dirDeref();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "mutation"
	// ImpPrinter.g:237:1: mutation : ( ^( MUTATE LTYPE dirDeref lVar ) | ^( MUTATE ITYPE dataDeref iVar ) );
	public final ImpPrinter.mutation_return mutation() throws RecognitionException {
		ImpPrinter.mutation_return retval = new ImpPrinter.mutation_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:238:5: ( ^( MUTATE LTYPE dirDeref lVar ) | ^( MUTATE ITYPE dataDeref iVar ) )
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
					// ImpPrinter.g:238:9: ^( MUTATE LTYPE dirDeref lVar )
					{
					match(input,MUTATE,FOLLOW_MUTATE_in_mutation1531); 
					match(input, Token.DOWN, null); 
					match(input,LTYPE,FOLLOW_LTYPE_in_mutation1533); 
					pushFollow(FOLLOW_dirDeref_in_mutation1535);
					dirDeref();
					state._fsp--;

					pushFollow(FOLLOW_lVar_in_mutation1537);
					lVar();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// ImpPrinter.g:239:7: ^( MUTATE ITYPE dataDeref iVar )
					{
					match(input,MUTATE,FOLLOW_MUTATE_in_mutation1547); 
					match(input, Token.DOWN, null); 
					match(input,ITYPE,FOLLOW_ITYPE_in_mutation1549); 
					pushFollow(FOLLOW_dataDeref_in_mutation1551);
					dataDeref();
					state._fsp--;

					pushFollow(FOLLOW_iVar_in_mutation1553);
					iVar();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "ret"
	// ImpPrinter.g:242:1: ret : ( ^( RET LTYPE locExp ) | ^( RET ITYPE atomIntExp ) | ^( RET BTYPE atomBoolExp ) ) ;
	public final ImpPrinter.ret_return ret() throws RecognitionException {
		ImpPrinter.ret_return retval = new ImpPrinter.ret_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:243:5: ( ( ^( RET LTYPE locExp ) | ^( RET ITYPE atomIntExp ) | ^( RET BTYPE atomBoolExp ) ) )
			// ImpPrinter.g:243:9: ( ^( RET LTYPE locExp ) | ^( RET ITYPE atomIntExp ) | ^( RET BTYPE atomBoolExp ) )
			{
			// ImpPrinter.g:243:9: ( ^( RET LTYPE locExp ) | ^( RET ITYPE atomIntExp ) | ^( RET BTYPE atomBoolExp ) )
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
					// ImpPrinter.g:243:11: ^( RET LTYPE locExp )
					{
					match(input,RET,FOLLOW_RET_in_ret1576); 
					match(input, Token.DOWN, null); 
					match(input,LTYPE,FOLLOW_LTYPE_in_ret1578); 
					pushFollow(FOLLOW_locExp_in_ret1580);
					locExp();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// ImpPrinter.g:244:7: ^( RET ITYPE atomIntExp )
					{
					match(input,RET,FOLLOW_RET_in_ret1590); 
					match(input, Token.DOWN, null); 
					match(input,ITYPE,FOLLOW_ITYPE_in_ret1592); 
					pushFollow(FOLLOW_atomIntExp_in_ret1594);
					atomIntExp();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// ImpPrinter.g:245:7: ^( RET BTYPE atomBoolExp )
					{
					match(input,RET,FOLLOW_RET_in_ret1604); 
					match(input, Token.DOWN, null); 
					match(input,BTYPE,FOLLOW_BTYPE_in_ret1606); 
					pushFollow(FOLLOW_atomBoolExp_in_ret1608);
					atomBoolExp();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "malloc"
	// ImpPrinter.g:248:1: malloc : ^( MALLOC lVar ) ;
	public final ImpPrinter.malloc_return malloc() throws RecognitionException {
		ImpPrinter.malloc_return retval = new ImpPrinter.malloc_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:249:5: ( ^( MALLOC lVar ) )
			// ImpPrinter.g:249:9: ^( MALLOC lVar )
			{
			match(input,MALLOC,FOLLOW_MALLOC_in_malloc1629); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_lVar_in_malloc1631);
			lVar();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "free"
	// ImpPrinter.g:252:1: free : ^( FREE lVar ) ;
	public final ImpPrinter.free_return free() throws RecognitionException {
		ImpPrinter.free_return retval = new ImpPrinter.free_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:253:5: ( ^( FREE lVar ) )
			// ImpPrinter.g:253:9: ^( FREE lVar )
			{
			match(input,FREE,FOLLOW_FREE_in_free1652); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_lVar_in_free1654);
			lVar();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "assume"
	// ImpPrinter.g:256:1: assume : ^( ASSUME boolExp ) ;
	public final ImpPrinter.assume_return assume() throws RecognitionException {
		ImpPrinter.assume_return retval = new ImpPrinter.assume_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:257:5: ( ^( ASSUME boolExp ) )
			// ImpPrinter.g:257:9: ^( ASSUME boolExp )
			{
			match(input,ASSUME,FOLLOW_ASSUME_in_assume1673); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_boolExp_in_assume1675);
			boolExp();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "functionCall"
	// ImpPrinter.g:260:1: functionCall : ( ^( func LTYPE lVar vars ) | ^( func ITYPE iVar vars ) | ^( func BTYPE bVar vars ) );
	public final ImpPrinter.functionCall_return functionCall() throws RecognitionException {
		ImpPrinter.functionCall_return retval = new ImpPrinter.functionCall_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:261:5: ( ^( func LTYPE lVar vars ) | ^( func ITYPE iVar vars ) | ^( func BTYPE bVar vars ) )
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
					// ImpPrinter.g:261:9: ^( func LTYPE lVar vars )
					{
					pushFollow(FOLLOW_func_in_functionCall1696);
					func();
					state._fsp--;

					match(input, Token.DOWN, null); 
					match(input,LTYPE,FOLLOW_LTYPE_in_functionCall1698); 
					pushFollow(FOLLOW_lVar_in_functionCall1700);
					lVar();
					state._fsp--;

					pushFollow(FOLLOW_vars_in_functionCall1702);
					vars();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// ImpPrinter.g:262:7: ^( func ITYPE iVar vars )
					{
					pushFollow(FOLLOW_func_in_functionCall1712);
					func();
					state._fsp--;

					match(input, Token.DOWN, null); 
					match(input,ITYPE,FOLLOW_ITYPE_in_functionCall1714); 
					pushFollow(FOLLOW_iVar_in_functionCall1716);
					iVar();
					state._fsp--;

					pushFollow(FOLLOW_vars_in_functionCall1718);
					vars();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// ImpPrinter.g:263:7: ^( func BTYPE bVar vars )
					{
					pushFollow(FOLLOW_func_in_functionCall1728);
					func();
					state._fsp--;

					match(input, Token.DOWN, null); 
					match(input,BTYPE,FOLLOW_BTYPE_in_functionCall1730); 
					pushFollow(FOLLOW_bVar_in_functionCall1732);
					bVar();
					state._fsp--;

					pushFollow(FOLLOW_vars_in_functionCall1734);
					vars();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "vars"
	// ImpPrinter.g:266:1: vars : ( lVar | iVar )+ ;
	public final ImpPrinter.vars_return vars() throws RecognitionException {
		ImpPrinter.vars_return retval = new ImpPrinter.vars_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:267:5: ( ( lVar | iVar )+ )
			// ImpPrinter.g:267:10: ( lVar | iVar )+
			{
			// ImpPrinter.g:267:10: ( lVar | iVar )+
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
					// ImpPrinter.g:267:11: lVar
					{
					pushFollow(FOLLOW_lVar_in_vars1756);
					lVar();
					state._fsp--;

					}
					break;
				case 2 :
					// ImpPrinter.g:267:18: iVar
					{
					pushFollow(FOLLOW_iVar_in_vars1760);
					iVar();
					state._fsp--;

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "lVars"
	// ImpPrinter.g:270:1: lVars : ^( LVARS ( lVar )+ ) ;
	public final ImpPrinter.lVars_return lVars() throws RecognitionException {
		ImpPrinter.lVars_return retval = new ImpPrinter.lVars_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:271:5: ( ^( LVARS ( lVar )+ ) )
			// ImpPrinter.g:271:9: ^( LVARS ( lVar )+ )
			{
			match(input,LVARS,FOLLOW_LVARS_in_lVars1781); 
			match(input, Token.DOWN, null); 
			// ImpPrinter.g:271:17: ( lVar )+
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
					// ImpPrinter.g:271:18: lVar
					{
					pushFollow(FOLLOW_lVar_in_lVars1784);
					lVar();
					state._fsp--;

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

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "iVars"
	// ImpPrinter.g:274:1: iVars : ^( IVARS ( iVar )+ ) ;
	public final ImpPrinter.iVars_return iVars() throws RecognitionException {
		ImpPrinter.iVars_return retval = new ImpPrinter.iVars_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:275:5: ( ^( IVARS ( iVar )+ ) )
			// ImpPrinter.g:275:9: ^( IVARS ( iVar )+ )
			{
			match(input,IVARS,FOLLOW_IVARS_in_iVars1805); 
			match(input, Token.DOWN, null); 
			// ImpPrinter.g:275:17: ( iVar )+
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
					// ImpPrinter.g:275:17: iVar
					{
					pushFollow(FOLLOW_iVar_in_iVars1807);
					iVar();
					state._fsp--;

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

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "bVars"
	// ImpPrinter.g:278:1: bVars : ^( BVARS ( bVar )+ ) ;
	public final ImpPrinter.bVars_return bVars() throws RecognitionException {
		ImpPrinter.bVars_return retval = new ImpPrinter.bVars_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:279:5: ( ^( BVARS ( bVar )+ ) )
			// ImpPrinter.g:279:9: ^( BVARS ( bVar )+ )
			{
			match(input,BVARS,FOLLOW_BVARS_in_bVars1829); 
			match(input, Token.DOWN, null); 
			// ImpPrinter.g:279:17: ( bVar )+
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
					// ImpPrinter.g:279:17: bVar
					{
					pushFollow(FOLLOW_bVar_in_bVars1831);
					bVar();
					state._fsp--;

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

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "formula"
	// ImpPrinter.g:282:1: formula : ( atomForm | ^( binaryConnector atomForm atomForm ) | ^( NEG atomForm ) | pointsTo | ^( LOCEQ locTerm locTerm ) | ^( INTEQ atomIntTerm atomIntTerm ) | ^( '<' atomIntTerm atomIntTerm ) | ^( '<=' atomIntTerm atomIntTerm ) | ^( SETEQ atomSetTerm atomSetTerm ) | ^( LSETEQ atomLsetTerm atomLsetTerm ) | ^( MSETEQ atomMsetTerm atomMsetTerm ) | ^( INTMEM atomIntTerm atomSetTerm ) | ^( LOCMEM locTerm atomLsetTerm ) | ^( INTMMEM atomIntTerm atomMsetTerm ) | ^( INTSUBSET atomSetTerm atomSetTerm ) | ^( 'lt' atomSetTerm atomSetTerm ) | ^( 'le' atomSetTerm atomSetTerm ) | ^( 'lt-set' atomIntTerm atomSetTerm ) | ^( 'set-lt' atomSetTerm atomIntTerm ) | ^( 'le-set' atomIntTerm atomSetTerm ) | ^( 'set-le' atomSetTerm atomIntTerm ) | ^( LOCSUBSET atomLsetTerm atomLsetTerm ) | ^( INTMSUBSET atomMsetTerm atomMsetTerm ) );
	public final ImpPrinter.formula_return formula() throws RecognitionException {
		ImpPrinter.formula_return retval = new ImpPrinter.formula_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:283:5: ( atomForm | ^( binaryConnector atomForm atomForm ) | ^( NEG atomForm ) | pointsTo | ^( LOCEQ locTerm locTerm ) | ^( INTEQ atomIntTerm atomIntTerm ) | ^( '<' atomIntTerm atomIntTerm ) | ^( '<=' atomIntTerm atomIntTerm ) | ^( SETEQ atomSetTerm atomSetTerm ) | ^( LSETEQ atomLsetTerm atomLsetTerm ) | ^( MSETEQ atomMsetTerm atomMsetTerm ) | ^( INTMEM atomIntTerm atomSetTerm ) | ^( LOCMEM locTerm atomLsetTerm ) | ^( INTMMEM atomIntTerm atomMsetTerm ) | ^( INTSUBSET atomSetTerm atomSetTerm ) | ^( 'lt' atomSetTerm atomSetTerm ) | ^( 'le' atomSetTerm atomSetTerm ) | ^( 'lt-set' atomIntTerm atomSetTerm ) | ^( 'set-lt' atomSetTerm atomIntTerm ) | ^( 'le-set' atomIntTerm atomSetTerm ) | ^( 'set-le' atomSetTerm atomIntTerm ) | ^( LOCSUBSET atomLsetTerm atomLsetTerm ) | ^( INTMSUBSET atomMsetTerm atomMsetTerm ) )
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
					// ImpPrinter.g:283:9: atomForm
					{
					pushFollow(FOLLOW_atomForm_in_formula1852);
					atomForm();
					state._fsp--;

					}
					break;
				case 2 :
					// ImpPrinter.g:284:7: ^( binaryConnector atomForm atomForm )
					{
					pushFollow(FOLLOW_binaryConnector_in_formula1861);
					binaryConnector();
					state._fsp--;

					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_atomForm_in_formula1863);
					atomForm();
					state._fsp--;

					pushFollow(FOLLOW_atomForm_in_formula1865);
					atomForm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// ImpPrinter.g:285:7: ^( NEG atomForm )
					{
					match(input,NEG,FOLLOW_NEG_in_formula1875); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_atomForm_in_formula1877);
					atomForm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// ImpPrinter.g:286:7: pointsTo
					{
					pushFollow(FOLLOW_pointsTo_in_formula1886);
					pointsTo();
					state._fsp--;

					}
					break;
				case 5 :
					// ImpPrinter.g:287:7: ^( LOCEQ locTerm locTerm )
					{
					match(input,LOCEQ,FOLLOW_LOCEQ_in_formula1895); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_locTerm_in_formula1897);
					locTerm();
					state._fsp--;

					pushFollow(FOLLOW_locTerm_in_formula1899);
					locTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 6 :
					// ImpPrinter.g:288:7: ^( INTEQ atomIntTerm atomIntTerm )
					{
					match(input,INTEQ,FOLLOW_INTEQ_in_formula1909); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_atomIntTerm_in_formula1911);
					atomIntTerm();
					state._fsp--;

					pushFollow(FOLLOW_atomIntTerm_in_formula1913);
					atomIntTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 7 :
					// ImpPrinter.g:289:7: ^( '<' atomIntTerm atomIntTerm )
					{
					match(input,91,FOLLOW_91_in_formula1923); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_atomIntTerm_in_formula1925);
					atomIntTerm();
					state._fsp--;

					pushFollow(FOLLOW_atomIntTerm_in_formula1927);
					atomIntTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 8 :
					// ImpPrinter.g:290:7: ^( '<=' atomIntTerm atomIntTerm )
					{
					match(input,92,FOLLOW_92_in_formula1937); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_atomIntTerm_in_formula1939);
					atomIntTerm();
					state._fsp--;

					pushFollow(FOLLOW_atomIntTerm_in_formula1941);
					atomIntTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 9 :
					// ImpPrinter.g:291:7: ^( SETEQ atomSetTerm atomSetTerm )
					{
					match(input,SETEQ,FOLLOW_SETEQ_in_formula1951); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_atomSetTerm_in_formula1953);
					atomSetTerm();
					state._fsp--;

					pushFollow(FOLLOW_atomSetTerm_in_formula1955);
					atomSetTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 10 :
					// ImpPrinter.g:292:7: ^( LSETEQ atomLsetTerm atomLsetTerm )
					{
					match(input,LSETEQ,FOLLOW_LSETEQ_in_formula1965); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_atomLsetTerm_in_formula1967);
					atomLsetTerm();
					state._fsp--;

					pushFollow(FOLLOW_atomLsetTerm_in_formula1969);
					atomLsetTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 11 :
					// ImpPrinter.g:293:7: ^( MSETEQ atomMsetTerm atomMsetTerm )
					{
					match(input,MSETEQ,FOLLOW_MSETEQ_in_formula1979); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_atomMsetTerm_in_formula1981);
					atomMsetTerm();
					state._fsp--;

					pushFollow(FOLLOW_atomMsetTerm_in_formula1983);
					atomMsetTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 12 :
					// ImpPrinter.g:294:7: ^( INTMEM atomIntTerm atomSetTerm )
					{
					match(input,INTMEM,FOLLOW_INTMEM_in_formula1993); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_atomIntTerm_in_formula1995);
					atomIntTerm();
					state._fsp--;

					pushFollow(FOLLOW_atomSetTerm_in_formula1997);
					atomSetTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 13 :
					// ImpPrinter.g:295:7: ^( LOCMEM locTerm atomLsetTerm )
					{
					match(input,LOCMEM,FOLLOW_LOCMEM_in_formula2007); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_locTerm_in_formula2009);
					locTerm();
					state._fsp--;

					pushFollow(FOLLOW_atomLsetTerm_in_formula2011);
					atomLsetTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 14 :
					// ImpPrinter.g:296:7: ^( INTMMEM atomIntTerm atomMsetTerm )
					{
					match(input,INTMMEM,FOLLOW_INTMMEM_in_formula2021); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_atomIntTerm_in_formula2023);
					atomIntTerm();
					state._fsp--;

					pushFollow(FOLLOW_atomMsetTerm_in_formula2025);
					atomMsetTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 15 :
					// ImpPrinter.g:297:7: ^( INTSUBSET atomSetTerm atomSetTerm )
					{
					match(input,INTSUBSET,FOLLOW_INTSUBSET_in_formula2035); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_atomSetTerm_in_formula2037);
					atomSetTerm();
					state._fsp--;

					pushFollow(FOLLOW_atomSetTerm_in_formula2039);
					atomSetTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 16 :
					// ImpPrinter.g:298:7: ^( 'lt' atomSetTerm atomSetTerm )
					{
					match(input,126,FOLLOW_126_in_formula2049); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_atomSetTerm_in_formula2051);
					atomSetTerm();
					state._fsp--;

					pushFollow(FOLLOW_atomSetTerm_in_formula2053);
					atomSetTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 17 :
					// ImpPrinter.g:299:7: ^( 'le' atomSetTerm atomSetTerm )
					{
					match(input,118,FOLLOW_118_in_formula2063); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_atomSetTerm_in_formula2065);
					atomSetTerm();
					state._fsp--;

					pushFollow(FOLLOW_atomSetTerm_in_formula2067);
					atomSetTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 18 :
					// ImpPrinter.g:300:7: ^( 'lt-set' atomIntTerm atomSetTerm )
					{
					match(input,127,FOLLOW_127_in_formula2077); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_atomIntTerm_in_formula2079);
					atomIntTerm();
					state._fsp--;

					pushFollow(FOLLOW_atomSetTerm_in_formula2081);
					atomSetTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 19 :
					// ImpPrinter.g:301:7: ^( 'set-lt' atomSetTerm atomIntTerm )
					{
					match(input,144,FOLLOW_144_in_formula2091); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_atomSetTerm_in_formula2093);
					atomSetTerm();
					state._fsp--;

					pushFollow(FOLLOW_atomIntTerm_in_formula2095);
					atomIntTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 20 :
					// ImpPrinter.g:302:7: ^( 'le-set' atomIntTerm atomSetTerm )
					{
					match(input,119,FOLLOW_119_in_formula2105); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_atomIntTerm_in_formula2107);
					atomIntTerm();
					state._fsp--;

					pushFollow(FOLLOW_atomSetTerm_in_formula2109);
					atomSetTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 21 :
					// ImpPrinter.g:303:7: ^( 'set-le' atomSetTerm atomIntTerm )
					{
					match(input,143,FOLLOW_143_in_formula2119); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_atomSetTerm_in_formula2121);
					atomSetTerm();
					state._fsp--;

					pushFollow(FOLLOW_atomIntTerm_in_formula2123);
					atomIntTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 22 :
					// ImpPrinter.g:304:7: ^( LOCSUBSET atomLsetTerm atomLsetTerm )
					{
					match(input,LOCSUBSET,FOLLOW_LOCSUBSET_in_formula2133); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_atomLsetTerm_in_formula2135);
					atomLsetTerm();
					state._fsp--;

					pushFollow(FOLLOW_atomLsetTerm_in_formula2137);
					atomLsetTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 23 :
					// ImpPrinter.g:305:7: ^( INTMSUBSET atomMsetTerm atomMsetTerm )
					{
					match(input,INTMSUBSET,FOLLOW_INTMSUBSET_in_formula2147); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_atomMsetTerm_in_formula2149);
					atomMsetTerm();
					state._fsp--;

					pushFollow(FOLLOW_atomMsetTerm_in_formula2151);
					atomMsetTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "binaryConnector"
	// ImpPrinter.g:308:1: binaryConnector : ( CONJ | DISJ | IMPLIES | EQUIV | SEPCONJ | SEPIMPL );
	public final ImpPrinter.binaryConnector_return binaryConnector() throws RecognitionException {
		ImpPrinter.binaryConnector_return retval = new ImpPrinter.binaryConnector_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:309:5: ( CONJ | DISJ | IMPLIES | EQUIV | SEPCONJ | SEPIMPL )
			// ImpPrinter.g:
			{
			if ( input.LA(1)==CONJ||input.LA(1)==DISJ||input.LA(1)==EQUIV||input.LA(1)==IMPLIES||(input.LA(1) >= SEPCONJ && input.LA(1) <= SEPIMPL) ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "atomForm"
	// ImpPrinter.g:317:1: atomForm : ( ^( ATOMBOOL formula ) | TRUE | EMP | RESULTFORM | bVar | relRec | rec | ^( OLD formula ) );
	public final ImpPrinter.atomForm_return atomForm() throws RecognitionException {
		ImpPrinter.atomForm_return retval = new ImpPrinter.atomForm_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:318:5: ( ^( ATOMBOOL formula ) | TRUE | EMP | RESULTFORM | bVar | relRec | rec | ^( OLD formula ) )
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
					// ImpPrinter.g:318:9: ^( ATOMBOOL formula )
					{
					match(input,ATOMBOOL,FOLLOW_ATOMBOOL_in_atomForm2229); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_formula_in_atomForm2231);
					formula();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// ImpPrinter.g:319:7: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_atomForm2240); 
					}
					break;
				case 3 :
					// ImpPrinter.g:320:7: EMP
					{
					match(input,EMP,FOLLOW_EMP_in_atomForm2248); 
					}
					break;
				case 4 :
					// ImpPrinter.g:321:7: RESULTFORM
					{
					match(input,RESULTFORM,FOLLOW_RESULTFORM_in_atomForm2256); 
					}
					break;
				case 5 :
					// ImpPrinter.g:322:7: bVar
					{
					pushFollow(FOLLOW_bVar_in_atomForm2264);
					bVar();
					state._fsp--;

					}
					break;
				case 6 :
					// ImpPrinter.g:323:7: relRec
					{
					pushFollow(FOLLOW_relRec_in_atomForm2272);
					relRec();
					state._fsp--;

					}
					break;
				case 7 :
					// ImpPrinter.g:324:7: rec
					{
					pushFollow(FOLLOW_rec_in_atomForm2280);
					rec();
					state._fsp--;

					}
					break;
				case 8 :
					// ImpPrinter.g:325:7: ^( OLD formula )
					{
					match(input,OLD,FOLLOW_OLD_in_atomForm2289); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_formula_in_atomForm2291);
					formula();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "pointsTo"
	// ImpPrinter.g:328:1: pointsTo : ^( '|->' locTerm ( fieldVal )+ ) ;
	public final ImpPrinter.pointsTo_return pointsTo() throws RecognitionException {
		ImpPrinter.pointsTo_return retval = new ImpPrinter.pointsTo_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:329:5: ( ^( '|->' locTerm ( fieldVal )+ ) )
			// ImpPrinter.g:329:9: ^( '|->' locTerm ( fieldVal )+ )
			{
			match(input,152,FOLLOW_152_in_pointsTo2310); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_locTerm_in_pointsTo2312);
			locTerm();
			state._fsp--;

			// ImpPrinter.g:329:25: ( fieldVal )+
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
					// ImpPrinter.g:329:25: fieldVal
					{
					pushFollow(FOLLOW_fieldVal_in_pointsTo2314);
					fieldVal();
					state._fsp--;

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

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "fieldVal"
	// ImpPrinter.g:332:1: fieldVal : ( ^( ':' ITYPE field iVar ) | ^( ':' LTYPE dir lVar ) | ^( ':' SLTYPE dir lVar ) | ^( ':' ITYPE field 'virtual' iVar ) | ^( ':' LTYPE dir 'virtual' lVar ) );
	public final ImpPrinter.fieldVal_return fieldVal() throws RecognitionException {
		ImpPrinter.fieldVal_return retval = new ImpPrinter.fieldVal_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:333:5: ( ^( ':' ITYPE field iVar ) | ^( ':' LTYPE dir lVar ) | ^( ':' SLTYPE dir lVar ) | ^( ':' ITYPE field 'virtual' iVar ) | ^( ':' LTYPE dir 'virtual' lVar ) )
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
					// ImpPrinter.g:333:9: ^( ':' ITYPE field iVar )
					{
					match(input,89,FOLLOW_89_in_fieldVal2336); 
					match(input, Token.DOWN, null); 
					match(input,ITYPE,FOLLOW_ITYPE_in_fieldVal2338); 
					pushFollow(FOLLOW_field_in_fieldVal2340);
					field();
					state._fsp--;

					pushFollow(FOLLOW_iVar_in_fieldVal2342);
					iVar();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// ImpPrinter.g:334:7: ^( ':' LTYPE dir lVar )
					{
					match(input,89,FOLLOW_89_in_fieldVal2353); 
					match(input, Token.DOWN, null); 
					match(input,LTYPE,FOLLOW_LTYPE_in_fieldVal2355); 
					pushFollow(FOLLOW_dir_in_fieldVal2357);
					dir();
					state._fsp--;

					pushFollow(FOLLOW_lVar_in_fieldVal2359);
					lVar();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// ImpPrinter.g:335:7: ^( ':' SLTYPE dir lVar )
					{
					match(input,89,FOLLOW_89_in_fieldVal2370); 
					match(input, Token.DOWN, null); 
					match(input,SLTYPE,FOLLOW_SLTYPE_in_fieldVal2372); 
					pushFollow(FOLLOW_dir_in_fieldVal2374);
					dir();
					state._fsp--;

					pushFollow(FOLLOW_lVar_in_fieldVal2376);
					lVar();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// ImpPrinter.g:336:7: ^( ':' ITYPE field 'virtual' iVar )
					{
					match(input,89,FOLLOW_89_in_fieldVal2387); 
					match(input, Token.DOWN, null); 
					match(input,ITYPE,FOLLOW_ITYPE_in_fieldVal2389); 
					pushFollow(FOLLOW_field_in_fieldVal2391);
					field();
					state._fsp--;

					match(input,149,FOLLOW_149_in_fieldVal2393); 
					pushFollow(FOLLOW_iVar_in_fieldVal2395);
					iVar();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 5 :
					// ImpPrinter.g:337:7: ^( ':' LTYPE dir 'virtual' lVar )
					{
					match(input,89,FOLLOW_89_in_fieldVal2406); 
					match(input, Token.DOWN, null); 
					match(input,LTYPE,FOLLOW_LTYPE_in_fieldVal2408); 
					pushFollow(FOLLOW_dir_in_fieldVal2410);
					dir();
					state._fsp--;

					match(input,149,FOLLOW_149_in_fieldVal2412); 
					pushFollow(FOLLOW_lVar_in_fieldVal2414);
					lVar();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "locTerm"
	// ImpPrinter.g:340:1: locTerm returns [String value] : ( NIL | RESULTLOC | lVar | ^( OLD n= locTerm ) );
	public final ImpPrinter.locTerm_return locTerm() throws RecognitionException {
		ImpPrinter.locTerm_return retval = new ImpPrinter.locTerm_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope n =null;

		try {
			// ImpPrinter.g:341:5: ( NIL | RESULTLOC | lVar | ^( OLD n= locTerm ) )
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
					// ImpPrinter.g:341:9: NIL
					{
					match(input,NIL,FOLLOW_NIL_in_locTerm2437); 
					}
					break;
				case 2 :
					// ImpPrinter.g:342:7: RESULTLOC
					{
					match(input,RESULTLOC,FOLLOW_RESULTLOC_in_locTerm2446); 
					}
					break;
				case 3 :
					// ImpPrinter.g:343:7: lVar
					{
					pushFollow(FOLLOW_lVar_in_locTerm2455);
					lVar();
					state._fsp--;

					}
					break;
				case 4 :
					// ImpPrinter.g:344:7: ^( OLD n= locTerm )
					{
					match(input,OLD,FOLLOW_OLD_in_locTerm2464); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_locTerm_in_locTerm2468);
					n=locTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "intTerm"
	// ImpPrinter.g:347:1: intTerm : ( atomIntTerm | ^( '+' atomIntTerm atomIntTerm ) | ^( '-' atomIntTerm atomIntTerm ) | ^( '?' atomForm atomIntTerm atomIntTerm ) );
	public final ImpPrinter.intTerm_return intTerm() throws RecognitionException {
		ImpPrinter.intTerm_return retval = new ImpPrinter.intTerm_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:348:5: ( atomIntTerm | ^( '+' atomIntTerm atomIntTerm ) | ^( '-' atomIntTerm atomIntTerm ) | ^( '?' atomForm atomIntTerm atomIntTerm ) )
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
					// ImpPrinter.g:348:9: atomIntTerm
					{
					pushFollow(FOLLOW_atomIntTerm_in_intTerm2488);
					atomIntTerm();
					state._fsp--;

					}
					break;
				case 2 :
					// ImpPrinter.g:349:7: ^( '+' atomIntTerm atomIntTerm )
					{
					match(input,85,FOLLOW_85_in_intTerm2497); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_atomIntTerm_in_intTerm2499);
					atomIntTerm();
					state._fsp--;

					pushFollow(FOLLOW_atomIntTerm_in_intTerm2501);
					atomIntTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// ImpPrinter.g:350:7: ^( '-' atomIntTerm atomIntTerm )
					{
					match(input,87,FOLLOW_87_in_intTerm2511); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_atomIntTerm_in_intTerm2513);
					atomIntTerm();
					state._fsp--;

					pushFollow(FOLLOW_atomIntTerm_in_intTerm2515);
					atomIntTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// ImpPrinter.g:351:7: ^( '?' atomForm atomIntTerm atomIntTerm )
					{
					match(input,93,FOLLOW_93_in_intTerm2525); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_atomForm_in_intTerm2527);
					atomForm();
					state._fsp--;

					pushFollow(FOLLOW_atomIntTerm_in_intTerm2529);
					atomIntTerm();
					state._fsp--;

					pushFollow(FOLLOW_atomIntTerm_in_intTerm2531);
					atomIntTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "atomIntTerm"
	// ImpPrinter.g:354:1: atomIntTerm : ( ^( ATOMINT intTerm ) | INT | RESULTINT | iVar | iRec | biRec | BOT | TOP | ^( OLD intTerm ) );
	public final ImpPrinter.atomIntTerm_return atomIntTerm() throws RecognitionException {
		ImpPrinter.atomIntTerm_return retval = new ImpPrinter.atomIntTerm_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:355:5: ( ^( ATOMINT intTerm ) | INT | RESULTINT | iVar | iRec | biRec | BOT | TOP | ^( OLD intTerm ) )
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
					// ImpPrinter.g:355:9: ^( ATOMINT intTerm )
					{
					match(input,ATOMINT,FOLLOW_ATOMINT_in_atomIntTerm2550); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_intTerm_in_atomIntTerm2552);
					intTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// ImpPrinter.g:356:7: INT
					{
					match(input,INT,FOLLOW_INT_in_atomIntTerm2561); 
					}
					break;
				case 3 :
					// ImpPrinter.g:357:7: RESULTINT
					{
					match(input,RESULTINT,FOLLOW_RESULTINT_in_atomIntTerm2569); 
					}
					break;
				case 4 :
					// ImpPrinter.g:358:7: iVar
					{
					pushFollow(FOLLOW_iVar_in_atomIntTerm2577);
					iVar();
					state._fsp--;

					}
					break;
				case 5 :
					// ImpPrinter.g:359:7: iRec
					{
					pushFollow(FOLLOW_iRec_in_atomIntTerm2585);
					iRec();
					state._fsp--;

					}
					break;
				case 6 :
					// ImpPrinter.g:360:7: biRec
					{
					pushFollow(FOLLOW_biRec_in_atomIntTerm2593);
					biRec();
					state._fsp--;

					}
					break;
				case 7 :
					// ImpPrinter.g:361:7: BOT
					{
					match(input,BOT,FOLLOW_BOT_in_atomIntTerm2601); 
					}
					break;
				case 8 :
					// ImpPrinter.g:362:7: TOP
					{
					match(input,TOP,FOLLOW_TOP_in_atomIntTerm2609); 
					}
					break;
				case 9 :
					// ImpPrinter.g:363:7: ^( OLD intTerm )
					{
					match(input,OLD,FOLLOW_OLD_in_atomIntTerm2618); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_intTerm_in_atomIntTerm2620);
					intTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "lsetTerm"
	// ImpPrinter.g:366:1: lsetTerm : ( atomLsetTerm | ^( 'lsingleton' locTerm ) | ^( 'lunion' lsetTerm lsetTerm ) | ^( 'lintersection' lsetTerm lsetTerm ) | ^( 'lsetminus' lsetTerm lsetTerm ) | ^( OLD lsetTerm ) );
	public final ImpPrinter.lsetTerm_return lsetTerm() throws RecognitionException {
		ImpPrinter.lsetTerm_return retval = new ImpPrinter.lsetTerm_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:367:5: ( atomLsetTerm | ^( 'lsingleton' locTerm ) | ^( 'lunion' lsetTerm lsetTerm ) | ^( 'lintersection' lsetTerm lsetTerm ) | ^( 'lsetminus' lsetTerm lsetTerm ) | ^( OLD lsetTerm ) )
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
					// ImpPrinter.g:367:9: atomLsetTerm
					{
					pushFollow(FOLLOW_atomLsetTerm_in_lsetTerm2640);
					atomLsetTerm();
					state._fsp--;

					}
					break;
				case 2 :
					// ImpPrinter.g:368:7: ^( 'lsingleton' locTerm )
					{
					match(input,125,FOLLOW_125_in_lsetTerm2649); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_locTerm_in_lsetTerm2651);
					locTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// ImpPrinter.g:369:7: ^( 'lunion' lsetTerm lsetTerm )
					{
					match(input,128,FOLLOW_128_in_lsetTerm2661); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_lsetTerm_in_lsetTerm2663);
					lsetTerm();
					state._fsp--;

					pushFollow(FOLLOW_lsetTerm_in_lsetTerm2665);
					lsetTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// ImpPrinter.g:370:7: ^( 'lintersection' lsetTerm lsetTerm )
					{
					match(input,120,FOLLOW_120_in_lsetTerm2675); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_lsetTerm_in_lsetTerm2677);
					lsetTerm();
					state._fsp--;

					pushFollow(FOLLOW_lsetTerm_in_lsetTerm2679);
					lsetTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 5 :
					// ImpPrinter.g:371:7: ^( 'lsetminus' lsetTerm lsetTerm )
					{
					match(input,124,FOLLOW_124_in_lsetTerm2689); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_lsetTerm_in_lsetTerm2691);
					lsetTerm();
					state._fsp--;

					pushFollow(FOLLOW_lsetTerm_in_lsetTerm2693);
					lsetTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 6 :
					// ImpPrinter.g:372:7: ^( OLD lsetTerm )
					{
					match(input,OLD,FOLLOW_OLD_in_lsetTerm2703); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_lsetTerm_in_lsetTerm2705);
					lsetTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "atomLsetTerm"
	// ImpPrinter.g:375:1: atomLsetTerm : ( 'emptylset' | lsVar | rec );
	public final ImpPrinter.atomLsetTerm_return atomLsetTerm() throws RecognitionException {
		ImpPrinter.atomLsetTerm_return retval = new ImpPrinter.atomLsetTerm_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:376:5: ( 'emptylset' | lsVar | rec )
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
					// ImpPrinter.g:376:9: 'emptylset'
					{
					match(input,103,FOLLOW_103_in_atomLsetTerm2723); 
					}
					break;
				case 2 :
					// ImpPrinter.g:377:7: lsVar
					{
					pushFollow(FOLLOW_lsVar_in_atomLsetTerm2731);
					lsVar();
					state._fsp--;

					}
					break;
				case 3 :
					// ImpPrinter.g:378:7: rec
					{
					pushFollow(FOLLOW_rec_in_atomLsetTerm2739);
					rec();
					state._fsp--;

					}
					break;

			}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "setTerm"
	// ImpPrinter.g:381:1: setTerm : ( atomSetTerm | ^( 'singleton' intTerm ) | ^( 'union' setTerm setTerm ) | ^( 'intersection' setTerm setTerm ) | ^( 'setminus' setTerm setTerm ) | ^( OLD setTerm ) );
	public final ImpPrinter.setTerm_return setTerm() throws RecognitionException {
		ImpPrinter.setTerm_return retval = new ImpPrinter.setTerm_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:382:5: ( atomSetTerm | ^( 'singleton' intTerm ) | ^( 'union' setTerm setTerm ) | ^( 'intersection' setTerm setTerm ) | ^( 'setminus' setTerm setTerm ) | ^( OLD setTerm ) )
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
					// ImpPrinter.g:382:9: atomSetTerm
					{
					pushFollow(FOLLOW_atomSetTerm_in_setTerm2758);
					atomSetTerm();
					state._fsp--;

					}
					break;
				case 2 :
					// ImpPrinter.g:383:7: ^( 'singleton' intTerm )
					{
					match(input,147,FOLLOW_147_in_setTerm2767); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_intTerm_in_setTerm2769);
					intTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// ImpPrinter.g:384:7: ^( 'union' setTerm setTerm )
					{
					match(input,148,FOLLOW_148_in_setTerm2779); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_setTerm_in_setTerm2781);
					setTerm();
					state._fsp--;

					pushFollow(FOLLOW_setTerm_in_setTerm2783);
					setTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// ImpPrinter.g:385:7: ^( 'intersection' setTerm setTerm )
					{
					match(input,113,FOLLOW_113_in_setTerm2793); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_setTerm_in_setTerm2795);
					setTerm();
					state._fsp--;

					pushFollow(FOLLOW_setTerm_in_setTerm2797);
					setTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 5 :
					// ImpPrinter.g:386:7: ^( 'setminus' setTerm setTerm )
					{
					match(input,145,FOLLOW_145_in_setTerm2807); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_setTerm_in_setTerm2809);
					setTerm();
					state._fsp--;

					pushFollow(FOLLOW_setTerm_in_setTerm2811);
					setTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 6 :
					// ImpPrinter.g:387:7: ^( OLD setTerm )
					{
					match(input,OLD,FOLLOW_OLD_in_setTerm2821); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_setTerm_in_setTerm2823);
					setTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "atomSetTerm"
	// ImpPrinter.g:390:1: atomSetTerm : ( 'emptyset' | sVar | rec );
	public final ImpPrinter.atomSetTerm_return atomSetTerm() throws RecognitionException {
		ImpPrinter.atomSetTerm_return retval = new ImpPrinter.atomSetTerm_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:391:5: ( 'emptyset' | sVar | rec )
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
					// ImpPrinter.g:391:9: 'emptyset'
					{
					match(input,105,FOLLOW_105_in_atomSetTerm2841); 
					}
					break;
				case 2 :
					// ImpPrinter.g:392:7: sVar
					{
					pushFollow(FOLLOW_sVar_in_atomSetTerm2849);
					sVar();
					state._fsp--;

					}
					break;
				case 3 :
					// ImpPrinter.g:393:7: rec
					{
					pushFollow(FOLLOW_rec_in_atomSetTerm2857);
					rec();
					state._fsp--;

					}
					break;

			}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "msetTerm"
	// ImpPrinter.g:396:1: msetTerm : ( atomMsetTerm | ^( 'msingleton' intTerm ) | ^( 'munion' msetTerm msetTerm ) | ^( 'mintersection' msetTerm msetTerm ) | ^( 'msetminus' msetTerm msetTerm ) | ^( OLD msetTerm ) );
	public final ImpPrinter.msetTerm_return msetTerm() throws RecognitionException {
		ImpPrinter.msetTerm_return retval = new ImpPrinter.msetTerm_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:397:5: ( atomMsetTerm | ^( 'msingleton' intTerm ) | ^( 'munion' msetTerm msetTerm ) | ^( 'mintersection' msetTerm msetTerm ) | ^( 'msetminus' msetTerm msetTerm ) | ^( OLD msetTerm ) )
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
					// ImpPrinter.g:397:9: atomMsetTerm
					{
					pushFollow(FOLLOW_atomMsetTerm_in_msetTerm2876);
					atomMsetTerm();
					state._fsp--;

					}
					break;
				case 2 :
					// ImpPrinter.g:398:7: ^( 'msingleton' intTerm )
					{
					match(input,135,FOLLOW_135_in_msetTerm2885); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_intTerm_in_msetTerm2887);
					intTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// ImpPrinter.g:399:7: ^( 'munion' msetTerm msetTerm )
					{
					match(input,136,FOLLOW_136_in_msetTerm2897); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_msetTerm_in_msetTerm2899);
					msetTerm();
					state._fsp--;

					pushFollow(FOLLOW_msetTerm_in_msetTerm2901);
					msetTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// ImpPrinter.g:400:7: ^( 'mintersection' msetTerm msetTerm )
					{
					match(input,131,FOLLOW_131_in_msetTerm2911); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_msetTerm_in_msetTerm2913);
					msetTerm();
					state._fsp--;

					pushFollow(FOLLOW_msetTerm_in_msetTerm2915);
					msetTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 5 :
					// ImpPrinter.g:401:7: ^( 'msetminus' msetTerm msetTerm )
					{
					match(input,134,FOLLOW_134_in_msetTerm2925); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_msetTerm_in_msetTerm2927);
					msetTerm();
					state._fsp--;

					pushFollow(FOLLOW_msetTerm_in_msetTerm2929);
					msetTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 6 :
					// ImpPrinter.g:402:7: ^( OLD msetTerm )
					{
					match(input,OLD,FOLLOW_OLD_in_msetTerm2939); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_msetTerm_in_msetTerm2941);
					msetTerm();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "atomMsetTerm"
	// ImpPrinter.g:405:1: atomMsetTerm : ( 'emptymset' | msVar | rec );
	public final ImpPrinter.atomMsetTerm_return atomMsetTerm() throws RecognitionException {
		ImpPrinter.atomMsetTerm_return retval = new ImpPrinter.atomMsetTerm_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:406:5: ( 'emptymset' | msVar | rec )
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
					// ImpPrinter.g:406:9: 'emptymset'
					{
					match(input,104,FOLLOW_104_in_atomMsetTerm2959); 
					}
					break;
				case 2 :
					// ImpPrinter.g:407:7: msVar
					{
					pushFollow(FOLLOW_msVar_in_atomMsetTerm2967);
					msVar();
					state._fsp--;

					}
					break;
				case 3 :
					// ImpPrinter.g:408:7: rec
					{
					pushFollow(FOLLOW_rec_in_atomMsetTerm2975);
					rec();
					state._fsp--;

					}
					break;

			}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "relRec"
	// ImpPrinter.g:411:1: relRec : ^( RELREC ID locTerm p= locTerm ) ;
	public final ImpPrinter.relRec_return relRec() throws RecognitionException {
		ImpPrinter.relRec_return retval = new ImpPrinter.relRec_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope p =null;

		try {
			// ImpPrinter.g:412:5: ( ^( RELREC ID locTerm p= locTerm ) )
			// ImpPrinter.g:412:9: ^( RELREC ID locTerm p= locTerm )
			{
			match(input,RELREC,FOLLOW_RELREC_in_relRec2995); 
			match(input, Token.DOWN, null); 
			match(input,ID,FOLLOW_ID_in_relRec2997); 
			pushFollow(FOLLOW_locTerm_in_relRec2999);
			locTerm();
			state._fsp--;

			pushFollow(FOLLOW_locTerm_in_relRec3003);
			p=locTerm();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "rec"
	// ImpPrinter.g:415:1: rec : ^( REC ID locTerm ) ;
	public final ImpPrinter.rec_return rec() throws RecognitionException {
		ImpPrinter.rec_return retval = new ImpPrinter.rec_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:416:5: ( ^( REC ID locTerm ) )
			// ImpPrinter.g:416:9: ^( REC ID locTerm )
			{
			match(input,REC,FOLLOW_REC_in_rec3024); 
			match(input, Token.DOWN, null); 
			match(input,ID,FOLLOW_ID_in_rec3026); 
			pushFollow(FOLLOW_locTerm_in_rec3028);
			locTerm();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "iRec"
	// ImpPrinter.g:419:1: iRec : ^( IREC ID locTerm ) ;
	public final ImpPrinter.iRec_return iRec() throws RecognitionException {
		ImpPrinter.iRec_return retval = new ImpPrinter.iRec_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:420:5: ( ^( IREC ID locTerm ) )
			// ImpPrinter.g:420:9: ^( IREC ID locTerm )
			{
			match(input,IREC,FOLLOW_IREC_in_iRec3049); 
			match(input, Token.DOWN, null); 
			match(input,ID,FOLLOW_ID_in_iRec3051); 
			pushFollow(FOLLOW_locTerm_in_iRec3053);
			locTerm();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "biRec"
	// ImpPrinter.g:423:1: biRec : ^( BIREC ID locTerm p= locTerm ) ;
	public final ImpPrinter.biRec_return biRec() throws RecognitionException {
		ImpPrinter.biRec_return retval = new ImpPrinter.biRec_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope p =null;

		try {
			// ImpPrinter.g:424:5: ( ^( BIREC ID locTerm p= locTerm ) )
			// ImpPrinter.g:424:9: ^( BIREC ID locTerm p= locTerm )
			{
			match(input,BIREC,FOLLOW_BIREC_in_biRec3072); 
			match(input, Token.DOWN, null); 
			match(input,ID,FOLLOW_ID_in_biRec3074); 
			pushFollow(FOLLOW_locTerm_in_biRec3076);
			locTerm();
			state._fsp--;

			pushFollow(FOLLOW_locTerm_in_biRec3080);
			p=locTerm();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "sRec"
	// ImpPrinter.g:427:1: sRec : ^( SREC ID locTerm ) ;
	public final ImpPrinter.sRec_return sRec() throws RecognitionException {
		ImpPrinter.sRec_return retval = new ImpPrinter.sRec_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:428:5: ( ^( SREC ID locTerm ) )
			// ImpPrinter.g:428:9: ^( SREC ID locTerm )
			{
			match(input,SREC,FOLLOW_SREC_in_sRec3101); 
			match(input, Token.DOWN, null); 
			match(input,ID,FOLLOW_ID_in_sRec3103); 
			pushFollow(FOLLOW_locTerm_in_sRec3105);
			locTerm();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "bsRec"
	// ImpPrinter.g:431:1: bsRec : ^( BSREC ID locTerm p= locTerm ) ;
	public final ImpPrinter.bsRec_return bsRec() throws RecognitionException {
		ImpPrinter.bsRec_return retval = new ImpPrinter.bsRec_return();
		retval.start = input.LT(1);

		TreeRuleReturnScope p =null;

		try {
			// ImpPrinter.g:432:5: ( ^( BSREC ID locTerm p= locTerm ) )
			// ImpPrinter.g:432:9: ^( BSREC ID locTerm p= locTerm )
			{
			match(input,BSREC,FOLLOW_BSREC_in_bsRec3126); 
			match(input, Token.DOWN, null); 
			match(input,ID,FOLLOW_ID_in_bsRec3128); 
			pushFollow(FOLLOW_locTerm_in_bsRec3130);
			locTerm();
			state._fsp--;

			pushFollow(FOLLOW_locTerm_in_bsRec3134);
			p=locTerm();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "lsRec"
	// ImpPrinter.g:435:1: lsRec : ^( LSREC ID locTerm ) ;
	public final ImpPrinter.lsRec_return lsRec() throws RecognitionException {
		ImpPrinter.lsRec_return retval = new ImpPrinter.lsRec_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:436:5: ( ^( LSREC ID locTerm ) )
			// ImpPrinter.g:436:9: ^( LSREC ID locTerm )
			{
			match(input,LSREC,FOLLOW_LSREC_in_lsRec3155); 
			match(input, Token.DOWN, null); 
			match(input,ID,FOLLOW_ID_in_lsRec3157); 
			pushFollow(FOLLOW_locTerm_in_lsRec3159);
			locTerm();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "msRec"
	// ImpPrinter.g:439:1: msRec : ^( MSREC ID locTerm ) ;
	public final ImpPrinter.msRec_return msRec() throws RecognitionException {
		ImpPrinter.msRec_return retval = new ImpPrinter.msRec_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:440:5: ( ^( MSREC ID locTerm ) )
			// ImpPrinter.g:440:9: ^( MSREC ID locTerm )
			{
			match(input,MSREC,FOLLOW_MSREC_in_msRec3178); 
			match(input, Token.DOWN, null); 
			match(input,ID,FOLLOW_ID_in_msRec3180); 
			pushFollow(FOLLOW_locTerm_in_msRec3182);
			locTerm();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "intExp"
	// ImpPrinter.g:443:1: intExp : ( atomIntExp | ^( ( '+' | '-' ) intExp intExp ) );
	public final ImpPrinter.intExp_return intExp() throws RecognitionException {
		ImpPrinter.intExp_return retval = new ImpPrinter.intExp_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:444:3: ( atomIntExp | ^( ( '+' | '-' ) intExp intExp ) )
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
					// ImpPrinter.g:444:7: atomIntExp
					{
					pushFollow(FOLLOW_atomIntExp_in_intExp3200);
					atomIntExp();
					state._fsp--;

					}
					break;
				case 2 :
					// ImpPrinter.g:445:7: ^( ( '+' | '-' ) intExp intExp )
					{
					if ( input.LA(1)==85||input.LA(1)==87 ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_intExp_in_intExp3218);
					intExp();
					state._fsp--;

					pushFollow(FOLLOW_intExp_in_intExp3220);
					intExp();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "atomIntExp"
	// ImpPrinter.g:448:1: atomIntExp : ( ^( CONS INT ) | iVar );
	public final ImpPrinter.atomIntExp_return atomIntExp() throws RecognitionException {
		ImpPrinter.atomIntExp_return retval = new ImpPrinter.atomIntExp_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:449:5: ( ^( CONS INT ) | iVar )
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
					// ImpPrinter.g:449:9: ^( CONS INT )
					{
					match(input,CONS,FOLLOW_CONS_in_atomIntExp3241); 
					match(input, Token.DOWN, null); 
					match(input,INT,FOLLOW_INT_in_atomIntExp3243); 
					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// ImpPrinter.g:450:7: iVar
					{
					pushFollow(FOLLOW_iVar_in_atomIntExp3252);
					iVar();
					state._fsp--;

					}
					break;

			}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "locExp"
	// ImpPrinter.g:453:1: locExp : ( NIL | NEW | lVar );
	public final ImpPrinter.locExp_return locExp() throws RecognitionException {
		ImpPrinter.locExp_return retval = new ImpPrinter.locExp_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:454:5: ( NIL | NEW | lVar )
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
					// ImpPrinter.g:454:9: NIL
					{
					match(input,NIL,FOLLOW_NIL_in_locExp3269); 
					}
					break;
				case 2 :
					// ImpPrinter.g:455:7: NEW
					{
					match(input,NEW,FOLLOW_NEW_in_locExp3277); 
					}
					break;
				case 3 :
					// ImpPrinter.g:456:7: lVar
					{
					pushFollow(FOLLOW_lVar_in_locExp3285);
					lVar();
					state._fsp--;

					}
					break;

			}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "boolExp"
	// ImpPrinter.g:459:1: boolExp : ( atomBoolExp | ^( ( AND | OR | EQUALS ) atomBoolExp atomBoolExp ) | ^( NOT atomBoolExp ) );
	public final ImpPrinter.boolExp_return boolExp() throws RecognitionException {
		ImpPrinter.boolExp_return retval = new ImpPrinter.boolExp_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:460:5: ( atomBoolExp | ^( ( AND | OR | EQUALS ) atomBoolExp atomBoolExp ) | ^( NOT atomBoolExp ) )
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
					// ImpPrinter.g:460:9: atomBoolExp
					{
					pushFollow(FOLLOW_atomBoolExp_in_boolExp3302);
					atomBoolExp();
					state._fsp--;

					}
					break;
				case 2 :
					// ImpPrinter.g:461:7: ^( ( AND | OR | EQUALS ) atomBoolExp atomBoolExp )
					{
					if ( input.LA(1)==AND||input.LA(1)==EQUALS||input.LA(1)==OR ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_atomBoolExp_in_boolExp3324);
					atomBoolExp();
					state._fsp--;

					pushFollow(FOLLOW_atomBoolExp_in_boolExp3326);
					atomBoolExp();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// ImpPrinter.g:462:7: ^( NOT atomBoolExp )
					{
					match(input,NOT,FOLLOW_NOT_in_boolExp3337); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_atomBoolExp_in_boolExp3339);
					atomBoolExp();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "atomBoolExp"
	// ImpPrinter.g:465:1: atomBoolExp : ( ^( ATOMBOOL boolExp ) | ^( LOCEQ locExp locExp ) | ^( INTEQ intExp intExp ) | ^( '<' intExp intExp ) | ^( '<=' intExp intExp ) | TRUE | bVar | ^( 'cond' atomIntExp ) );
	public final ImpPrinter.atomBoolExp_return atomBoolExp() throws RecognitionException {
		ImpPrinter.atomBoolExp_return retval = new ImpPrinter.atomBoolExp_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:466:5: ( ^( ATOMBOOL boolExp ) | ^( LOCEQ locExp locExp ) | ^( INTEQ intExp intExp ) | ^( '<' intExp intExp ) | ^( '<=' intExp intExp ) | TRUE | bVar | ^( 'cond' atomIntExp ) )
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
					// ImpPrinter.g:466:7: ^( ATOMBOOL boolExp )
					{
					match(input,ATOMBOOL,FOLLOW_ATOMBOOL_in_atomBoolExp3358); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_boolExp_in_atomBoolExp3360);
					boolExp();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// ImpPrinter.g:467:5: ^( LOCEQ locExp locExp )
					{
					match(input,LOCEQ,FOLLOW_LOCEQ_in_atomBoolExp3368); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_locExp_in_atomBoolExp3370);
					locExp();
					state._fsp--;

					pushFollow(FOLLOW_locExp_in_atomBoolExp3372);
					locExp();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 3 :
					// ImpPrinter.g:468:5: ^( INTEQ intExp intExp )
					{
					match(input,INTEQ,FOLLOW_INTEQ_in_atomBoolExp3380); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_intExp_in_atomBoolExp3382);
					intExp();
					state._fsp--;

					pushFollow(FOLLOW_intExp_in_atomBoolExp3384);
					intExp();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 4 :
					// ImpPrinter.g:469:5: ^( '<' intExp intExp )
					{
					match(input,91,FOLLOW_91_in_atomBoolExp3392); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_intExp_in_atomBoolExp3394);
					intExp();
					state._fsp--;

					pushFollow(FOLLOW_intExp_in_atomBoolExp3396);
					intExp();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 5 :
					// ImpPrinter.g:470:5: ^( '<=' intExp intExp )
					{
					match(input,92,FOLLOW_92_in_atomBoolExp3404); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_intExp_in_atomBoolExp3406);
					intExp();
					state._fsp--;

					pushFollow(FOLLOW_intExp_in_atomBoolExp3408);
					intExp();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;
				case 6 :
					// ImpPrinter.g:471:5: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_atomBoolExp3415); 
					}
					break;
				case 7 :
					// ImpPrinter.g:472:5: bVar
					{
					pushFollow(FOLLOW_bVar_in_atomBoolExp3421);
					bVar();
					state._fsp--;

					}
					break;
				case 8 :
					// ImpPrinter.g:473:5: ^( 'cond' atomIntExp )
					{
					match(input,99,FOLLOW_99_in_atomBoolExp3428); 
					match(input, Token.DOWN, null); 
					pushFollow(FOLLOW_atomIntExp_in_atomBoolExp3430);
					atomIntExp();
					state._fsp--;

					match(input, Token.UP, null); 

					}
					break;

			}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "dirDeref"
	// ImpPrinter.g:476:1: dirDeref : ^( '.' lVar dir ) ;
	public final ImpPrinter.dirDeref_return dirDeref() throws RecognitionException {
		ImpPrinter.dirDeref_return retval = new ImpPrinter.dirDeref_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:477:5: ( ^( '.' lVar dir ) )
			// ImpPrinter.g:477:9: ^( '.' lVar dir )
			{
			match(input,88,FOLLOW_88_in_dirDeref3451); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_lVar_in_dirDeref3453);
			lVar();
			state._fsp--;

			pushFollow(FOLLOW_dir_in_dirDeref3455);
			dir();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "dataDeref"
	// ImpPrinter.g:480:1: dataDeref : ^( '.' lVar field ) ;
	public final ImpPrinter.dataDeref_return dataDeref() throws RecognitionException {
		ImpPrinter.dataDeref_return retval = new ImpPrinter.dataDeref_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:481:5: ( ^( '.' lVar field ) )
			// ImpPrinter.g:481:9: ^( '.' lVar field )
			{
			match(input,88,FOLLOW_88_in_dataDeref3474); 
			match(input, Token.DOWN, null); 
			pushFollow(FOLLOW_lVar_in_dataDeref3476);
			lVar();
			state._fsp--;

			pushFollow(FOLLOW_field_in_dataDeref3478);
			field();
			state._fsp--;

			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "iVar"
	// ImpPrinter.g:484:1: iVar : ( ^( IVAR ID ) | ^( IVAR QMARK ) );
	public final ImpPrinter.iVar_return iVar() throws RecognitionException {
		ImpPrinter.iVar_return retval = new ImpPrinter.iVar_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:485:5: ( ^( IVAR ID ) | ^( IVAR QMARK ) )
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
					// ImpPrinter.g:485:9: ^( IVAR ID )
					{
					match(input,IVAR,FOLLOW_IVAR_in_iVar3499); 
					match(input, Token.DOWN, null); 
					match(input,ID,FOLLOW_ID_in_iVar3501); 
					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// ImpPrinter.g:486:8: ^( IVAR QMARK )
					{
					match(input,IVAR,FOLLOW_IVAR_in_iVar3512); 
					match(input, Token.DOWN, null); 
					match(input,QMARK,FOLLOW_QMARK_in_iVar3514); 
					match(input, Token.UP, null); 

					}
					break;

			}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "lVar"
	// ImpPrinter.g:489:1: lVar : ( ^( LVAR ID ) | ^( LVAR QQMARK ) );
	public final ImpPrinter.lVar_return lVar() throws RecognitionException {
		ImpPrinter.lVar_return retval = new ImpPrinter.lVar_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:490:5: ( ^( LVAR ID ) | ^( LVAR QQMARK ) )
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
					// ImpPrinter.g:490:9: ^( LVAR ID )
					{
					match(input,LVAR,FOLLOW_LVAR_in_lVar3535); 
					match(input, Token.DOWN, null); 
					match(input,ID,FOLLOW_ID_in_lVar3537); 
					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// ImpPrinter.g:491:8: ^( LVAR QQMARK )
					{
					match(input,LVAR,FOLLOW_LVAR_in_lVar3548); 
					match(input, Token.DOWN, null); 
					match(input,QQMARK,FOLLOW_QQMARK_in_lVar3550); 
					match(input, Token.UP, null); 

					}
					break;

			}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "bVar"
	// ImpPrinter.g:494:1: bVar : ( ^( BVAR ID ) | ^( BVAR QMARK ) );
	public final ImpPrinter.bVar_return bVar() throws RecognitionException {
		ImpPrinter.bVar_return retval = new ImpPrinter.bVar_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:495:5: ( ^( BVAR ID ) | ^( BVAR QMARK ) )
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
					// ImpPrinter.g:495:9: ^( BVAR ID )
					{
					match(input,BVAR,FOLLOW_BVAR_in_bVar3575); 
					match(input, Token.DOWN, null); 
					match(input,ID,FOLLOW_ID_in_bVar3577); 
					match(input, Token.UP, null); 

					}
					break;
				case 2 :
					// ImpPrinter.g:496:8: ^( BVAR QMARK )
					{
					match(input,BVAR,FOLLOW_BVAR_in_bVar3588); 
					match(input, Token.DOWN, null); 
					match(input,QMARK,FOLLOW_QMARK_in_bVar3590); 
					match(input, Token.UP, null); 

					}
					break;

			}
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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "sVar"
	// ImpPrinter.g:499:1: sVar : ^( SVAR ID ) ;
	public final ImpPrinter.sVar_return sVar() throws RecognitionException {
		ImpPrinter.sVar_return retval = new ImpPrinter.sVar_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:500:5: ( ^( SVAR ID ) )
			// ImpPrinter.g:500:9: ^( SVAR ID )
			{
			match(input,SVAR,FOLLOW_SVAR_in_sVar3611); 
			match(input, Token.DOWN, null); 
			match(input,ID,FOLLOW_ID_in_sVar3613); 
			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "lsVar"
	// ImpPrinter.g:503:1: lsVar : ^( LSVAR ID ) ;
	public final ImpPrinter.lsVar_return lsVar() throws RecognitionException {
		ImpPrinter.lsVar_return retval = new ImpPrinter.lsVar_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:504:5: ( ^( LSVAR ID ) )
			// ImpPrinter.g:504:9: ^( LSVAR ID )
			{
			match(input,LSVAR,FOLLOW_LSVAR_in_lsVar3638); 
			match(input, Token.DOWN, null); 
			match(input,ID,FOLLOW_ID_in_lsVar3640); 
			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "msVar"
	// ImpPrinter.g:507:1: msVar : ^( MSVAR ID ) ;
	public final ImpPrinter.msVar_return msVar() throws RecognitionException {
		ImpPrinter.msVar_return retval = new ImpPrinter.msVar_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:508:5: ( ^( MSVAR ID ) )
			// ImpPrinter.g:508:9: ^( MSVAR ID )
			{
			match(input,MSVAR,FOLLOW_MSVAR_in_msVar3661); 
			match(input, Token.DOWN, null); 
			match(input,ID,FOLLOW_ID_in_msVar3663); 
			match(input, Token.UP, null); 

			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "dir"
	// ImpPrinter.g:511:1: dir : ( ID | QMARK );
	public final ImpPrinter.dir_return dir() throws RecognitionException {
		ImpPrinter.dir_return retval = new ImpPrinter.dir_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:512:5: ( ID | QMARK )
			// ImpPrinter.g:
			{
			if ( input.LA(1)==ID||input.LA(1)==QMARK ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "field"
	// ImpPrinter.g:516:1: field : ID ;
	public final ImpPrinter.field_return field() throws RecognitionException {
		ImpPrinter.field_return retval = new ImpPrinter.field_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:517:5: ( ID )
			// ImpPrinter.g:517:9: ID
			{
			match(input,ID,FOLLOW_ID_in_field3712); 
			}

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
		public StringTemplate st;
		public Object getTemplate() { return st; }
		public String toString() { return st==null?null:st.toString(); }
	};


	// $ANTLR start "func"
	// ImpPrinter.g:520:1: func : ID ;
	public final ImpPrinter.func_return func() throws RecognitionException {
		ImpPrinter.func_return retval = new ImpPrinter.func_return();
		retval.start = input.LT(1);

		try {
			// ImpPrinter.g:521:5: ( ID )
			// ImpPrinter.g:521:9: ID
			{
			match(input,ID,FOLLOW_ID_in_func3729); 
			}

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



	public static final BitSet FOLLOW_PROG_in_program60 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_recDecl_in_program62 = new BitSet(new long[]{0x0000804000008008L,0x0801080300000000L,0x0000000000004620L});
	public static final BitSet FOLLOW_formDecl_in_program65 = new BitSet(new long[]{0x0000804000008008L,0x0000080000000000L});
	public static final BitSet FOLLOW_methodDef_in_program70 = new BitSet(new long[]{0x0000804000008008L});
	public static final BitSet FOLLOW_predDecl_in_recDecl117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_intFuncDecl_in_recDecl129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binIntFuncDecl_in_recDecl137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lsetFuncDecl_in_recDecl149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_setFuncDecl_in_recDecl161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_msetFuncDecl_in_recDecl173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relDecl_in_recDecl183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binSetFuncDecl_in_recDecl191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_138_in_relDecl217 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_relDecl223 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_relDecl231 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_relDecl239 = new BitSet(new long[]{0x08881E1F45890100L,0xC0C0000018020587L,0x0000000001018000L});
	public static final BitSet FOLLOW_formula_in_relDecl247 = new BitSet(new long[]{0x08881E1F45890108L,0xC0C0000018020587L,0x0000000001018000L});
	public static final BitSet FOLLOW_formula_in_relDecl256 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_137_in_predDecl283 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_predDecl289 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_predDecl295 = new BitSet(new long[]{0x08881E1F45890100L,0xC0C0000018020587L,0x0000000001018000L});
	public static final BitSet FOLLOW_formula_in_predDecl303 = new BitSet(new long[]{0x08881E1F45890108L,0xC0C0000018020587L,0x0000000001018000L});
	public static final BitSet FOLLOW_formula_in_predDecl312 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_112_in_intFuncDecl339 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_intFuncDecl345 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_intFuncDecl351 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_intDef_in_intFuncDecl359 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_96_in_binIntFuncDecl384 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_binIntFuncDecl390 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_binIntFuncDecl398 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_binIntFuncDecl406 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_intDef_in_binIntFuncDecl414 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_100_in_intDef439 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_intCase_in_intDef441 = new BitSet(new long[]{0x080000A080003200L,0x0000000420A10008L});
	public static final BitSet FOLLOW_intTerm_in_intDef444 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_98_in_intCase463 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_formula_in_intCase465 = new BitSet(new long[]{0x080000A080003200L,0x0000000020A10008L});
	public static final BitSet FOLLOW_intTerm_in_intCase467 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_123_in_lsetFuncDecl488 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_lsetFuncDecl494 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_lsetFuncDecl500 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_lsetDef_in_lsetFuncDecl508 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_100_in_lsetDef533 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lsetCase_in_lsetDef535 = new BitSet(new long[]{0x0800400000000000L,0x3100008400000001L,0x0000000000000001L});
	public static final BitSet FOLLOW_lsetTerm_in_lsetDef538 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_98_in_lsetCase557 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_formula_in_lsetCase559 = new BitSet(new long[]{0x0800400000000000L,0x3100008000000001L,0x0000000000000001L});
	public static final BitSet FOLLOW_lsetTerm_in_lsetCase561 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_142_in_setFuncDecl582 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_setFuncDecl588 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_setFuncDecl594 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_setDef_in_setFuncDecl602 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_97_in_binSetFuncDecl627 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_binSetFuncDecl633 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_binSetFuncDecl641 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_binSetFuncDecl649 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_setDef_in_binSetFuncDecl657 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_100_in_setDef682 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_setCase_in_setDef684 = new BitSet(new long[]{0x0800000000000000L,0x0002020400008001L,0x00000000001A0000L});
	public static final BitSet FOLLOW_setTerm_in_setDef687 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_98_in_setCase706 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_formula_in_setCase708 = new BitSet(new long[]{0x0800000000000000L,0x0002020000008001L,0x00000000001A0000L});
	public static final BitSet FOLLOW_setTerm_in_setCase710 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_133_in_msetFuncDecl731 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_msetFuncDecl737 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_msetFuncDecl743 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_msetDef_in_msetFuncDecl751 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_100_in_msetDef776 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_msetCase_in_msetDef778 = new BitSet(new long[]{0x0820000000000000L,0x0000010400000001L,0x00000000000001C8L});
	public static final BitSet FOLLOW_msetTerm_in_msetDef781 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_98_in_msetCase800 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_formula_in_msetCase802 = new BitSet(new long[]{0x0820000000000000L,0x0000010000000001L,0x00000000000001C8L});
	public static final BitSet FOLLOW_msetTerm_in_msetCase804 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_107_in_formDecl821 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_formDecl823 = new BitSet(new long[]{0x08881E1F45890100L,0xC0C0000018020587L,0x0000000001018000L});
	public static final BitSet FOLLOW_formula_in_formDecl831 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_type_in_methodDef850 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_methodDef859 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_methodArgs_in_methodDef868 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_requires_in_methodDef877 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_ensures_in_methodDef886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_methodBody_in_methodDef896 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ARGS_in_methodArgs935 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_arg_in_methodArgs946 = new BitSet(new long[]{0x0000804000008008L});
	public static final BitSet FOLLOW_ITYPE_in_arg975 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_iVar_in_arg977 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LTYPE_in_arg987 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lVar_in_arg989 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BTYPE_in_arg999 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_bVar_in_arg1001 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_139_in_requires1057 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_formula_in_requires1061 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_106_in_ensures1080 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_formula_in_ensures1084 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SEQ_in_methodBody1110 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_methodBody1112 = new BitSet(new long[]{0x00440000304004C8L,0x0200800000004040L,0x0000000000440000L});
	public static final BitSet FOLLOW_whileLoop_in_statement1138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditional_in_statement1142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_statement1146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ATOMSTMT_in_statement1151 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_methodBody_in_statement1153 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_functionCall_in_mainBody1183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileLoop_in_mainBody1193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_150_in_whileLoop1219 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_boolExp_in_whileLoop1221 = new BitSet(new long[]{0x00440000304004C0L,0x0200800000004040L,0x0000000000440000L});
	public static final BitSet FOLLOW_statement_in_whileLoop1223 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_121_in_whileLoop1235 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_whileLoop1237 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_146_in_whileLoop1249 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_whileLoop1251 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_111_in_conditional1278 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_boolExp_in_conditional1281 = new BitSet(new long[]{0x00440000304004C0L,0x0200800000004040L,0x0000000000440000L});
	public static final BitSet FOLLOW_statement_in_conditional1283 = new BitSet(new long[]{0x0000000000000008L,0x0000004000000000L});
	public static final BitSet FOLLOW_el_in_conditional1285 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_102_in_el1313 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_statement_in_el1315 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_assignment_in_command1334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mutation_in_command1342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_malloc_in_command1350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_free_in_command1358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assume_in_command1366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionCall_in_command1374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ret_in_command1382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unknownStmt_in_command1390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STMT_in_unknownStmt1408 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomIntExp_in_unknownStmt1410 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSGN_in_assignment1431 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ITYPE_in_assignment1433 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_iVar_in_assignment1435 = new BitSet(new long[]{0x0000008000200000L,0x0000000000A00000L});
	public static final BitSet FOLLOW_intExp_in_assignment1437 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSGN_in_assignment1449 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LTYPE_in_assignment1451 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_assignment1453 = new BitSet(new long[]{0x0301000000000000L});
	public static final BitSet FOLLOW_locExp_in_assignment1455 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSGN_in_assignment1467 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_BTYPE_in_assignment1469 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_bVar_in_assignment1471 = new BitSet(new long[]{0x1400020102010110L,0x0000000818020000L});
	public static final BitSet FOLLOW_boolExp_in_assignment1473 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DEREFASSGN_in_assignment1485 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ITYPE_in_assignment1487 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_iVar_in_assignment1489 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_dataDeref_in_assignment1491 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DEREFASSGN_in_assignment1503 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LTYPE_in_assignment1505 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_assignment1507 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_dirDeref_in_assignment1509 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MUTATE_in_mutation1531 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LTYPE_in_mutation1533 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_dirDeref_in_mutation1535 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_mutation1537 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MUTATE_in_mutation1547 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ITYPE_in_mutation1549 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_dataDeref_in_mutation1551 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_iVar_in_mutation1553 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RET_in_ret1576 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LTYPE_in_ret1578 = new BitSet(new long[]{0x0301000000000000L});
	public static final BitSet FOLLOW_locExp_in_ret1580 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RET_in_ret1590 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ITYPE_in_ret1592 = new BitSet(new long[]{0x0000008000200000L});
	public static final BitSet FOLLOW_atomIntExp_in_ret1594 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_RET_in_ret1604 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_BTYPE_in_ret1606 = new BitSet(new long[]{0x0000020100010100L,0x0000000818020000L});
	public static final BitSet FOLLOW_atomBoolExp_in_ret1608 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MALLOC_in_malloc1629 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lVar_in_malloc1631 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_FREE_in_free1652 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lVar_in_free1654 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ASSUME_in_assume1673 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_boolExp_in_assume1675 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_func_in_functionCall1696 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LTYPE_in_functionCall1698 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_functionCall1700 = new BitSet(new long[]{0x0001008000000000L});
	public static final BitSet FOLLOW_vars_in_functionCall1702 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_func_in_functionCall1712 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ITYPE_in_functionCall1714 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_iVar_in_functionCall1716 = new BitSet(new long[]{0x0001008000000000L});
	public static final BitSet FOLLOW_vars_in_functionCall1718 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_func_in_functionCall1728 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_BTYPE_in_functionCall1730 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_bVar_in_functionCall1732 = new BitSet(new long[]{0x0001008000000000L});
	public static final BitSet FOLLOW_vars_in_functionCall1734 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_lVar_in_vars1756 = new BitSet(new long[]{0x0001008000000002L});
	public static final BitSet FOLLOW_iVar_in_vars1760 = new BitSet(new long[]{0x0001008000000002L});
	public static final BitSet FOLLOW_LVARS_in_lVars1781 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lVar_in_lVars1784 = new BitSet(new long[]{0x0001000000000008L});
	public static final BitSet FOLLOW_IVARS_in_iVars1805 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_iVar_in_iVars1807 = new BitSet(new long[]{0x0000008000000008L});
	public static final BitSet FOLLOW_BVARS_in_bVars1829 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_bVar_in_bVars1831 = new BitSet(new long[]{0x0000000000010008L});
	public static final BitSet FOLLOW_atomForm_in_formula1852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_binaryConnector_in_formula1861 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomForm_in_formula1863 = new BitSet(new long[]{0x0800000001010100L,0x0000000000020007L});
	public static final BitSet FOLLOW_atomForm_in_formula1865 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEG_in_formula1875 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomForm_in_formula1877 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_pointsTo_in_formula1886 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOCEQ_in_formula1895 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_locTerm_in_formula1897 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_formula1899 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTEQ_in_formula1909 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula1911 = new BitSet(new long[]{0x080000A080003200L,0x0000000000010008L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula1913 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_91_in_formula1923 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula1925 = new BitSet(new long[]{0x080000A080003200L,0x0000000000010008L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula1927 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_92_in_formula1937 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula1939 = new BitSet(new long[]{0x080000A080003200L,0x0000000000010008L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula1941 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SETEQ_in_formula1951 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula1953 = new BitSet(new long[]{0x0000000000000000L,0x0000020000008001L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula1955 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LSETEQ_in_formula1965 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomLsetTerm_in_formula1967 = new BitSet(new long[]{0x0000400000000000L,0x0000008000000001L});
	public static final BitSet FOLLOW_atomLsetTerm_in_formula1969 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MSETEQ_in_formula1979 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomMsetTerm_in_formula1981 = new BitSet(new long[]{0x0020000000000000L,0x0000010000000001L});
	public static final BitSet FOLLOW_atomMsetTerm_in_formula1983 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTMEM_in_formula1993 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula1995 = new BitSet(new long[]{0x0000000000000000L,0x0000020000008001L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula1997 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOCMEM_in_formula2007 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_locTerm_in_formula2009 = new BitSet(new long[]{0x0000400000000000L,0x0000008000000001L});
	public static final BitSet FOLLOW_atomLsetTerm_in_formula2011 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTMMEM_in_formula2021 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula2023 = new BitSet(new long[]{0x0020000000000000L,0x0000010000000001L});
	public static final BitSet FOLLOW_atomMsetTerm_in_formula2025 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTSUBSET_in_formula2035 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula2037 = new BitSet(new long[]{0x0000000000000000L,0x0000020000008001L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula2039 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_126_in_formula2049 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula2051 = new BitSet(new long[]{0x0000000000000000L,0x0000020000008001L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula2053 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_118_in_formula2063 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula2065 = new BitSet(new long[]{0x0000000000000000L,0x0000020000008001L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula2067 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_127_in_formula2077 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula2079 = new BitSet(new long[]{0x0000000000000000L,0x0000020000008001L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula2081 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_144_in_formula2091 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula2093 = new BitSet(new long[]{0x080000A080003200L,0x0000000000010008L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula2095 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_119_in_formula2105 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula2107 = new BitSet(new long[]{0x0000000000000000L,0x0000020000008001L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula2109 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_143_in_formula2119 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomSetTerm_in_formula2121 = new BitSet(new long[]{0x080000A080003200L,0x0000000000010008L});
	public static final BitSet FOLLOW_atomIntTerm_in_formula2123 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOCSUBSET_in_formula2133 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomLsetTerm_in_formula2135 = new BitSet(new long[]{0x0000400000000000L,0x0000008000000001L});
	public static final BitSet FOLLOW_atomLsetTerm_in_formula2137 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTMSUBSET_in_formula2147 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomMsetTerm_in_formula2149 = new BitSet(new long[]{0x0020000000000000L,0x0000010000000001L});
	public static final BitSet FOLLOW_atomMsetTerm_in_formula2151 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ATOMBOOL_in_atomForm2229 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_formula_in_atomForm2231 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TRUE_in_atomForm2240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EMP_in_atomForm2248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RESULTFORM_in_atomForm2256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bVar_in_atomForm2264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_relRec_in_atomForm2272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rec_in_atomForm2280 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLD_in_atomForm2289 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_formula_in_atomForm2291 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_152_in_pointsTo2310 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_locTerm_in_pointsTo2312 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_fieldVal_in_pointsTo2314 = new BitSet(new long[]{0x0000000000000008L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_fieldVal2336 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ITYPE_in_fieldVal2338 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_field_in_fieldVal2340 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_iVar_in_fieldVal2342 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_89_in_fieldVal2353 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LTYPE_in_fieldVal2355 = new BitSet(new long[]{0x4000000020000000L});
	public static final BitSet FOLLOW_dir_in_fieldVal2357 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_fieldVal2359 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_89_in_fieldVal2370 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SLTYPE_in_fieldVal2372 = new BitSet(new long[]{0x4000000020000000L});
	public static final BitSet FOLLOW_dir_in_fieldVal2374 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_fieldVal2376 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_89_in_fieldVal2387 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ITYPE_in_fieldVal2389 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_field_in_fieldVal2391 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_149_in_fieldVal2393 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_iVar_in_fieldVal2395 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_89_in_fieldVal2406 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_LTYPE_in_fieldVal2408 = new BitSet(new long[]{0x4000000020000000L});
	public static final BitSet FOLLOW_dir_in_fieldVal2410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_149_in_fieldVal2412 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_lVar_in_fieldVal2414 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NIL_in_locTerm2437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RESULTLOC_in_locTerm2446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lVar_in_locTerm2455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLD_in_locTerm2464 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_locTerm_in_locTerm2468 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_atomIntTerm_in_intTerm2488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_85_in_intTerm2497 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomIntTerm_in_intTerm2499 = new BitSet(new long[]{0x080000A080003200L,0x0000000000010008L});
	public static final BitSet FOLLOW_atomIntTerm_in_intTerm2501 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_87_in_intTerm2511 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomIntTerm_in_intTerm2513 = new BitSet(new long[]{0x080000A080003200L,0x0000000000010008L});
	public static final BitSet FOLLOW_atomIntTerm_in_intTerm2515 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_93_in_intTerm2525 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomForm_in_intTerm2527 = new BitSet(new long[]{0x080000A080003200L,0x0000000000010008L});
	public static final BitSet FOLLOW_atomIntTerm_in_intTerm2529 = new BitSet(new long[]{0x080000A080003200L,0x0000000000010008L});
	public static final BitSet FOLLOW_atomIntTerm_in_intTerm2531 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ATOMINT_in_atomIntTerm2550 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_intTerm_in_atomIntTerm2552 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INT_in_atomIntTerm2561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RESULTINT_in_atomIntTerm2569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iVar_in_atomIntTerm2577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_iRec_in_atomIntTerm2585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_biRec_in_atomIntTerm2593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOT_in_atomIntTerm2601 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TOP_in_atomIntTerm2609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OLD_in_atomIntTerm2618 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_intTerm_in_atomIntTerm2620 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_atomLsetTerm_in_lsetTerm2640 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_125_in_lsetTerm2649 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_locTerm_in_lsetTerm2651 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_128_in_lsetTerm2661 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lsetTerm_in_lsetTerm2663 = new BitSet(new long[]{0x0800400000000000L,0x3100008000000001L,0x0000000000000001L});
	public static final BitSet FOLLOW_lsetTerm_in_lsetTerm2665 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_120_in_lsetTerm2675 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lsetTerm_in_lsetTerm2677 = new BitSet(new long[]{0x0800400000000000L,0x3100008000000001L,0x0000000000000001L});
	public static final BitSet FOLLOW_lsetTerm_in_lsetTerm2679 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_124_in_lsetTerm2689 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lsetTerm_in_lsetTerm2691 = new BitSet(new long[]{0x0800400000000000L,0x3100008000000001L,0x0000000000000001L});
	public static final BitSet FOLLOW_lsetTerm_in_lsetTerm2693 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OLD_in_lsetTerm2703 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lsetTerm_in_lsetTerm2705 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_103_in_atomLsetTerm2723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lsVar_in_atomLsetTerm2731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rec_in_atomLsetTerm2739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomSetTerm_in_setTerm2758 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_147_in_setTerm2767 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_intTerm_in_setTerm2769 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_148_in_setTerm2779 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_setTerm_in_setTerm2781 = new BitSet(new long[]{0x0800000000000000L,0x0002020000008001L,0x00000000001A0000L});
	public static final BitSet FOLLOW_setTerm_in_setTerm2783 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_113_in_setTerm2793 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_setTerm_in_setTerm2795 = new BitSet(new long[]{0x0800000000000000L,0x0002020000008001L,0x00000000001A0000L});
	public static final BitSet FOLLOW_setTerm_in_setTerm2797 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_145_in_setTerm2807 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_setTerm_in_setTerm2809 = new BitSet(new long[]{0x0800000000000000L,0x0002020000008001L,0x00000000001A0000L});
	public static final BitSet FOLLOW_setTerm_in_setTerm2811 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OLD_in_setTerm2821 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_setTerm_in_setTerm2823 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_105_in_atomSetTerm2841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sVar_in_atomSetTerm2849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rec_in_atomSetTerm2857 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomMsetTerm_in_msetTerm2876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_135_in_msetTerm2885 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_intTerm_in_msetTerm2887 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_136_in_msetTerm2897 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_msetTerm_in_msetTerm2899 = new BitSet(new long[]{0x0820000000000000L,0x0000010000000001L,0x00000000000001C8L});
	public static final BitSet FOLLOW_msetTerm_in_msetTerm2901 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_131_in_msetTerm2911 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_msetTerm_in_msetTerm2913 = new BitSet(new long[]{0x0820000000000000L,0x0000010000000001L,0x00000000000001C8L});
	public static final BitSet FOLLOW_msetTerm_in_msetTerm2915 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_134_in_msetTerm2925 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_msetTerm_in_msetTerm2927 = new BitSet(new long[]{0x0820000000000000L,0x0000010000000001L,0x00000000000001C8L});
	public static final BitSet FOLLOW_msetTerm_in_msetTerm2929 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_OLD_in_msetTerm2939 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_msetTerm_in_msetTerm2941 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_104_in_atomMsetTerm2959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_msVar_in_atomMsetTerm2967 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rec_in_atomMsetTerm2975 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RELREC_in_relRec2995 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_relRec2997 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_relRec2999 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_relRec3003 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_REC_in_rec3024 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_rec3026 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_rec3028 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IREC_in_iRec3049 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_iRec3051 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_iRec3053 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BIREC_in_biRec3072 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_biRec3074 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_biRec3076 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_biRec3080 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SREC_in_sRec3101 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_sRec3103 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_sRec3105 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BSREC_in_bsRec3126 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_bsRec3128 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_bsRec3130 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_bsRec3134 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LSREC_in_lsRec3155 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_lsRec3157 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_lsRec3159 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MSREC_in_msRec3178 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_msRec3180 = new BitSet(new long[]{0x0A01000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_locTerm_in_msRec3182 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_atomIntExp_in_intExp3200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_intExp3210 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_intExp_in_intExp3218 = new BitSet(new long[]{0x0000008000200000L,0x0000000000A00000L});
	public static final BitSet FOLLOW_intExp_in_intExp3220 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_CONS_in_atomIntExp3241 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_atomIntExp3243 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_iVar_in_atomIntExp3252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NIL_in_locExp3269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NEW_in_locExp3277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lVar_in_locExp3285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomBoolExp_in_boolExp3302 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_boolExp3312 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomBoolExp_in_boolExp3324 = new BitSet(new long[]{0x0000020100010100L,0x0000000818020000L});
	public static final BitSet FOLLOW_atomBoolExp_in_boolExp3326 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NOT_in_boolExp3337 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomBoolExp_in_boolExp3339 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ATOMBOOL_in_atomBoolExp3358 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_boolExp_in_atomBoolExp3360 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LOCEQ_in_atomBoolExp3368 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_locExp_in_atomBoolExp3370 = new BitSet(new long[]{0x0301000000000000L});
	public static final BitSet FOLLOW_locExp_in_atomBoolExp3372 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_INTEQ_in_atomBoolExp3380 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_intExp_in_atomBoolExp3382 = new BitSet(new long[]{0x0000008000200000L,0x0000000000A00000L});
	public static final BitSet FOLLOW_intExp_in_atomBoolExp3384 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_91_in_atomBoolExp3392 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_intExp_in_atomBoolExp3394 = new BitSet(new long[]{0x0000008000200000L,0x0000000000A00000L});
	public static final BitSet FOLLOW_intExp_in_atomBoolExp3396 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_92_in_atomBoolExp3404 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_intExp_in_atomBoolExp3406 = new BitSet(new long[]{0x0000008000200000L,0x0000000000A00000L});
	public static final BitSet FOLLOW_intExp_in_atomBoolExp3408 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_TRUE_in_atomBoolExp3415 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bVar_in_atomBoolExp3421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_99_in_atomBoolExp3428 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_atomIntExp_in_atomBoolExp3430 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_88_in_dirDeref3451 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lVar_in_dirDeref3453 = new BitSet(new long[]{0x4000000020000000L});
	public static final BitSet FOLLOW_dir_in_dirDeref3455 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_88_in_dataDeref3474 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_lVar_in_dataDeref3476 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_field_in_dataDeref3478 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IVAR_in_iVar3499 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_iVar3501 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_IVAR_in_iVar3512 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QMARK_in_iVar3514 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LVAR_in_lVar3535 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_lVar3537 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LVAR_in_lVar3548 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QQMARK_in_lVar3550 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BVAR_in_bVar3575 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_bVar3577 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_BVAR_in_bVar3588 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_QMARK_in_bVar3590 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_SVAR_in_sVar3611 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_sVar3613 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_LSVAR_in_lsVar3638 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_lsVar3640 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_MSVAR_in_msVar3661 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ID_in_msVar3663 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ID_in_field3712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_func3729 = new BitSet(new long[]{0x0000000000000002L});
}
