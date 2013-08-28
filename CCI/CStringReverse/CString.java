/*
// C-Style String class with reverse operation
// @author Juan Jose Lopez Delgado
// 27-08-13
*/

public class CString {
  public char[] cstring;
  
  public CString(String cin) {
    cin += '\n';
    cstring = cin.toCharArray();
  }
  
  public CString(char[] cin) {
    cstring = cin;
  }
  
  public CString reverse () {
    int length = 0;
    while (cstring[length] != '\n') { length++; }
    char[] charArr = new char[length + 1];
    
    for (int i = length - 1; i >= 0; i--) {
      charArr[length - i - 1] = cstring[i];
    }
    
    charArr[length] = '\n';
    return new CString(charArr);
  }
  
  public  void reverseInPlace (CString cin) {
    int length = 0;
    char buf;
    
    while (cstring[length] != '\n') { length++; }
    for (int i = 0; i < length /2; i++) {
      buf = cin.cstring[i];
      cin.cstring[i] = cin.cstring[length-i-1];
      cin.cstring[length-i-1] = buf;
    }
  }
  
  public static void main(String[] args) {
    if (args[0] == null) {
      System.out.println("Please provide an argument and try again");
      return;
    }
    CString cs = new CString(args[0]);
    for (char a : cs.cstring) {
      System.out.print(a);
    }
    cs = cs.reverse();
    for (char a : cs.cstring) {
      System.out.print(a);
    }
    cs.reverseInPlace(cs);
    for (char a : cs.cstring) {
      System.out.print(a);
    }
  }
  
}