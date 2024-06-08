import java.util.Scanner;

public class CountingOrcs {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    int m = Integer.parseInt(sc.nextLine());
    int h = Integer.parseInt(sc.nextLine());
    int total = 0;

    for (int i = 1; i <= h; i++) {
      total += n;
      n += m;
    }

    System.out.println(total);
  }
}