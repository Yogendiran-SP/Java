import java.util.Scanner;
public class ReverseCalculatorFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to be reversed: ");
        int a = scanner.nextInt();
        scanner.close();
        String c = Integer.toString(a);
        int b = 0, m = 1;
        int i = (c.length());
        if(i>1) {
            for(int j=2;j<=i;j++) {
                m=m*10;
            }
        }
        i=i-1;
        System.out.println("i value:"+i);
        System.out.println("m value:"+m);
        for(;a>0;) {
            b=b+m*(a%10);
            a=a/10;
            m=m/10;
            System.out.println("Iteration:"+b);
        }
        System.out.println("The reverse number is:"+b);
    }
}