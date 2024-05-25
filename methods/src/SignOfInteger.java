import java.util.Scanner;

public class SignOfInteger {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = Integer.parseInt(sc.nextLine());
    printIntSign(num);
  }

  static void printIntSign(int num) {
    String output = String.format("The number %d is ", num);
    if(num > 0) {
      output += "positive";
    }else if (num < 0) {
      output += "negative";
    }else {
      output += "zero";
    }

    System.out.println(output);
  }
}