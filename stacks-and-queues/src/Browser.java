import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Browser {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Deque<String> urls = new ArrayDeque<>();
    Deque<String> history = new ArrayDeque<>();
    String input = sc.nextLine();
    while (!input.equals("Home")) {
      if (input.equals("back")) {
        if (urls.size() == 1 || urls.isEmpty()) {
          System.out.println("no previous URLs");
        } else {
          history.push(urls.pop());
          System.out.println(urls.peek());
        }
      } else if (input.equals("next")) {
        if (history.isEmpty()) {
          System.out.println("no urls in history");
        } else {
          urls.push(history.pop());
          System.out.println(urls.peek());
        }
      } else {
        if (!history.isEmpty()) {
          history.clear();
        }
        urls.push(input);
        System.out.println(input);
      }

      input = sc.nextLine();
    }
  }
}
