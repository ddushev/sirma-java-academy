import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RohanCavalryFormation {
  private static void swap(ArrayList<Integer> arrList, int ind1, int ind2) {
    int temp = arrList.get(ind1);
    arrList.set(ind1, arrList.get(ind2));
    arrList.set(ind2, temp);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> list = Arrays.stream(sc.nextLine().split(", "))
            .map(Integer::parseInt)
            .toList();
    ArrayList<Integer> cavalry = new ArrayList<>(list);
    String command = sc.nextLine();

    while (!command.equals("end")) {
      String[] tokens = command.split(" ");
      String currentCommand = tokens[0];
      int val1 = -1;
      int val2 = -1;
      boolean isCurrentCommandValid = true;

      if (tokens.length == 2) {
        val1 = Integer.parseInt(tokens[1]);
      } else if (tokens.length == 3) {
        val1 = Integer.parseInt(tokens[1]);
        val2 = Integer.parseInt(tokens[2]);
      }

      boolean isIndex1Valid = val1 >= 0 && val1 < cavalry.size();
      boolean isIndex2Valid = val2 >= 0 && val2 < cavalry.size();
      boolean isIndex1and2Valid = isIndex1Valid && isIndex2Valid && val1 != val2;

      if (currentCommand.equals("destroy") && !isIndex1Valid) {
        isCurrentCommandValid = false;
      } else if (currentCommand.equals("swap") && !isIndex1and2Valid) {
        isCurrentCommandValid = false;
      } else if (currentCommand.equals("insert") && !isIndex2Valid && val2 != cavalry.size()) {
        isCurrentCommandValid = false;
      }

      if (!isCurrentCommandValid) {
        command = sc.nextLine();
        continue;
      }

      switch (currentCommand) {
        case "destroy": {
          cavalry.remove(val1);
          break;
        }
        case "swap": {
          swap(cavalry, val1, val2);
          break;
        }
        case "add": {
          cavalry.addLast(val1);
          break;
        }
        case "insert": {
          if (val2 == cavalry.size()) {
            cavalry.addLast(val1);
          } else {
            cavalry.add(val1, val2);
          }
          break;
        }
        case "center": {
          if (cavalry.size() % 2 == 0) {
            System.out.println(cavalry.get(cavalry.size() / 2 - 1) + " " + cavalry.get(cavalry.size() / 2));
          } else {
            System.out.println(cavalry.get(cavalry.size() / 2));
          }
          break;
        }
      }
      if (!command.equals("center")) {
        System.out.println(cavalry.stream().map(String::valueOf).collect(Collectors.joining(" ")));
      }
      command = sc.nextLine();
    }
  }
}
