/*
// Grouping anagrams together
// Input: String[], Output: String[][] //Anagrams
// @author Juan Jose Lopez Delgado
// 28-09-13
*/

import java.util.HashSet;
import java.util.HashMap;
import java.util.Arrays;

class Anagrams {
  public HashMap<String, HashSet<String>> map;
  
  public Anagrams() {
    map = new HashMap<String,HashSet<String>>();
  }
  
  public String[][] solver(String[] words) {
    HashSet<String> temp;
    for (String w : words) {
      String s = Anagrams.sort(w);
      if (map.containsKey(s)) {
        temp = map.get(s);
        temp.add(w);
        map.put(s,temp);
      } else {
        temp = new HashSet<String>();
        temp.add(w);
        map.put(s,temp);
      }
    }
    String[][] result = new String[map.size()][map.values().size()];
    int i = 0;
    for (String key : map.keySet()) {
      result[i] = map.get(key).toArray(new String[map.get(key).size()]);
      i++;
    }
    return result;
  }
  
  public static String sort(String w) {
    char[] arr = w.toCharArray();
    Arrays.sort(arr);
    w = new String(arr);
    return w;
  }
}