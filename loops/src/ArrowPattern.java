import java.util.Scanner;

public class ArrowPattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());

    int rows = n - 1;
    int width = n % 2 == 0 ? n - 1 : n - 2;
    int upperSpaces;
    int bottomSpaces = n % 2 == 0 ? n / 2 - 1 : (n - 1) / 2;

    for (int row = 1; row <= rows; row++) {
      upperSpaces = n % 2 == 0 ? width - row : width - row + 1;
      for (int space = 1; space <= upperSpaces; space++) {
        System.out.print(" ");
      }
      for(int stars = 1; stars <= row; stars++ ) {
        System.out.print("* ");
      }
      System.out.println();
    }

    for (int row = 1; row <= rows; row++) {
      for (int space = 1; space <= bottomSpaces; space++) {
        System.out.print(" ");
      }
      for(int stars = 1; stars <= width; stars++ ) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
