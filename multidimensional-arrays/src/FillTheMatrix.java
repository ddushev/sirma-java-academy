import java.util.Scanner;

public class FillTheMatrix {
  static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  static int[][] createMatrix(int size, String pattern) {
    int[][] matrix = new int[size][size];
    int numToInsert = 1;
    if (pattern.equals("A")) {
      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
          matrix[j][i] = numToInsert++;
        }
      }
    } else if (pattern.equals("B")) {
      for (int i = 0; i < matrix.length; i++) {
        if (i % 2 == 0) {
          for (int j = 0; j < matrix[i].length; j++) {
            matrix[j][i] = numToInsert++;
          }
        } else {
          for (int j = matrix.length -1 ; j >= 0; j--) {
            matrix[j][i] = numToInsert++;
          }
        }
      }
    }

    return matrix;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] tokens = sc.nextLine().split(" ");
    printMatrix(createMatrix(Integer.parseInt(tokens[0]), tokens[1]));
  }
}
