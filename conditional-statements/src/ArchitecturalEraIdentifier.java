import java.io.Console;

public class ArchitecturalEraIdentifier {
  public static void main(String[] args) {
    Console console = System.console();

    int year = Integer.parseInt(console.readLine());
    String material = console.readLine();
    if(material.equals("stone")) {
      if(year < 500 ) {
        System.out.println("Ancient");
      }else if (year <= 1500){
        System.out.println("Medieval");
      }
    }else if(material.equals("steel")) {
      if(year >= 1800 && year <= 1900) {
        System.out.println("Industrial");
      }else if (year > 1900) {
        System.out.println("Modern");
      }
    }else if(material.equals("wood") && year >= 1500 && year <= 1800) {
      System.out.println("Colonial");
    }else {
      System.out.println("Uncertain");
    }
  }
}