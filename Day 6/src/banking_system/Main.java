package banking_system;

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("S123", "ayan", 1000, 5);
        BankAccount acc2 = new CurrentAccount("C456", "vivek", 2000, 500);

        BankAccount[] accounts = {acc1, acc2};

        for (BankAccount account : accounts) {
            System.out.println("Account Holder: " + account.getHolderName() + ", Interest: " + account.calculateInterest());
        }
    }
}
