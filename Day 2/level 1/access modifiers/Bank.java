class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;


    // Constructor
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }


    // Public methods to access and modify balance
    public double getBalance() {
        return balance;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }
}


// SavingsAccount subclass demonstrating protected and public member access
class SavingsAccount extends BankAccount {
    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }


    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: Rs" + getBalance());
    }
}


public class Bank {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(12345, "Ayan", 5000.0);
        System.out.println("Account Details:");
        account.displayDetails();


        System.out.println("\nUpdating Balance...");
        account.setBalance(7000.0);


        System.out.println("\nAccount Details After Update:");
        account.displayDetails();
    }
}


