import java.util.Scanner;

public class CoinsAndNotes {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int coinsOf1 = Integer.parseInt(sc.nextLine());
    int coinsOf2 = Integer.parseInt(sc.nextLine());
    int coinsOf5 = Integer.parseInt(sc.nextLine());
    int sum = Integer.parseInt(sc.nextLine());

    for (int ones = 0; ones <= coinsOf1; ones++) {
      for (int twos = 0; twos <= coinsOf2; twos++) {
        for (int fives = 0; fives <= coinsOf5; fives++) {
          int currSum = ones + twos * 2 + fives * 5;
          if (sum == currSum) {
            System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.", ones, twos, fives, sum);
            System.out.println();
          }
        }
      }
    }
  }
}
