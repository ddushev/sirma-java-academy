import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastKNums {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = Integer.parseInt(sc.nextLine());
    int[] nums = Arrays.stream(sc.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

    for (int i = 0; i < k; i++) {
      System.out.print(nums[i] + " ");
    }

    System.out.println();

    for (int i = nums.length - k; i < nums.length; i++) {
      System.out.print(nums[i] + " ");
    }

    System.out.println();

  }
}
