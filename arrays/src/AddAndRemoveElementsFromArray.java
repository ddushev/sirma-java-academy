import java.util.Scanner;

public class AddAndRemoveElementsFromArray {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] commands = scanner.nextLine().split(",");
    int[] numbers = new int[commands.length]; // Array to store numbers
    int currentIndex = 0; // Index to track the last filled position in the array
    int currentNumber = 1; // Initial number

    for (String command : commands) {
      if (command.equals("add")) {
        numbers[currentIndex++] = currentNumber++;
      } else if (command.equals("remove")) {
        if (currentIndex > 0) {
          currentIndex--; // Decrease index to remove the last added number
        }
      }
    }

    if (currentIndex == 0) {
      System.out.println("Empty");
    } else {
      for (int i = 0; i < currentIndex; i++) {
        System.out.print(numbers[i] + " ");
      }
    }
  }
}
