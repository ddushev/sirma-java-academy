import java.util.*;

public class RandomizeWords {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<String> words = new ArrayList<>(Arrays.asList(sc.nextLine().split(" ")));
    Random rnd = new Random();
    while(!words.isEmpty()) {
      int randomIndex = rnd.nextInt(words.size());
      System.out.println(words.get(randomIndex));
      words.remove(randomIndex);
    }
  }
}
