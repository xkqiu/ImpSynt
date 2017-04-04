import java.io.*;
import java.nio.file.Files;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Text;


public class NaturalSynthesis {
	public static String sig;
	public static int call_count = 0;
	public static ImpSynt is;
	public static CommonTree trueTree;
	public static PrintWriter writer;
	public static int i_init;
	public static int l_init;
	public static int bnd;
	public static int cond_count = 0;
	public static List<Integer> prevCond = new LinkedList<Integer>(); 
	public static int currCond = -1;
	public static int statement_id = 0;
	public static int cond_id = 0;
	public static int branch_id = 0;
	public static int loc_id = 0;
	public static int int_id = 0;
	public static int create_node_id = 0;
	public static int update_int = 0;
	public static int update_int_before_loop = 0;
	public static int[] update_int_to = new int[10];
	public static int update_loc = 0;
	public static int update_loc_before_loop = 0;
	public static int[] update_loc_to = new int[10];
	public static int mutate_loc = 0;
	
	public static String gen_non_zero(int r) {
		if (r < 1) return "";
		String range = "{| 1 ";
		for (int i = 2; i <= r; i++) {
			range += "| " + i + " ";
		}
		range += "|}";
		return range;
	}
	
	public static String gen_non_zero(int r, int offset) {
		if (r < 1) return "";
		String range = "{| " + (1+offset) + " ";
		for (int i = 2; i <= r; i++) {
			range += "| " + (i+offset) + " ";
		}
		range += "|}";
		return range;
	}
	
	public static int lookup(LinkedList<Pair<String, String>> ags, String name) {
		int count = 0;
		for (Pair<String, String> a : ags) {
			if (a.getFirst().equals(name)) return count;
			else count++;
		}
		return -1;
	}
	
	public static String convertForm(CommonTree ct) {
		CommonTree arg1;
		switch (ct.getText()) {
			case "~": return "! " + convertForm((CommonTree)ct.getChild(0));
			case "&": return convertForm((CommonTree)ct.getChild(0)) + " && " + convertForm((CommonTree)ct.getChild(1));
			case "|": return convertForm((CommonTree)ct.getChild(0)) + " || " + convertForm((CommonTree)ct.getChild(1));
			case "<": return convertForm((CommonTree)ct.getChild(0)) + " < " + convertForm((CommonTree)ct.getChild(1));
			case "<=": 
				arg1 = (CommonTree)ct.getChild(0);
				if (arg1.getText().equals("IREC")) {
					String temp = arg1.getChild(1).getText();
					if (temp.equals("resultloc")) temp = "r";
					else if (temp.equals("LVAR")) temp = arg1.getChild(1).getChild(0).getText();
					return arg1.getChild(0).getText() + "_leq_inv(" 
						+ temp + ", "
						+ convertForm((CommonTree)ct.getChild(1)) + ")";			
				}
				else return convertForm((CommonTree)ct.getChild(0)) + " <= " + convertForm((CommonTree)ct.getChild(1));
			case "?": return convertForm((CommonTree)ct.getChild(0)) + " ? " + convertForm((CommonTree)ct.getChild(1)) + " : " + convertForm((CommonTree)ct.getChild(2));
			case "+": return convertForm((CommonTree)ct.getChild(0)) + " + " + convertForm((CommonTree)ct.getChild(1));
			case "-": return convertForm((CommonTree)ct.getChild(0)) + " - " + convertForm((CommonTree)ct.getChild(1));
			case "REC": {
				String temp = ct.getChild(1).getText();
				if (temp.equals("resultloc")) temp = "r";
				else if (temp.equals("LVAR")) temp = ct.getChild(1).getChild(0).getText();
				return ct.getChild(0).getText() + "_inv(" + temp + ")";
			}
			case "IREC": {
				String temp = ct.getChild(1).getText();
				if (temp.equals("resultloc")) temp = "r";
				else if (temp.equals("LVAR")) temp = ct.getChild(1).getChild(0).getText();
				return ct.getChild(0).getText() + "_comp(locvars[" + temp + "])";
			}
			case "RELREC": {
				Tree temp = ct.getChild(1);
				String temp1 = "";
				if (temp.getText().equals("old")) {
					temp1 += "old_";
					temp = ct.getChild(1).getChild(0);
				}
				if (temp.getText().equals("resultloc")) temp1 += "r";
				else if (temp.getText().equals("LVAR")) temp1 += temp.getChild(0).getText();
				temp = ct.getChild(2);
				String temp2 = "";
				if (temp.getText().equals("old")) {
					temp2 += "old_";
					temp = ct.getChild(2).getChild(0);
				}
				if (temp.getText().equals("resultloc")) temp2 += "r";
				else if (temp.getText().equals("LVAR")) temp2 += temp.getChild(0).getText();
				return ct.getChild(0).getText() + "_inv(" + temp1 + ", " + temp2 + ")";
			}
			case "BIREC": {
				Tree temp = ct.getChild(1);
				String temp1 = "";
				if (temp.getText().equals("old")) {
					temp1 += "old_";
					temp = ct.getChild(1).getChild(0);
				}
				if (temp.getText().equals("resultloc")) temp1 += "r";
				else if (temp.getText().equals("LVAR")) temp1 += temp.getChild(0).getText();
				temp = ct.getChild(2);
				String temp2 = "";
				if (temp.getText().equals("old")) {
					temp2 += "old_";
					temp = ct.getChild(2).getChild(0);
				}
				if (temp.getText().equals("resultloc")) temp2 += "r";
				else if (temp.getText().equals("LVAR")) temp2 += temp.getChild(0).getText();
				return ct.getChild(0).getText() + "_comp(locvars[" + temp1 + "], locvars[" + temp2 + "])";
			}
			case "LVAR": return "locvars[" + convertForm((CommonTree)ct.getChild(0)) + "]";
			case "IVAR": return "intvars[" + convertForm((CommonTree)ct.getChild(0)) + "]";
			case "old":
				CommonTree arg = (CommonTree)ct.getChild(0);
				switch (arg.getText()) {
					case "REC": return "old_" + arg.getChild(0).getText() + "_" + arg.getChild(1).getChild(0).getText();
					case "IREC": return "old_" + arg.getChild(0).getText() + "_" + arg.getChild(1).getChild(0).getText();
					case "BIREC": return "old_" + arg.getChild(0).getText() + "_" + arg.getChild(1).getChild(0).getText() + "_" + arg.getChild(2).getChild(0).getText();
					case "IVAR": return "old_" + arg.getChild(0).getText();
					case "LVAR": return "old_" + arg.getChild(0).getText();
					default: return "";
				}
			case "ATOMBOOL": return "(" + convertForm((CommonTree)ct.getChild(0)) + ")";
			case "ATOMINT": return "(" + convertForm((CommonTree)ct.getChild(0)) + ")";
			case "resultint": return "intvars[r]";
			case "resultloc": return "locvars[r]";
			case "LOCEQ": 
				String left = ct.getChild(0).getText();
				if (left.equals("resultloc")) left = "r";
				else if (left.equals("nil")) left = "0";
				else if (left.equals("old")) left = Integer.toString(l_init-1);
				else if (left.equals("LVAR")) left = ct.getChild(0).getChild(0).getText();
				String right = ct.getChild(1).getText();
				if (right.equals("resultloc")) right = "r";
				else if (right.equals("nil")) right = "0";
				else if (right.equals("old")) right = Integer.toString(l_init-1);
				if (right.equals("LVAR")) right = ct.getChild(1).getChild(0).getText();
				return "locvar_eq(" + left + ", " + right + ")";
				//return convertForm((CommonTree)ct.getChild(0)) + " == " + convertForm((CommonTree)ct.getChild(1));
			case "INTEQ": 
				arg1 = (CommonTree)ct.getChild(0);
				if (arg1.getText().equals("IREC")) {
					String temp = arg1.getChild(1).getText();
					if (temp.equals("resultloc")) temp = "r";
					else if (temp.equals("LVAR")) temp = arg1.getChild(1).getChild(0).getText();
					return arg1.getChild(0).getText() + "_equal_inv(" 
						+ temp + ", "
						+ convertForm((CommonTree)ct.getChild(1)) + ")";			
				}
				else return convertForm((CommonTree)ct.getChild(0)) + " == " + convertForm((CommonTree)ct.getChild(1));
			case "|->":
				int num = ct.getChildCount() - 1;
				String from = "r";
				if (ct.getChild(0).getChildCount() > 0) 
					from = ((CommonTree)ct.getChild(0).getChild(0)).getText();
				String temp = "";
				for (int i = 1; i <= num; i++) {
					CommonTree currField = (CommonTree)ct.getChild(i);
					if (currField.getChild(0).getText().equals("loc") || currField.getChild(0).getText().equals("int")) {
						String to = currField.getChild(2).getText();
						if (to.equals("resultloc"))
							to = "r";
						else if (to.equals("old"))
							to = "old_" + ((CommonTree)currField.getChild(2).getChild(0).getChild(0)).getText() + "_" + from;
						else if (to.equals("LVAR") || to.equals("IVAR")) 
							to = ((CommonTree)currField.getChild(2).getChild(0)).getText();
						switch (currField.getChild(1).getText()) {
							case "next": temp += "nextTo(" + from + ", " + to + ")"; break;
							case "left": temp += "leftTo(" + from + ", " + to + ")"; break;
							case "right": temp += "rightTo(" + from + ", " + to + ")"; break;
							case "key": temp += "keyEqTo(" + from + ", " + to + ")"; break;
							default: temp += "";
						}
					}
					if (i != num) temp += " && ";
				}
				return temp;
			default: return ct.getText();
		}
	}
	
	@SuppressWarnings("unchecked")
	public static String convertCond(CommonTree ct, int locrange, int intrange, int locrange2, int intrange2, boolean unmodified, LinkedList<Pair<String, String>> ags, LinkedList<String> loc_ags, LinkedList<String> int_ags) {
		switch (ct.getText()) {
			case "!": return "! " + convertCond((CommonTree)ct.getChild(0), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags);
			case "||": return convertCond((CommonTree)ct.getChild(0), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags) + " || " + convertCond((CommonTree)ct.getChild(1), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags);
			case "&&": return convertCond((CommonTree)ct.getChild(0), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags) + " && " + convertCond((CommonTree)ct.getChild(1), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags);
			case "ATOMBOOL": return "(" + convertCond((CommonTree)ct.getChild(0), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags) + ")";
			case "LOCEQ": return "locvars[" + convertStmt((CommonTree)ct.getChild(0), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags) + "] == locvars[" + convertStmt((CommonTree)ct.getChild(1), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags) + "]";
			case "INTEQ": return "intvars[" + convertStmt((CommonTree)ct.getChild(0), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags) + "] == intvars[" + convertStmt((CommonTree)ct.getChild(1), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags) + "]";
			default: {
				return ct.getText();
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public static String convertStmt(CommonTree ct, int locrange, int intrange, int locrange2, int intrange2, boolean unmodified, LinkedList<Pair<String, String>> ags, LinkedList<String> loc_ags, LinkedList<String> int_ags) {
		switch (ct.getText()) {
			case "SEQ": {
				String temp = "";
				for (Object sct : ct.getChildren())
					temp += convertStmt((CommonTree)sct, locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags);
				return temp;
			}
			case "if": {
				String temp = "\tif (" + convertStmt((CommonTree)ct.getChild(0), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags) 
						+ ") " + convertStmt((CommonTree)ct.getChild(1), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags) + "\n";
				if (ct.getChildCount() == 3) temp += convertStmt((CommonTree)ct.getChild(2), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags);
				return temp;
			}
			case "else": return "\telse " + convertStmt((CommonTree)ct.getChild(0), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags) + "\n";
			case "cond": {
				String basic = "";
				if (unmodified) basic = "basic_branch_cond" + branch_id++ + "(" + (locrange+locrange2) + ", " + (locrange+1) + ", " + (intrange+intrange2) + ", " + intrange + ")";
				else basic = "basic_cond" + cond_id++ + "(" + (locrange+locrange2) + ", " + (intrange+intrange2) + ")";
				String conj = basic;
				int c = Integer.valueOf(ct.getChild(0).getChild(0).getText());
				for (int i = 1; i < c; i++) {
					if (unmodified) basic = "basic_branch_cond" + branch_id++ + "(" + (locrange+locrange2) + ", " + (locrange+1) + ", " + (intrange+intrange2) + ", " + intrange + ")";
					else basic = "basic_cond" + cond_id++ + "(" + (locrange+locrange2) + ", " + (intrange+intrange2) + ")";
					conj += (" && " + basic);
				}
				return conj;
			}
			case "statement": {
				int num = Integer.valueOf(ct.getChild(0).getChild(0).getText());
				String temp = "";
				for (int i = 0; i < num; i++) {
					temp += "\tstatement" + statement_id++ + "(" + locrange + ", " + intrange + ", " + locrange2 + ", " + intrange2 + ");\n";
				}
				return temp;
			}
			case "MUTATE":
				String mutate = "";
				if (ct.getChild(0).getText().equals("int")) {
					mutate += "\tintMutate(" 
							+ convertStmt((CommonTree)ct.getChild(1).getChild(0), locrange+locrange2, intrange+intrange2, 0, 0, unmodified, ags, loc_ags, int_ags) 
							+ ", " + convertStmt((CommonTree)ct.getChild(2), locrange+locrange2, intrange+intrange2, 0, 0, unmodified, ags, loc_ags, int_ags)
							+ ");\n";
				}
				else if (ct.getChild(0).getText().equals("loc")) {
					mutate += "\tlocMutate(" 
							+ convertStmt((CommonTree)ct.getChild(1).getChild(0), locrange+locrange2, intrange+intrange2, 0, 0, unmodified, ags, loc_ags, int_ags) 
							+ ", " + convertStmt((CommonTree)ct.getChild(2), locrange+locrange2, intrange+intrange2, 0, 0, unmodified, ags, loc_ags, int_ags);
					switch (ct.getChild(1).getChild(1).getText()) {
						case "left": mutate += ", LEFT"; break;
						case "right": mutate += ", RIGHT"; break;
						case "next": mutate += ", NEXT"; break;
						case "??": mutate += ", ??"; break;
						default: ;
					}
					mutate += ");\n";
				}
				return mutate;
			case "DEREFASSGN":
				String assign = "";
				if (ct.getChild(0).getText().equals("int")) {
					assign += "\tintderef2var(" 
							+ convertStmt((CommonTree)ct.getChild(2).getChild(0), locrange+locrange2, intrange+intrange2, 0, 0, unmodified, ags, loc_ags, int_ags) 
							+ ", " + convertStmt((CommonTree)ct.getChild(1), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags) 
							+ ");\n";
				}
				else if (ct.getChild(0).getText().equals("loc")) {
					assign += "\tlocderef2var(" 
							+ convertStmt((CommonTree)ct.getChild(2).getChild(0), locrange+locrange2, intrange+intrange2, 0, 0, unmodified, ags, loc_ags, int_ags) 
							+ ", " + convertStmt((CommonTree)ct.getChild(1), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags);
					switch (ct.getChild(2).getChild(1).getText()) {
						case "left": assign += ", LEFT"; break;
						case "right": assign += ", RIGHT"; break;
						case "??": assign += ", ??"; break;
						default: ;
					}
					assign += ");\n";
				}
				return assign;
			case ":=": {
				switch (ct.getChild(2).getText()) {
					case "new": return "\tcreate_node" + create_node_id++ + "(" + convertStmt((CommonTree)ct.getChild(1), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags)
						+ ", " + (locrange+locrange2) + ", " + (intrange+intrange2) + ");\n";
					case "IVAR": 
						if (ct.getChild(2).getChild(0).getText().equals("??"))
							return "\tupdate_intvar(" + convertStmt((CommonTree)ct.getChild(1), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags)
							+ ", " + (locrange+locrange2) + ", " + (intrange+intrange2) + ");\n";
						return "\tintVarAssign(" + convertStmt((CommonTree)ct.getChild(1), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags)
							+ ", " + convertStmt((CommonTree)ct.getChild(2), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags)
							+ ", 1);\n";
					case "LVAR": 
						if (ct.getChild(2).getChild(0).getText().equals("???"))
							return "\tupdate_locvar(" + convertStmt((CommonTree)ct.getChild(1), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags)
							+ ", " + (locrange+locrange2) + ", " + (intrange+intrange2) + ");\n";
						return "\tlocVarAssign(" + convertStmt((CommonTree)ct.getChild(1), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags)
							+ ", " + convertStmt((CommonTree)ct.getChild(2), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags)
							+ ");\n";
					case "nil":
						return "\tlocVarAssign(" + convertStmt((CommonTree)ct.getChild(1), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags)
							+ ", 0);\n";
					case "CONS":
						return "\tintVarAssign(" + convertStmt((CommonTree)ct.getChild(1), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags)
							+ ", 0, " + convertStmt((CommonTree)ct.getChild(2), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags)
							+ ");\n";
					default: 
						return "\t" + convertStmt((CommonTree)ct.getChild(1), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags)
						+ " = " + convertStmt((CommonTree)ct.getChild(2), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags) + ";\n";
				}
			}
			case "<": {
				return "intvars[" + convertStmt((CommonTree)ct.getChild(0), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags)
						+ "] < intvars[" +
						convertStmt((CommonTree)ct.getChild(1), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags)
						+ "]";
			}
			case "<=": {
				return "intvars[" + convertStmt((CommonTree)ct.getChild(0), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags)
				+ "] <= intvars[" +
				convertStmt((CommonTree)ct.getChild(1), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags)
				+ "]";
			}
			case "LOCEQ": {
				return "locvar_eq(" + 
						convertStmt((CommonTree)ct.getChild(0), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags)
						+ ", " +
						convertStmt((CommonTree)ct.getChild(1), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags)
						+ ")";
			}
			case "INTEQ": {
				return "intvar_eq(" + 
						convertStmt((CommonTree)ct.getChild(0), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags)
						+ ", " +
						convertStmt((CommonTree)ct.getChild(1), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags)
						+ ")";
			}
			case "LVAR": {
				String temp = ct.getChild(0).getText();
				if (temp.equals("???")) temp = "loc_id" + loc_id++ + "(" + locrange + ")";
				else {
					int i;
					for (i = 0; i < ags.size(); i++) {
						if (ags.get(i).getFirst().equals(temp)) {
							temp = String.valueOf(l_init-i-1);
							break;
						}
					}
					if (i == ags.size()) {
						int j;
						for (j = 0; j < loc_ags.size(); j++) {
							if (loc_ags.get(j).equals(temp)) {
								break;
							}
						}
						if (j == loc_ags.size()) loc_ags.add(temp);
						temp = String.valueOf(j+1);
					}
					
				}
				return temp;
			}
			case "IVAR": {
				String temp = ct.getChild(0).getText();
				if (temp.equals("??")) temp = "int_id" + int_id++ + "(" + intrange + ")";
				else {
					int i;
					for (i = 0; i < ags.size(); i++) {
						if (ags.get(i).getFirst().equals(temp)) {
							temp = String.valueOf(i_init-i-1);
							break;
						}
					}
					if (i == ags.size()) {
						int j;
						for (j = 0; j < int_ags.size(); j++) {
							if (int_ags.get(j).equals(temp)) {
								break;
							}
						}
						if (j == int_ags.size()) int_ags.add(temp);
						temp = String.valueOf(j);
					}
					
				}
				return temp;
			}
			case "CONS": return ct.getChild(0).getText();
			case "true": return "true";
			case "nil": return "0";
			case "return": 
				if (ct.getChild(1).getChild(0).getText().startsWith("l_"))
					return "\tret_loc(" + ct.getChild(1).getChild(0).getText().substring(2) + ");\n";
				else if (ct.getChild(1).getChild(0).getText().startsWith("i_"))
					return "\tret_int(" + ct.getChild(1).getChild(0).getText().substring(2) + ");\n";
				else if (ct.getChild(0).getText().equals("LTYPE")) 
					return "\tret_loc(" + convertStmt((CommonTree)ct.getChild(1), locrange+locrange2, intrange+intrange2, 0, 0, unmodified, ags, loc_ags, int_ags) + ");\n";
				else if (ct.getChild(0).getText().equals("ITYPE")) 
					return "\tret_int(" + convertStmt((CommonTree)ct.getChild(1), locrange+locrange2, intrange+intrange2, 0, 0, unmodified, ags, loc_ags, int_ags) + ");\n";
				else
					return "\treturn " + convertStmt((CommonTree)ct.getChild(1), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags) + ";\n";
			case "ATOMSTMT": return "\t{\n" + convertStmt((CommonTree)ct.getChild(0), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags) + "\n\t}\n";
			default: {
				String m = ct.getText();
				//LinkedList<Pair<String, String>> ags = is.args.get(m);
				List<CommonTree> params = (List<CommonTree>)ct.getChildren();
				List<CommonTree> agss = params.subList(2, params.size());
	        	
				//First parameter is either fixed, or the unknown ranking variable
				String call = "";
				//System.out.println(ags.get(0).getChild(0).getText());
				if (agss.get(0).getChild(0).getText().equals("???")) {
					String rank_var = "rank_var_for_call_" + call_count++;
					String ranking = "\tint " + rank_var + " = " + convertStmt(agss.get(0), locrange+locrange2, intrange+intrange2, 0, 0, unmodified, ags, loc_ags, int_ags) + ";\n"
							+ "\tassertPost(ranking_decreases(rank_func_" + ct.getText()
							+ ", " + rank_var + ", 1));\n";
					call += ranking + "\trec_" + ct.getText() + "(" + rank_var + ", ";
				}
				else call += "\trec_" + ct.getText() + "(" + convertStmt(agss.get(0), locrange+locrange2, intrange+intrange2, 0, 0, unmodified, ags, loc_ags, int_ags) + ", ";
	        	
				for (CommonTree p : agss.subList(1, agss.size())) {
	        		call += convertStmt(p, locrange+locrange2, intrange+intrange2, 0, 0, unmodified, ags, loc_ags, int_ags) + ", ";
	        	}
	        	call += convertStmt((CommonTree)ct.getChild(1), locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags) + ", ";
	        	if (is.ret_types.get(m).equals("int")) call += "ret_value, ";
	        	if (sig.equals("bst")) 
	        		call += "new_symbolic, new_left, new_right, new_key);\n";
	        	else
	        		call += "new_symbolic, new_next, new_supernext, new_key);\n";
				return call;
			}
		}
	}
	
	public static void createRecursiveCall(String m, LinkedList<Pair<String, String>> ags) {
		HashSet<String> recs = is.olds.get(m);
		
		int count = 0;
		for (Pair<String, String> p : ags) {
    		if (p.getSecond().equals("int")) {
    			if (count++ > 0) writer.print(", ");
    			else writer.print("int ");
    			writer.print("newer_" + p.getFirst());
    		}
    	}
		
		if (sig.equals("bst")) {
			if (count++ > 0) writer.print(", ");
			else writer.print("int ");
			writer.print("newer_bst");
		}
		else {
		//if (recs.contains("sll")) {
			if (count++ > 0) writer.print(", ");
			else writer.print("int ");
			writer.print("newer_sll");
		}
		if (recs.contains("len")) {
			if (count++ > 0) writer.print(", ");
			else writer.print("int ");
			writer.print("newer_len");
		}
    	if (recs.contains("min")) {
    		if (count++ > 0) writer.print(", ");
    		else writer.print("int ");
    		writer.print("newer_min");
    	}
    	if (recs.contains("max")) {
    		if (count++ > 0) writer.print(", ");
    		else writer.print("int ");
    		writer.print("newer_max");
    	}
    	if (recs.contains("size")) {
    		if (count++ > 0) writer.print(", ");
    		else writer.print("int ");
    		writer.print("newer_size");
    	}
    	if (recs.contains("height")) {
    		if (count++ > 0) writer.print(", ");
    		else writer.print("int ");
    		writer.print("newer_height");
    	}
    	if (count > 0) writer.println(";\n");
		
		writer.print("void rec_" + m + "(");
    	for (Pair<String, String> p : ags) {
    		writer.print("int " + p.getFirst() + ", ");
    	}
    	writer.print("int recret, ");
    	if (is.ret_types.get(m).equals("int")) writer.print("ref int rv, ");
    	writer.println("ref bit[HEAPSIZE-1] new_symbolic, ref int[HEAPSIZE-1] new_next, ref int[HEAPSIZE-1] new_supernext, ref int[HEAPSIZE-1] new_key) {\n");
    	
    	//assertPost(pre_cond)
    	writer.print("\tassertPost(pre_cond_" + m + "(");
    	count = 0;
    	for (Pair<String, String> p : ags) {
    		if (count++ > 0) writer.print(", ");
    		writer.print(p.getFirst());
    	}
    	writer.println("));\n");
    	
    	//snapshot
    	writer.print("\tsnapshot_" + m + "(");
    	count = 0;
    	for (Pair<String, String> p : ags) {
    		if (p.getSecond().equals("int")) {
    			if (count++ > 0) writer.print(", ");
    			writer.print(p.getFirst() + ", newer_" + p.getFirst());
    		}
    		if (p.getSecond().equals("loc")) {
    			if (count++ > 0) writer.print(", ");
    			writer.print(p.getFirst());
    		}
    	}
    	if (sig.equals("bst")) {
    		if (count++ > 0) writer.print(", ");
    		writer.print("newer_bst");
    	}
    	else {
    		if (count++ > 0) writer.print(", ");
    		writer.print("newer_sll");
    	}
    	count++;
    	/*if (sig.equals("bst")) {
    		if (count++ > 0) writer.print(", ");
    		writer.print("newer_bst");
    	}
    	if (recs.contains("sll")) {
    		if (count++ > 0) writer.print(", ");
    		writer.print("newer_sll");
    	}*/
    	if (recs.contains("len")) {
    		if (count++ > 0) writer.print(", ");
    		writer.print("newer_len");
    	}
    	if (recs.contains("min")) {
    		if (count++ > 0) writer.print(", ");
    		writer.print("newer_min");
    	}
    	if (recs.contains("max")) {
    		if (count++ > 0) writer.print(", ");
    		writer.print("newer_max");
    	}
    	if (recs.contains("size")) {
    		if (count++ > 0) writer.print(", ");
    		writer.print("newer_size");
    	}
    	if (recs.contains("height")) {
    		if (count++ > 0) writer.print(", ");
    		writer.print("newer_height");
    	}
    	if (recs.contains("lenseg")) {
    		if (count++ > 0) writer.print(", ");
    		writer.print("newer_lenseg");
    	}
    	if (recs.contains("minseg")) {
    		if (count++ > 0) writer.print(", ");
    		writer.print("newer_minseg");
    	}
    	if (recs.contains("maxseg")) {
    		if (count++ > 0) writer.print(", ");
    		writer.print("newer_maxseg");
    	}
    	writer.println(");\n");
    	
    	//havoc
    	writer.print("\t");
    	if (is.ret_types.get(m).equals("loc")) writer.print("locvars[recret] = ");
    	writer.print("havoc(");
    	for (Pair<String, String> p : ags) {
    		switch (p.getSecond()) {
    			case "loc": writer.print("locvars[" + p.getFirst() + "], ");
    			default: ;
    		}
    	}
    	writer.println("new_symbolic, new_next, new_supernext, new_key);\n");
    	
    	//update return value
    	if (is.ret_types.get(m).equals("int")) writer.println("\tintvars[recret] = rv;\n");
    	
    	//assumePre(post_cond)
    	writer.print("\tassumePre(post_cond_" + m + "(recret");
    	for (Pair<String, String> p : ags) {
    		writer.print(", " + p.getFirst());
    	}
    	for (Pair<String, String> p : ags) {
    		if (p.getSecond().equals("int"))
    			writer.print(", newer_" + p.getFirst());
    		if (p.getSecond().equals("loc")) {
    			if (recs.contains("len")) writer.print(", newer_len");
        		if (recs.contains("min")) writer.print(", newer_min");
        		if (recs.contains("max")) writer.print(", newer_max");
        		if (recs.contains("size")) writer.print(", newer_size");
        		if (recs.contains("height")) writer.print(", newer_height");
    		}
    	}
    	writer.println("));");
    	
    	writer.println("}\n");
	}
	
	public static void preCond(String m, LinkedList<Pair<String, String>> ags, int int_init, int loc_init) {
		writer.print("\tassume pre_cond_" + m + "(");
    	int int_count = 0, loc_count = 0;
    	for (Pair<String, String> p : ags) {
    		if (int_count + loc_count > 0) writer.print(", ");
    		if (p.getSecond().equals("int"))
    			writer.print(i_init-(++int_count));
    		if (p.getSecond().equals("loc"))
    			writer.print(l_init-(++loc_count));
    	}
    	writer.println(");\n");
	}
	
	public static void postCond(String m, LinkedList<Pair<String, String>> ags, int int_init, int loc_init) {
		writer.print("\tassertPost(post_cond_" + m + "(ret");
		HashSet<String> recs = is.olds.get(m);
		int loc_count = 0;
		int int_count = 0;
		for (Pair<String, String> p : ags) {
			if (p.getSecond().equals("int"))
				writer.print(", " + (i_init-(++int_count)));
			if (p.getSecond().equals("loc"))
				writer.print(", " + (l_init-(++loc_count)));
		}
    	for (int i = 0; i < ags.size(); i++) {
    		Pair<String, String> p = ags.get(i);
    		if (p.getSecond().equals("int"))
    			writer.print(", old_" + p.getFirst());
    		if (p.getSecond().equals("loc")) {
    			if (recs.contains("len")) writer.print(", old_len");
    	    	if (recs.contains("min")) writer.print(", old_min");
    	    	if (recs.contains("max")) writer.print(", old_max");
    	    	if (recs.contains("size")) writer.print(", old_size");
    	    	if (recs.contains("height")) writer.print(", old_height");
    	    	for (int j = i+1; j < ags.size(); j++) {
    	    		Pair<String, String> q = ags.get(j);
    	    		if (recs.contains("lenseg")) writer.print(", old_lenseg");
        	    	if (recs.contains("minseg")) writer.print(", old_minseg");
        	    	if (recs.contains("maxseg")) writer.print(", old_maxseg");
    	    	}
    		}
    	}
    	writer.println("));\n");
	}
	
	@SuppressWarnings("unchecked")
	public static void recursiveSnapshot(String m, LinkedList<Pair<String, String>> ags, int int_init, int loc_init) {
		//snapshot
    	writer.print("\tsnapshot_" + m + "(");
    	int int_count = 0;
    	int loc_count = 0;
    	int count = 0;
    	for (Pair<String, String> p : ags) {
    		if (count++ > 0) writer.print(", ");
    		if (p.getSecond().equals("int")) {
    			writer.print((i_init-(++int_count)) + ", old_" + p.getFirst());
    		}
    		if (p.getSecond().equals("loc"))
    			writer.print(l_init-(++loc_count));
    	}
    	HashSet<String> recs = is.olds.get(m);
    	if (sig.equals("bst")) writer.print(", old_bst");
    	else writer.print(", old_sll");
    	//if (recs.contains("sll")) writer.print(", old_sll");
    	if (recs.contains("len")) writer.print(", old_len");
    	if (recs.contains("min")) writer.print(", old_min");
    	if (recs.contains("max")) writer.print(", old_max");
    	if (recs.contains("size")) writer.print(", old_size");
    	if (recs.contains("height")) writer.print(", old_height");
    	if (recs.contains("lenseg")) writer.print(", old_lenseg");
    	if (recs.contains("minseg")) writer.print(", old_minseg");
    	if (recs.contains("maxseg")) writer.print(", old_maxseg");
    	writer.println(");\n");
    	
    	//ranking snapshot
    	if (((Pair<String, String>)ags.toArray()[0]).getSecond().equals("loc"))
    		writer.println("\tranking_snapshot(rank_func_" + m + ", " + loc_init + ", 1);\n");
	}
	
	public static String encodeBasicBlock(LinkedList<Pair<String, String>> ags, LinkedList<String> loc_ags, LinkedList<String> int_ags, CommonTree ct, int locrange, int intrange, int locrange2, int intrange2, boolean unmodified) {
		String raw = convertStmt(ct, locrange, intrange, locrange2, intrange2, unmodified, ags, loc_ags, int_ags);
		int i = 0, l = 0;
        for (int c = 0; c < ags.size(); c++) {
        	if (ags.get(c).getSecond().equals("int")) {
        		raw = raw.replaceAll(ags.get(c).getFirst() + ", ", i_init - i - 1 + ", ");
        		raw = raw.replaceAll(ags.get(c).getFirst() + "\\)", i_init - i - 1 + "\\)");
        		i++;
        	}
        	else if (ags.get(c).getSecond().equals("loc")) {
        		raw = raw.replaceAll(ags.get(c).getFirst() + ", ", l_init - l - 1 + ", ");
        		raw = raw.replaceAll(ags.get(c).getFirst() + "\\)", l_init - l - 1 + "\\)");
        		l++;
        	}
        }
        raw = raw.replaceAll("nil, ", "0, ");
		raw = raw.replaceAll("nil\\)", "0\\)");
        
        raw = raw.replaceAll("\\(l_", "\\(");
        raw = raw.replaceAll(" l_", " ");
        raw = raw.replaceAll("\\[l_", "\\[");
        raw = raw.replaceAll("\\(i_", "\\(");
        raw = raw.replaceAll(" i_", " ");
        raw = raw.replaceAll("\\[i_", "\\[");
        
        raw = raw.replaceAll("l==", "==");
        raw = raw.replaceAll("i==", "==");
        
        return raw;
	}
	
	public static void encodeLoopFree(String n, LinkedList<Pair<String, String>> ags, LinkedList<String> loc_ags, LinkedList<String> int_ags, CommonTree body, int int_init, int loc_init) {
		String m = n.split("__")[0];
		
		if (sig.equals("bst")) {
			writer.println("harness void " + n
	    			+ "(int[LOCVARSIZE-1] llocvars, int[INTVARSIZE] lintvars, int[HEAPSIZE-1] lleft, int[HEAPSIZE-1] lright, int[HEAPSIZE-1] lkey, bit[HEAPSIZE-1] lsymbolic, bit[HEAPSIZE-1] lactive,"
	    			+ "int ret_value, bit[HEAPSIZE-1] new_symbolic, int[HEAPSIZE-1] new_left, int[HEAPSIZE-1] new_right, int[HEAPSIZE-1] new_key) {\n\n"
	    			+ "\tint[HEAPSIZE-1] lnext = {};\n"
	    			+ "\tint[HEAPSIZE-1] lsupernext = {};\n"
	    			+ "\tinit(llocvars, lintvars, lnext, lsupernext, lleft, lright, lkey, lsymbolic, lactive);\n\n"
	    			+ "\tassume(basic_assumptions() && basic_axioms());\n");
		}
		else {
			writer.println("harness void " + n
	    			+ "(int[LOCVARSIZE-1] llocvars, int[INTVARSIZE] lintvars, int[HEAPSIZE-1] lnext, int[HEAPSIZE-1] lsupernext, int[HEAPSIZE-1] lkey, bit[HEAPSIZE-1] lsymbolic, bit[HEAPSIZE-1] lactive, "
	    			+ "int ret_value, bit[HEAPSIZE-1] new_symbolic, int[HEAPSIZE-1] new_next, int[HEAPSIZE-1] new_supernext, int[HEAPSIZE-1] new_key) {\n\n"
	    			+ "\tint[HEAPSIZE-1] lleft = {};\n"
	    			+ "\tint[HEAPSIZE-1] lright = {};\n"
	    			+ "\tinit(llocvars, lintvars, lnext, lsupernext, lleft, lright, lkey, lsymbolic, lactive);\n\n"
	    			+ "\tassume(basic_assumptions() && basic_axioms());\n");
		}
		
		//pre_cond
    	preCond(m, ags, int_init, loc_init);
    	
    	if (is.mtds.contains(m)) recursiveSnapshot(m, ags, int_init, loc_init);	
    	
    	if (!prevCond.isEmpty()) {
        	for (Integer condNum : prevCond) {
            	writer.println("\tassume !cond" + condNum + "();\n");
            }
    	}
        if (currCond >= 0) 
        	writer.println("\tassume cond" + currCond + "();\n");
    	
    	writer.println(encodeBasicBlock(ags, loc_ags, int_ags, body, loc_init-1, int_init, l_init-loc_init, i_init-int_init, false));
    	
    	//post_cond
    	postCond(m, ags, int_init, loc_init);
    	
    	writer.println("}");
	}
	
	public static void encodeLoop(String n, LinkedList<Pair<String, String>> ags, LinkedList<String> loc_ags, LinkedList<String> int_ags, List<CommonTree> pre, CommonTree loopBody, List<CommonTree> post, int int_init, int loc_init) {
		int locAux = (loopBody.getText().equals("loop") || loopBody.getText().equals("simple-loop")) ? Integer.valueOf(loopBody.getChild(0).getText()) : loc_ags.size();
		int intAux = (loopBody.getText().equals("loop") || loopBody.getText().equals("simple-loop")) ? Integer.valueOf(loopBody.getChild(1).getText()) : int_ags.size();
		int invSize = (loopBody.getText().equals("loop") || loopBody.getText().equals("simple-loop")) ? Integer.valueOf(loopBody.getChild(2).getText()) : loc_ags.size();
		
		String m = n.split("__")[0];
		HashSet<String> recs = is.olds.get(m);
		HashSet<String> preRecs = is.preRecs.get(m);
		HashSet<String> postRecs = is.postRecs.get(m);
		
		// assuming the last loop-related variable is for ranking?
		writer.println("int rank_var_" + m + " = " + (locAux > 0 ? locAux : l_init) + ";"); //gen_non_zero(locAux > 0 ? locAux : l_init) + ";");
		writer.println("int rank_var_aux_" + m + " = " + gen_non_zero(l_init - locAux - 1, locAux) + ";\n");
		
		//assuming not the last loop-related variable, which is usually used in loop condition
		writer.println("int mutate_var_" + m + " = " + gen_non_zero(locAux > 0 ? locAux-1 : l_init-1) + ";");
		
		//preserving choices
		if (sig.equals("bst"))
			writer.println("\nbit preserve_bst = " + postRecs.contains("bst") + ";");
		else {
			writer.println("\nbit preserve_sll = " + postRecs.contains("sll") + ";");
			writer.println("bit preserve_len = " + recs.contains("len") + ";");
			writer.println("bit preserve_min = " + recs.contains("min") + ";");
			writer.println("bit preserve_max = " + recs.contains("max") + ";\n");
			writer.println("bit preserve_lenseg = " + recs.contains("lenseg") + ";");
			writer.println("bit preserve_minseg = " + recs.contains("minseg") + ";");
			writer.println("bit preserve_maxseg = " + recs.contains("maxseg") + ";\n");
		}
		for (Pair<String, String> p : ags) {
        	if (p.getSecond().equals("int")) writer.println("bit preserve_" + p.getFirst() + " = 1;\n");
        }
		
		//guess ranking
		writer.println("void guess_ranking_" + m + "() {\n"
				+ "\tassume rank_var_" + m + ">0 && rank_var_" + m + "<LOCVARSIZE;\n"
				+ "\tassume rank_var_aux_" + m + ">0 && rank_var_aux_" + m + "<LOCVARSIZE;\n"
				+ "\tranking_snapshot(rank_func_" + m + ", rank_var_" + m + ", rank_var_aux_" + m + ");\n"
				+ "}\n");
		
		//loop invariant
		writer.println("bit loop_preserves_" + m + "() {\n"
				+ "\tbit single = " + ((loopBody.getText().equals("loop") || loopBody.getText().equals("simple-loop")) && locAux <= 2) + ";\n"
				+ "\tint comp1 = " + gen_non_zero((locAux < 2 ? 1 : (locAux-1))) + ";\n"
				//+ "\tint comp2 = gen_non_zero(" + (locAux < 2 ? 1 : (locAux-1)) + ")+1;\n"
				+ "\tint comp2 = comp1 + 1;\n"
				+ "\tint comp3 = " + gen_non_zero(l_init - locAux - 1, locAux) + ";\n"
				+ "\tint comp4 = " + gen_non_zero(l_init - locAux - 1, locAux) + ";\n"
				+ "\treturn (preserve_sll ? sll_equal_inv(LOCVARSIZE-1) : true)\n"
				+ "\t  && (preserve_len ? len_preserve_inv(old_len, comp1, comp2, comp3, single) : true)\n"
				+ "\t  && (preserve_min ? min_preserve_inv(old_min, comp1, comp2, comp3, single) : true)\n"
				+ "\t  && (preserve_max ? max_preserve_inv(old_max, comp1, comp2, comp3, single) : true)\n"
				+ "\t  && ((preserve_lenseg && comp3 != comp4) ? lenseg_preserve_inv(old_lenseg, comp1, comp2, comp3, comp4, single) : true)\n"
				+ "\t  && ((preserve_minseg && comp3 != comp4) ? minseg_preserve_inv(old_minseg, comp1, comp2, comp3, comp4, single) : true)\n"
				+ "\t  && ((preserve_maxseg && comp3 != comp4) ? maxseg_preserve_inv(old_maxseg, comp1, comp2, comp3, comp4, single) : true)");
		for (Pair<String, String> p : ags) {
        	if (p.getSecond().equals("int")) 
        		writer.println("\t  && (preserve_" + p.getFirst() + " ? intvars[0] == old_" + p.getFirst() + " : true)");
        }
		writer.println("\t;\n}\n");
		
		writer.print("bit loop_inv_" + m + "() {\n"
				+ "\treturn loop_preserves_" + m + "()");
		int i = 0;
		if (preRecs.contains("sll") || preRecs.contains("sllseg") || postRecs.contains("sll") || postRecs.contains("sllseg")) {
			//0 for SLL and 1 for SLLSEG
			writer.println("\n\t && predicate({| 0 | 1 |}, "
				+ locAux + ", " + intAux + ", "
				+ (l_init-locAux-1) + ", " + (i_init-intAux) + ")");
			i++;
		}
		if (preRecs.contains("rsll") || preRecs.contains("rsllseg") || postRecs.contains("rsll") || postRecs.contains("rsllseg")) {
			//8 for RSLL and 9 for RSLLSEG
			writer.println("\n\t && predicate({| 8 | 9 |}, "
				+ locAux + ", " + intAux + ", "
				+ (l_init-locAux-1) + ", " + (i_init-intAux) + ")");
			i++;
		}
		if (is.dirs.contains("next")) {
			//2 for NEXTTO
			writer.println("\n\t && predicate(2, "
				+ locAux + ", " + intAux + ", "
				+ (l_init-locAux-1) + ", " + (i_init-intAux) + ")");
			i++;
		}
		if (mutate_loc > 0) {
			//10 for DISJ
			writer.println("\n\t && predicate(10, "
				+ locAux + ", " + intAux + ", "
				+ (l_init-locAux-1) + ", " + (i_init-intAux) + ")");
			i++;
		}
		String any_pred = "\n\t && any_pred("
				+ locAux + ", " + intAux + ", "
				+ (l_init-locAux-1) + ", " + (i_init-intAux) + ")";
		while (i++ < invSize) {
			writer.print(any_pred);
		}
		writer.println(";\n}\n");
		
		writer.println("bit loop_inv_pre_" + m + "() {\n"
				+ "\treturn loop_inv_" + m + "();\n"
				+ "}\n");
		
		writer.println("bit loop_inv_post_" + m + "() {\n"
				+ "\treturn loop_inv_" + m + "()\n\t  && "
				+ "ranking_decreases(rank_func_" + m + ", rank_var_" + m + ", rank_var_aux_" + m + ");\n"
				+ "}\n");
		
		//loop condition
		writer.print("bit loop_cond_" + m + "() {\n\treturn ");
		if (loopBody.getText().equals("while")) {
			CommonTree loopCond = (CommonTree)loopBody.getChild(0);
			writer.print(convertCond(loopCond, loc_init-1, int_init, l_init-loc_init, i_init-int_init, false, ags, loc_ags, int_ags));
		}
		else writer.print("cond_for_loop(" + locAux + ", " + (l_init-locAux-1) + ", " + i_init + ")");
		writer.println(";\n}\n");
		
		//before loop
		if (sig.equals("bst")) {
			writer.println("harness void before_loop_" + m
	    			+ "(int[LOCVARSIZE-1] llocvars, int[INTVARSIZE] lintvars, int[HEAPSIZE-1] lleft, int[HEAPSIZE-1] lright, int[HEAPSIZE-1] lkey, bit[HEAPSIZE-1] lsymbolic, bit[HEAPSIZE-1] lactive) {\n\n"
	    			+ "\tint[HEAPSIZE-1] lnext = {};\n"
	    			+ "\tint[HEAPSIZE-1] lsupernext = {};\n"
	    			+ "\tinit(llocvars, lintvars, lnext, lsupernext, lleft, lright, lkey, lsymbolic, lactive);\n\n"
	    			+ "\tassume(basic_assumptions() && basic_axioms());");
		}
		else {
			writer.println("harness void before_loop_" + m
	    			+ "(int[LOCVARSIZE-1] llocvars, int[INTVARSIZE] lintvars, int[HEAPSIZE-1] lnext, int[HEAPSIZE-1] lsupernext, int[HEAPSIZE-1] lkey, bit[HEAPSIZE-1] lsymbolic, bit[HEAPSIZE-1] lactive) {\n\n"
	    			+ "\tint[HEAPSIZE-1] lleft = {};\n"
	    			+ "\tint[HEAPSIZE-1] lright = {};\n"
	    			+ "\tinit(llocvars, lintvars, lnext, lsupernext, lleft, lright, lkey, lsymbolic, lactive);\n\n"
	    			+ "\tassume(basic_assumptions() && basic_axioms());");
		}
    	writer.print("\tassume pre_cond_" + m + "(");
    	int count = 0;
    	int loc_count = l_init;
    	int int_count = i_init;
    	for (Pair<String, String> p : ags) {
    		if (count++ > 0) writer.print(", ");
    		if (p.getSecond().equals("loc")) writer.print(--loc_count);
    		else if (p.getSecond().equals("int")) writer.print(--int_count);
    	}
    	writer.println(");");
    	
    	writer.print("\tsnapshot_" + m + "(");
    	loc_count = l_init;
    	int_count = i_init;
    	for (Pair<String, String> p : ags) {
    		if (p.getSecond().equals("loc")) writer.print(--loc_count + ", ");
    		else if (p.getSecond().equals("int")) writer.print(--int_count + ", ");
    		if (p.getSecond().equals("int")) writer.print("old_" + p.getFirst() + ", ");
    	}
    	
    	if (sig.equals("bst")) writer.print("old_bst");
    	else writer.print("old_sll");
    	count = 1;
    	if (recs.contains("len")) {
    		if (count++ > 0) writer.print(", ");
    		writer.print("old_len");
    	}
    	if (recs.contains("min")) {
    		if (count++ > 0) writer.print(", ");
    		writer.print("old_min");
    	}
    	if (recs.contains("max")) {
    		if (count++ > 0) writer.print(", ");
    		writer.print("old_max");
    	}
    	if (recs.contains("size")) {
    		if (count++ > 0) writer.print(", ");
    		writer.print("old_size");
    	}
    	if (recs.contains("height")) {
    		if (count++ > 0) writer.print(", ");
    		writer.print("old_height");
    	}
    	if (recs.contains("lenseg")) {
    		if (count++ > 0) writer.print(", ");
    		writer.print("old_lenseg");
    	}
    	if (recs.contains("minseg")) {
    		if (count++ > 0) writer.print(", ");
    		writer.print("old_minseg");
    	}
    	if (recs.contains("maxseg")) {
    		if (count++ > 0) writer.print(", ");
    		writer.print("old_maxseg");
    	}
        writer.println(");\n");
		
        if (!prevCond.isEmpty()) {
        	for (Integer condNum : prevCond) {
            	writer.println("\tassume !cond" + condNum + "();\n");
            }
        }
        if (currCond >= 0) 
        	writer.println("\tassume cond" + currCond + "();\n");
        
		for (CommonTree ct : pre) {
			writer.println(encodeBasicBlock(ags, loc_ags, int_ags, ct, loc_init-1, int_init, l_init-loc_init, i_init-int_init, false));
		}
		
		for (i = 0; i < intAux; i++) {
			writer.println("\tupdate_intvar" + update_int + "(LOCVARSIZE-1, INTVARSIZE);");
			update_int_to[update_int] = i;
			update_int++;
		}
		for (i = 1; i <= locAux; i++) {
			writer.println("\tupdate_locvar" + update_loc + "(" + i + ", LOCVARSIZE-1, INTVARSIZE);");
			update_loc_to[update_loc] = i;
			update_loc++;
		}
		
		writer.println("\n\tassertPost(loop_inv_pre_" + m + "());\n}\n");
		
		update_int_before_loop = update_int;
		update_loc_before_loop = update_loc;
		
		
		//iterate
		writer.print("harness void iterate_" + m + "(");
		for (Pair<String, String> p : ags) {
    		if (p.getSecond().equals("int"))
    			writer.print("int lold_" + p.getFirst() + ", ");
    		if (p.getSecond().equals("loc")) {
    			if (sig.equals("bst")) {
    				writer.print("int lold_bst, ");
    				if (recs.contains("size")) writer.print("int lold_size, ");
                    if (recs.contains("height")) writer.print("int lold_height, ");
    			}
    			else {
    				writer.print("int lold_sll, ");
    				if (recs.contains("len")) writer.print("int lold_len, ");
        			if (recs.contains("min")) writer.print("int lold_min, ");
                    if (recs.contains("max")) writer.print("int lold_max, ");
                    if (recs.contains("lenseg")) writer.print("int lold_lenseg, ");
        			if (recs.contains("minseg")) writer.print("int lold_minseg, ");
                    if (recs.contains("maxseg")) writer.print("int lold_maxseg, ");
    			}
    		}
    	}
		if (sig.equals("bst")) {
			writer.println("int[LOCVARSIZE-1] llocvars, int[INTVARSIZE] lintvars, int[HEAPSIZE-1] lleft, int[HEAPSIZE-1] lright, int[HEAPSIZE-1] lkey, bit[HEAPSIZE-1] lsymbolic, bit[HEAPSIZE-1] lactive) {\n\n"
	    			+ "\tint[HEAPSIZE-1] lnext = {};\n"
	    			+ "\tint[HEAPSIZE-1] lsupernext = {};\n"
					+ "\tinit(llocvars, lintvars, lnext, lsupernext, lleft, lright, lkey, lsymbolic, lactive);\n");
		}
		else {
			writer.println("int[LOCVARSIZE-1] llocvars, int[INTVARSIZE] lintvars, int[HEAPSIZE-1] lnext, int[HEAPSIZE-1] lsupernext, int[HEAPSIZE-1] lkey, bit[HEAPSIZE-1] lsymbolic, bit[HEAPSIZE-1] lactive) {\n\n"
					+ "\tint[HEAPSIZE-1] lleft = {};\n"
	    			+ "\tint[HEAPSIZE-1] lright = {};\n"
					+ "\tinit(llocvars, lintvars, lnext, lsupernext, lleft, lright, lkey, lsymbolic, lactive);\n");
		}
		for (Pair<String, String> p : ags) {
    		if (p.getSecond().equals("int"))
    			writer.println("\told_" + p.getFirst() + " = lold_" + p.getFirst() + ";");
    		if (p.getSecond().equals("loc")) {
    			if (sig.equals("bst")) {
    				writer.println("\told_bst = lold_bst;");
    				if (recs.contains("size")) writer.println("\told_size = lold_size;");
        			if (recs.contains("height")) writer.println("\told_height = lold_height;");
    			}
    			else {
    				writer.println("\told_sll = lold_sll;");
    				if (recs.contains("len")) writer.println("\told_len = lold_len;");
        			if (recs.contains("min")) writer.println("\told_min = lold_min;");
        			if (recs.contains("max")) writer.println("\told_max = lold_max;");
        			if (recs.contains("lenseg")) writer.println("\told_lenseg = lold_lenseg;");
        			if (recs.contains("minseg")) writer.println("\told_minseg = lold_minseg;");
        			if (recs.contains("maxseg")) writer.println("\told_maxseg = lold_maxseg;");
    			}
    		}
    	}
    	writer.println("\n\tassume(basic_assumptions() && basic_axioms());\n"
    			+ "\tassume loop_inv_pre_" + m + "();\n"
    			+ "\tassume loop_cond_" + m + "();\n"
    			+ "\tguess_ranking_" + m + "();\n");
    	
    	if (loopBody.getText().equals("while")) 
    		writer.println(encodeBasicBlock(ags, loc_ags, int_ags, (CommonTree)loopBody.getChild(1), loc_init-1, int_init, l_init-loc_init, i_init-int_init, false));
    	else if (loopBody.getText().equals("simple-loop")) {
    		for (i = 0; i < intAux; i++) 
    			writer.println("\tupdate_intvar" + update_int++ + "(" + locAux + ", " + intAux + ");");
    		for (i = 1; i <= locAux; i++) 
    			writer.println("\tupdate_locvar" + update_loc++ + "(" + i + ", " + locAux + ", " + intAux + ");");
    	}
    	else if (loopBody.getText().equals("loop") || loopBody.getText().equals("simple-loop")) {
    		for (i = 0; i < intAux; i++) {
    			writer.println("\tupdate_intvar" + update_int + "(" + locAux + ", " + intAux + ");");
    			update_int_to[update_int] = i;
    			update_int++;
    		}
    		for (i = 1; i <= locAux; i++) {
    			writer.println("\tupdate_locvar" + update_loc + "(" + i + ", " + locAux + ", " + intAux + ");");
    			update_loc_to[update_loc] = i;
    			update_loc++;
    		}
    		writer.println("\tmutate_locvar" + mutate_loc++ + "(mutate_var_" + m + ", " + locAux + ", " + intAux + ");");
    		//for (int i = 1; i <= locAux; i++) 
    		//	writer.println("\tmutate_locvar" + mutate_loc++ + "(" + i + ", " + locAux + ", " + intAux + ");");
    	}
    	
    	writer.println("\n\tassertPost(loop_inv_post_" + m + "());\n}\n");
    	
    	
    	//after loop
    	writer.print("harness void after_loop_" + m + "(");
    	for (Pair<String, String> p : ags) {
    		if (p.getSecond().equals("int"))
    			writer.print("int lold_" + p.getFirst() + ", ");
    		if (p.getSecond().equals("loc")) {
    			if (sig.equals("bst")) {
    				writer.print("int lold_bst, ");
    				if (recs.contains("size")) writer.print("int lold_size, ");
                    if (recs.contains("height")) writer.print("int lold_height, ");
    			}
    			else {
    				writer.print("int lold_sll, ");
    				if (recs.contains("len")) writer.print("int lold_len, ");
        			if (recs.contains("min")) writer.print("int lold_min, ");
                    if (recs.contains("max")) writer.print("int lold_max, ");
                    if (recs.contains("lenseg")) writer.print("int lold_lenseg, ");
        			if (recs.contains("minseg")) writer.print("int lold_minseg, ");
                    if (recs.contains("maxseg")) writer.print("int lold_maxseg, ");
    			}
    		}
    	}
    	if (sig.equals("bst")) {
    		writer.println("int[LOCVARSIZE-1] llocvars, int[INTVARSIZE] lintvars, int[HEAPSIZE-1] lleft, int[HEAPSIZE-1] lright, int[HEAPSIZE-1] lkey, bit[HEAPSIZE-1] lsymbolic, bit[HEAPSIZE-1] lactive) {\n\n"
    				+ "\tint[HEAPSIZE-1] lnext = {};\n"
	    			+ "\tint[HEAPSIZE-1] lsupernext = {};\n"
    				+ "\tinit(llocvars, lintvars, lnext, lsupernext, lleft, lright, lkey, lsymbolic, lactive);\n");
    	}
    	else {
    		writer.println("int[LOCVARSIZE-1] llocvars, int[INTVARSIZE] lintvars, int[HEAPSIZE-1] lnext, int[HEAPSIZE-1] lsupernext, int[HEAPSIZE-1] lkey, bit[HEAPSIZE-1] lsymbolic, bit[HEAPSIZE-1] lactive) {\n\n"
    				+ "\tint[HEAPSIZE-1] lleft = {};\n"
	    			+ "\tint[HEAPSIZE-1] lright = {};\n"
    				+ "\tinit(llocvars, lintvars, lnext, lsupernext, lleft, lright, lkey, lsymbolic, lactive);\n");
    	}
		for (Pair<String, String> p : ags) {
    		if (p.getSecond().equals("int"))
    			writer.println("\told_" + p.getFirst() + " = lold_" + p.getFirst() + ";");
    		if (p.getSecond().equals("loc")) {
    			if (sig.equals("bst")) {
    				writer.println("\told_bst = lold_bst;");
    				if (recs.contains("size")) writer.println("\told_size = lold_size;");
        			if (recs.contains("height")) writer.println("\told_height = lold_height;");
    			}
    			else {
    				writer.println("\told_sll = lold_sll;");
    				if (recs.contains("len")) writer.println("\told_len = lold_len;");
        			if (recs.contains("min")) writer.println("\told_min = lold_min;");
        			if (recs.contains("max")) writer.println("\told_max = lold_max;");
        			if (recs.contains("lenseg")) writer.println("\told_lenseg = lold_lenseg;");
        			if (recs.contains("minseg")) writer.println("\told_minseg = lold_minseg;");
        			if (recs.contains("maxseg")) writer.println("\told_maxseg = lold_maxseg;");
    			}
    		}
    	}
    	writer.println("\n\tassume(basic_assumptions() && basic_axioms());\n"
    	    	+ "\tassume loop_inv_" + m + "();\n"
    			+ "\tassume !loop_cond_" + m + "();\n");
    	
    	
    	if (loopBody.getText().equals("loop") || loopBody.getText().equals("simple-loop")) {
    		writer.println("\tmutate_locvar" + mutate_loc++ + "(" + gen_non_zero(locAux > 0 ? locAux : l_init) + ", " + locAux + ", " + intAux + ");");
    		//for (int i = 1; i <= locAux; i++) 
    		//	writer.println("\tmutate_locvar" + mutate_loc++ + "(" + i + ", " + locAux + ", " + intAux + ");");
    	}
    	
    	for (CommonTree ct : post) {
			writer.println(encodeBasicBlock(ags, loc_ags, int_ags, ct, loc_init-1, int_init, l_init-loc_init, i_init-int_init, false));
		}
    	
    	writer.print("\tassertPost(post_cond_" + m + "(ret");
    	loc_count = 0;
		int_count = 0;
		for (Pair<String, String> p : ags) {
			if (p.getSecond().equals("int"))
				writer.print(", " + (i_init-(++int_count)));
			if (p.getSecond().equals("loc"))
				writer.print(", " + (l_init-(++loc_count)));
		}
    	for (i = 0; i < ags.size(); i++) {
    		Pair<String, String> p = ags.get(i);
    		if (p.getSecond().equals("int"))
    			writer.print(", old_" + p.getFirst());
    		if (p.getSecond().equals("loc")) {
    			count = 0;
    	    	if (recs.contains("len")) writer.print(", old_len");
    	    	if (recs.contains("min")) writer.print(", old_min");
    	    	if (recs.contains("max")) writer.print(", old_max");
    	    	if (recs.contains("size")) writer.print(", old_size");
    	    	if (recs.contains("height")) writer.print(", old_height");
    	    	for (int j = i+1; j < ags.size(); j++) {
    	    		Pair<String, String> q = ags.get(j);
    	    		if (recs.contains("lenseg")) writer.print(", old_lenseg");
        	    	if (recs.contains("minseg")) writer.print(", old_minseg");
        	    	if (recs.contains("maxseg")) writer.print(", old_maxseg");
    	    	}
    		}
    	}
    	writer.println("));\n}\n");
	}
	
	@SuppressWarnings("unchecked")
	public static void encodeHoareTriple(String m, LinkedList<Pair<String, String>> ags, LinkedList<String> loc_ags, LinkedList<String> int_ags, CommonTree body, int loc_init, int int_init) {
		if (body.getText().equals("ATOMSTMT"))
			encodeHoareTriple(m, ags, loc_ags, int_ags, (CommonTree)body.getChild(0), loc_init, int_init);
		else {
	    	int loop = -1;
	    	if (body.getText().equals("while") || body.getText().equals("loop") || body.getText().equals("simple-loop")) loop = 0;
	    	else if (body.getText().equals("SEQ")) {
	    		int count = 0;
	    		for (CommonTree c : (List<CommonTree>)body.getChildren()) {
	    			if (c.getText().equals("while") || c.getText().equals("loop") || c.getText().equals("simple-loop")) loop = count;
	    			count++;
	    		}
	    	}
	    	
	    	if (loop < 0) encodeLoopFree(m, ags, loc_ags, int_ags, body, int_init, loc_init);
	    	else {
	    		List<CommonTree> pre = (List<CommonTree>)body.getChildren().subList(0, loop);
	    		CommonTree loopBody = (CommonTree)body.getChildren().get(loop);
	    		List<CommonTree> post = (List<CommonTree>)body.getChildren().subList(loop+1, body.getChildren().size());
	    		encodeLoop(m, ags, loc_ags, int_ags, pre, loopBody, post, int_init, loc_init);
	    	}
		}
    	
	}
	
	private static void encodeBranch(String m, LinkedList<Pair<String, String>> ags, LinkedList<String> loc_ags, LinkedList<String> int_ags, CommonTree body, int loc_init, int int_init) {
		if (body.getText().equals("if")) {
			currCond = cond_count++;
			CommonTree cond = (CommonTree)body.getChild(0);
			writer.println("bit cond" + currCond + "() {");
			writer.println("\treturn " + encodeBasicBlock(ags, loc_ags, int_ags, cond, loc_init-1, int_init, l_init-loc_init, i_init-int_init, true) + ";\n}\n");
			encodeHoareTriple(m+"__"+currCond, ags, loc_ags, int_ags, (CommonTree)body.getChild(1), loc_init, int_init);
			if (body.getChildCount() == 3) {
				prevCond.add(Integer.valueOf(currCond));
				currCond = -1;
				body = (CommonTree)body.getChild(2).getChild(0);
				encodeBranch(m, ags, loc_ags, int_ags, body, loc_init, int_init);
			}
		}
		else encodeHoareTriple(m+"__"+cond_count, ags, loc_ags, int_ags, body, loc_init, int_init);
		
	}

	public static void main(String[] args) throws Exception {
		if (args[0].equals("tree")) sig = "bst";
		else sig = "lseg";
	
		//to read the parameters form file
		Scanner inputFileToGetParameter = new Scanner(new File("examples//" + args[0] + "//" + args[1] + ".imp"));
		String[] argsFromFile = new String[4];
		if(inputFileToGetParameter.hasNext()&&inputFileToGetParameter.next().equals("#pragma")
				&&inputFileToGetParameter.hasNext()&&inputFileToGetParameter.next().equals("option")){
			//System.out.println("have parameters");
			// read the parameters form file
			int i=0;
			for(i=0;i<4&&inputFileToGetParameter.hasNext();i++){//read for parameters
				argsFromFile[i]=inputFileToGetParameter.next();
			}
			if(i!=4){// do not have 4 parameters
				System.out.println("Do not have enough parameters");
				return;
			}
		}
		else{//set the default parameters here
			//System.out.println("set to default parameters");
			argsFromFile[0]="4";
			argsFromFile[1]="3";
			argsFromFile[2]="2";
			argsFromFile[3]="1";
		}
		inputFileToGetParameter.close();

        ANTLRFileStream in = new ANTLRFileStream("examples//" + args[0] + "//" + args[1] + ".imp");
        ImpLexer lexer = new ImpLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ImpParser parser = new ImpParser(tokens);
        CommonTree tree = (CommonTree)parser.program().getTree();
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
        is = new ImpSynt(nodes);
        ImpSynt.program_return pr = is.program();
        

        i_init = Integer.valueOf(argsFromFile[2]);
    	l_init = Integer.valueOf(argsFromFile[1]);
    	bnd = Integer.valueOf(argsFromFile[0]);
        
        writer = new PrintWriter("sk//" + args[0] + "//" + args[1] + ".sk");
        
        //arguments
        writer.println("pragma options \"--slv-simiters 4"
        		+ " --bnd-inbits " + ((i_init <= 1) ? (sig.equals("bst") ? 3 : 3) : (i_init+1))
        		+ (sig.equals("bst") ? " --bnd-bound-mode CALLSITE" : "")
        		+ " --bnd-inline-amnt " + (sig.equals("bst") ? 3 : (bnd+3))
        		+ " --bnd-unroll-amnt " + (bnd-1)
        		+ " \";\n\n"
        		+ "int TIMESIZE = 4;\n"
        		+ "int BOUND = " + (sig.equals("bst") ? 2 : (bnd-1)) + ";\n"
        		+ "int INTMAX = 7;\n" // + (int)(Math.pow(2, i_init+2) - 1) + ";\n"
        		+ "int HEAPSIZE = " + argsFromFile[0] + ";\n"
        		+ "int LOCVARSIZE = " + argsFromFile[1] + ";\n"
        		+ "int INTVARSIZE = " + ((i_init == 0) ? "1" : argsFromFile[2]) + ";\n"
        		+ "int MBUDGET = " + argsFromFile[3] + ";\n\n"
        		+ "include \"header/" + sig + "_header.skh\";\n");
        
        //snapshots of int vars, len, min, max at every call site
        writer.print("int ");
        for (String m : is.mtds) {
        	LinkedList<Pair<String, String>> ags = is.args.get(m);
        	LinkedList<String> local_loc_ags = new LinkedList<String>();
        	LinkedList<String> local_int_ags = new LinkedList<String>();
        	int count = 0;
        	if (sig.equals("bst")) {
        		if (count++ > 0) writer.print(", "); 
        		writer.print("old_bst");
        	}
        	//else writer.print("old_sll");
        	for (Pair<String, String> p : ags) {
        		if (p.getSecond().equals("int")) {
        			if (count++ > 0) writer.print(", "); 
        			writer.print("old_" + p.getFirst());
        		}
        	}
        	HashSet<String> recs = is.olds.get(m);
        	if (recs.contains("sll") || true) {
        		if (count++ > 0) writer.print(", "); 
        		writer.print("old_sll");
        	} 
        	if (recs.contains("len") || true) {
        		if (count++ > 0) writer.print(", "); 
        		writer.print("old_len");
        	} 
        	if (recs.contains("min") || true) {
        		if (count++ > 0) writer.print(", "); 
        		writer.print("old_min");
        	}
        	if (recs.contains("max") || true) {
        		if (count++ > 0) writer.print(", "); 
        		writer.print("old_max");
        	}
        	if (recs.contains("size") || true) {
        		if (count++ > 0) writer.print(", "); 
        		writer.print("old_size");
        	}
        	if (recs.contains("height") || true) {
        		if (count++ > 0) writer.print(", "); 
        		writer.print("old_height");
        	}
        	if (recs.contains("lenseg") || true) {
        		if (count++ > 0) writer.print(", "); 
        		writer.print("old_lenseg");
        	} 
        	if (recs.contains("minseg") || true) {
        		if (count++ > 0) writer.print(", "); 
        		writer.print("old_minseg");
        	}
        	if (recs.contains("maxseg") || true) {
        		if (count++ > 0) writer.print(", "); 
        		writer.print("old_maxseg");
        	}
        	writer.println(";\n");
        }
        
        /*for (String m : is.mtds) {
        	LinkedList<Pair<String, String>> ags = is.args.get(m);
        	
        }
        
        for (int i = 1; i <= is.callCount; i++) {
        	writer.println("int len_before_call_" + i + ", min_before_call_" + i + ", max_before_call_" + i + ";\n");
        }*/
        
        LinkedList<String> recursiveMtds = new LinkedList<String>();
        for (String m : is.mtds) {
        	for (int i = 0; i < is.callCount; i++) {
        		if (m.equals(is.callees.get(i))) recursiveMtds.add(m);
        	}
        }
        
        //ranking function
        //for (String m : recursiveMtds) {
        	//writer.println("int rank_func_" + m + " = " + gen_non_zero(3) + "; //len, min or max");
        //}
        /*for (int i = 0; i < is.callCount; i++) {
            if (is.call_args.get(i).get(0).equals("??")) 
            	writer.println("int rank_var_for_call_" + i + " = " + gen_non_zero(Integer.valueOf(args[3]) - 1) + ";\n");
        }*/
        
        
        //recursive calls
        for (String m : recursiveMtds) {
        	LinkedList<Pair<String, String>> ags = is.args.get(m);
        	createRecursiveCall(m, ags);
        }
        
        //encode every method
        for (String m : is.mtds) {
        	LinkedList<Pair<String, String>> ags = is.args.get(m);
        	LinkedList<String> local_loc_ags = new LinkedList<String>();
        	LinkedList<String> local_int_ags = new LinkedList<String>();
        	
        	writer.print("int rank_func_" + m + " = ");
        	if (sig.equals("bst")) writer.println("SIZE");
        	else if (is.preRecs.get(m).contains("sll") || is.preRecs.get(m).contains("rll")) {
        		if (is.preRecs.get(m).contains("sllseg") || is.preRecs.get(m).contains("rllseg"))
        			writer.print("{| LEN | LENSEG |}"); 
        		else writer.print("LEN"); 
        	}
        	else if (is.preRecs.get(m).contains("sllseg") || is.preRecs.get(m).contains("rllseg"))
        		writer.print("LENSEG"); 
        	else writer.print("LEN");
        	writer.println(";");
        	
        	//snapshot function
            writer.print("\nvoid snapshot_" + m + "(");
            int count = 0;
        	for (Pair<String, String> p : ags) {
        		if (count++ > 0) writer.print(", ");
        		writer.print("int " + p.getFirst());
        		if (p.getSecond().equals("int")) writer.print(", ref int o" + p.getFirst());
        	}
        	HashSet<String> recs = is.olds.get(m);
        	if (sig.equals("bst")) writer.print(", ref int obst");
        	else writer.print(", ref int osll");
        	//if (recs.equals("sll")) writer.print(", ref int osll");
        	if (recs.contains("len")) writer.print(", ref int olen");
        	if (recs.contains("min")) writer.print(", ref int omin");
        	if (recs.contains("max")) writer.print(", ref int omax");
        	if (recs.contains("size")) writer.print(", ref int osize");
        	if (recs.contains("height")) writer.print(", ref int oheight");
        	if (recs.contains("lenseg")) writer.print(", ref int olenseg");
        	if (recs.contains("minseg")) writer.print(", ref int ominseg");
        	if (recs.contains("maxseg")) writer.print(", ref int omaxseg");
            writer.println(") {");
            boolean waitInt = true;
            boolean waitLoc = true;
            for (Pair<String, String> p : ags) {
        		if (p.getSecond().equals("int") && waitInt) {
        			writer.print("\to" + p.getFirst() + " = intvars[" + p.getFirst() + "];\n");
        			waitInt = false;
        		}
        		if (p.getSecond().equals("loc") && waitLoc) {
        			if (sig.equals("bst")) 
        				writer.println("\tobst = bst_comp(locvars[" + p.getFirst() + "]);");
        			//else writer.println("\tosll = sll_comp(locvars[" + p.getFirst() + "]);");
        			if (recs.contains("sll")) 
        				writer.println("\tosll = sll_comp(locvars[" + p.getFirst() + "]);");
        			if (recs.contains("len")) 
        				writer.println("\tolen = len_comp(locvars[" + p.getFirst() + "]);");
        			if (recs.contains("min")) 
        				writer.println("\tomin = min_comp(locvars[" + p.getFirst() + "]);");
        			if (recs.contains("max")) 
        				writer.println("\tomax = max_comp(locvars[" + p.getFirst() + "]);");
        			if (recs.contains("size")) 
        				writer.println("\tosize = size_comp(locvars[" + p.getFirst() + "]);");
        			if (recs.contains("height")) 
        				writer.println("\toheight = height_comp(locvars[" + p.getFirst() + "]);");
        			waitLoc = false;
        			for (Pair<String, String> q : ags) {
        				if (p.getFirst().equals(q.getFirst())) continue;
        				if (recs.contains("lenseg")) 
            				writer.println("\tolenseg = lenseg_comp(locvars[" + p.getFirst() + "], locvars[" + q.getFirst() + "]);");
            			if (recs.contains("minseg")) 
            				writer.println("\tominseg = minseg_comp(locvars[" + p.getFirst() + "], locvars[" + q.getFirst() + "]);");
            			if (recs.contains("maxseg")) 
            				writer.println("\tomaxseg = maxseg_comp(locvars[" + p.getFirst() + "], locvars[" + q.getFirst() + "]);");
        			}
        		}
        	}
            writer.println("}\n");
        	
        	//precondition
        	writer.print("bit pre_cond_" + m + "(");
        	count = 0;
        	for (Pair<String, String> p : ags) {
        		if (count++ > 0) writer.print(", ");
        		writer.print("int " + p.getFirst());
        	}
        	writer.println(") {");
        	writer.println("\treturn " + convertForm(is.requires_ensures.get(m).getFirst()) + ";\n"
        			+ "}\n");
        	
        	//postcondition
        	writer.print("bit post_cond_" + m + "(int r");
        	for (Pair<String, String> p : ags) {
    			writer.print(", int " + p.getFirst());
    		}
        	for (int i = 0; i < ags.size(); i++) {
        		Pair<String, String> p = ags.get(i);
        		if (p.getSecond().equals("int"))
        			writer.print(", " + p.getSecond() + " old_" + p.getFirst());
        		if (p.getSecond().equals("loc")) {
        			if (recs.contains("len")) writer.print(", ref int old_len_" + p.getFirst());
            		if (recs.contains("min")) writer.print(", ref int old_min_" + p.getFirst());
            		if (recs.contains("max")) writer.print(", ref int old_max_" + p.getFirst());
            		if (recs.contains("size")) writer.print(", ref int old_size_" + p.getFirst());
            		if (recs.contains("height")) writer.print(", ref int old_height_" + p.getFirst());
            		for (int j = i+1; j < ags.size(); j++) {
            			Pair<String, String> q = ags.get(j);
            			if (recs.contains("lenseg")) writer.print(", ref int old_lenseg_" + p.getFirst() + "_" + q.getFirst());
                		if (recs.contains("minseg")) writer.print(", ref int old_minseg_" + p.getFirst() + "_" + q.getFirst());
                		if (recs.contains("maxseg")) writer.print(", ref int old_maxseg_" + p.getFirst() + "_" + q.getFirst());
            		}
        		}
        	}
        	writer.println(") {");
        	writer.println("\treturn " + convertForm(is.requires_ensures.get(m).getSecond()) + ";\n"
        			+ "}\n");
        	
        	int int_init = i_init, loc_init = l_init;	
        	for (Pair<String, String> p : ags) {
        		if (p.getSecond().equals("int")) int_init--;
        		if (p.getSecond().equals("loc")) loc_init--;
        	}
        	
        	CommonTree body = is.body.get(m);
        	prevCond = new LinkedList<Integer>();
        	currCond = -1;
        	if (body.getChildCount() == 1 && body.getChild(0).getText().equals("if"))
        		encodeBranch(m, ags, local_loc_ags, local_int_ags, (CommonTree)body.getChild(0), loc_init, int_init);
        	else encodeHoareTriple(m, ags, local_loc_ags, local_int_ags, body, loc_init, int_init);
        	
        }
        
        //auxiliary statement and cond functions
        for (int i = 0; i < statement_id; i++) {
        	writer.println("void statement" + i + "(int locrange, int intrange, int locrange2, int intrange2) { \n\tstatement(locrange, intrange, locrange2, intrange2);\n}");
        }
        for (int i = 0; i < cond_id; i++) {
        	writer.println("bit basic_cond" + i + "(int locrange, int intrange) { \n\treturn basic_cond(locrange, intrange);\n}");
        }
        for (int i = 0; i < branch_id; i++) {
        	writer.println("bit basic_branch_cond" + i + "(int locrange, int locstart, int intrange, int intstart) { \n\treturn basic_branch_cond(locrange, locstart, intrange, intstart);\n}");
        }
        for (int i = 0; i < loc_id; i++) {
        	writer.println("int loc_id" + i + "(int locrange) { \n\treturn gen_non_zero(locrange);\n}");
        }
        for (int i = 0; i < int_id; i++) {
        	writer.println("int int_id" + i + "(int intrange) { \n\treturn gen_all(intrange);\n}");
        }
        for (int i = 0; i < update_int_before_loop; i++) {
        	writer.println("void update_intvar" + i + "(int locrange, int intrange) { \n\tupdate_intvar_statement(" + update_int_to[i] + ", locrange - " + (update_loc_before_loop - i) + ", intrange);\n}");
        }
        for (int i = update_int_before_loop; i < update_int; i++) {
        	writer.println("void update_intvar" + i + "(int locrange, int intrange) { \n\tupdate_intvar(" + update_int_to[i] + ", locrange, intrange);\n}");
        }
        for (int i = 0; i < update_loc_before_loop; i++) {
        	writer.println("void update_locvar" + i + "(int to, int locrange, int intrange) { \n\tupdate_locvar(to , locrange, intrange);\n}");
        }
        for (int i = update_loc_before_loop; i < update_loc; i++) {
        	writer.println("void update_locvar" + i + "(int to, int locrange, int intrange) { \n\tupdate_locvar(to, locrange, intrange);\n}");
        }
        for (int i = 0; i < mutate_loc; i++) {
        	writer.println("void mutate_locvar" + i + "(int v, int locrange, int intrange) { \n\tmutate_locvar(v, locrange, intrange);\n}");
        }
        for (int i = 0; i < create_node_id; i++) {
        	writer.println("void create_node" + i + "(int v, int locrange, int intrange) { \n\tcreate_node(v, locrange, intrange);\n}");
        }
        
        writer.close();
        
        //cleanup
        Files.deleteIfExists(new File("output//" + args[0] + "//" + args[1] + ".out").toPath());
        Files.deleteIfExists(new File("output//" + args[0] + "//" + args[1] + ".cpp").toPath());
        
        //run sketch
        //System.out.println(new File("sk").getAbsolutePath());
        //String[] command = {"/Users/xkqiu/hg/sketch-frontend/target/sketch-1.7.2-noarch-launchers/sketch", "--fe-cegis-path", "/Users/xkqiu/hg/sketch-backend/src/SketchSolver/cegis", "-p", "lowering", "-V", "10", "--fe-output-code", "--fe-output-dir", "..//output//" + args[0] + "//", args[0] + "/" + args[1] + ".sk"};
        String[] command = {"/home/waghon/tools/sketch-1.7.2/sketch-frontend/sketch", "--fe-cegis-path", "/home/waghon/tools/sketch-1.7.2/sketch-backend/src/SketchSolver/cegis", "-p", "lowering", "-V", "10", "--fe-output-code", "--fe-output-dir", "..//output//" + args[0] + "//", args[0] + "/" + args[1] + ".sk"};
        //, "--fe-custom-codegen", "..//codegen//lib//codegen.jar"
        ProcessBuilder sketch = new ProcessBuilder(command);
        //sketch.directory(new File("/Users/xkqiu/Documents/workspace/ImpSynt/sk"));
        sketch.directory(new File("/home/waghon/Projects/ImpSynt/sk"));
        sketch.redirectErrorStream(true);
        sketch.redirectOutput(new File("output//" + args[0] + "//" + args[1] + ".out"));
        Process p = sketch.start();
        p.waitFor();
        
        //sketch.directory(new File("").getAbsoluteFile());
        //sketch.redirectOutput(new File("output//" + args[0] + "//" + args[1] + ".out"));
        //System.out.println(sketch.command());
        //Process pcs = sketch.start();
        
        /*
        System.out.println(tree.getText());
        List<? extends Object> l = tree.getChildren();
        if (l != null)
          for (Object t : l) System.out.println(((CommonTree)t).getText());
        DOTTreeGenerator gen = new DOTTreeGenerator();
        StringTemplate st = gen.toDOT(tree);
        System.out.println(st);
        */
        
        File cpp = new File("output//" + args[0] + "//" + args[1] + ".cpp");
        if (! Files.exists(cpp.toPath())) {
        	System.out.println("ERROR: Sketch could not be resolved!");
        	return;
        }
        
        Scanner scanner = new Scanner(cpp);
        String text = scanner.useDelimiter("\\A").next();
        //System.out.println(text);
        
        Scanner sk_scanner = new Scanner(new File("sk//" + args[0] + "//" + args[1] + ".sk"));
        String sk_text = sk_scanner.useDelimiter("\\A").next();
        
        //find holes
        nodes = new CommonTreeNodeStream((Tree)pr.tree);
        nodes.setTokenStream(tokens);
        ImpSyntHoleFinder hfinder = new ImpSyntHoleFinder(nodes);
        hfinder.program();
        //for (Integer t : hfinder.unknownInts) System.out.println(t);
        
        //decode filled parser tree
        nodes = new CommonTreeNodeStream((Tree)pr.tree);
        nodes.setTokenStream(tokens);
        ImpPrinter printer = new ImpPrinter(nodes);
        ImpPrinter.program_return r4 = printer.program();
        String prg = r4.st.toString();
        int count = 0;
        for (Integer t : hfinder.unknownLocs) {
        	String replace = decodeLoc(text, count++, sk_text, l_init);
        	prg = prg.replaceFirst("\\?\\?\\?", replace);
        }
        count = 0;
        for (Integer t : hfinder.unknownInts) {
        	String replace = decodeInt(text, count++, sk_text, i_init);
        	prg = prg.replaceFirst("\\?\\?", replace);
        }
        count = 0;
        for (Tree t : hfinder.unknownConds) {
        	String replace = decodeCond(text, count++, sk_text, l_init, i_init);
        	prg = prg.replaceFirst("cond\\(1\\)", replace);
        }
        count = 0;
        for (Tree t : hfinder.unknownStmts) {
        	String replace = decodeStatement(text, count++, sk_text, l_init, i_init);
        	prg = prg.replaceFirst("statement\\(1\\)", replace);
        }
        count = 0;
        for (Tree t : hfinder.unknownLoops) {
        	int start = prg.indexOf("loop(");
        	int length = prg.substring(start+5).indexOf(");");
        	String threeArgs = prg.substring(start+5, start+length+5);
        	String replaced = "loop\\(" + threeArgs + "\\);";
        	String[] auxs = threeArgs.split(",");
        	int locAux = Integer.valueOf(auxs[0].trim()).intValue();
        	int intAux = Integer.valueOf(auxs[1].trim()).intValue();
        	String replace = decodeLoop(is.mtds.iterator().next(), text, locAux, intAux, count++, sk_text, l_init, i_init);
        	prg = prg.replaceFirst(replaced, replace);
        	//System.out.println(prg);
        }
        count = 0;
        for (Tree t : hfinder.unknownSimpleLoops) {
        	int start = prg.indexOf("simple-loop(");
        	int length = prg.substring(start+12).indexOf(");");
        	String threeArgs = prg.substring(start+12, start+length+12);
        	String replaced = "loop\\(" + threeArgs + "\\);";
        	String[] auxs = threeArgs.split(",");
        	int locAux = Integer.valueOf(auxs[0].trim()).intValue();
        	int intAux = Integer.valueOf(auxs[1].trim()).intValue();
        	String replace = decodeLoop(is.mtds.iterator().next(), text, locAux, intAux, count++, sk_text, l_init, i_init);
        	prg = prg.replaceFirst(replaced, replace);
        	//System.out.println(prg);
        }
        count = 0;
        for (Integer t : hfinder.unknownNew) {
        	String replaced = "new";
        	String replace = decodeNew(text, count++, sk_text, l_init, i_init);
        	prg = prg.replaceFirst(replaced, replace);
        }
        
        writer = new PrintWriter("output//" + args[0] + "//" + args[1] + ".imp");
        writer.println(prg);
        writer.close();
    }
	
	public static String strip(String subst, String command) {
		int st = subst.indexOf(command + "(");
		subst = subst.substring(st);
		return subst.substring(subst.indexOf("(")+1);
	}
	
	public static LinkedList<Pair<String, String>> findArgs(String prg, String key) {
		String[] segments = prg.split("harness ");
		for (int i = 1; i < segments.length; i++) {
			if (segments[i].contains(key + "(")) {
				String mname = "";
				for (String m : is.mtds) {
					if (segments[i].contains(m)) mname = m;
				}
				return is.args.get(mname);
			}
		}
		return null;
	}
	
	public static String decodeLocVar(int n, String prg, int count, String key) {
		LinkedList<Pair<String, String>> ags = findArgs(prg, key);
		LinkedList<Pair<String, String>> filtered_ags = new LinkedList<Pair<String, String>>();
		for (Pair<String, String> p : ags) if (p.getSecond().equals("loc")) filtered_ags.add(p);
		if (n == 0) return "nil";
		else if (count <= n) return "ERROR";
		else if (count-n <= filtered_ags.size()) return filtered_ags.get(count-n-1).getFirst();
		else return "l_" + n;
	}
	
	public static String decodeIntVar(int n, String prg, int count, String key) {
		LinkedList<Pair<String, String>> ags = findArgs(prg, key);
		LinkedList<Pair<String, String>> filtered_ags = new LinkedList<Pair<String, String>>();
		for (Pair<String, String> p : ags) if (p.getSecond().equals("int")) filtered_ags.add(p);
		System.out.println(filtered_ags.size());
		if (count <= n) return "ERROR";
		else if (count-n <= filtered_ags.size()) return filtered_ags.get(count-n-1).getFirst();
		else return "i_" + n;
	}
	
	public static String decodeLoc(String text, int i, String prg, int count) {
		int idx = text.indexOf("void loc_id" + i + "(");
		String subst = text.substring(idx).split("}")[0];
		String[] p = subst.split("_out = ");
		int n = Integer.parseInt(p[p.length-1].split(";")[0]);
		return decodeLocVar(n, prg, count, "loc_id" + i);
	}
	
	public static String decodeInt(String text, int i, String prg, int count) {
		int idx = text.indexOf("void int_id" + i + "(");
		String subst = text.substring(idx).split("}")[0];
		String[] p = subst.split("_out = ");
		int n = Integer.parseInt(p[p.length-1].split(";")[0]);
		return decodeIntVar(n, prg, count, "int_id" + i);
	}
	
	public static String decodeNew(String text, int i, String prg, int loc_count, int int_count) {
		String newcode = "new Loc(";
		int idx = text.indexOf("void create_node" + i + "(");
		String subst = text.substring(idx).split("return;")[0];
		String[] params = strip(subst, "intMutate").split(", ");
		newcode += "key=" + decodeIntVar(Integer.parseInt(params[1]), prg, int_count, "create_node" + i);
		params = strip(subst, "locMutate").split(", ");
		newcode += ", next=" + decodeLocVar(Integer.parseInt(params[1]), prg, loc_count, "create_node" + i);
		newcode += ")";
		return newcode;
	}
	
	public static String decodeBoolExp(String name, String text, int i, String prg, int loc_count, int int_count, int locstart, int intstart) {
		int idx = text.indexOf("void " + name + "(");
		String subst = text.substring(idx).split("return;")[0];
		if (subst.contains("intderef_lt_var")) {
			String[] params = strip(subst, "intderef_lt_var").split(", ");
			for (int d = 0; d < params.length; d++){
				if (params[d].contains("locstart")) {
					params[d] = params[d].replaceAll("locstart", String.valueOf(locstart));
					/*if (params[d].contains(" + ")) {
						int pilot = params[d].indexOf("+");
						params[d] = String.valueOf(Integer.parseInt(params[d].substring(0, pilot-1))) + Integer.parseInt(params[d].substring(pilot+2, params[d].length()));
					}*/
				}
				if (params[d].contains("intstart")) {
					System.out.println(d + ": " + intstart);
					params[d] = params[d].replaceAll("intstart", String.valueOf(intstart));
					/*if (params[d].contains(" + ")) {
						int pilot = params[d].indexOf("+");
						params[d] = String.valueOf(Integer.parseInt(params[d].substring(0, pilot-1))) + Integer.parseInt(params[d].substring(pilot+2, params[d].length()));
					}*/
				}
			}
			String left = decodeLocVar(Integer.parseInt(params[0]), prg, loc_count, name);
			String right = decodeIntVar(Integer.parseInt(params[1]), prg, int_count, name);
			String neg = subst.contains("_out = !") ? "! " : "";
			return neg + left + ".key < " + right;
		}
		else if (subst.contains("locvar_eq")) {
			String[] params = strip(subst, "locvar_eq").split(", ");
			for (int d = 0; d < params.length; d++){
				if (params[d].contains("locstart")) {
					params[d] = params[d].replaceAll("locstart", String.valueOf(locstart));
					if (params[d].contains(" + ")) {
						int pilot = params[d].indexOf("+");
						params[d] = String.valueOf(Integer.parseInt(params[d].substring(0, pilot-1))) + Integer.parseInt(params[d].substring(pilot+2, params[d].length()));
					}
				}
			}
			String left = decodeLocVar(Integer.parseInt(params[0]), prg, loc_count, name);
			String right = decodeLocVar(Integer.parseInt(params[1]), prg, loc_count, name);
			if (subst.contains("_out = !")) 
				return left + " != " + right;
			else if (!left.equals(right)) return left + " == " + right;
			else return "true";
		}
		else if (subst.contains("assert (0);")) {
			return "false";
		}
		else return subst;
	}
	
	public static String decodeCond(String text, int i, String prg, int loc_count, int int_count) {
		//return decodeBoolExp("basic_cond", text, i, prg, loc_count, int_count);
		int idx = text.indexOf("void basic_cond" + i + "(");
		String subst = text.substring(idx).split("return;")[0];
		if (subst.contains("basic_branch_cond" + i)) {
			String[] params = strip(subst, "basic_branch_cond" + i).split(", ");
			int locstart = Integer.parseInt(params[1]);
			int intstart = Integer.parseInt(params[3]);
			return decodeBoolExp("basic_branch_cond" + i, text, i, prg, loc_count, int_count, locstart, intstart);
		}
		else return decodeBoolExp("basic_cond" + i, text, i, prg, loc_count, int_count, 0, 0);
	}
	
	//decode the "if" guard before an update statement
	public static String decodePositiveGuard(String name, String subst, int i, int too, String prg, int loc_count) {
		String guard = "";
		if (subst.contains("intderef_lt_var")) {
			String subst2 = strip(subst, "intderef_lt_var");
			String[] params = subst2.split(", ");
			int num = (params[0].equals("to")) ? too : Integer.parseInt(params[0]);
			String left = decodeLocVar(num, prg, loc_count, name + i);
			String right = decodeIntVar(Integer.parseInt(params[1]), prg, loc_count, name + i);
			String neg = subst.contains("_out = !") ? "! " : "";
			guard = "if (" + neg + left + ".key < " + right + ") ";
		}
		if (subst.contains("locvar_eq")) {
			String subst3 = strip(subst, "locvar_eq");
			String[] params = subst3.split(", ");
			int num = (params[0].equals("to")) ? too : Integer.parseInt(params[0]);
			String left = decodeLocVar(num, prg, loc_count, name + i);
			String right = decodeLocVar(Integer.parseInt(params[1]), prg, loc_count, name + i);
			if (!left.equals(right)) guard = "if (" + left + " == " + right + ") ";
		}
		return guard;
	}
	
	public static String decodeLiteral(String name, String text, String subst, int i, String prg, int loc_count) {
		String guard = "";
		if (subst.contains("loop_preserves_" + name)) {
			String inv = "";
			int idx = text.indexOf("void loop_preserves_" + name + "(");
			String func = text.substring(idx+20).split("\\n}")[0];
			String[] substs = func.split("if \\(");
			if (substs.length == 1) guard = "false";
			else {
				for (String ss : substs) {
					inv += "(" + decodeLiteral(name, text, ss, i, prg, loc_count) + ") & ";
				}
				guard = inv.substring(0, inv.length()-3);
			}
		}
		else if (subst.contains("rsll_inv")) {
			String subst2 = strip(subst, "rsll_inv");
			String[] params = subst2.split(", ");
			int num = Integer.parseInt(params[0]);
			System.out.println("decoding " + num);
			String left = decodeLocVar(num, prg, loc_count, "iterate_" + name);
			guard = "rsll^(" + left + ") ";
		}
		else if (subst.contains("sll_inv")) {
			String subst2 = strip(subst, "sll_inv");
			String[] params = subst2.split(", ");
			int num = Integer.parseInt(params[0]);
			System.out.println("decoding " + num);
			String left = decodeLocVar(num, prg, loc_count, "iterate_" + name);
			guard = "sll^(" + left + ") ";
		}
		else if (subst.contains("rsllseg_inv")) {
			String subst2 = strip(subst, "rsllseg_inv");
			String[] params = subst2.split(", ");
			int num = Integer.parseInt(params[0]);
			String left = decodeLocVar(num, prg, loc_count, "iterate_" + name);
			num = Integer.parseInt(params[1]);
			String right = decodeLocVar(num, prg, loc_count, "iterate_" + name);
			guard = "rsllseg^(" + left + ", " + right + ") ";
		}
		else if (subst.contains("sllseg_inv")) {
			String subst2 = strip(subst, "sllseg_inv");
			String[] params = subst2.split(", ");
			int num = Integer.parseInt(params[0]);
			String left = decodeLocVar(num, prg, loc_count, "iterate_" + name);
			num = Integer.parseInt(params[1]);
			String right = decodeLocVar(num, prg, loc_count, "iterate_" + name);
			guard = "sllseg^(" + left + ", " + right + ") ";
		}
		else if (subst.contains("disj_inv")) {
			String subst2 = strip(subst, "disj_inv");
			String[] params = subst2.split(", ");
			int num = Integer.parseInt(params[0]);
			String left = decodeLocVar(num, prg, loc_count, "iterate_" + name);
			num = Integer.parseInt(params[1]);
			String right = decodeLocVar(num, prg, loc_count, "iterate_" + name);
			num = Integer.parseInt(params[2]);
			String lefttail = decodeLocVar(num, prg, loc_count, "iterate_" + name);
			num = Integer.parseInt(params[3]);
			String righttail = decodeLocVar(num, prg, loc_count, "iterate_" + name);
			guard = "disjoint^(" + left + ", " + right + ", " + lefttail + ", " + righttail + ") ";
		}
		else if (subst.contains("minseg_preserve_inv")) {
			String subst2 = strip(subst, "minseg_preserve_inv");
			String[] params = subst2.split(", ");
			boolean single = Boolean.parseBoolean(params[5]);
			if (single) {
				int v1 = Integer.parseInt(params[1]);
				int v3 = Integer.parseInt(params[3]);
				String head = decodeLocVar(v1, prg, loc_count, "iterate_" + name);
				String tail = decodeLocVar(v3, prg, loc_count, "iterate_" + name);
				guard = "minseg^(" + head + ", " + tail + ") == " + params[0];
			}
			else {
				int v1 = Integer.parseInt(params[1]);
				int v2 = Integer.parseInt(params[2]);
				int v3 = Integer.parseInt(params[3]);
				int v4 = Integer.parseInt(params[4]);
				String vv1 = decodeLocVar(v1, prg, loc_count, "iterate_" + name);
				String vv2 = decodeLocVar(v2, prg, loc_count, "iterate_" + name);
				String vv3 = decodeLocVar(v3, prg, loc_count, "iterate_" + name);
				String vv4 = decodeLocVar(v4, prg, loc_count, "iterate_" + name);
				guard = "MIN(minseg^(" + vv1 + ", " + vv3 + "), minseg^(" + vv2 + ", " + vv4 + ")) == " + params[0];
			}
		}
		else if (subst.contains("maxseg_preserve_inv")) {
			String subst2 = strip(subst, "maxseg_preserve_inv");
			String[] params = subst2.split(", ");
			boolean single = Boolean.parseBoolean(params[5]);
			if (single) {
				int v1 = Integer.parseInt(params[1]);
				int v3 = Integer.parseInt(params[3]);
				String head = decodeLocVar(v1, prg, loc_count, "iterate_" + name);
				String tail = decodeLocVar(v3, prg, loc_count, "iterate_" + name);
				guard = "maxseg^(" + head + ", " + tail + ") == " + params[0];
			}
			else {
				int v1 = Integer.parseInt(params[1]);
				int v2 = Integer.parseInt(params[2]);
				int v3 = Integer.parseInt(params[3]);
				int v4 = Integer.parseInt(params[4]);
				String vv1 = decodeLocVar(v1, prg, loc_count, "iterate_" + name);
				String vv2 = decodeLocVar(v2, prg, loc_count, "iterate_" + name);
				String vv3 = decodeLocVar(v3, prg, loc_count, "iterate_" + name);
				String vv4 = decodeLocVar(v4, prg, loc_count, "iterate_" + name);
				guard = "MAX(maxseg^(" + vv1 + ", " + vv3 + "), maxseg^(" + vv2 + ", " + vv4 + ")) == " + params[0];
			}
		}
		else if (subst.contains("lenseg_preserve_inv")) {
			String subst2 = strip(subst, "lenseg_preserve_inv");
			String[] params = subst2.split(", ");
			boolean single = Boolean.parseBoolean(params[5]);
			if (single) {
				int v1 = Integer.parseInt(params[1]);
				int v3 = Integer.parseInt(params[3]);
				String head = decodeLocVar(v1, prg, loc_count, "iterate_" + name);
				String tail = decodeLocVar(v3, prg, loc_count, "iterate_" + name);
				guard = "lenseg^(" + head + ", " + tail + ") == " + params[0];
			}
			else {
				int v1 = Integer.parseInt(params[1]);
				int v2 = Integer.parseInt(params[2]);
				int v3 = Integer.parseInt(params[3]);
				int v4 = Integer.parseInt(params[4]);
				String vv1 = decodeLocVar(v1, prg, loc_count, "iterate_" + name);
				String vv2 = decodeLocVar(v2, prg, loc_count, "iterate_" + name);
				String vv3 = decodeLocVar(v3, prg, loc_count, "iterate_" + name);
				String vv4 = decodeLocVar(v4, prg, loc_count, "iterate_" + name);
				guard = "lenseg^(" + vv1 + ", " + vv3 + ") + lenseg^(" + vv2 + ", " + vv4 + ") == " + params[0];
			}
		}
		return guard;
	}
	
	public static String decodeLoopInv(String name, String text, int i, int too, String prg, int loc_count) {
		String inv = "";
		int idx = text.indexOf("void loop_inv_" + name + "(");
		String func = text.substring(idx).split("\\n}")[0];
		String[] substs = func.split("if \\(");
		for (String subst : substs) {
			inv += "(" + decodeLiteral(name, text, subst, i, prg, loc_count) + ") & ";
		}
		return inv.substring(0, inv.length()-3);
	}
	
	public static String decodeCommand(String name, String text, int i, int too, String prg, int loc_count, int int_count) {
		int idx = text.indexOf("void " + name + i + "(");
		String subst = text.substring(idx).split("\\n}")[0];
		if (subst.contains("intVarAssign")) {
			subst = strip(subst, "intVarAssign");
			String[] params = subst.split(", "); 
			int num = (params[0].equals("to")) ? too : Integer.parseInt(params[0]);
			String to = decodeIntVar(num, prg, int_count, name + i);
			String from = decodeIntVar(Integer.parseInt(params[1]), prg, int_count, name + i);
			int choice = Integer.parseInt(params[2]);
			String prefix = to.startsWith("i_") ? "int " : "";
			switch (choice) {
				case 0: return prefix + to + " := 0";
				case 7: return prefix + to + " := 7";
				case 1: return prefix + to + " := " + from;
				case 2: return prefix + to + " := " + from + " + 1";
				case 3: return prefix + to + " := " + from + " - 1";
				default: return subst;
			}
		}
		else if (subst.contains("locVarAssign")) {
			String guard = decodePositiveGuard(name, subst, i, too, prg, loc_count);
			
			subst = strip(subst, "locVarAssign");
			String[] params = subst.split(", ");
			int num = (params[0].equals("to")) ? too : Integer.parseInt(params[0]);
			int num2 = (params[1].equals("to")) ? too : Integer.parseInt(params[1]);
			String to = decodeLocVar(num, prg, loc_count, name + i);
			String from = decodeLocVar(num2, prg, loc_count, name + i);
			if (to.equals(from)) return "";
			if (to.startsWith("l_")) guard += "loc ";
			return guard + to + " := " + from;
		}
		else if (subst.contains("locderef2var")) {
			String guard = decodePositiveGuard(name, subst, i, too, prg, loc_count);
			
			subst = strip(subst, "locderef2var");
			String[] params = subst.split(", ");
			System.out.println(params[1] + too);
			int num = (params[0].equals("to")) ? too : Integer.parseInt(params[0]);
			int num2 = (params[1].equals("to")) ? too : Integer.parseInt(params[1]);
			String deref = decodeLocVar(num, prg, loc_count, name + i);
			String to = decodeLocVar(num2, prg, loc_count, name + i);
			if (to.startsWith("l_")) guard += "loc ";
			return guard + to + " := " + deref + ".next";
		}
		else if (subst.contains("intderef2var")) {
			subst = strip(subst, "intderef2var");
			String[] params = subst.split(", ");
			int num = (params[1].equals("to")) ? too : Integer.parseInt(params[1]);
			String deref = decodeLocVar(Integer.parseInt(params[0]), prg, loc_count, name + i);
			String to = decodeIntVar(num, prg, int_count, name + i);
			if (to.startsWith("i_")) return "int " + to + " := " + deref + ".key";
			else return to + " := " + deref + ".key";
		}
		else if (subst.contains("intMutate")) {
			subst = strip(subst, "intMutate");
			String[] params = subst.split(", ");
			String derefed = decodeLocVar(Integer.parseInt(params[0]), prg, loc_count, name + i);
			String newval = decodeIntVar(Integer.parseInt(params[1]), prg, int_count, name + i);
			return derefed + ".key := " + newval;
		}
		else if (subst.contains("locMutate")) {
			subst = strip(subst, "locMutate");
			String[] params = subst.split(", ");
			String derefed = decodeLocVar(Integer.parseInt(params[0]), prg, loc_count, name + i);
			String newval = decodeLocVar(Integer.parseInt(params[1]), prg, loc_count, name + i);
			return derefed + ".next := " + newval;
		}
		else if (subst.contains("malloc(")) {
			subst = strip(subst, "malloc");
			String[] params = subst.split(", ");
			String ml = decodeLocVar(Integer.parseInt(params[0]), prg, loc_count, name + i);
			String prefix = ml.startsWith("l_") ? "loc " : "";
			return prefix + ml + " := malloc()";
		}
		else if (subst.contains("free(")) {
			subst = strip(subst, "free");
			String[] params = subst.split(", ");
			String fr = decodeLocVar(Integer.parseInt(params[0]), prg, loc_count, name + i);
			return "free " + fr;
		}
		else return subst;
	}
	
	public static String decodeStatement(String text, int i, String prg, int loc_count, int int_count) {
		return decodeCommand("statement", text, i, 0, prg, loc_count, int_count);
	}
	
	public static String decodeUpdateInt(String text, int i, int to, String prg, int loc_count, int int_count) {
		return decodeCommand("update_intvar", text, i, to, prg, loc_count, int_count);
	}
	
	public static String decodeUpdateLoc(String text, int i, int to, String prg, int loc_count, int int_count) {
		return decodeCommand("update_locvar", text, i, to, prg, loc_count, int_count);
	}
	
	public static String decodeLoop(String pname, String text, int lAux, int iAux, int i, String prg, int loc_count, int int_count) {
		String beforeLoop = "\t";
		for (int l = 0; l < update_int_before_loop; l++) {
			beforeLoop += decodeUpdateInt(text, l, l, prg, loc_count, int_count) + ";\n\t";
		}
		for (int l = 0; l < update_loc_before_loop; l++) {
			beforeLoop += decodeUpdateLoc(text, l, l+1, prg, loc_count, int_count) + ";\n\t";
		}
		
		
		String lp = "\twhile (";
		lp += decodeBoolExp("loop_cond_" + pname, text, i, prg, loc_count, int_count, 0, 0);
		lp += ") {\n";
		lp += "\t/* inv: " + decodeLoopInv(pname, text, i, 0, prg, loc_count) + " */\n";
		for (int l = update_int_before_loop; l < update_int; l++) {
			lp += "\t\t" + decodeUpdateInt(text, l, l-update_int_before_loop, prg, loc_count, int_count) + ";\n";
		}
		for (int l = update_loc_before_loop; l < update_loc; l++) {
			lp += "\t\t" + decodeUpdateLoc(text, l, l-update_loc_before_loop+1,  prg, loc_count, int_count) + ";\n";
		}
		lp += "\t}";
		
		System.out.println(beforeLoop + "\n" + lp + "\n");
		
		return beforeLoop + "\n" + lp + "\n";
	}
}
