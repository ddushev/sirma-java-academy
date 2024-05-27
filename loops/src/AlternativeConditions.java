import java.util.Scanner;

public class AlternativeConditions {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    int m = n;
    int maxNumbersOnRow = 0;
    int rows = 0;
    int counter = 0;
    int numToPrint = 1;

    while(m > 0) {
      if(m - counter < 0) {
        counter = m;
      }else {
        counter++;
      }

      if(counter > maxNumbersOnRow) {
        maxNumbersOnRow = counter;
      }

      rows++;
      m -= counter;
    }

    int maxSymbolsOnRow = maxNumbersOnRow * 2 - 1;

    for (int row = 1; row <= rows; row++) {
      StringBuilder line = new StringBuilder();
      int maxSpacesOnRow = row == rows ? maxSymbolsOnRow - (n - numToPrint) * 2 - 1 : maxSymbolsOnRow - (row * 2 - 1);

      line.append(" ".repeat(Math.max(0, maxSpacesOnRow)));


      for (int nums = 1; nums <= maxSymbolsOnRow - maxSpacesOnRow; nums++) {
        if (numToPrint > n) {
          break;
        }
        if(line.isEmpty() || line.charAt(line.length() - 1) == ' ') {
          line.append(numToPrint++);
        }else {
          line.append(" ");
        }
      }

      System.out.println(line);
    }


  }
}
