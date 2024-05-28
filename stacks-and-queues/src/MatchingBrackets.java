import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class MatchingBrackets {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String expression = sc.nextLine();
    Deque<Integer> parentheses = new ArrayDeque<>();
    Deque<Integer> curly = new ArrayDeque<>();
    Deque<Integer> square = new ArrayDeque<>();

    for (int i = 0; i < expression.length(); i++) {
      switch (expression.charAt(i)) {
        case '(':
          parentheses.push(i);
          break;
        case ')':
          System.out.println(expression.substring(parentheses.pop(), i+1));
          break;
        case '[':
          square.push(i);
          break;
        case ']':
          System.out.println(expression.substring(square.pop(), i+1));
          break;
        case '{':
          curly.push(i);
          break;
        case '}':
          System.out.println(expression.substring(curly.pop(), i+1));
          break;
      }
    }
  }
}

