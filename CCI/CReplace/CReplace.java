public class CReplace {
    public static String creplace (String Sin, char Cin, String Sout) {
	char[] charArr = Sin.toCharArray();
	String buf = "";
	for (char c : charArr) {
	    if (c == Cin) { buf += Sout; }
	    else { buf += c; }
	}
	return buf;
    }
    
    public static void main (String[] args) {
	if (args.length != 3) { System.out.println("Please input a String, character to be replaced, a string to replace it with"); return;}
	System.out.println(CReplace.creplace(args[0], args[1].charAt(0), args[2]));
    }
}