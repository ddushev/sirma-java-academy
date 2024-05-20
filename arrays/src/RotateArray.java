import java.util.Scanner;

public class RotateArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] inputArr = sc.nextLine().split(",");
    int rotations = Integer.parseInt(sc.nextLine());

    while(rotations > 0) {
    String[] tempArr = new String[inputArr.length];
      for (int i = 0; i < inputArr.length - 1; i++) {
        if(i == 0) {
          tempArr[i] = inputArr[inputArr.length - 1];
        }
        tempArr[i+1] = inputArr[i];
      }
      inputArr = tempArr;

      rotations--;
    }
    System.out.println(String.join(" ", inputArr));
  }
}
