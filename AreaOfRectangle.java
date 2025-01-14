import java.util.Scanner;
public class AreaOfRectangle {
    private int l,b,p;
    public  int getinput1() {
        return l;
    }
    public void setinput1(int l) {
        this.l=l;
    }
    public int getinput2() {
        return b;
    }
    public void setinput2(int b) {
        this.b=b;
    }
    public int getcalculatePerimeter() {
        return 2*(l*b);
    }
    public void setcalculatePerimeter() {
        this.p=2*(l*b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AreaOfRectangle obj = new AreaOfRectangle();
        System.out.println("\nEnter length of the rectangle: ");
        obj.setinput1(scanner.nextInt());
        System.out.println("Enter the breadth of the rectangle: ");
        obj.setinput2(scanner.nextInt());
        System.out.println("The Area of the rectangle is "+(obj.getinput1()*obj.getinput2()));
        System.out.println("Thr Perimeter of the rectangle is "+ obj.getcalculatePerimeter());
        scanner.close();
    }
}
