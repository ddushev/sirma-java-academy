import java.util.Scanner;

public class NumberReversal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();
    StringBuilder nReversed = new StringBuilder();
    for (int i = n.length() - 1; i >= 0; i--) {
      nReversed.append(n.charAt(i));
    }
    System.out.println(nReversed);
  }
}