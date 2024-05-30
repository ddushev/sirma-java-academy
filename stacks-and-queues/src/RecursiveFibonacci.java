import java.util.Scanner;

public class RecursiveFibonacci {
  private static long[] fibonacciCache;

  static long getNthFib(int n) {
    if(n == 1 || n == 0) {
      return n;
    }
    if(fibonacciCache[n] != 0) {
      return fibonacciCache[n];
    }
    long fibonacciOfNth = getNthFib(n-1) + getNthFib(n-2);
    fibonacciCache[n] = fibonacciOfNth;
    return getNthFib(n-1) + getNthFib(n-2);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    fibonacciCache = new long[n + 1];
    System.out.println(getNthFib(n));
  }
}
