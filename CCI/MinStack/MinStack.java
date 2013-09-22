/*
// A stack that keeps track of minimum element in O(1)
// @author Juan Jose Lopez Delgado
// 22-09-13
*/
class MinStack { 
  public int[] minA;
  public int[] stack;
  public int min;
  public int pointer;
  
  public MinStack(int size) {
    minA = new int[size];
    stack = new int[size];
    minA[0] = Integer.MAX_VALUE;
    pointer = 0;
  }
  
  public void push(int data) {
    if (pointer < stack.length) { 
      stack[pointer] = data;
      if (min == 0 || data <= minA[min-1]) {
        minA[min] = data;
        min++;
      } pointer++;
    } else { System.out.println("Out of bounds"); }
  }
  
  public int pop() {
    if (pointer < stack.length && pointer > 0) {
      pointer--;
      if (stack[pointer] == minA[min-1]){ min--; }
      return stack[pointer];
    } else { System.out.println("Stack is empty"); }
  return -1;
  }
  
  public int min() {
    if (pointer <= 0) { System.out.println("Stack is empty"); return -1; }
    return minA[min-1]; }
}