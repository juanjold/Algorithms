/*
// Probability interface
// @author Juan Jose Lopez Delgado
// 28-01-14
*/

import java.util.LinkedList;

public interface Chance {
  public LinkedList<Integer> history = new LinkedList<Integer>();
  
  public double average(int times);
  
  public double average(int value, int times);
     
  public int cast() ;
  
  public void lastVal();
  
  public void val(int n);
  
  public void toss(int times);
  
  public void reset();
}