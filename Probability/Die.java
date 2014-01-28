/*
// A fair die
// @author Juan Jose Lopez Delgado
// 28-01-14
*/

public class Die implements Chance {
  public int total = 0; 
  
  public int cast() {
    history.push((int)((Math.random() * 6) + 1));
    total += history.peek();
    return history.peek();
  }
  
  public void val(int n) {
    System.out.println(n);
  }
  
  public void lastVal() {
    if(!history.isEmpty()) {
      val(history.peek()); }
  }
  
  public double average(int times) {
    return (double) total/times;
  }
  
  public void reset() {
    history.clear();
  }
  
  public double average(int value, int times) {
    int counter = 0;
    for(Integer i : history) {
      if(value == i) {
        counter += 1;
      }
    }
    return (double)counter/times;
  }
  
  public void toss(int times) {
    for (int i = 0; i < times; i++) {
      cast();
    }
    System.out.println("Average of 6's " + average(6,times));
    System.out.println("Average of 3's " + average(3,times));
  }
  
}