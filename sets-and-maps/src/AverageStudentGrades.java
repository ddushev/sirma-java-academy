import java.util.*;

public class AverageStudentGrades {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    Map<String, ArrayList<Double>> studentsMap = new TreeMap<>();

    for (int i = 1; i <= n; i++) {
      String[] studentData = sc.nextLine().split(" ");
      String studentName = studentData[0];
      double grade = Double.parseDouble(studentData[1]);
      studentsMap.computeIfAbsent(studentName, _ -> new ArrayList<>()).add(grade);

//      if(studentsMap.containsKey(studentName)) {
//        studentsMap.get(studentName).add(grade);
//      }else {
//        ArrayList<Double> gradesList =  new ArrayList<>();
//        gradesList.add(Double.parseDouble(studentData[1]));
//        studentsMap.put(studentData[0], gradesList);
//      }

    }

//    for (Map.Entry<String, ArrayList<Double>> student: studentsMap.entrySet()) {
//      double gradesSum = 0;
//      for (double sum: student.getValue()) {
//        gradesSum += sum;
//      }
//
//      System.out.printf("%s -> %s (avg: %.2f)", student.getKey(), student.getValue(), gradesSum / student.getValue().size());
//      System.out.println();
//    }

    studentsMap.forEach((studentName, grades) -> {
      double average = grades.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);

      StringBuilder gradesString = new StringBuilder();

      for (int i = 0; i < grades.size(); i++) {
        gradesString.append(String.format("%.2f", grades.get(i)));
        if(i < grades.size() - 1) {
          gradesString.append(" ");
        }
      }

      System.out.printf("%s -> %s (avg: %.2f)", studentName, gradesString, average);
      System.out.println();
    });
  }
}
