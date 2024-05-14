import java.util.Scanner;

public class Speed {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int meters = Integer.parseInt(sc.nextLine());
    int hours = Integer.parseInt(sc.nextLine());
    int minutes = Integer.parseInt(sc.nextLine());
    int sec = Integer.parseInt(sc.nextLine());

    String speed = String.format("%.6f", (double) meters / (hours * 3600 + minutes * 60 + sec));
    System.out.printf(speed);
  }
}
