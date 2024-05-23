package carconstructor;

import java.util.ArrayList;
import java.util.Scanner;

public class CarConstructors {
  private String brand;
  private String model = "unknown";
  private int horsepower = -1;

  public CarConstructors(String brand) {
    this.brand = brand;
  }

  public CarConstructors(String brand, String model) {
    this.brand = brand;
    this.model = model;
  }

  public CarConstructors(String brand, int horsepower) {
    this.brand = brand;
    this.horsepower = horsepower;
  }

  public CarConstructors(String brand, String model, int horsepower) {
    this.brand = brand;
    this.model = model;
    this.horsepower = horsepower;
  }

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

class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    ArrayList<CarConstructors> cars = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      String[] carDetails = sc.nextLine().split(" ");
      CarConstructors newCar = getNewCar(carDetails);

      cars.add(newCar);
    }

    for (CarConstructors car: cars) {
      System.out.println(car.getCarInfo());
    }
  }

  private static CarConstructors getNewCar(String[] carDetails) {
    CarConstructors newCar;

    if(carDetails.length == 1) {
      newCar = new CarConstructors(carDetails[0]);
    } else if (carDetails.length == 2) {
      try {
        newCar = new CarConstructors(carDetails[0], Integer.parseInt(carDetails[1]));
      }catch (NumberFormatException e) {
        newCar = new CarConstructors(carDetails[0], carDetails[1]);
      }
    } else {
      newCar = new CarConstructors(carDetails[0], carDetails[1], Integer.parseInt(carDetails[2]));
    }
    return newCar;
  }
}
