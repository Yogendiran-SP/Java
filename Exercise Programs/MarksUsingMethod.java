import java.util.Scanner;
public class MarksUsingMethod {
    Scanner scanner = new Scanner(System.in);
    static int[] arr = {0, 1, 2, 3, 4};
    int[] arr1 = new int[5];
    void markEntry() {
        for (int i: arr) {
            System.out.print("Enter the mark of the subject "+(i+1)+" (out of 100): ");
            arr1[i] = scanner.nextInt();
        }
    }
    void markDisplay() {
        for (int j: arr) {
            System.out.println("The marks of the subject "+(j+1)+" is: "+arr1[j]);
        }
    }
    public static void main(String[] args) {
        MarksUsingMethod obj = new MarksUsingMethod();    
        obj.markEntry();
        obj.markDisplay();
    }
    
}