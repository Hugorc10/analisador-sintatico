package parser;

public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\113\000\002\002\004\000\002\026\002\000\002\002" +
    "\005\000\002\027\002\000\002\014\006\000\002\030\002" +
    "\000\002\014\005\000\002\004\003\000\002\004\003\000" +
    "\002\004\003\000\002\004\004\000\002\004\004\000\002" +
    "\004\004\000\002\004\003\000\002\004\004\000\002\004" +
    "\004\000\002\004\005\000\002\003\004\000\002\003\003" +
    "\000\002\021\007\000\002\006\004\000\002\006\005\000" +
    "\002\006\006\000\002\006\007\000\002\006\006\000\002" +
    "\006\007\000\002\006\006\000\002\006\007\000\002\006" +
    "\006\000\002\006\007\000\002\012\006\000\002\012\010" +
    "\000\002\012\006\000\002\012\010\000\002\012\010\000" +
    "\002\012\010\000\002\024\006\000\002\024\006\000\002" +
    "\007\005\000\002\010\006\000\002\010\004\000\002\010" +
    "\005\000\002\010\003\000\002\010\005\000\002\010\005" +
    "\000\002\010\005\000\002\025\005\000\002\025\003\000" +
    "\002\011\003\000\002\011\003\000\002\013\003\000\002" +
    "\013\003\000\002\013\003\000\002\013\003\000\002\013" +
    "\003\000\002\013\003\000\002\015\003\000\002\015\003" +
    "\000\002\017\005\000\002\020\005\000\002\020\003\000" +
    "\002\020\005\000\002\020\003\000\002\005\003\000\002" +
    "\005\003\000\002\005\003\000\002\022\003\000\002\022" +
    "\003\000\002\022\003\000\002\022\003\000\002\016\005" +
    "\000\002\016\005\000\002\016\005\000\002\023\005\000" +
    "\002\023\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\203\000\004\034\000\001\002\000\004\002\205\001" +
    "\002\000\004\034\006\001\002\000\026\007\ufffe\035\ufffc" +
    "\040\ufffe\041\ufffe\052\ufffe\053\ufffe\054\ufffe\056\ufffe\060" +
    "\ufffe\062\ufffe\001\002\000\004\005\010\001\002\000\004" +
    "\002\uffff\001\002\000\004\035\204\001\002\000\024\007" +
    "\031\040\014\041\024\052\016\053\027\054\023\056\032" +
    "\060\022\062\026\001\002\000\026\007\031\035\ufffa\040" +
    "\014\041\024\052\016\053\027\054\023\056\032\060\022" +
    "\062\026\001\002\000\004\011\112\001\002\000\026\007" +
    "\031\035\ufff8\040\014\041\024\052\016\053\027\054\023" +
    "\056\032\060\022\062\026\001\002\000\004\006\173\001" +
    "\002\000\026\007\031\035\ufff9\040\014\041\024\052\016" +
    "\053\027\054\023\056\032\060\022\062\026\001\002\000" +
    "\026\007\031\035\ufff4\040\014\041\024\052\016\053\027" +
    "\054\023\056\032\060\022\062\026\001\002\000\004\007" +
    "\167\001\002\000\004\031\165\001\002\000\004\006\163" +
    "\001\002\000\004\011\112\001\002\000\006\007\uffc8\042" +
    "\uffc8\001\002\000\004\060\063\001\002\000\004\006\044" +
    "\001\002\000\006\007\uffc9\042\uffc9\001\002\000\026\007" +
    "\uffef\035\uffef\040\uffef\041\uffef\052\uffef\053\uffef\054\uffef" +
    "\056\uffef\060\uffef\062\uffef\001\002\000\004\060\035\001" +
    "\002\000\004\035\034\001\002\000\010\005\ufffd\007\ufffd" +
    "\042\ufffd\001\002\000\004\031\036\001\002\000\010\055" +
    "\041\057\042\060\040\001\002\000\004\007\043\001\002" +
    "\000\042\006\uffc2\007\uffc2\012\uffc2\017\uffc2\020\uffc2\027" +
    "\uffc2\030\uffc2\032\uffc2\033\uffc2\042\uffc2\043\uffc2\044\uffc2" +
    "\046\uffc2\047\uffc2\050\uffc2\051\uffc2\001\002\000\042\006" +
    "\uffc0\007\uffc0\012\uffc0\017\uffc0\020\uffc0\027\uffc0\030\uffc0" +
    "\032\uffc0\033\uffc0\042\uffc0\043\uffc0\044\uffc0\046\uffc0\047" +
    "\uffc0\050\uffc0\051\uffc0\001\002\000\042\006\uffc1\007\uffc1" +
    "\012\uffc1\017\uffc1\020\uffc1\027\uffc1\030\uffc1\032\uffc1\033" +
    "\uffc1\042\uffc1\043\uffc1\044\uffc1\046\uffc1\047\uffc1\050\uffc1" +
    "\051\uffc1\001\002\000\026\007\uffee\035\uffee\040\uffee\041" +
    "\uffee\052\uffee\053\uffee\054\uffee\056\uffee\060\uffee\062\uffee" +
    "\001\002\000\012\037\045\055\041\057\042\060\040\001" +
    "\002\000\012\006\uffc3\007\uffc3\017\061\042\uffc3\001\002" +
    "\000\006\007\uffba\042\uffba\001\002\000\010\006\057\007" +
    "\uffb7\042\uffb7\001\002\000\020\006\uffc5\007\uffc5\017\051" +
    "\020\053\032\052\033\054\042\uffc5\001\002\000\012\037" +
    "\uffbf\055\uffbf\057\uffbf\060\uffbf\001\002\000\012\037\uffbd" +
    "\055\uffbd\057\uffbd\060\uffbd\001\002\000\012\037\uffbe\055" +
    "\uffbe\057\uffbe\060\uffbe\001\002\000\012\037\uffbc\055\uffbc" +
    "\057\uffbc\060\uffbc\001\002\000\012\037\045\055\041\057" +
    "\042\060\040\001\002\000\010\006\uffc6\007\uffc6\042\uffc6" +
    "\001\002\000\012\037\045\055\041\057\042\060\040\001" +
    "\002\000\006\007\uffb8\042\uffb8\001\002\000\012\037\045" +
    "\055\041\057\042\060\040\001\002\000\010\006\uffc4\007" +
    "\uffc4\042\uffc4\001\002\000\010\006\065\007\067\031\066" +
    "\001\002\000\026\007\ufff0\035\ufff0\040\ufff0\041\ufff0\052" +
    "\ufff0\053\ufff0\054\ufff0\056\ufff0\060\ufff0\062\ufff0\001\002" +
    "\000\004\060\063\001\002\000\012\036\071\037\070\055" +
    "\072\057\073\001\002\000\026\007\uffed\035\uffed\040\uffed" +
    "\041\uffed\052\uffed\053\uffed\054\uffed\056\uffed\060\uffed\062" +
    "\uffed\001\002\000\006\006\105\007\106\001\002\000\006" +
    "\006\102\007\103\001\002\000\006\006\077\007\100\001" +
    "\002\000\006\006\074\007\075\001\002\000\004\060\063" +
    "\001\002\000\026\007\uffeb\035\uffeb\040\uffeb\041\uffeb\052" +
    "\uffeb\053\uffeb\054\uffeb\056\uffeb\060\uffeb\062\uffeb\001\002" +
    "\000\026\007\uffea\035\uffea\040\uffea\041\uffea\052\uffea\053" +
    "\uffea\054\uffea\056\uffea\060\uffea\062\uffea\001\002\000\004" +
    "\060\063\001\002\000\026\007\uffe9\035\uffe9\040\uffe9\041" +
    "\uffe9\052\uffe9\053\uffe9\054\uffe9\056\uffe9\060\uffe9\062\uffe9" +
    "\001\002\000\026\007\uffe8\035\uffe8\040\uffe8\041\uffe8\052" +
    "\uffe8\053\uffe8\054\uffe8\056\uffe8\060\uffe8\062\uffe8\001\002" +
    "\000\004\060\063\001\002\000\026\007\uffe7\035\uffe7\040" +
    "\uffe7\041\uffe7\052\uffe7\053\uffe7\054\uffe7\056\uffe7\060\uffe7" +
    "\062\uffe7\001\002\000\026\007\uffe6\035\uffe6\040\uffe6\041" +
    "\uffe6\052\uffe6\053\uffe6\054\uffe6\056\uffe6\060\uffe6\062\uffe6" +
    "\001\002\000\004\060\063\001\002\000\026\007\uffe5\035" +
    "\uffe5\040\uffe5\041\uffe5\052\uffe5\053\uffe5\054\uffe5\056\uffe5" +
    "\060\uffe5\062\uffe5\001\002\000\026\007\uffe4\035\uffe4\040" +
    "\uffe4\041\uffe4\052\uffe4\053\uffe4\054\uffe4\056\uffe4\060\uffe4" +
    "\062\uffe4\001\002\000\026\007\uffec\035\uffec\040\uffec\041" +
    "\uffec\052\uffec\053\uffec\054\uffec\056\uffec\060\uffec\062\uffec" +
    "\001\002\000\014\034\006\052\016\053\027\054\023\060" +
    "\022\001\002\000\014\037\113\045\114\055\041\057\042" +
    "\060\040\001\002\000\004\046\142\001\002\000\010\055" +
    "\041\057\042\060\040\001\002\000\024\012\uffd2\027\uffd2" +
    "\030\uffd2\043\uffd2\044\uffd2\046\uffd2\047\uffd2\050\uffd2\051" +
    "\uffd2\001\002\000\004\012\135\001\002\000\024\012\uffd7" +
    "\027\122\030\123\043\120\044\131\046\126\047\127\050" +
    "\121\051\125\001\002\000\014\037\uffd1\045\uffd1\055\uffd1" +
    "\057\uffd1\060\uffd1\001\002\000\010\055\uffcd\057\uffcd\060" +
    "\uffcd\001\002\000\010\055\uffcb\057\uffcb\060\uffcb\001\002" +
    "\000\010\055\uffca\057\uffca\060\uffca\001\002\000\010\055" +
    "\041\057\042\060\040\001\002\000\010\055\uffcc\057\uffcc" +
    "\060\uffcc\001\002\000\012\037\133\055\uffcf\057\uffcf\060" +
    "\uffcf\001\002\000\010\055\uffce\057\uffce\060\uffce\001\002" +
    "\000\014\037\113\045\114\055\041\057\042\060\040\001" +
    "\002\000\014\037\uffd0\045\uffd0\055\uffd0\057\uffd0\060\uffd0" +
    "\001\002\000\004\012\uffd8\001\002\000\004\012\uffd4\001" +
    "\002\000\024\012\uffd3\027\uffd3\030\uffd3\043\uffd3\044\uffd3" +
    "\046\uffd3\047\uffd3\050\uffd3\051\uffd3\001\002\000\014\034" +
    "\uffdb\052\uffdb\053\uffdb\054\uffdb\060\uffdb\001\002\000\024" +
    "\012\uffd9\027\122\030\123\043\120\044\131\046\137\047" +
    "\127\050\121\051\125\001\002\000\010\055\uffcf\057\uffcf" +
    "\060\uffcf\001\002\000\014\037\113\045\114\055\041\057" +
    "\042\060\040\001\002\000\004\012\uffda\001\002\000\006" +
    "\037\143\060\144\001\002\000\004\012\uffd6\001\002\000" +
    "\004\012\uffd5\001\002\000\006\007\156\042\155\001\002" +
    "\000\006\007\150\042\147\001\002\000\014\034\006\052" +
    "\016\053\027\054\023\060\022\001\002\000\026\007\uffe1" +
    "\035\uffe1\040\uffe1\041\uffe1\052\uffe1\053\uffe1\054\uffe1\056" +
    "\uffe1\060\uffe1\062\uffe1\001\002\000\004\007\154\001\002" +
    "\000\004\007\153\001\002\000\026\007\uffe0\035\uffe0\040" +
    "\uffe0\041\uffe0\052\uffe0\053\uffe0\054\uffe0\056\uffe0\060\uffe0" +
    "\062\uffe0\001\002\000\026\007\uffde\035\uffde\040\uffde\041" +
    "\uffde\052\uffde\053\uffde\054\uffde\056\uffde\060\uffde\062\uffde" +
    "\001\002\000\014\034\006\052\016\053\027\054\023\060" +
    "\022\001\002\000\026\007\uffe3\035\uffe3\040\uffe3\041\uffe3" +
    "\052\uffe3\053\uffe3\054\uffe3\056\uffe3\060\uffe3\062\uffe3\001" +
    "\002\000\004\007\162\001\002\000\004\007\161\001\002" +
    "\000\026\007\uffdf\035\uffdf\040\uffdf\041\uffdf\052\uffdf\053" +
    "\uffdf\054\uffdf\056\uffdf\060\uffdf\062\uffdf\001\002\000\026" +
    "\007\uffe2\035\uffe2\040\uffe2\041\uffe2\052\uffe2\053\uffe2\054" +
    "\uffe2\056\uffe2\060\uffe2\062\uffe2\001\002\000\012\037\045" +
    "\055\041\057\042\060\040\001\002\000\006\007\uffb9\042" +
    "\uffb9\001\002\000\012\037\045\055\041\057\042\060\040" +
    "\001\002\000\006\007\uffc7\042\uffc7\001\002\000\026\007" +
    "\031\035\ufff2\040\014\041\024\052\016\053\027\054\023" +
    "\056\032\060\022\062\026\001\002\000\004\035\ufff1\001" +
    "\002\000\004\035\ufff3\001\002\000\004\035\ufff5\001\002" +
    "\000\004\060\174\001\002\000\006\007\uffbb\042\uffbb\001" +
    "\002\000\004\035\ufff7\001\002\000\014\034\006\052\016" +
    "\053\027\054\023\060\022\001\002\000\004\007\202\001" +
    "\002\000\004\007\201\001\002\000\026\007\uffdc\035\uffdc" +
    "\040\uffdc\041\uffdc\052\uffdc\053\uffdc\054\uffdc\056\uffdc\060" +
    "\uffdc\062\uffdc\001\002\000\026\007\uffdd\035\uffdd\040\uffdd" +
    "\041\uffdd\052\uffdd\053\uffdd\054\uffdd\056\uffdd\060\uffdd\062" +
    "\uffdd\001\002\000\004\035\ufff6\001\002\000\010\005\ufffb" +
    "\007\ufffb\042\ufffb\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\203\000\006\002\003\026\004\001\001\000\002\001" +
    "\001\000\004\014\006\001\001\000\006\027\011\030\010" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\022\003\012\004\032\012\014\015\020\016\024" +
    "\017\027\021\016\024\017\001\001\000\022\003\012\004" +
    "\202\012\014\015\020\016\024\017\027\021\016\024\017" +
    "\001\001\000\004\007\175\001\001\000\022\003\012\004" +
    "\174\012\014\015\020\016\024\017\027\021\016\024\017" +
    "\001\001\000\002\001\001\000\022\003\012\004\171\012" +
    "\014\015\020\016\024\017\027\021\016\024\017\001\001" +
    "\000\022\003\012\004\170\012\014\015\020\016\024\017" +
    "\027\021\016\024\017\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\007\110\001\001\000" +
    "\002\001\001\000\004\006\063\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\005\036\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\010" +
    "\005\047\020\046\023\045\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\022\054\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\005\047\020\055\001\001\000\002" +
    "\001\001\000\010\005\047\020\046\023\057\001\001\000" +
    "\002\001\001\000\006\005\047\020\061\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\006" +
    "\107\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\006\075\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\006\100\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\006\103\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\006\106\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\012\014\144" +
    "\015\145\016\024\017\027\001\001\000\010\005\114\010" +
    "\115\025\116\001\001\000\002\001\001\000\006\005\114" +
    "\025\135\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\011\127\013\123\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\005" +
    "\133\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\010\005\114\010\131\025\116\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\011\137\013\123\001" +
    "\001\000\002\001\001\000\010\005\114\010\140\025\116" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\012\014\150\015\151\016\024\017\027\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\012\014\156\015\157\016" +
    "\024\017\027\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\010\005\047\020\046\023\163\001\001\000\002\001\001" +
    "\000\006\005\047\020\165\001\001\000\002\001\001\000" +
    "\022\003\012\004\167\012\014\015\020\016\024\017\027" +
    "\021\016\024\017\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\012\014\176\015\177\016\024\017" +
    "\027\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



	boolean parsing_failed = false;
	String source_filename;

	public SrcLoc sLoc(java_cup.runtime.Symbol token)
	{
		return new SrcLoc(token.left, token.right, source_filename);
	}
   
   public parser(Lexer mylexer, String fname) 
   {
    super(mylexer);
   	source_filename = fname;
   }
   
   public void syntax_error(java_cup.runtime.Symbol cur_token)
   {
   	   parsing_failed = true;
   	   System.err.println("Syntax error " + sLoc(cur_token).toString() + " Got: " + cur_token.toString());
   }

   public boolean hasFailed() { return parsing_failed;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 74: // list_exp ::= calc 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("list_exp",17, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 73: // list_exp ::= calc VIRG list_exp 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("list_exp",17, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 72: // io ::= WRITELN VIRG list_exp 
            {
              Object RESULT =null;
		 System.out.println("WRITELN"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("io",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 71: // io ::= WRITE VIRG list_exp 
            {
              Object RESULT =null;
		 System.out.println("WRITE"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("io",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 70: // io ::= READLN VIRG IDEN 
            {
              Object RESULT =null;
		 System.out.println("READLN"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("io",12, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 69: // op_arit ::= DIV 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_arit",16, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 68: // op_arit ::= MULT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_arit",16, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 67: // op_arit ::= MENOS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_arit",16, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 66: // op_arit ::= MAIS 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_arit",16, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 65: // tipo ::= BOOLEAN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 64: // tipo ::= INT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 63: // tipo ::= IDEN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("tipo",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 62: // calc ::= STRING 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("calc",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 61: // calc ::= STRING MAIS calc 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("calc",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 60: // calc ::= tipo 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("calc",14, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 59: // calc ::= tipo op_arit calc 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("calc",14, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 58: // atr ::= IDEN IGUAL calc 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("atr",13, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 57: // cmd ::= io 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("cmd",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 56: // cmd ::= atr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("cmd",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 55: // op_log_num ::= MENOR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_log_num",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 54: // op_log_num ::= MAIOR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_log_num",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 53: // op_log_num ::= MENORQ 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_log_num",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 52: // op_log_num ::= MAIORQ 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_log_num",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 51: // op_log_num ::= DIFE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_log_num",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 50: // op_log_num ::= IGUALI 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_log_num",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // op_log ::= OR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_log",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // op_log ::= AND 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("op_log",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // expr_simples ::= tipo 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr_simples",19, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // expr_simples ::= expr_simples op_log_num tipo 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr_simples",19, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // expr ::= expr_simples IGUALI STRING 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // expr ::= STRING IGUALI IDEN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // expr ::= STRING IGUALI STRING 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // expr ::= expr_simples 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // expr ::= expr_simples op_log expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // expr ::= NOT expr_simples 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // expr ::= NOT expr_simples op_log expr 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // expr_log ::= APAR expr FPAR 
            {
              Object RESULT =null;
		 System.out.println("EXPRESS??O"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr_log",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // decl_while ::= WHILE expr_log cmd PVIR 
            {
              Object RESULT =null;
		 System.out.println("FIM WHILE"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("decl_while",18, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // decl_while ::= WHILE expr_log bloco PVIR 
            {
              Object RESULT =null;
		 System.out.println("FIM WHILE"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("decl_while",18, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // decl_if ::= IF expr_log cmd ELSE bloco PVIR 
            {
              Object RESULT =null;
		 System.out.println("FIM IF-ELSE"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("decl_if",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // decl_if ::= IF expr_log bloco ELSE cmd PVIR 
            {
              Object RESULT =null;
		 System.out.println("FIM IF-ELSE"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("decl_if",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // decl_if ::= IF expr_log cmd ELSE cmd PVIR 
            {
              Object RESULT =null;
		 System.out.println("FIM IF-ELSE"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("decl_if",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // decl_if ::= IF expr_log cmd PVIR 
            {
              Object RESULT =null;
		 System.out.println("FIM IF"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("decl_if",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // decl_if ::= IF expr_log bloco ELSE bloco PVIR 
            {
              Object RESULT =null;
		 System.out.println("FIM IF-ELSE"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("decl_if",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // decl_if ::= IF expr_log bloco PVIR 
            {
              Object RESULT =null;
		 System.out.println("FIM IF"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("decl_if",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // vars ::= IDEN IGUAL STRING VIRG vars 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("vars",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // vars ::= IDEN IGUAL STRING PVIR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("vars",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // vars ::= IDEN IGUAL BYTE VIRG vars 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("vars",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // vars ::= IDEN IGUAL BYTE PVIR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("vars",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // vars ::= IDEN IGUAL BOOLEAN VIRG vars 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("vars",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // vars ::= IDEN IGUAL BOOLEAN PVIR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("vars",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // vars ::= IDEN IGUAL INT VIRG vars 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("vars",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // vars ::= IDEN IGUAL INT PVIR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("vars",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // vars ::= IDEN VIRG vars 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("vars",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // vars ::= IDEN PVIR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("vars",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // decl_con ::= FINAL IDEN IGUAL tipo PVIR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("decl_con",15, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // decl_var ::= PVIR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("decl_var",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // decl_var ::= TIPO vars 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("decl_var",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // decls ::= cmd PVIR decls 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("decls",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // decls ::= cmd PVIR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("decls",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // decls ::= decl_while decls 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("decls",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // decls ::= decl_while 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("decls",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // decls ::= decl_con decls 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("decls",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // decls ::= decl_var decls 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("decls",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // decls ::= decl_if decls 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("decls",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // decls ::= decl_if 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("decls",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // decls ::= decl_con 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("decls",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // decls ::= decl_var 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("decls",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // bloco ::= BEGIN NT$2 END 
            {
              Object RESULT =null;
              // propagate RESULT from NT$2
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 System.out.println("END BLOCO"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("bloco",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // NT$2 ::= 
            {
              Object RESULT =null;
 System.out.println("BEGIN BLOCO"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$2",22, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // bloco ::= BEGIN NT$1 decls END 
            {
              Object RESULT =null;
              // propagate RESULT from NT$1
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		 System.out.println("END BLOCO"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("bloco",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // NT$1 ::= 
            {
              Object RESULT =null;
 System.out.println("BEGIN BLOCO"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$1",21, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // program ::= NT$0 bloco PONT 
            {
              Object RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		 System.out.println("FIM"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // NT$0 ::= 
            {
              Object RESULT =null;
 System.out.println("INICIO"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",20, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

