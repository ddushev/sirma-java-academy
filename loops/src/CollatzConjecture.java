import java.util.Scanner;

public class CollatzConjecture {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    StringBuilder res = new StringBuilder();

    while(true) {
      res.append(n).append(" ");
      if(n % 2 == 0) {
        n /= 2;
      }else {
        n = n * 3 + 1;
      }
      if(n == 1) {
        res.append(n);
        break;
      }
    }

    System.out.println(res);
  }
}
