import java.util.Arrays;
import java.util.Scanner;

public class МаximalSum {
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
    int rowDims = dims[0];
    int colDims = dims[1];
    int[][] wholeMatrix = new int[rowDims][colDims];
    int[][] matrixMaxSum = new int[3][3];
    int maxSum = 0;

//    Fill matrix data
    for (int row = 0; row < rowDims; row++) {
      int[] currentRow = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      for (int col = 0; col < colDims; col++) {
        wholeMatrix[row][col] = currentRow[col];
      }
    }
//    Iterates over all 3x3 matrices
    for (int row = 0; row <= rowDims - 3; row++) {
      for (int col = 0; col <= colDims - 3; col++) {
        int tempMaxSum = 0;
        for (int tempRow = row; tempRow <= row + 2; tempRow ++) {
          for (int tempCol = col; tempCol <= col + 2; tempCol ++ ) {
            tempMaxSum += wholeMatrix[tempRow][tempCol];
          }
        }
        //if the current 3x3 matrix sum is > than the max sum updates the matrix and the sum
        if(tempMaxSum > maxSum) {
          maxSum = tempMaxSum;
          matrixMaxSum[0][0] = wholeMatrix[row][col];
          matrixMaxSum[0][1] = wholeMatrix[row][col + 1];
          matrixMaxSum[0][2] = wholeMatrix[row][col + 2];
          matrixMaxSum[1][0] = wholeMatrix[row + 1][col];
          matrixMaxSum[1][1] = wholeMatrix[row + 1][col + 1];
          matrixMaxSum[1][2] = wholeMatrix[row + 1][col + 2];
          matrixMaxSum[2][0] = wholeMatrix[row + 2][col];
          matrixMaxSum[2][1] = wholeMatrix[row + 2][col + 1];
          matrixMaxSum[2][2] = wholeMatrix[row + 2][col + 2];
        }
      }
    }
    System.out.println("Sum = " + maxSum);
    printMatrix(matrixMaxSum);
  }
}
