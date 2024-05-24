import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
  private final String firstName;
  private final String lastName;
  private final int age;
  private final String hometown;

  public Student(String firstName, String lastName, int age, String hometown){
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.hometown = hometown;
  }

  public String getHometown() {
    return hometown;
  }

  @Override
  public String toString(){
    return String.format("%s %s is %d years old", firstName, lastName, age);
  }

}

class StudentTest{
  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    while (!input.equals("end")) {
      String[] studentDetails = input.split(" ");
      students.add(new Student(studentDetails[0], studentDetails[1], Integer.parseInt(studentDetails[2]), studentDetails[3]));
      input = sc.nextLine();
    }

    String cityName = sc.nextLine();

    for (Student student: students) {
      if (student.getHometown().equals(cityName)) {
        System.out.println(student);
      }
    }
  }
}
