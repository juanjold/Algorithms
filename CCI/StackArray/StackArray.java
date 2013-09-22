/*
// Naïve implementation of three stacks with one array
// @author Juan Jose Lopez Delgado
// 22-09-13
*/

class StackArray {
  public static final int STACK_SIZE = 9;
  public int[] stacks;
  public int[] pointer;
  public int arrayOne, arrayTwo, arrayThree;
  
  public StackArray() {
    stacks = new int[STACK_SIZE];
    arrayOne = STACK_SIZE/3;
    arrayTwo = STACK_SIZE*2/3;
    arrayThree = STACK_SIZE;
    pointer =  new int[] {0, arrayOne, arrayTwo};
  }
  
  public void push(int data, int array) {
    if (array > 3 || array <= 0) {
      System.out.println("Nonexistent stack");
      return;
    }
    if (array == 1) {
      if (pointer[0] < arrayOne) {
        stacks[pointer[0]] = data;
        if (pointer[0] < arrayOne) { pointer[0]++; }
      } else { System.out.println("Stack full"); return; }
    } else if (array == 2) {
      if (pointer[1] < arrayTwo) {
        stacks[pointer[1]] = data;
        if (pointer[1] < arrayTwo) { pointer[1]++; }
      } else { System.out.println("Stack full"); return; }
    } else if (array == 3) {
      if (pointer[2] < arrayThree) {
        stacks[pointer[2]] = data;
        if (pointer[2] < arrayThree) { pointer[2]++; }
      } else { System.out.println("Stack full"); return; }
    }
  }
  
  public int pop(int array) {
    if (array > 3 || array <= 0) {
      System.out.println("Nonexistent stack");
      return -1;
    }
    if (array == 1) {
      if (pointer[0] > 0) {
        pointer[0]--;
        return stacks[pointer[0]];
      } else { System.out.println("Stack is empty"); } 
    } else if (array == 2) {
      if (pointer[1] > arrayOne) {
        pointer[1]--;
        return stacks[pointer[1]];
      } else { System.out.println("Stack is empty"); } 
    } else if (array == 3) {
      if (pointer[2] > arrayTwo) {
        pointer[2]--;
        return stacks[pointer[2]];
      } else { System.out.println("Stack is empty"); } 
    } return -1;
  }
}