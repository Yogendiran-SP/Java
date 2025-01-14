class Account {
    private double balance = 500.00;  // member data
    public double  getBalance(int x) {     // member method
      int withdrawal = 500;// logic here
      return balance-withdrawal;
    }
  
    public static void main(String[] args) {
      Account accnt = new Account();           // object creation
      double value = accnt.getBalance(123456);
      System.out.println(accnt.balance);
      System.out.println("The balance is: " + value);
    }
  }
        