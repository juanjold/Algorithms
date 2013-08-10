/* Simple heap sort implementation
 * @author Juan José López Delgado
*/

public class Heap {
 public int[] array;

  public Heap (int elem) {
    array = new int[elem];
  }
  
  public Heap (){
    array = new int[0];
  }
  
  public void insert(int x) {
    int[] longer = new int[array.length + 1];
    System.arraycopy(array, 0, longer, 0, array.length);
    longer[array.length] = x;
    array = longer;
  }
  
  public int extractMax() { 
    int ret = this.max();
    if(array.length > 0 ) {
      int[] shorter = new int[array.length - 1];
      System.arraycopy(array, 1, shorter, 0, array.length-1);
      array = shorter;
    }
    return ret;
  }
  
  public int max() {
    int ret = 0;
    if(array.length > 0 ) { ret = array[0]; }
    return ret;
  }
  
  public void maxHeapify(int i) {
    int largest, buff;
    int lChild = 2*(i+1) - 1;
    int rChild = 2*(i+1);
    if (lChild < array.length && array[lChild] > array[i]) {
      largest = lChild;
    } else {
      largest = i;
    }
    if (rChild < array.length && array[rChild] > array[largest]) {
      largest = rChild;
    }
    if (largest != i) {
      buff = array[i];
      array[i] = array[largest];
      array[largest] = buff;
      maxHeapify(largest);
    }
  }
  
  public void buildMaxHeap() {
    for (int i = array.length/2; i >= 0; i--) {
      maxHeapify(i);
    }
  }
  
  public int[] heapSort() {
    int[] sorted = new int[array.length];
    int max, i = 0;
    buildMaxHeap();
    
    for (int length = array.length; length > 0; length--) {
      max = array[0];
      array[0] = array[length-1];
      sorted[i] = max;
      i++;
      int[] shorter = new int[array.length - 1];
      System.arraycopy(array, 0, shorter, 0, array.length-1);
      array = shorter;
      maxHeapify(0);
    }
    
    return sorted;
  }
}