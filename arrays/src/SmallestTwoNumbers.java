import java.util.Arrays;
import java.util.Scanner;

public class SmallestTwoNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nums = Arrays.stream(sc.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
    Arrays.sort(nums);
    int[] smallestNums = {nums[0], nums[1]};
    System.out.println(Arrays.toString(smallestNums)
            .replace(", ", " ")
            .replace("[", "")
            .replace("]", ""));
  }
}
