/*
// In-place Implementation of QuickSort
// Implementation of MergeSort
// @author Juan Jose Lopez Delgado
// 29-09-13
*/

public class Sort {
  public int[] arr;
  
  public Sort() {
  }
  
  public Sort(int[] in) {
    arr = in;
  }
  
  public int[] quickSort() {
   return quickSort(arr);
  }
  
  public int[] quickSort(int[] arr) {
    if (arr == null || arr.length <= 1) {
      return arr;
    }
    quickSortWork(arr,0,arr.length-1);
    return arr;
  }
  
  public int[] quickSortWork(int[] arr, int low, int high) {
    int left = low;
    int right = high;
    int pivot = arr[(high - low)/2 + low];
    int temp;
    
    while (left <= right) {
      while(arr[left] < pivot) { left++; }
      while(arr[right] > pivot) { right--; }
      if (left <= right) {
        temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
      }
    }
    if (low < right) { quickSortWork(arr,low,right); }
    if (left < high) { quickSortWork(arr,left,high);}
    return arr;
  }
  
  public int[] mergeSort() {
    return mergeSort(arr);
  }
  
  public int[] mergeSort(int[] in) {
    return mergeSort(in,0,in.length-1);
  }
  
  public int[] mergeSort(int[] arr, int low, int high) {
    if (low < high) {
      int mid = low + (high - low)/2;
      mergeSort(arr, low, mid);
      mergeSort(arr, mid + 1, high);
      merge(arr, low, mid, high);
    }
    return arr;
  }
  
  public int[] merge(int[] arr, int low, int mid, int high) {
    int[] temp = new int[arr.length];
    for (int i = low; i <= high; i++) { temp[i] = arr[i]; }
    int i = low;
    int j = mid + 1;
    int k = low;
    
    while (i <= mid && j <= high) {
      if (temp[i] <= temp[j]) {
        arr[k] = temp[i];
        i++;
      } else {
        arr[k] = temp[j];
        j++;
      } k++;
    }
    while (i <= mid) {
      arr[k] = temp[i];
      i++;
      k++;
    }   
    return arr;
  }
}