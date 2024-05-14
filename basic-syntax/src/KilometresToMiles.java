import java.util.Scanner;

public class KilometresToMiles {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double kilometres = Double.parseDouble(sc.nextLine());
    double kmToMiles = 0.621371192;
    double miles = kilometres * kmToMiles;
    System.out.println(miles);
  }
}
