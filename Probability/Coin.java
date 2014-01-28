/*
// A fair coin
// @author Juan Jose Lopez Delgado
// 28-01-14
*/

public class Coin implements Chance{
  public int total = 0; 
  
  public int cast() {
    if(Math.random() > 0.5) {
      history.push(1);
      total += history.peek();
      return 1;
    }
    else {
      history.push(0);
      total += history.peek();
      return 0;
    }
  }
  
  public void val(int n){
    if (n == 1) {
      System.out.print("H");
    } else {
      System.out.print("T");
    }
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
  
  
  public double average(int times) {
    return (double) total/times;
  }
  
  public void lastVal(){
    val((int)history.peek());
  }
  
  public void toss(int times) {
    int e = 0;
    int counter = 0;
    for(int i = 0; i < times; i++) {
      e =  atLeast2(this, -1);
      counter += e;
      System.out.println(" " + e + " tosses");
    }
    System.out.println("----------------" + '\n' + "Average: " + counter/times);
  }
  
  public static int atLeast2(Coin c, int n) {
    int cast = c.cast();
    c.lastVal();
    if (cast == n) {
      return 1;
    } else {
      return 1 + atLeast2(c, cast);
    }
  }
}