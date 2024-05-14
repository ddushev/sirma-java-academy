import java.util.Scanner;

public class Calculate {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numOne = Integer.parseInt(sc.nextLine());
    int numTwo = Integer.parseInt(sc.nextLine());
    int sum = numOne + numTwo;
    int diff = Math.abs(numOne - numTwo);
    int product = numOne * numTwo;
    double avg = (double) (numOne + numTwo) / 2;
    System.out.println(sum);
    System.out.println(diff);
    System.out.println(product);
    System.out.printf("%.6f", avg);
    System.out.println();
  }
}
