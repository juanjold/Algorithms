/*
// If in an MxN matrix an element is 0, its entire row and column is set to 0
// @author Juan Jose Lopez Delgado
// 31-08-13
*/

import java.util.HashSet;

public class ColRowZero {
  public static int[][] zero(int[][] matrix) {
    HashSet<Integer> row = new HashSet<Integer>();
    HashSet<Integer> col = new HashSet<Integer>();
    
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == 0) {
          row.add(i);
          col.add(j);
        }
      }
    }
    
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) { 
        if (row.contains(i) || col.contains(j)) {
          matrix[i][j] = 0;
        }
      }
    }
    
    return matrix;
  }
  
  public static void main(String[] args) {
    int[][] matrix = {{1,2,3},{1,2,0},{3,2,1}};
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) { 
        System.out.print(matrix[i][j] + " "); 
      }
      System.out.println();
    }
    System.out.println();
    matrix = ColRowZero.zero(matrix);
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) { 
        System.out.print(matrix[i][j] + " "); 
      }
      System.out.println();
    }
  }
}