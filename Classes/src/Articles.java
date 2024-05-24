import java.util.Scanner;

public class Articles {
  private String title;
  private String content;
  private String author;

  public Articles(String title, String content, String author) {
    this.title = title;
    this.content = content;
    this.author = author;
  }

  public void editContent(String newContent) {
    content = newContent;
  }

  public void changeAuthor(String newAuthor) {
    author = newAuthor;
  }

  public void renameTitle(String newTitle) {
    title = newTitle;
  }

  @Override
  public String toString() {
    return String.format("%s, %s, %s", this.title, this.content, this.author);
  }
}

class ArticlesTest{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] articleDetails = sc.nextLine().split(", ");
    Articles article = new Articles(articleDetails[0],articleDetails[1], articleDetails[2]);
    int n = Integer.parseInt(sc.nextLine());
    for(int i = 0; i < n; i++) {
      String[] actionDetails = sc.nextLine().split(": ");
      switch (actionDetails[0]) {
        case "Edit":
          article.editContent(actionDetails[1]);
          break;
        case "ChangeAuthor":
          article.changeAuthor(actionDetails[1]);
          break;
        case "Rename":
          article.renameTitle(actionDetails[1]);
          break;
      }
    }
    System.out.println(article);
  }
}
