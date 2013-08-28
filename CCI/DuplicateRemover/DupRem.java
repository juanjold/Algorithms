import java.util.Arrays;
/*
// Design an algorithm and write code to remove the duplicate characters in a string 
// without using any additional buffer NOTE: One or two additional variables are fine 
// An extra copy of the array is not. 
// @author Juan Jose Lopez Delgado
// 27-08-13
*/

public class DupRem {

  public String RemDup(String cin) {
    if (cin.length() <= 1) { return cin; }
    char[] charArr = cin.toCharArray();
    Arrays.sort(charArr);
    String buf = "" +  charArr[0];
    
    for (int i = 1; i < charArr.length; i++) {
      if (charArr[i - 1] != charArr[i]) {
          buf += charArr[i];
      }
    }
  return buf;
  }
}