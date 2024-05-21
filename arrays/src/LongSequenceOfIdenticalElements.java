import java.util.Scanner;

public class LongSequenceOfIdenticalElements {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] inputArr = sc.nextLine().split(" ");

    String sequenceChar = "";
    int longestSequenceCount = 1;
    int currentSequenceCount = 1;


    for (int i = 0; i < inputArr.length - 1; i++) {

      if(inputArr[i].equals(inputArr[i+1])) {
        currentSequenceCount++;
      }else {
        currentSequenceCount = 1;
      }

      if (currentSequenceCount >= longestSequenceCount) {
        longestSequenceCount = currentSequenceCount;
        sequenceChar = inputArr[i];
      }

    }
    for (int i = 0; i < longestSequenceCount; i++) {
      System.out.print(sequenceChar + " ");
    }
  }
}
