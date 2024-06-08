import java.util.Scanner;

public class ElvishCodeCipher {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String encryptedMsg = sc.nextLine();
    int cipher = Integer.parseInt(sc.nextLine().trim());
    StringBuilder decryptedMsg = new StringBuilder();

    for (char ch : encryptedMsg.toCharArray()) {
      char decryptedChar = (char) (ch - cipher);
      decryptedMsg.append(decryptedChar);
    }

    System.out.println(decryptedMsg);

  }
}
