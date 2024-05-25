import java.util.Scanner;

public class Grades {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double grade = Double.parseDouble(sc.nextLine());
    printGrade(grade);
  }

  static void printGrade(double grade) {
    String output = "";
    if (2 <= grade && grade <= 2.99) {
      output = "Fail";
    } else if (3 <= grade && grade <= 3.49) {
      output = "Poor";
    } else if (3.50 <= grade && grade <= 4.49) {
      output = "Good";
    } else if(4.50 <= grade && grade <= 5.49) {
      output = "Very good";
    } else if(5.50 <= grade && grade <= 6) {
      output = "Excellent";
    }

    System.out.println(output);
  }
}
