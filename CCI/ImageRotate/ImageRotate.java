/*
// Method for rotating an image represented by a n x n matrix
// @author Juan Jose Lopez Delgado
// 29-08-13
*/

public class ImageRotate {

  public static int[][] ImageRotate(int[][] image) {
    int length = image.length;
    for (int i = 0; i < length; i++) {
      if (length != image[i].length)
        throw new IllegalArgumentException("Input must be nxn matrix"); 
    }
    int[][] result = new int[length][length];
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length; j++) {
        result[j][length - i - 1] = image[i][j];
      }
    }
    return result;
  }
}