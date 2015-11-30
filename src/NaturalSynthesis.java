import java.io.*;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

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
	
	public static String gen_non_zero(int r) {
		if (r < 1) return "";
		String range = "{| 1 ";
		for (int i = 2; i <= r; i++) {
			range += "| " + i + " ";
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
			case "LVAR": return "locvars[" + convertForm((CommonTree)ct.getChild(0)) + "]";
			case "IVAR": return "intvars[" + convertForm((CommonTree)ct.getChild(0)) + "]";
			case "old":
				CommonTree arg = (CommonTree)ct.getChild(0);
				switch (arg.getText()) {
					case "REC": return "old_" + arg.getChild(0).getText() + "_" + arg.getChild(1).getChild(0).getText();
					case "IREC": return "old_" + arg.getChild(0).getText() + "_" + arg.getChild(1).getChild(0).getText();
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
	public static String convertStmt(CommonTree ct, int locrange, int intrange, int locrange2, int intrange2, boolean unmodified) {
		switch (ct.getText()) {
			case "SEQ": {
				String temp = "";
				for (Object sct : ct.getChildren())
					temp += convertStmt((CommonTree)sct, locrange, intrange, locrange2, intrange2, unmodified);
				return temp;
			}
			case "if": {
				String temp = "\tif (" + convertStmt((CommonTree)ct.getChild(0), locrange, intrange, locrange2, intrange2, unmodified) 
						+ ") " + convertStmt((CommonTree)ct.getChild(1), locrange, intrange, locrange2, intrange2, unmodified) + "\n";
				if (ct.getChildCount() == 3) temp += convertStmt((CommonTree)ct.getChild(2), locrange, intrange, locrange2, intrange2, unmodified);
				return temp;
			}
			case "else": return "\telse " + convertStmt((CommonTree)ct.getChild(0), locrange, intrange, locrange2, intrange2, unmodified) + "\n";
			case "cond": {
				String basic = "";
				if (unmodified) basic = "basic_branch_cond(" + (locrange+locrange2) + ", " + (locrange+1) + ", " + (intrange+intrange2) + ", " + intrange + ")";
				else basic = "basic_cond(" + (locrange+locrange2) + ", " + (intrange+intrange2) + ")";
				String conj = basic;
				int c = Integer.valueOf(ct.getChild(0).getChild(0).getText());
				for (int i = 1; i < c; i++) conj += (" && " + basic);
				return conj;
			}
			case "statement": {
				int num = Integer.valueOf(ct.getChild(0).getChild(0).getText());
				String temp = "";
				for (int i = 0; i < num; i++) {
					temp += "\tstatement(" + locrange + ", " + intrange + ", " + locrange2 + ", " + intrange2 + ");\n";
				}
				return temp;
			}
			case "MUTATE":
				String mutate = "";
				if (ct.getChild(0).getText().equals("int")) {
					mutate += "\tintMutate(" 
							+ convertStmt((CommonTree)ct.getChild(1).getChild(0), locrange+locrange2, intrange+intrange2, 0, 0, unmodified) 
							+ ", " + convertStmt((CommonTree)ct.getChild(2), locrange+locrange2, intrange+intrange2, 0, 0, unmodified)
							+ ");\n";
				}
				else if (ct.getChild(0).getText().equals("loc")) {
					mutate += "\tlocMutate(" 
							+ convertStmt((CommonTree)ct.getChild(1).getChild(0), locrange+locrange2, intrange+intrange2, 0, 0, unmodified) 
							+ ", " + convertStmt((CommonTree)ct.getChild(2), locrange+locrange2, intrange+intrange2, 0, 0, unmodified);
					switch (ct.getChild(1).getChild(1).getText()) {
						case "left": mutate += ", LEFT"; break;
						case "right": mutate += ", RIGHT"; break;
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
							+ convertStmt((CommonTree)ct.getChild(2).getChild(0), locrange+locrange2, intrange+intrange2, 0, 0, unmodified) 
							+ ", " + convertStmt((CommonTree)ct.getChild(1), locrange, intrange, locrange2, intrange2, unmodified) 
							+ ");\n";
				}
				else if (ct.getChild(0).getText().equals("loc")) {
					assign += "\tlocderef2var(" 
							+ convertStmt((CommonTree)ct.getChild(2).getChild(0), locrange+locrange2, intrange+intrange2, 0, 0, unmodified) 
							+ ", " + convertStmt((CommonTree)ct.getChild(1), locrange, intrange, locrange2, intrange2, unmodified);
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
					case "new": return "\tcreate_node(" + convertStmt((CommonTree)ct.getChild(1), locrange, intrange, locrange2, intrange2, unmodified)
						+ ", " + (locrange+locrange2) + ", " + (intrange+intrange2) + ");\n";
					case "IVAR": 
						if (ct.getChild(2).getChild(0).getText().equals("??"))
							return "\tupdate_intvar(" + convertStmt((CommonTree)ct.getChild(1), locrange, intrange, locrange2, intrange2, unmodified)
							+ ", " + (locrange+locrange2) + ", " + (intrange+intrange2) + ");\n";
						return "\tintVarAssign(" + convertStmt((CommonTree)ct.getChild(1), locrange, intrange, locrange2, intrange2, unmodified)
							+ ", " + convertStmt((CommonTree)ct.getChild(2), locrange, intrange, locrange2, intrange2, unmodified)
							+ ", 1);\n";
					case "LVAR": 
						if (ct.getChild(2).getChild(0).getText().equals("???"))
							return "\tupdate_locvar(" + convertStmt((CommonTree)ct.getChild(1), locrange, intrange, locrange2, intrange2, unmodified)
							+ ", " + (locrange+locrange2) + ", " + (intrange+intrange2) + ");\n";
						return "\tlocVarAssign(" + convertStmt((CommonTree)ct.getChild(1), locrange, intrange, locrange2, intrange2, unmodified)
							+ ", " + convertStmt((CommonTree)ct.getChild(2), locrange, intrange, locrange2, intrange2, unmodified)
							+ ");\n";
					default: return "\t" + convertStmt((CommonTree)ct.getChild(1), locrange, intrange, locrange2, intrange2, unmodified)
						+ " = " + convertStmt((CommonTree)ct.getChild(2), locrange, intrange, locrange2, intrange2, unmodified) + ";\n";
				}
			}
			case "LVAR": {
				String temp = ct.getChild(0).getText();
				if (temp.equals("???")) temp = "gen_non_zero(" + locrange + ")";
				return temp;
			}
			case "IVAR": {
				String temp = ct.getChild(0).getText();
				if (temp.equals("??")) temp = "gen_all(" + intrange + ")";
				return temp;
			}
			case "CONS": return ct.getChild(0).getText();
			case "true": return "true";
			case "return": 
				if (ct.getChild(0).getText().equals("LTYPE")) 
					return "\tret_loc(" + convertStmt((CommonTree)ct.getChild(1), locrange+locrange2, intrange+intrange2, 0, 0, unmodified) + ");\n";
				else if (ct.getChild(0).getText().equals("ITYPE")) 
					return "\tret_int(" + convertStmt((CommonTree)ct.getChild(1), locrange+locrange2, intrange+intrange2, 0, 0, unmodified) + ");\n";
				else
					return "\treturn " + convertStmt((CommonTree)ct.getChild(1), locrange, intrange, locrange2, intrange2, unmodified) + ";\n";
			case "ATOMSTMT": return "\t{\n" + convertStmt((CommonTree)ct.getChild(0), locrange, intrange, locrange2, intrange2, unmodified) + "\n\t}\n";
			default: {
				String m = ct.getText();
				//LinkedList<Pair<String, String>> ags = is.args.get(m);
				List<CommonTree> params = (List<CommonTree>)ct.getChildren();
				List<CommonTree> ags = params.subList(2, params.size());
	        	
				String rank_var = "rank_var_for_call_" + call_count++;
				String ranking = "\tint " + rank_var + " = " + convertStmt(ags.get(0), locrange+locrange2, intrange+intrange2, 0, 0, unmodified) + ";\n"
						+ "\tassertPost(ranking_decreases(rank_func_" + ct.getText()
						+ ", " + rank_var + "));\n";
				
				String call = "\trec_" + ct.getText() + "(" + rank_var + ", ";
	        	for (CommonTree p : ags.subList(1, ags.size())) {
	        		call += convertStmt(p, locrange+locrange2, intrange+intrange2, 0, 0, unmodified) + ", ";
	        	}
	        	call += convertStmt((CommonTree)ct.getChild(1), locrange, intrange, locrange2, intrange2, unmodified) + ", ";
	        	if (is.ret_types.get(m).equals("int")) call += "ret_value, ";				
				call += "new_symbolic, new_next, new_supernext, new_key);\n";
				return ranking + call;
			}
		}
	}
	
	public static void createRecursiveCall(String m, LinkedList<Pair<String, String>> ags) {
		HashSet<String> recs = is.olds.get(m);
		
		writer.print("int ");
		for (Pair<String, String> p : ags) {
    		if (p.getSecond().equals("int")) writer.print("newer_" + p.getFirst() + ", ");
    	}
		if (sig.equals("bst")) writer.print("newer_bst");
		else writer.print("newer_sll");
		int count = 1;
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
    	writer.println(";\n");
		
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
    	if (count++ > 0) writer.print(", ");
    	if (sig.equals("bst")) writer.print("newer_bst");
		else writer.print("newer_sll");
    	if (recs.contains("len")) {
    		writer.print(", ");
    		writer.print("newer_len");
    	}
    	if (recs.contains("min")) {
    		writer.print(", ");
    		writer.print("newer_min");
    	}
    	if (recs.contains("max")) {
    		writer.print(", ");
    		writer.print("newer_max");
    	}
    	if (recs.contains("size")) {
    		writer.print(", ");
    		writer.print("newer_size");
    	}
    	if (recs.contains("height")) {
    		writer.print(", ");
    		writer.print("newer_height");
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
    	for (Pair<String, String> p : ags) {
    		if (p.getSecond().equals("int"))
    			writer.print(", old_" + p.getFirst());
    		if (p.getSecond().equals("loc")) {
    			if (recs.contains("len")) writer.print(", old_len");
    	    	if (recs.contains("min")) writer.print(", old_min");
    	    	if (recs.contains("max")) writer.print(", old_max");
    	    	if (recs.contains("size")) writer.print(", old_size");
    	    	if (recs.contains("height")) writer.print(", old_height");
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
    	if (recs.contains("len")) writer.print(", old_len");
    	if (recs.contains("min")) writer.print(", old_min");
    	if (recs.contains("max")) writer.print(", old_max");
    	if (recs.contains("size")) writer.print(", old_size");
    	if (recs.contains("height")) writer.print(", old_height");
    	writer.println(");\n");
    	
    	//ranking snapshot
    	if (((Pair<String, String>)ags.toArray()[0]).getSecond().equals("loc"))
    		writer.println("\tranking_snapshot(rank_func_" + m + ", " + loc_init + ");\n");
	}
	
	public static void encodeLoopFree(String n, LinkedList<Pair<String, String>> ags, CommonTree body, int int_init, int loc_init) {
		String m = n.split("__")[0];
		
		if (sig.equals("bst")) {
			writer.println("harness void " + n
	    			+ "(int[LOCVARSIZE-1] llocvars, int[INTVARSIZE] lintvars, int[HEAPSIZE-1] lleft, int[HEAPSIZE-1] lright, int[HEAPSIZE-1] lkey, bit[HEAPSIZE-1] lsymbolic, bit[HEAPSIZE-1] lactive) {\n\n"
	    			//+ "int ret_value, bit[HEAPSIZE-1] new_symbolic, int[HEAPSIZE-1] new_left, int[HEAPSIZE-1] new_right, int[HEAPSIZE-1] new_key) {\n\n"
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
    	
    	writer.println(convertStmt(body, loc_init-1, int_init, l_init-loc_init, i_init-int_init, false));
    	
    	//post_cond
    	postCond(m, ags, int_init, loc_init);
    	
    	writer.println("}");
	}
	
	public static void encodeLoop(String n, LinkedList<Pair<String, String>> ags, List<CommonTree> pre, CommonTree loopBody, List<CommonTree> post, int int_init, int loc_init) {
		int locAux = (loopBody.getText().equals("loop") || loopBody.getText().equals("simple-loop")) ? Integer.valueOf(loopBody.getChild(0).getText()) : 0;
		int intAux = (loopBody.getText().equals("loop") || loopBody.getText().equals("simple-loop")) ? Integer.valueOf(loopBody.getChild(1).getText()) : 0;
		int invSize = (loopBody.getText().equals("loop") || loopBody.getText().equals("simple-loop")) ? Integer.valueOf(loopBody.getChild(2).getText()) : 0;
		
		String m = n.split("__")[0];
		HashSet<String> recs = is.olds.get(m);
		HashSet<String> postRecs = is.postRecs.get(m);
		
		writer.println("int rank_var_" + m + " = " + gen_non_zero(locAux) + ";");
		
		//preserving choices
		if (sig.equals("bst"))
			writer.println("\nbit preserve_bst = " + postRecs.contains("bst") + ";");
		else
			writer.println("\nbit preserve_sll = " + postRecs.contains("sll") + ";");
		writer.println("bit preserve_len = " + recs.contains("len") + ";");
		writer.println("bit preserve_min = " + recs.contains("min") + ";");
		writer.println("bit preserve_max = " + recs.contains("max") + ";\n");
        for (Pair<String, String> p : ags) {
        	if (p.getSecond().equals("int")) writer.println("bit preserve_" + p.getFirst() + " = 1;\n");
        }
		
		//guess ranking
		writer.println("void guess_ranking_" + m + "() {\n"
				+ "\tassume rank_var_" + m + ">0 && rank_var_" + m + "<LOCVARSIZE;\n"
				+ "\tranking_snapshot(rank_func_" + m + ", rank_var_" + m + ");\n"
				+ "}\n");
		
		//loop invariant
		writer.println("bit loop_preserves_" + m + "() {\n"
				+ "\tbit single = " + (locAux <= 2) + ";\n"
				+ "\tint comp1 = gen_non_zero(" + (locAux < 2 ? 1 : (locAux-1)) + ");\n"
				+ "\tint comp2 = gen_non_zero(" + (locAux < 2 ? 1 : (locAux-1)) + ")+1;\n"
				+ "\treturn (preserve_sll ? sll_equal_inv(LOCVARSIZE-1) : true)\n"
				+ "\t  && (preserve_len ? len_preserve_inv(LOCVARSIZE-1, old_len, comp1, comp2, single) : true)\n"
				+ "\t  && (preserve_min ? min_preserve_inv(LOCVARSIZE-1, old_min, comp1, comp2, single) : true)\n"
				+ "\t  && (preserve_max ? max_preserve_inv(LOCVARSIZE-1, old_max, comp1, comp2, single) : true)");
		for (Pair<String, String> p : ags) {
        	if (p.getSecond().equals("int")) 
        		writer.println("\t  && (preserve_" + p.getFirst() + " ? intvars[0] == old_" + p.getFirst() + " : true)");
        }
		writer.println("\t;\n}\n");
		
		writer.print("bit loop_inv_" + m + "() {\n"
				+ "\treturn loop_preserves_" + m + "()");
		String any_pred = "\n\t && any_pred("
				+ locAux + ", " + intAux + ", "
				+ (l_init-locAux-1) + ", " + (i_init-intAux) + ")";
		for (int i = 0; i < invSize; i++) {
			writer.print(any_pred);
		}
		writer.println(";\n}\n");
		
		writer.println("bit loop_inv_pre_" + m + "() {\n"
				+ "\treturn loop_inv_" + m + "();\n"
				+ "}\n");
		
		writer.println("bit loop_inv_post_" + m + "() {\n"
				+ "\treturn loop_inv_" + m + "()\n\t  && "
				+ "ranking_decreases(rank_func_" + m + ", rank_var_" + m + ");\n"
				+ "}\n");
		
		//loop condition
		writer.print("bit loop_cond_" + m + "() {\n\treturn ");
		if (loopBody.getText().equals("while")) {
			CommonTree loopCond = (CommonTree)loopBody.getChild(0);
			writer.print(convertStmt(loopCond, loc_init-1, int_init, l_init-loc_init, i_init-int_init, false));
		}
		else writer.print("cond_for_loop(" + locAux + ", " + (l_init-1) + ", " + i_init + ")");
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
        writer.println(");\n");
		
        if (!prevCond.isEmpty()) {
        	for (Integer condNum : prevCond) {
            	writer.println("\tassume !cond" + condNum + "();\n");
            }
        }
        if (currCond >= 0) 
        	writer.println("\tassume cond" + currCond + "();\n");
        
		for (CommonTree ct : pre) {
			writer.println(convertStmt(ct, loc_init-1, int_init, l_init-loc_init, i_init-int_init, false));
		}
		
		for (int i = 0; i < intAux; i++) 
			writer.println("\tupdate_intvar(" + i + ", LOCVARSIZE-1, INTVARSIZE);");
		for (int i = 1; i <= locAux; i++) 
			writer.println("\tupdate_locvar(" + i + ", LOCVARSIZE-1, INTVARSIZE);");
		
		writer.println("\n\tassertPost(loop_inv_pre_" + m + "());\n}\n");
		
		
		//iterate
		writer.print("harness void iterate_" + m + "(");
		for (Pair<String, String> p : ags) {
    		if (p.getSecond().equals("int"))
    			writer.print("int lold_" + p.getFirst() + ", ");
    		if (p.getSecond().equals("loc")) {
    			if (sig.equals("bst")) writer.print("int lold_bst, ");
    			else writer.print("int lold_sll, ");
    			if (recs.contains("len")) writer.print("int lold_len, ");
    			if (recs.contains("min")) writer.print("int lold_min, ");
                if (recs.contains("max")) writer.print("int lold_max, ");
                if (recs.contains("size")) writer.print("int lold_size, ");
                if (recs.contains("height")) writer.print("int lold_height, ");
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
    			if (sig.equals("bst")) writer.println("\told_bst = lold_bst;");
    			else writer.println("\told_sll = lold_sll;");
    			if (recs.contains("len")) writer.println("\told_len = lold_len;");
    			if (recs.contains("min")) writer.println("\told_min = lold_min;");
    			if (recs.contains("max")) writer.println("\told_max = lold_max;");
    			if (recs.contains("size")) writer.println("\told_size = lold_size;");
    			if (recs.contains("height")) writer.println("\told_height = lold_height;");
    		}
    	}
    	writer.println("\n\tassume(basic_assumptions() && basic_axioms());\n"
    			+ "\tassume loop_inv_pre_" + m + "();\n"
    			+ "\tassume loop_cond_" + m + "();\n"
    			+ "\tguess_ranking_" + m + "();\n");
    	
    	if (loopBody.getText().equals("while")) 
    		writer.println(convertStmt((CommonTree)loopBody.getChild(1), loc_init-1, int_init, l_init-loc_init, i_init-int_init, false));
    	else if (loopBody.getText().equals("simple-loop")) {
    		for (int i = 0; i < intAux; i++) 
    			writer.println("\tupdate_intvar(" + i + ", " + locAux + ", " + intAux + ");");
    		for (int i = 1; i <= locAux; i++) 
    			writer.println("\tupdate_locvar(" + i + ", " + locAux + ", " + intAux + ");");
    	}
    	else if (loopBody.getText().equals("loop") || loopBody.getText().equals("simple-loop")) {
    		for (int i = 0; i < intAux; i++) 
    			writer.println("\tupdate_intvar(" + i + ", " + locAux + ", " + intAux + ");");
    		for (int i = 1; i <= locAux; i++) 
    			writer.println("\tupdate_locvar(" + i + ", " + locAux + ", " + intAux + ");");
    		for (int i = 1; i <= locAux; i++) 
    			writer.println("\tmutate_locvar(" + i + ", " + locAux + ", " + intAux + ");");
    	}
    	
    	writer.println("\n\tassertPost(loop_inv_post_" + m + "());\n}\n");
    	
    	
    	//after loop
    	writer.print("harness void after_loop_" + m + "(");
    	for (Pair<String, String> p : ags) {
    		if (p.getSecond().equals("int"))
    			writer.print("int lold_" + p.getFirst() + ", ");
    		if (p.getSecond().equals("loc")) {
    			if (sig.equals("bst")) writer.print("int lold_bst, ");
    			else writer.print("int lold_sll, ");
    			if (recs.contains("len")) writer.print("int lold_len, ");
    			if (recs.contains("min")) writer.print("int lold_min, ");
                if (recs.contains("max")) writer.print("int lold_max, ");
                if (recs.contains("size")) writer.print("int lold_size, ");
                if (recs.contains("height")) writer.print("int lold_height, ");
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
    			if (sig.equals("bst")) writer.println("\told_bst = lold_bst;");
    			else writer.println("\told_sll = lold_sll;");
    			if (recs.contains("len")) writer.println("\told_len = lold_len;");
    			if (recs.contains("min")) writer.println("\told_min = lold_min;");
    			if (recs.contains("max")) writer.println("\told_max = lold_max;");
    			if (recs.contains("size")) writer.println("\told_size = lold_size;");
    			if (recs.contains("height")) writer.println("\told_height = lold_height;");
    		}
    	}
    	writer.println("\n\tassume(basic_assumptions() && basic_axioms());\n"
    	    	+ "\tassume loop_inv_pre_" + m + "();\n"
    			+ "\tassume !loop_cond_" + m + "();\n");
    	
    	for (CommonTree ct : post) {
			writer.println(convertStmt(ct, loc_init-1, int_init, l_init-loc_init, i_init-int_init, false));
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
    	for (Pair<String, String> p : ags) {
    		if (p.getSecond().equals("int"))
    			writer.print(", old_" + p.getFirst());
    		if (p.getSecond().equals("loc")) {
    			count = 0;
    	    	if (recs.contains("len")) writer.print(", old_len");
    	    	if (recs.contains("min")) writer.print(", old_min");
    	    	if (recs.contains("max")) writer.print(", old_max");
    	    	if (recs.contains("size")) writer.print(", old_size");
    	    	if (recs.contains("height")) writer.print(", old_height");
    		}
    	}
    	writer.println("));\n}\n");
	}
	
	@SuppressWarnings("unchecked")
	public static void encodeHoareTriple(String m, LinkedList<Pair<String, String>> ags, CommonTree body, int loc_init, int int_init) {
		if (body.getText().equals("ATOMSTMT"))
			encodeHoareTriple(m, ags, (CommonTree)body.getChild(0), loc_init, int_init);
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
	    	
	    	if (loop < 0) encodeLoopFree(m, ags, body, int_init, loc_init);
	    	else {
	    		List<CommonTree> pre = (List<CommonTree>)body.getChildren().subList(0, loop);
	    		CommonTree loopBody = (CommonTree)body.getChildren().get(loop);
	    		List<CommonTree> post = (List<CommonTree>)body.getChildren().subList(loop+1, body.getChildren().size());
	    		encodeLoop(m, ags, pre, loopBody, post, int_init, loc_init);
	    	}
		}
    	
	}
	
	private static void encodeBranch(String m, LinkedList<Pair<String, String>> ags, CommonTree body, int loc_init, int int_init) {
		if (body.getText().equals("if")) {
			currCond = cond_count++;
			CommonTree cond = (CommonTree)body.getChild(0);
			writer.println("bit cond" + currCond + "() {");
			writer.println("\treturn " + convertStmt(cond, loc_init-1, int_init, l_init-loc_init, i_init-int_init, true) + ";\n}\n");
			encodeHoareTriple(m+"__"+currCond, ags, (CommonTree)body.getChild(1), loc_init, int_init);
			if (body.getChildCount() == 3) {
				prevCond.add(Integer.valueOf(currCond));
				currCond = -1;
				body = (CommonTree)body.getChild(2).getChild(0);
				encodeBranch(m, ags, body, loc_init, int_init);
			}
		}
		else encodeHoareTriple(m+"__"+cond_count, ags, body, loc_init, int_init);
		
	}

	public static void main(String[] args) throws Exception {
		if (args[0].equals("tree")) sig = "bst";
		else sig = "lseg";
		
        ANTLRFileStream in = new ANTLRFileStream("examples//" + args[0] + "//" + args[1] + ".imp");
        ImpLexer lexer = new ImpLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ImpParser parser = new ImpParser(tokens);
        CommonTree tree = (CommonTree)parser.program().getTree();
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);
        is = new ImpSynt(nodes);
        is.program();
        
        ImpLexer trueLexer = new ImpLexer(new ANTLRStringStream("true"));
        ImpParser trueParser = new ImpParser(new CommonTokenStream(trueLexer));
        trueTree = (CommonTree)trueParser.atomBoolExp().getTree();

        i_init = Integer.valueOf(args[4]);
    	l_init = Integer.valueOf(args[3]);
    	bnd = Integer.valueOf(args[2]);
        
        writer = new PrintWriter("sk//" + args[0] + "//" + args[1] + ".sk");
        
        //arguments
        writer.println("pragma options \"--slv-simiters 10"
        		+ " --bnd-inbits " + ((i_init == 0) ? (sig.equals("bst") ? 3 : 2) : (i_init+1))
        		+ (sig.equals("bst") ? " --bnd-bound-mode CALLSITE" : "")
        		+ " --bnd-inline-amnt " + (sig.equals("bst") ? 3 : (bnd-1))
        		+ " --bnd-unroll-amnt " + (bnd-1)
        		+ " \";\n\n"
        		+ "int TIMESIZE = 4;\n"
        		+ "int BOUND = " + (sig.equals("bst") ? 2 : (bnd-1)) + ";\n"
        		+ "int INTMAX = " + (int)(Math.pow(2, i_init+2) - 1) + ";\n"
        		+ "int HEAPSIZE = " + args[2] + ";\n"
        		+ "int LOCVARSIZE = " + args[3] + ";\n"
        		+ "int INTVARSIZE = " + ((i_init == 0) ? "1" : args[4]) + ";\n"
        		+ "int MBUDGET = " + args[5] + ";\n\n"
        		+ "include \"header/" + sig + "_header.skh\";\n");
        
        //snapshots of int vars, len, min, max at every call site
        writer.print("int ");
        for (String m : is.mtds) {
        	LinkedList<Pair<String, String>> ags = is.args.get(m);
        	if (sig.equals("bst")) writer.print("old_bst");
        	else writer.print("old_sll");
        	int count = 1;
        	for (Pair<String, String> p : ags) {
        		if (p.getSecond().equals("int")) {
        			if (count++ > 0) writer.print(", "); 
        			writer.print("old_" + p.getFirst());
        		}
        	}
        	HashSet<String> recs = is.olds.get(m);
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
        	
        	writer.println("int rank_func_" + m + " = " + (sig.equals("bst") ? "SIZE" : "LEN") + "; //len, min or max");
        	
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
        	if (recs.contains("len")) writer.print(", ref int olen");
        	if (recs.contains("min")) writer.print(", ref int omin");
        	if (recs.contains("max")) writer.print(", ref int omax");
        	if (recs.contains("size")) writer.print(", ref int osize");
        	if (recs.contains("height")) writer.print(", ref int oheight");
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
        			else writer.println("\tosll = sll_comp(locvars[" + p.getFirst() + "]);");
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
        	for (Pair<String, String> p : ags) {
        		if (p.getSecond().equals("int"))
        			writer.print(", " + p.getSecond() + " old_" + p.getFirst());
        		if (p.getSecond().equals("loc")) {
        			if (recs.contains("len")) writer.print(", ref int old_len_" + p.getFirst());
            		if (recs.contains("min")) writer.print(", ref int old_min_" + p.getFirst());
            		if (recs.contains("max")) writer.print(", ref int old_max_" + p.getFirst());
            		if (recs.contains("size")) writer.print(", ref int old_size_" + p.getFirst());
            		if (recs.contains("height")) writer.print(", ref int old_height_" + p.getFirst());
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
        		encodeBranch(m, ags, (CommonTree)body.getChild(0), loc_init, int_init);
        	else encodeHoareTriple(m, ags, body, loc_init, int_init);
        	
        }
        
        
        writer.close();
        
        
        //run sketch
        System.out.println(new File("sketch").getAbsolutePath());
        String[] command = {"/Users/xkqiu/hg/sketch-frontend/target/sketch-1.7.0-noarch-launchers/sketch", "-p", "lowering", "-V", "10", args[0] + "/" + args[1] + ".sk"};
        ProcessBuilder sketch = new ProcessBuilder(command);
        sketch.directory(new File("/Users/xkqiu/Documents/workspace/ImpSynt/sk"));
        sketch.redirectError(new File("output//" + args[0] + "//" + args[1] + ".out"));
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
    }
}
