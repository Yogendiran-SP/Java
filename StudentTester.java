

public class StudentTester
{
    private int StuId;
    public int getStudentId(int x){
        return StuId;
    }
    public static void main(String[] args)
    {
        StudentTester Student = new StudentTester();
        int StudentId = Student.getStudentId(1001);

    }
}