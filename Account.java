public class Account
{
    private double balance=500.00;
    public double getBalance(int accountId)
    {
        return balance;
    }
    public static void main(String[] args)
    {
        Account accnt=new Account();
        double value=accnt.getBalance(123456);
        System.out.print("\tThe Balance is " + value);
    }
}