import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int billid = scanner.nextInt();
        int customerid = scanner.nextInt();
        String discountval = scanner.next();
        double discountamt = Double.parseDouble(discountval.replace("%","")) / 100.0;
        
        scanner.close();
    }
}
