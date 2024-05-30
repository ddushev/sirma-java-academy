import java.util.Arrays;
import java.util.Scanner;

public class Snowflakes {
  static void printMatrix(String[][] matrix) {
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
    String[][] snowflakes = new String[dims[0]][dims[1]];
    int rowMaxIndex = dims[0] - 1;
    int colMaxIndex = dims[1] - 1;

    for (int row = 0; row <= rowMaxIndex; row++) {
      String[] currentRow = sc.nextLine().split(" ");
      for (int col = 0; col <= colMaxIndex; col++) {
        snowflakes[row][col] = currentRow[col];
      }
    }

    for (int row = 0; row < rowMaxIndex; row++) {
      boolean isFalling = false;
      boolean canFallFurther = false;
      for (int col = 0; col <= colMaxIndex; col++) {
        String currentSymbol = snowflakes[row][col];
        String nextRowSymbol = snowflakes[row + 1][col];
        if (currentSymbol.equals("*") && nextRowSymbol.equals("0")) {
          snowflakes[row][col] = "0";
          snowflakes[row + 1][col] = "*";
          if (row + 2 <= rowMaxIndex && snowflakes[row + 2][col].equals("0")) {
            canFallFurther = true;
          }
          isFalling = true;
        }
      }
      if (isFalling) {
        printMatrix(snowflakes);
        if (canFallFurther)
          System.out.println("=".repeat(dims[0]));
      } else {
        break;
      }
    }
  }
}
