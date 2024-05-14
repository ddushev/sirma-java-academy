import java.util.Scanner;

public class WeatherForecast {
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    String town = sc.nextLine();
    int degrees = Integer.parseInt(sc.nextLine());
    String output = String.format("Today in %s is %d degrees", town, degrees);
    System.out.println(output);
    System.out.printf("Today in %s is %d degrees", town, degrees);
  }
}
