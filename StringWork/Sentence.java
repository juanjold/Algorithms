/*
// Reverse a Sentence, by word.
// Input: String
// Output: reversed String
// @author Juan Jose Lopez Delgado
// 23-01-14
*/

public class Sentence {
  public static String reverseWords(String str) {
    if(str == null) { return null; }
   char[] ch = str.toCharArray();
   char temp;
   
   for (int i = 0; i < ch.length/2; i++) {
     temp = ch[i];
     ch[i] = ch[ch.length-i-1];
     ch[ch.length-i-1] = temp;
   }
   System.out.println(ch);
   
   int pos = 0;
   for(int i = 0; i <= ch.length ; i++) {
     if (i == ch.length || ch[i] == ' ') {
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
}