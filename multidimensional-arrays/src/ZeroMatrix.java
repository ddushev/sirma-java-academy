import java.util.*;

public class ZeroMatrix {
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
    int[][] matrix = new int[dims[0]][dims[1]];
    Queue<Integer> rowsToClear = new ArrayDeque<>();
    Queue<Integer> colsToClear = new ArrayDeque<>();

    for (int row = 0; row < matrix.length; row++) {
      int[] rowNums = Arrays.stream(sc.nextLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
      for (int col = 0; col < matrix[row].length; col++) {
        int currentNum = rowNums[col];
        matrix[row][col] = currentNum;
        if(currentNum == 0) {
          if (!rowsToClear.contains(row)) {
            rowsToClear.offer(row);
          }

          if (!colsToClear.contains(col)) {
            colsToClear.offer(col);
          }
        }
      }
    }

    while(!rowsToClear.isEmpty()) {
      int rowToClear = rowsToClear.poll();
      for (int col = 0; col < dims[1]; col++) {
        matrix[rowToClear][col] = 0;
      }
    }

    while(!colsToClear.isEmpty()) {
      int colToClear = colsToClear.poll();
      for (int row = 0;  row < dims[0]; row++) {
        matrix[row][colToClear] = 0;
      }
    }

    printMatrix(matrix);
  }
}
