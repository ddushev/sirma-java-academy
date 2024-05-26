import java.util.Scanner;

public class GreaterValue {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String types = sc.nextLine();
    String output = "";

    switch (types) {
      case "int" -> {
        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());
        output = greaterValue(num1, num2);
      }
      case "string" -> {
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        output = greaterValue(str1, str2);
      }
      case "char" -> {
        char char1 = sc.next().charAt(0);
        char char2 = sc.next().charAt(0);
        output = greaterValue(char1, char2);
      }
    }

    System.out.println(output);
  }

  static String greaterValue(int num1, int num2) {
    return  String.valueOf(Math.max(num1, num2));
  }

  static String greaterValue(String str1, String str2) {
    return str1.compareTo(str2) > 0 ? str1 : str2 ;
  }

  static String greaterValue(char char1, char char2) {
    return String.valueOf(char1 > char2 ? char1 : char2);
  }
}
