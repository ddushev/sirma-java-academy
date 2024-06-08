import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double[] input = Arrays.stream(sc.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
    Map<Double, Integer> realNumsCount = new LinkedHashMap<>();
    for (double num: input) {
      if(realNumsCount.containsKey(num)) {
        realNumsCount.replace(num, realNumsCount.get(num) + 1);
      }else {
        realNumsCount.put(num, 1);
      }
    }

    for (Map.Entry<Double, Integer> realNum: realNumsCount.entrySet()) {
      System.out.printf("%.1f -> %d", realNum.getKey(), realNum.getValue());
      System.out.println();
    }
  }
}