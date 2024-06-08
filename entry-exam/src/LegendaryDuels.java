import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryDuels {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] sequence = sc.nextLine().split("");
    ArrayDeque<String> movesStack = new ArrayDeque<>();
    Map<String, String> movesMap = new HashMap<>();
    movesMap.put("(", ")");
    movesMap.put("{", "}");
    movesMap.put("!", "!");

    for (String move : sequence) {
      if (movesMap.containsKey(move)) {
        if (!movesStack.isEmpty() && movesStack.peek().equals("!")) {
          movesStack.pop();
          continue;
        }
        movesStack.push(movesMap.get(move));
      } else {
        String counterMove = movesStack.pop();
        if (!counterMove.equals(move)) {
          System.out.println("Not Legendary");
          return;
        }
      }
    }
    if (movesStack.isEmpty()) {
      System.out.println("Legendary");
    } else {
      System.out.println("Not Legendary");
    }
  }
}
