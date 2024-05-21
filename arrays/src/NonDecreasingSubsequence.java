import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NonDecreasingSubsequence {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] inputArr = Arrays.stream(sc.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
    int[] outputArr = new int[inputArr.length];
    int counter = 1;
    outputArr[0] = inputArr[0];
    for (int i = 1; i < inputArr.length; i++) {
      if (inputArr[i] >= inputArr[i - 1]) {
        outputArr[counter] = inputArr[i];
        counter++;
      }
    }

    outputArr = Arrays.copyOf(outputArr, counter);

    System.out.println(Arrays.stream(outputArr).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
  }
}
