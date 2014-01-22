/*
// Find path from i,j to k,m, on a given grid.
// Input: start position, grid, end position
// Output: traversed grid array
// @author Juan Jose Lopez Delgado
// 01-04-14
*/

public class Path {
  public Path() {
  }
  public static void printGrid(char[][] grid) {
    for (int i = 0; i < grid.length ; i++) {
      for (int j = 0; j < grid.length ; j ++) {
        System.out.print(grid[i][j] + " ");
      }
      System.out.println();
    }
  }

  // to search from top-left to bottom-right, intialize with
  // 0,0,grid,grid.length-1,grid[0].length-1
  public static boolean path(int i, int j, char[][] grid, int k, int m) {
    if (k >= grid.length || m >= grid[0].length) {
      return false;
    }
    
    if (i >= grid.length || j >= grid[0].length || 
        i < 0 || j < 0 ) {
      return false;
    }
    if (i == k && j == m) {
      grid[i][j] = '*';
      return true;
    }
    
    if (grid[i][j] == 'X' || grid[i][j] == '-' || grid[i][j] == '*') {
      return false;
    }
    
    grid[i][j] = '*';
    if(path(i, j-1, grid,k,m)) { 
      return true; }
    if(path(i+1, j, grid,k,m)) { 
      return true; }
    if(path(i, j+1, grid,k,m)) { 
      return true; }
    if(path(i-1, j, grid,k,m)) { 
      return true; }

    grid[i][j] = '-';
    return false;
  }
}