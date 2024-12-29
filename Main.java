import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner S1 = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = S1.nextLine();
        System.out.println("Hi " + name + "!");
        S1.close();
    }
}
