package banking_system;

// Interface: Loanable
interface Loanable {
    boolean applyForLoan(double amount);

    double calculateLoanEligibility();
}