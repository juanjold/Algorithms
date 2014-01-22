/*
// Removing every person every x, who remaims?
// Input: LinkedList<String> Output: String
// @author Juan Jose Lopez Delgado
// 21-01-14
*/

import java.util.LinkedList;

public class CircList {  
  public static String remove(LinkedList<String> strl, int rand) {
    if (rand <= 0 || strl == null || strl.size() <= 0 ) { return null; }
 
    int size = strl.size();
    int counter = 1;
    int at = 0;
    while (size > 1) {
      if(strl.get(at) != null) {
        if ((counter % rand) == 0) {
          strl.set(at,null);
          size--;
        }
        counter++;
      }
      at++;
      if (at >= strl.size()) { at = 0; }
    }
  
  
  for (String s : strl) {
    if (s != null) {
      return s;
    }
  }
  
  return null;
  }
}