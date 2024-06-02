import java.util.Scanner;

public class CheckboardPattern {
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
    int size = Integer.parseInt(sc.nextLine());
    int[][] chessboard = new int[size][size];
    boolean isBlack;

    for (int row = 0; row < size; row++) {
      isBlack = row > 0 && chessboard[row - 1][0] == 0;
      for (int col = 0; col < size; col++) {
        if (isBlack) {
          chessboard[row][col] = 1;
        }
        isBlack = !isBlack;
      }
    }

    printMatrix(chessboard);
  }
}
