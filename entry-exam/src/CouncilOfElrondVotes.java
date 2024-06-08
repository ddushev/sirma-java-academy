import java.util.Scanner;

public class CouncilOfElrondVotes {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] votes = sc.nextLine().split(", ");

    int yesCount = 0;
    int noCount = 0;
    int abstainCount = 0;

    for (String vote : votes) {
      switch (vote) {
        case "Yes":
          yesCount++;
          break;
        case "No":
          noCount++;
          break;
        case "Abstain":
          abstainCount++;
          break;
      }
    }

    String result;
    if (yesCount > noCount) {
      result = "Yes";
    } else if (noCount > yesCount) {
      result = "No";
    } else if (yesCount == 0 && abstainCount > 0) {
      result = "Abstain";
    } else {
      result = "Tie";
    }

    System.out.println(result);
  }
}
