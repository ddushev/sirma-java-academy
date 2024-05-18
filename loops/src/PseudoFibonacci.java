import java.util.Scanner;

public class PseudoFibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    int fSum = 1;
    int f0 = 0;
    int f1 = 1;
    int fCurr;

    for (int i = 1; i < n; i++) {
      fCurr = f0 + f1;
      fSum += fCurr;
      f0 = f1;
      f1 = fCurr;
    }

    if(n == 0) {
      fSum = 0;
    }

    System.out.println(fSum);
  }
}
