import java.util.Arrays;
import java.util.Scanner;

public class RotateMatrix90Degrees {
  static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] dims = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int[][] rotatedMatrix = new int[dims[0]][dims[1]];
    int rowMaxIndex = dims[0] - 1;
    int colMaxIndex = dims[1] - 1;

    for (int row = 0; row <= rowMaxIndex; row++) {
      int[] currentRow = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      for (int col = 0; col <= colMaxIndex; col++) {
          rotatedMatrix[col][colMaxIndex - row] = currentRow[col];
      }
    }
    printMatrix(rotatedMatrix);
  }
}
