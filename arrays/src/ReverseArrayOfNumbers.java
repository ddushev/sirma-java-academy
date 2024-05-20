import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayOfNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.nextLine());
    int[] arrInput = Arrays.stream(sc.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
    int[] newArr = new int[n];

    for (int i = 0; i < n; i++) {
      newArr[i] = arrInput[n - i - 1];
    }

    System.out.println(Arrays.toString(newArr));
  }
}