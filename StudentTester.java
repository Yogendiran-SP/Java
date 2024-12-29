import java.util.Scanner;

public class Student {

    private int Id, Y;
    private String N;
    private double M;
    private char R;
    public int getStudentId()
    {
        return Id;
    }
    public void setStudentId(int Id)
    {
        this.Id=Id;
    }
    public int getYearofEngg()
    {
        return Y;
    }
    public void setYearofEngg(int Y)
    {
        this.Y =Y;
    }
    public String getStudentName()
    {
        return N;
    }
    public void setStudentName(String N)
    {
        this.N=N;
    }
    public float getQualifyiingExamMarks()
    {
        return M;
    }
    public void setQualifiyingExamMarks(double M)
    {
        this.M=M;
    }
    public char getResidence()
    {
        return R;
    }
    public void setResidence(char R)
    {
        this.R=R;
    }
}

public class StudentTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Enter StudentId: ");
        student.setStudentId(input.nextInt());
        System.out.println("Enter Student Name: ");
        student.setStudentName(input.nextLine());
        System.out.println("Enter Student Qualifying Marks: ");
        student.setQualifiyingExamMarks(input.nextDouble());
        System.out.println("Enter Student Year of Engineering: ");
        student.setYearofEngg(input.nextInt());
        System.out.println("Enter Student Residential Status ('H' for Hostellers / 'D' for Dayscholars): ");
        student.setResidence(input.next().charAt(0));
        
        System.out.println("Student Name                 :"+student.getStudentName());
        System.out.println("Student Id                   :"+student.getStudentId());
        System.out.println("Student Qualifying Marks     :"+student.getQualifyiingExamMarks());
        System.out.println("Student Year of Engineering  :"+student.getYearofEngg());
        System.out.print("Student Residential Status :");
        if(student.getResidence()=='H')
        {
            System.out.println("Hosteller");
        }
        else if(student.getResidence()=='D')
        {
            System.out.println("Dayscholar");
        }
        scanner.close();
    }
}