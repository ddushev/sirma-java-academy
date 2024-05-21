import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulations {
  public static int[] removeArrayElement(int[] nums, int elToRemove) {
    int occurencies = 0;

    for (int num: nums) {
      if (num == elToRemove) {
        occurencies++;
      }
    }

    if (occurencies > 0) {
      int[] newArr = new int[nums.length - occurencies];
      int indexToInsert = 0;

      for (int num: nums) {
        if (num != elToRemove) {
          newArr[indexToInsert++] = num;
        }
      }
      return newArr;
    }

    return nums;

  }

  public static int[] removeArrayIndex(int[] nums, int indexToRemove) {
    if (0 <= indexToRemove && indexToRemove <= nums.length - 1) {
      int[] newArr = new int[nums.length - 1];
      int indexToInsert = 0;
      for (int i = 0; i < nums.length; i++) {
        if (i != indexToRemove) {
          newArr[indexToInsert++] = nums[i];
        }
      }
      return newArr;
    }
    return nums;
  }

  public static int[] insertElementAtIndex(int[] nums, int elToInsert, int insertAtIndex) {
    if (0 <= insertAtIndex && insertAtIndex <= nums.length - 1) {
      int[] newArr = new int[nums.length + 1];
      int indexToInsert = 0;
      for (int i = 0; i < newArr.length; i++) {
        if(i == insertAtIndex) {
          newArr[i] = elToInsert;
        }else {
          newArr[i] = nums[indexToInsert++];
        }
      }
      return newArr;
    }
    return nums;
  }


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    String[] commands = sc.nextLine().split(", ");

    for (String command: commands) {
      String[] details = command.split(" ");
      String action = details[0];
      int actionNum = Integer.parseInt(details[1]);
      switch (action) {
        case "Add": {
//          System.out.println("Add at the end the number " + actionNum);
          nums = Arrays.copyOf(nums, nums.length + 1);
          nums[nums.length - 1] = actionNum;
          break;
        }
        case "Remove": {
//          System.out.println("Remove number " + actionNum);
          nums = removeArrayElement(nums, actionNum);
          break;
        }
        case "RemoveAt":
//          System.out.println("Remove number at index " + actionNum);
          nums = removeArrayIndex(nums, actionNum);
          break;
        case "Insert":
          nums = insertElementAtIndex(nums, actionNum, Integer.parseInt(details[2]));
//          System.out.println("Insert num " + actionNum + " at index " + Integer.parseInt(details[2]));
          break;
      }
    }

    System.out.println(Arrays.toString(nums)
            .replace(",", " ")
            .replace("[", "")
            .replace("]", ""));
  }


}
