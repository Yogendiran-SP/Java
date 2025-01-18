import java.util.Scanner;
public class Marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {0, 1, 2, 3, 4};
        int[] arr1 = new int[5];
        for (int i: arr) {
            System.out.print("Enter the mark of the subject "+(i+1)+" (out of 100): ");
            arr1[i] = scanner.nextInt();
        }
        for (int j: arr) {
            System.out.println("The marks of the subject "+(j+1)+" is: "+arr1[j]);
        }

        scanner.close();
    }
}