import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {
  private static int id = 1;
  private double balance;
  private static double interest = 0.02;
  public final int accountId;

  public BankAccount() {
    this.accountId=id;
    id++;
  }

  public static void setInterestRate(double newInterest) {
    interest = newInterest;
  }

  public double getInterest(int years) {
    return interest * this.balance * years;
  }

  public void deposit(double amount) {
    this.balance = amount;
  }

}

class BankAccountTest{
  private final static ArrayList<BankAccount> accounts = new ArrayList<>();

  private static void createAccount() {
    BankAccount newAccount = new BankAccount();
    accounts.add(newAccount.accountId - 1, newAccount);
    System.out.printf("Account ID%d created", newAccount.accountId);
    System.out.println();
  }

  private static void deposit(int id, double amount) {
    try {
      BankAccount accToDeposit = accounts.get(id - 1);
      accToDeposit.deposit(amount);
      System.out.printf("Deposited %d to ID%d", (int)amount, id);
      System.out.println();
    } catch(IndexOutOfBoundsException e) {
      System.out.println("Account does not exist");
    }

  }

  private static void setInterest(double interest) {
    BankAccount.setInterestRate(interest);
  }

  private static void getInterest(int id, int years) {
    try {
      BankAccount acc = accounts.get(id - 1);
      System.out.println(acc.getInterest(years));
    } catch(IndexOutOfBoundsException e) {
      System.out.println("Account does not exist");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    while(!input.equals("End")) {

      String[] commands = input.split(" ");
      switch (commands[0]) {
        case "Create":
          createAccount();
          break;
        case "Deposit":
          deposit(Integer.parseInt(commands[1]), Double.parseDouble(commands[2]));
          break;
        case "SetInterest":
          setInterest(Double.parseDouble(commands[1]));
          break;
        case "GetInterest":
          getInterest(Integer.parseInt(commands[1]), Integer.parseInt(commands[2]));
          break;
      }

      input = sc.nextLine();
    }
  }
}
