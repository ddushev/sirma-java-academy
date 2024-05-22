import java.util.Arrays;
import java.util.Scanner;

public class ProcessOddNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nums = Arrays.stream(sc.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

    for (int i = nums.length - 1; i >= 0; i--) {
      if(i % 2 != 0) {
        System.out.print(nums[i] * 2 + " ");
      }
    }
    System.out.println();
  }
}
