import java.util.Scanner;

public class PasswordValidator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String password = sc.nextLine();
    validatePassword(password);
  }

  static void validatePassword(String password) {
    boolean isValid = true;

    if(password.length() < 6 || 10 < password.length()) {
      System.out.println("Password must be between 6 and 10 characters");
      isValid = false;
    }

    if(!password.matches("[a-zA-Z0-9]+")) {
      System.out.println("Password must contain only letters and digits");
      isValid = false;
    }

    if(!password.matches(".*[0-9].*[0-9].*")) {
      System.out.println("Password must have at least 2 digits");
      isValid = false;
    }

    if(isValid) {
      System.out.println("Password is valid");
    }
  }
}


