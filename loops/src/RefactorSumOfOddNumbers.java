import java.util.Scanner;

public class RefactorSumOfOddNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      int odd = 2 * i - 1;
      System.out.println(odd);
      sum += odd;
    }
    System.out.printf("Sum: %d%n", sum);

  }
}
