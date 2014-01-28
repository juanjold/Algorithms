/*
// Lazy implementation of the stack interface
//  using a linkedlist.
// @author Juan Jose Lopez Delgado
// 28-01-14
*/

import java.util.LinkedList;

public class LinkedStack implements Stack {
  
  protected LinkedList<Object> stack = new LinkedList<Object>();
    
  public boolean isEmpty() { return stack.isEmpty(); }
 
  public void push(Object o) { stack.addFirst(o); }
  
  public Object pop() { return stack.removeFirst(); }
  
  public Object peek() { return stack.peek(); }
  
  public int size() { return stack.size(); }
  
}