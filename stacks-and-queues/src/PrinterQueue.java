import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class PrinterQueue {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    Queue<String> printer = new ArrayDeque<>();


    while (!input.equals("print")) {
      if (input.equals("cancel")) {
        if (printer.isEmpty()) {
          System.out.println("Standby");
        } else {
          System.out.println("Canceled " + printer.poll());
        }
      } else {
        printer.offer(input);
      }

      input = sc.nextLine();
    }

    while(!printer.isEmpty()) {
      System.out.println(printer.poll());
    }
  }
}
