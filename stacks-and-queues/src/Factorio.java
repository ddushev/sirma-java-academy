import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Factorio {
  static String secondsToHourFormatter(long seconds) {
    LocalTime newTime = LocalTime.ofSecondOfDay(seconds % (24 * 3600));
    return newTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
  }

  static void rotateProducts(ArrayDeque<String> materials, long cycles) {
    for (long i = 1; i < cycles; i++) {
      materials.offerLast(Objects.requireNonNull(materials.pollFirst()));
    }
  }

  static Comparator<String> robotsPriorityComparator = (o1, o2) -> {
    int time1 = Integer.parseInt(o1.split("-")[2]);
    int time2 = Integer.parseInt(o2.split("-")[2]);
    return Integer.compare(time1, time2);
  };

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Queue<String> initialRobotOrder = Arrays.stream(sc.nextLine().split("\\|")).collect(Collectors.toCollection(ArrayDeque::new));
    String startTime = sc.nextLine();
    String token = sc.nextLine();
    ArrayDeque<String> materials = new ArrayDeque<>();
    PriorityQueue<String> robotsPriorityQueue = new PriorityQueue<>(robotsPriorityComparator);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm:ss");
    LocalTime time = LocalTime.parse(startTime, formatter);
    long seconds = time.toSecondOfDay();

    while (!token.equals("End")) {
      materials.offer(token);
      token = sc.nextLine();
    }

    String currentRobotDetails;
    String robotName;
    String material;
    long robotRechargeTime;
    long robotCurrentAvailability;
    long robotNextAvailability;
    long noAvailabilityTime;

    while (!materials.isEmpty()) {
      if (!initialRobotOrder.isEmpty()) {
        seconds++;
        currentRobotDetails = initialRobotOrder.poll();
      } else {
        currentRobotDetails = robotsPriorityQueue.poll();
        assert currentRobotDetails != null;
        robotCurrentAvailability = Long.parseLong(currentRobotDetails.split("-")[2]);
        noAvailabilityTime = robotCurrentAvailability - seconds;

        if(noAvailabilityTime > 0) {
          rotateProducts(materials, noAvailabilityTime);
        }
        seconds = robotCurrentAvailability;
      }

      material = materials.poll();
      robotRechargeTime = Long.parseLong(currentRobotDetails.split("-")[1]);
      robotName = currentRobotDetails.split("-")[0];
      robotNextAvailability = seconds + robotRechargeTime;

      System.out.printf("%s - %s [%s]", robotName, material, secondsToHourFormatter(seconds));
      System.out.println();


      if (currentRobotDetails.split("-").length == 2) {
        currentRobotDetails += String.format("-%s", robotNextAvailability);
      }else {
        String[] temp = currentRobotDetails.split("-");
        temp[2] = String.valueOf(robotNextAvailability);
        currentRobotDetails = String.join("-", temp);
      }

      robotsPriorityQueue.offer(currentRobotDetails);
    }
  }
}
