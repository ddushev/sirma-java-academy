import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class BasicStackOperations {
  static int getSmallestStackElem(Deque<Integer> s) {
    int smallestElem = Integer.MAX_VALUE;
    while(!s.isEmpty()) {
      int currentValue = s.pop();
      if (currentValue < smallestElem)  {
        smallestElem = currentValue;
      }
    }
    return smallestElem;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int[] nums = Arrays.stream(sc.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
    Deque<Integer> stack = new ArrayDeque<>();

    for (int i = 0; i < input[0]; i++) {
      stack.push(nums[i]);
    }

    for(int i = 0; i < input[1]; i++) {
      stack.pop();
    }

    if (stack.isEmpty()) {
      System.out.println(0);
    }else if(stack.contains(input[2])) {
      System.out.println(true);
    }else {
      System.out.println(getSmallestStackElem(stack));
    }
  }
}
