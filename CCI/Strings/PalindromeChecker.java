public class PalindromeChecker {
  
  public static boolean check(String word) {
    if (word.length() <= 1)
      return true;
  
    if (word.charAt(0) == word.charAt(word.length()-1))
          return check(word.substring(1,word.length()-1));
    
    return false;
    
  }
  
}