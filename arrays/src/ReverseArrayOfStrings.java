import java.util.Scanner;

public class ReverseArrayOfStrings {
  public static void reverseArray(String[] arr){
    for (int i = 0; i < arr.length / 2; i++) {
      int j = arr.length - 1 - i;
      String temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] arr = sc.nextLine().split(",");

    reverseArray(arr);
    System.out.println(String.join(" ", arr));
  }
}
