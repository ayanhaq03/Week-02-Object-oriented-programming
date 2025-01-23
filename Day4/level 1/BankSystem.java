class Customer {
    String name;
    private double balance;
    //constructor
    public Customer(String name) {
        this.name = name;
    }
    //method to view balance
    public void viewBalance() {
        System.out.println(name + "'s Balance: " + balance);
    }
    //method to deposit amount
    public void deposit(double amount) {
        balance += amount;
    }
}

class Bank {
    //method to open account
    public void openAccount(Customer customer, double initialDeposit) {
        customer.deposit(initialDeposit);
        System.out.println("Account opened for " + customer.name + " with balance: " + initialDeposit);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Customer customer = new Customer("Alice");
        Bank bank = new Bank();

        bank.openAccount(customer, 500.0);
        customer.viewBalance();
    }
}
