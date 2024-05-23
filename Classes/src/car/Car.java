package car;

import java.util.Scanner;

public class Car {
  private String brand;
  private String model;
  private int horsepower;

//  public Car.Car(String brand, String model, int horsepower) {
//    this.brand = brand;
//    this.model = model;
//    this.horsepower = horsepower;
//  }

  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public int getHorsepower() {
    return horsepower;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setHorsepower(int horsepower) {
    this.horsepower = horsepower;
  }

  public String getCarInfo() {
    return String.format("The car is: %s %s - %d HP", this.brand, this.model, this.horsepower);
  }

}

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    Car[] cars = new Car[n];

    for (int i = 0; i < n; i++) {
      String[] carDetails = sc.nextLine().split(" ");
      Car newCar = new Car();
      newCar.setBrand(carDetails[0]);
      newCar.setModel(carDetails[1]);
      newCar.setHorsepower(Integer.parseInt(carDetails[2]));
      cars[i] = newCar;
    }

    for (Car car: cars) {
      System.out.println(car.getCarInfo());
    }
  }
}
