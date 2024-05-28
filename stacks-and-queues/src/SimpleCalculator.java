import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class SimpleCalculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] tokens = sc.nextLine().split(" ");
    Deque<Integer> stackOfNums = new ArrayDeque<>();
    String operator = "+";
    int result = 0;

    for (String token : tokens) {
      if (token.equals("+") || token.equals("-")) {
        operator = token;
      } else {
        int num = Integer.parseInt(token);
        if (operator.equals("+")) {
          stackOfNums.push(num);
        }else {
          stackOfNums.push(-num);
        }
      }
    }

    while(!stackOfNums.isEmpty()) {
      result += stackOfNums.pop();
    }
    System.out.println(result);
  }
}
