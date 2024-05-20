import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayOfNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.nextLine());
    String[] arrInput = sc.nextLine().split(",");
    String[] newArr = new String[n];

    for (int i = 0; i < n; i++) {
      newArr[i] = arrInput[n - i - 1];
    }
    System.out.println(String.join(" ", newArr));
  }
}