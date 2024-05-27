import java.util.Scanner;

public class PasswordGenerator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    int l = Integer.parseInt(sc.nextLine());

    for (int first = 1; first <= n - 1; first++){
      for (int second = 1; second <= n - 1; second++) {
        for (int third = 1; third <= l; third++) {
          for (int forth = 1; forth <= l; forth++) {
            for(int fifth = Math.max(first, second) + 1; fifth <= n; fifth ++) {
              System.out.println(String.valueOf(first)+second+(char)('a' + third - 1)+(char)('a' + forth - 1)+fifth);
            }
          }
        }
      }
    }
  }
}
