import java.util.ArrayList;
import java.util.Scanner;

public class Storage {
  private int capacity;
  private final ArrayList<Product> storage;
  private double totalCost;

  public Storage(int capacity) {
    this.capacity = capacity;
    this.storage = new ArrayList<>();
    this.totalCost = 0;
  }

  public void addProducts(String name, double price, int quantity) {
    Product newProduct = new Product(name, price, quantity);
    capacity -= quantity;
    totalCost += quantity * price;
    storage.add(newProduct);
  }

  public int getCapacity(){
    return capacity;
  }

  public double getTotalCost(){
    return totalCost;
  }

  public String getProducts(){
    StringBuilder output = new StringBuilder();
    for(Product product: storage) {
      output.append(product.getProduct()).append(System.lineSeparator());
    }
    return output.toString();
  }

}

class Product {
  private final String name;
  private final double price;
  private final int quantity;

  public Product(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public String getProduct() {
    return String.format("Product %s is in storage and has %d quantity each with price of %.2f", this.name, this.quantity, this.price);
  }
}

class StorageTest {
  static Storage storage;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    while (!input.equals("End")) {
      String[] commands = input.split(" ");

      switch (commands[0]) {
        case "Create":
          storage = new Storage(Integer.parseInt(commands[1]));
          break;
        case "Add":
          storage.addProducts(commands[1], Double.parseDouble(commands[2]), Integer.parseInt(commands[3]));
          break;
        case "Get": {
          System.out.println(storage.getProducts());
          break;
        }
        case "Print":
          if(commands[1].equals("capacity")) {
            System.out.println(storage.getCapacity());
          }else if(commands[1].equals("totalCost")) {
            System.out.println(storage.getTotalCost());
          }
          break;
      }
      input = sc.nextLine();
    }
  }
}

