import java.util.Scanner;

public class Printing {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();
    char symbol = sc.nextLine().charAt(0);
    int num = Integer.parseInt(sc.nextLine());
    double realNum = Double.parseDouble(sc.nextLine());

    System.out.println(text);
    System.out.println(symbol);
    System.out.println(num);
    System.out.println(realNum);

    System.out.print(text);
    System.out.print(symbol);
    System.out.print(num);
    System.out.print(realNum);
  }
}
