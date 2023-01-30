package Class_Object;


public class BankAccount {
    private double balance;
    public int TransactionCount = 0;
    public BankAccount()
    {
        balance = 0;
    }
    public BankAccount(double initialBalance)
    {
        balance = initialBalance;
    }
    public void deposit(double amount){
        double newBalance = balance + amount;
        balance = newBalance;
        TransactionCount++;
    }
    public void withdraw(double amount)
    {
        double newBalance = balance - amount;
        balance = newBalance;
        TransactionCount++;
    }
    public double getBalance()
    {
        TransactionCount++;
        return balance;

    }

    public int getTransactionCount() {
        return TransactionCount;
    }
    public static  void main(String[] args)
    {
        BankAccount vireakBank = new BankAccount(157);
        vireakBank.deposit(50);
        vireakBank.deposit(45);
        vireakBank.withdraw(20);
        System.out.println("Balance "+vireakBank.getBalance());

        System.out.println("Transaction Count "+vireakBank.getTransactionCount());
    }
}
