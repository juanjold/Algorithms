import java.util.LinkedList;
import java.util.HashSet;

class Node {
  public HashSet<Node> children;
  public int data;
  public boolean marked;
  public boolean visited;
  
  public Node(int datum) {
    data = datum;
    children = new HashSet<Node>();
    marked = false;
    visited = false;
  }
  
  public void addChild(Node n){
    children.add(n);
  }
   
  public boolean remove(Node n){
    return children.remove(n);
  }
  
  public void mark() {
    marked = true;
  }
  
  public void visit() {
    visited = true;
  }
  
  public void print() {
    System.out.println(data);
  }
  
  public Node getUnvisitedChild(){
    for(Node child : children) {
      if(!child.marked){
        return child;
      }
    }
    return null;
  }
  
  public static void BFS(Node start) {
    LinkedList<Node> queue = new LinkedList<Node>();
    queue.add(start);
    start.mark();
    start.print();
    while(!queue.isEmpty()){
      Node n = queue.removeFirst();
      for (Node child : n.children) {
        if (!child.marked) {
          queue.add(child);
          child.mark();
          child.print();
        }
      }
    }
  }
  
  public static void DFS(Node start) {
    LinkedList<Node> stack = new LinkedList<Node>();
    stack.push(start);
    start.mark();
    start.print();
    while(!stack.isEmpty()){
      Node n = stack.peek();
      Node child = n.getUnvisitedChild();
        if (child != null) {
          child.mark();
          child.print();
          stack.push(child);
        } else { stack.pop(); }
    }
  }
}