public class BankAccount
{
    String Account_holder_name;
    double balance;
    void deposit (double amount)
    {
        balance += amount;
        System.out.println("deposited:"+amount);
    }
    void withdraw(double amount)
    {
        if (amount<=balance)
        {
            balance=balance-amount;
            System.out.println("withdraw:"+amount);
        }
        else
        {
            System.out.println("insufficient balance");
        }
    }
    void checkbalance()
    {
        System.out.println("Account holder:"+Account_holder_name);
        System.out.println("balance:"+balance);
    }
    public static void main (String[]args)
    {
        BankAccount b = new BankAccount();
        b.Account_holder_name="supriya";
        b.balance = 10000;
        b.deposit(2000);
        b.withdraw(5000);
        b.checkbalance();
    }
}
