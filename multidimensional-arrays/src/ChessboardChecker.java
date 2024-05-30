import java.util.Arrays;
import java.util.Scanner;

public class ChessboardChecker {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] dims = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int[][] chessBoard = new int[dims[0]][dims[1]];
    int rowMaxIndex = dims[0] - 1;
    int colMaxIndex = dims[1] - 1;
    boolean isThreaten = false;

    for (int row = 0; row <= rowMaxIndex; row++) {
      int[] currentRow = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      for (int col = 0; col <= colMaxIndex; col++) {
        chessBoard[row][col] = currentRow[col];
      }
    }

    for (int row = 0; row <= rowMaxIndex; row++) {
      int rowSum = 0;
      int colSum = 0;
      int leftBottomDiagonalSum = 0;
      int rightBottomDiagonalSum = 0;
      int leftTopLinesSum = 0;
      int rightTopLinesSum = 0;
      int leftTopLinesCounter = row + 1;
      for (int col = 0; col <= colMaxIndex; col++) {
        if (row > colMaxIndex || col > rowMaxIndex) {
          break;
        }
        rowSum += chessBoard[row][col];
        colSum += chessBoard[col][row];

        if (row + col <= rowMaxIndex) {
          leftBottomDiagonalSum += chessBoard[row + col][col];
          rightBottomDiagonalSum += chessBoard[row + col][colMaxIndex - col];
        }

        if (col + row + 1 <= colMaxIndex) {
          rightTopLinesSum += chessBoard[col][col + row + 1];
        }
        if (colMaxIndex - leftTopLinesCounter >= 0) {
          leftTopLinesSum += chessBoard[col][colMaxIndex - leftTopLinesCounter];
          leftTopLinesCounter++;
        }


        if (rowSum > 1 ||
                colSum > 1 ||
                leftBottomDiagonalSum > 1 ||
                rightBottomDiagonalSum > 1 ||
                leftTopLinesSum > 1 ||
                rightTopLinesSum > 1) {
          isThreaten = true;
          break;
        }
      }
      if (isThreaten) {
        break;
      }

    }
    System.out.println(isThreaten);
  }
}
