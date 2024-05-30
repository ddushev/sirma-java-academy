import java.util.Scanner;

public class ExcelColumnNameToNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] tokens = sc.nextLine().toCharArray();
    int sum = 0;

    if (tokens.length > 1) {
      for (int i = 0; i < tokens.length; i++) {
        if (i < tokens.length - 1) {
          sum += (tokens[i] - 64) * 26;
        }else {
          sum += tokens[i] - 64;
        }
      }
    } else {
      sum = tokens[0] - 64;
    }

    System.out.println(sum);
  }
}
