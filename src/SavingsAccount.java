// US-1: SavingsAccount
public class SavingsAccount extends Account{

    // Private fields specific to Savings accounts
    private final double interestRate = 0.035; // 3.5% annually
    private final double minimumBalance = 500.00; // $500 minimum

    //Constructor to invoke fields in parent class
    public SavingsAccount(Customer customer, double initialDeposit) {
        super(initialDeposit, customer);

    }

    //override methods from Account
    @Override
    //to show Account information + interest details
    public void displayAccountDetails() {
        System.out.println(
                 "ACC NO: " + getAccountNumber() + " | CUSTOMER NAME: " + getCustomer().getName()
                + " | TYPE: " + getAccountType() + " | BALANCE: " + getFormattedBalance()
                + " | STATUS: " + getStatus());
        System.out.println("    | Interest Rate: " + (interestRate * 100) + "% | Min Balance: $" + String.format("%,.2f", minimumBalance));

    }
    @Override
    public String getAccountType() {
        return "Savings";
    }
    @Override
    public double withdraw(double amount) {return 0;}

    // Additional method
    public double calculateInterest() {
        return this.getBalance() * interestRate;
    }
}
