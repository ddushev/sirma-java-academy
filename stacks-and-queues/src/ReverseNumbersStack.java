import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbersStack {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayDeque<Integer> input = new ArrayDeque<>();

    Arrays.stream(sc.nextLine().split(" "))
            .map(Integer::parseInt)
            .forEach(input::push);

    while (!input.isEmpty()) {
      System.out.print(input.pop());
      if (!input.isEmpty()) {
        System.out.print(" ");
      }
    }
  }
}
