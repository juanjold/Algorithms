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

  public static boolean path(int i, int j, char[][] grid) {
    if (i >= grid.length || j >= grid[0].length || 
        i < 0 || j < 0 ) {
      return false;
    }
    if (i == grid.length-1&& j ==grid[0].length-1) {
      grid[i][j] = '*';
      return true;
    }
    
    if (grid[i][j] == 'X' || grid[i][j] == '-' || grid[i][j] == '*') {
      return false;
    }
    
    grid[i][j] = '*';
    if(path(i, j-1, grid)) { 
      return true; }
    if(path(i+1, j, grid)) { 
      return true; }
    if(path(i, j+1, grid)) { 
      return true; }
    if(path(i-1, j, grid)) { 
      return true; }

    grid[i][j] = '-';
    return false;
  }
}