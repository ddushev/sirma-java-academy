import java.util.Scanner;

public class Paint {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int totalPaint = Integer.parseInt(sc.nextLine());

    double yellow = (double) totalPaint * 4 / 13;
    double red = yellow / 4;
    double white = yellow * 2;

    System.out.printf("Red: %.4f%n", red);
    System.out.printf("Yellow: %.4f%n", yellow);
    System.out.printf("White: %.4f%n", white);
  }
}
