import java.util.Scanner;
public class ReverseCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
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
        while (a>0) {
            if(a<10) {
                b=b+a%10;
            }
            else {
                b=b+m*(a%10);
            }
            a=a/10;
            m=m/10;
            System.out.println("Iteration:"+b);
        }
        System.out.println("Last:"+b);
        s.close();
    }
}