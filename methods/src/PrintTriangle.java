import java.util.Scanner;

public class PrintTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    printTriangle(n);
  }

  static void printTriangle(int n) {


    for (int rows = 1; rows <= n; rows++) {
      for (int cols = 1; cols <= rows; cols++) {
        System.out.print(cols + " ");
      }
      System.out.println();
    }

    for (int rows = 1; rows <= n - 1; rows++) {
      for (int cols = 1; cols <= n - rows; cols++) {
        System.out.print(cols + " ");
      }
      System.out.println();
    }
  }
}
