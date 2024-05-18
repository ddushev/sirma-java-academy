import java.util.Scanner;

public class PalindromeCheck {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();
    StringBuilder reversedText = new StringBuilder();

    for (int i = text.length() - 1; i >= 0; i--) {
      reversedText.append(text.charAt(i));
    }

    System.out.println(text.contentEquals(reversedText));
  }
}
