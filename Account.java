import java.util.Scanner;
public class Account {
  public static void main(String[] args) {
    float balance =1000,limit=10000,minbalance=100;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the amount of withdrawal: ");
    float amount = scanner.nextFloat();
    if(amount<balance && (amount<=limit) && (balance-amount)>minbalance) {
      balance-=amount;
      System.out.println("Withdrawal has successful");
      System.out.println("Your balance is "+balance);
    }
    else {
      System.out.println("Withdrawal has failed");
    }
    scanner.close();
  }
}  