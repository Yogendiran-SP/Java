import java.util.Scanner;
import java.lang.Math;

public class Calculatewithoperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a calculation to be calculated: ");
        int a = scanner.nextInt();
        String c = scanner.next();
        int b = scanner.nextInt();
        switch (c) {
            case "+":
                System.out.println("The Output is "+(a+b));
                break;
            case "-":
                System.out.println("The Output is "+(a-b));
                break;
            case "/":
                System.out.println("The Output is "+(a/b));
                break;
            case "%":
                System.out.println("The Output is "+(a%b));
                break;
            case "*":
                System.out.println("The Output is "+(a*b));
                break;
            case "//":
                System.out.println("The Output is "+ Math.floorDiv(a,b));
                break;
            case "^":
                System.out.println("The Output is "+ Math.pow(a,b));
                break;
            default:
                break;
        }
        scanner.close();
    }
}