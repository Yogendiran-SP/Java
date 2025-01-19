import java.util.Scanner;
public class Chocolate {
    int barcode;
    String name;
    String weight;
    double cost;
    public Chocolate(String cname, int cbarcode, double ccost, String cweight) {
        this.name = cname;
        this.cost=ccost;
        this.barcode=cbarcode;
        this.weight=cweight;
    }
    public int getBarCode() {
        return barcode;
    }
    public void setBarCode(int barcode) {
        this.barcode=barcode;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name=name;
    }
    public String getWeight() {
        return weight;
    }
    public void setWeight(String weight) {
        this.weight=weight;
    }
    public double getCost() {
        return cost;
    }
    public void setCost(double cost) {
        this.cost=cost;
    }
    public void display() {
        System.out.println("Name of the Chocolate: "+name);
        System.out.println("Cost of the Chocolate: "+cost);
        System.out.println("Barcode of the Chocolate: "+barcode);
        System.out.println("Weight of the Chocolate: "+weight);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Chocolate chocolate = new Chocolate("Cadbury", 64538376,599, "500g");
        chocolate.display();
        for(int i=0;;i++) {
            System.out.println("Enter your Choice:\n1. Display the info\n2. Modification needed\n3. Exit");
            int a = scanner.nextInt();
            if(a==1) {
                System.out.print("Enter the Chocolate name that you want to update: ");
                chocolate.name=scanner.nextLine();
                System.out.print("Enter the Chocolate cost that you want to update: ");
                chocolate.cost=scanner.nextDouble();
                System.out.print("Enter the Chocolate barcode that you want to update: ");
                chocolate.barcode=scanner.nextInt();
                System.out.print("Enter the Chocolate weight that you want to update: ");
                chocolate.weight=scanner.nextInt();
            }
            
        }
        
    }
}