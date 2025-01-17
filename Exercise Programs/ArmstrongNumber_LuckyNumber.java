import java.util.Scanner;
import java.lang.Math;
public class ArmstrongNumber_LuckyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Calculate Armstrong Number");
        System.out.println("2. Calculate Lucky Number");
        System.out.print("Your Choice is: ");
        int z = scanner.nextInt();
        if(z==1) {
            System.out.print("Enter a number: ");
            int a = scanner.nextInt();
            int copy = a;
            String c = Integer.toString(a);
            int i = c.length();
            System.out.println("i value: "+i);
            int b=0;
            for(int j=1;j<=i;j++) {
                b=b+(int)Math.pow((a%10),i);
                a=a/10;
                System.out.println("Iteration: "+b);
            }
            if(b==copy) {System.out.println(copy+" is an Armstrong number");} else {System.out.println(copy+" is not an Armstrong number");}
        }
        else if(z==2) {
            System.out.print("Enter a number: ");
            int a = scanner.nextInt();
            int copy = a;
            int s=0;
            String c = Integer.toString(a);
            int i = c.length();
            System.out.println("i value: "+i);
            int b;
            for(int j=0;j<i;j++) {
                System.out.println("Iteration of a: "+a);
                b = a%10;
                if(j%2==0) {
                    s=s+(b*b);
                    System.out.println("Inside while if of s: "+s+" and b: "+b);
                }
                a=a/10;
            }
            if(s%9==0) {
                System.out.println(copy+" is a Lucky Number!");
            }
            else {
                System.out.println("Sorry! "+copy+" is not a Lucky Number!");
            }
            
        }
        else {
            System.out.print("Oops! Invalid Choice!");
        }
        scanner.close();
    }
}