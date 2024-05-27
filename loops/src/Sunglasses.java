import java.util.Scanner;

public class Sunglasses {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());

    for (int rows = 1; rows <= n; rows++) {
      for (int cols = 1; cols <= n * 4 + n; cols++) {
        char charToPrint = '/';
        if(rows == 1 || rows == n || cols == 1 || cols == n * 2) {
          charToPrint = '*';
        }

        if(cols > n * 2 && cols <= n * 2 + n) {
          charToPrint = ' ';
          if(rows == Math.ceil((double) n / 2)) {
            charToPrint = '|';
          }
        }
        System.out.print(charToPrint);
      }
      System.out.println();
    }



  }
}
