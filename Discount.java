import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your bill amount: ");
        int billamt = scanner.nextInt();
        System.out.println("Enter the discount: ");
        String discountval = scanner.next();
        double discountamt = Double.parseDouble(discountval.replace("%","")) / 100.0;
        double discountbillamt = billamt - (billamt*discountamt);
        System.out.println("The discounted amount is "+discountbillamt);

        scanner.close();
    }
}
