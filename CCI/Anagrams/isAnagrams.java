import java.util.Arrays;
/*
// Method to test if two strings are anagrams or not
// @author Juan Jose Lopez Delgado
// 27-08-13
*/

public class isAnagrams{
  public boolean isAnagram (String first, String second) {
    if (first == null || second == null ||
         (first.length() != second.length())) { return false; }
    
    char[] firstArr = first.toCharArray();
    char[] secondArr= second.toCharArray();
    
    Arrays.sort(firstArr);
    Arrays.sort(secondArr);
    
    for (int i = 0; i < firstArr.length; i++) {
      if (firstArr[i] != secondArr[i]) {
        return false;
      }
    }
    return true;
  }
}