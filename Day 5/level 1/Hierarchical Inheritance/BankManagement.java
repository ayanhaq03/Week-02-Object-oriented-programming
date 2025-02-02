// Base class: BankAccount
class BankAccount {
    String accountNumber;
    double balance;

    // Constructor
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Display account details
    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    // Display account type
    void displayAccountType() {
        System.out.println("General Bank Account");
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    double interestRate;

    // Constructor
    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    void displayAccountType() {
        System.out.println("Savings Account");
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass: CheckingAccount
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    // Constructor
    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    void displayAccountType() {
        System.out.println("Checking Account");
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}

// Subclass: FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    int depositTerm; // in years

    // Constructor
    FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    @Override
    void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Deposit Term: " + depositTerm + " years");
    }
}

// Main Class
public class BankManagement {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("SA12345", 5000, 3.5);
        savingsAccount.displayAccountType();
        savingsAccount.displayDetails();

        System.out.println("------------------------------------------------");

        CheckingAccount checkingAccount = new CheckingAccount("CA67890", 3000, 1000);
        checkingAccount.displayAccountType();
        checkingAccount.displayDetails();

        System.out.println("------------------------------------------------");

        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("FD54321", 20000, 5);
        fixedDepositAccount.displayAccountType();
        fixedDepositAccount.displayDetails();
    }
}
