import java.util.Scanner;

public class HollowRectangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    int m = Integer.parseInt(sc.nextLine());

    for (int i = 1; i <= n; i++) {
      for (int l = 1; l <= m; l++) {
        if (i == 1 || i == n || l == 1 || l == m) {
          System.out.print("*");
        }else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }

  }
}
