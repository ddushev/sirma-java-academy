import java.util.Scanner;

public class OrthancArchivesSearch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] archive = sc.nextLine().split(", ");
    String nameToFind = sc.nextLine();
    int firstOccurrence = archive.length;
    int lastOccurrence = -1;

    for (int i = 0; i < archive.length; i++) {
      if (archive[i].equals(nameToFind)) {
        if (i < firstOccurrence) {
          firstOccurrence = i;
        }
        if (i > lastOccurrence) {
          lastOccurrence = i;
        }
      }
    }
    if (firstOccurrence < archive.length) {
      System.out.printf("First Occurrence: %d", firstOccurrence);
      System.out.println();
      System.out.printf("Last Occurrence: %d", lastOccurrence);
    } else {
      System.out.println("Record not found");
    }
  }
}
