import java.util.Scanner;

public class EmployeeRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no. of employees salary to be given (upto a max of 100 ata a time): ");
        float n = scanner.nextInt();
        int lavg=0,gavg=0;
        double avg=0;
        double[] a= new double[100];
        for(int i=0;i<n;i++) {
            System.out.print("Enter the salary of employee "+(i+1)+": ");
            a[i]= scanner.nextDouble();
        }
        for(int i=0;i<n;i++) {
            avg=avg+a[i];
        }
        avg=avg/n;
        System.out.println("The average salary is "+avg);
        for(int i=0;i<n;i++) {
            if(a[i]<=avg) {
                lavg = lavg+1;
            }
            else {
                gavg = gavg+1;
            }
        }
        System.out.println("The no. of employees salaries lesser than average is: "+lavg);
        System.out.println("The no. of employees salaries greater than average is: "+gavg);
        scanner.close();
    }
}
