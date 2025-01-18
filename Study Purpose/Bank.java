import java.util.Scanner;

public class Bank {
    String bank_name;
    String bank_area;
    String bank_phoneno;
    Bank() {
        bank_name = "SBI";
        bank_area = "Chetpet";
        bank_phoneno = "9840167674";
    }
    Bank(String bname, String barea, String bphoneno) {
        bank_name = bname;
        bank_area = barea;
        bank_phoneno = bphoneno;
    }
    
    void display() {
        System.out.println("The Bank Name is "+bank_name);
        System.out.println("The Bank Area is "+bank_area);
        System.out.println("The Bank Phone Number is "+bank_phoneno);
    }
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        Scanner scanner = new Scanner(System.in);
        Bank obj = new Bank();
        System.out.print("Enter the Name of the bank: ");
        obj.bank_name=scanner.nextLine();
        System.out.print("Enter the Area of the bank: ");
        obj.bank_area = scanner.nextLine();
        System.out.print("Enter the Phone Number of the bank: ");
        obj.bank_phoneno=scanner.nextLine();
        Bank bank2 = new Bank(obj.bank_name, obj.bank_area, obj.bank_phoneno);
        bank1.display();
        System.out.println("****************************");
        bank2.display();
        scanner.close();
    }
}