import java.util.Scanner;
public class InterestAmtInAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your balance: ");
        double balance = scanner.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double rateOfinterest = scanner.nextDouble();
        double interest = 0;
        System.out.print("Enter the amount you want to withdraw every month: ");
        double withdrawal = scanner.nextDouble();
        System.out.print("Enter the amount you want to deposit every month: ");
        double deposit = scanner.nextDouble();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (int i : arr) {
            balance+=deposit;
            balance-=withdrawal;
            interest=rateOfinterest*balance;
            balance+=interest;
            System.out.println("The interest for the month "+i+" is "+interest);
        }
        System.out.println("The Balance at the end of the year is "+balance);
        scanner.close();
    }
}