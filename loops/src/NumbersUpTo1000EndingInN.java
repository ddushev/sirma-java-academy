import java.util.Scanner;

public class NumbersUpTo1000EndingInN {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());

    for (int i = 1; i <= 1000; i++) {
      int devider = 10;
      if (n >= 10) {
        devider = (int) Math.pow(devider, String.valueOf(n).length());
      }

      if (i % devider == n) {
        System.out.println(i);
      }
    }
  }
}
