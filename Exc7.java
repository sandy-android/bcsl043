class Account
{
    private String name;
    private int accountNumber;
    private double balance;
    private String addressString;
    private String accountType;

   public Account(String n,int number,double bal){
         name = n;
         accountNumber = number;
         balance = bal;
   }

   public Account(String n, int a, double b, String add,String t)
{
    name=n;
    accountNumber=a;
    balance=b;
    addressString=add;
    accountType=t;
}

  public double getBalance(){
        return balance;
  }

  public void deposit(double amount){
        if (amount > 0)
            balance += amount;
        else
            System.out.println("Invalid deposit amount");
  }

    public void withdraw(double amount){
            if (amount > 0 && amount <= balance)
                balance -= amount;
            else
                System.out.println("Invalid withdraw amount");
    }

}


public class Exc7
{
    public static void main(String[] args)
    {
    // Creating Account objects using both constructors
    Account a1 = new Account("Alice", 1001, 5000.0);
    Account a2 = new Account("Bob", 1002, 3000.0, "123 Main St", "Savings");

    // Using deposit and withdraw methods
    a1.deposit(1500.0);
    a2.withdraw(500.0);

    // Displaying balances
    System.out.println("Balance of a1: " + a1.getBalance());
    System.out.println("Balance of a2: " + a2.getBalance());

    }
}