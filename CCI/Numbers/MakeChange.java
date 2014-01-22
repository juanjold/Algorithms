/*
// Number of coins needed for change. Different sol'ns
// @author Juan Jose Lopez Delgado
// 01-04-14
*/

import java.util.*;

public class MakeChange {
  
  // Recursive solution
  public static int recChange(HashSet<Integer> coins, int change) {
    int minChange = change;
    
    if (coins.contains(change)) {
      return 1;
    } else {
      for (int c : coins) {
        if (c <= change) {
        int minCoins = 1  + recChange(coins, change - c);
        if (minCoins < minChange)
          minChange = minCoins;
        }
      }
    }
    return minChange;
  }
  
  // Memoized solution
  public static int recChange(HashSet<Integer> coins, int change, HashMap<Integer,Integer> results) {
    int minChange = change;
    
    if (coins.contains(change)) {
      results.put(change,1);
      return 1;
    } else if (results.containsKey(change)) {
      return results.get(change);
    } else {
      for (int c : coins) {
        if (c <= change) {
          int numCoins = 1 + recChange(coins, change - c, results);
          if (numCoins < minChange) {
            minChange = numCoins;
            results.put(change, minChange);
          }
        }
      }
    }
    return minChange;
        
  }
            
}