/*
// Reverse a Sentence, by word.
// Bonus Bitwise string reverse
// Input: String
// Output: reversed String
// @author Juan Jose Lopez Delgado
// 23-01-14
*/

public class Sentence {
  public static String reverseWords(String str, char delim) {
    if(str == null) { return null; }
   char[] ch = str.toCharArray();
   char temp;
   int l = ch.length;
   
   for (int i = 0; i < l/2; i++) {
     temp = ch[i];
     ch[i] = ch[l-i-1];
     ch[l-i-1] = temp;
   }
   System.out.println(ch);
   
   int pos = 0;
   for(int i = 0; i <= l ; i++) {
     if (i == l || ch[i] == delim) {
       for(int j = 0; j < (i - pos)/2; j++) {
         temp = ch[j + pos];
         ch[j + pos] = ch[i - 1 - j];
         ch[i - 1 - j] = temp;
       }
       pos = i + 1;
     }
   }  
      System.out.println(ch);
   
  return String.valueOf(ch) ;
  }
  
  public static String reverseBitwise(String str) {
    char[] ch = str.toCharArray();
    int l = ch.length;
    for (int i = 0; i < l/2; i++) {
      ch[i] = (char) (ch[i] ^ ch[l - 1 - i]);
      ch[l - 1 - i] = (char) (ch[i] ^ ch[l - 1 - i]);
      ch[i] = (char) (ch[i] ^ ch[l - 1 - i]);
    }
    return String.valueOf(ch);
  }
}