package accounts;


import customers.Customer;
import customers.PremiumCustomer;
// US-1: SavingsAccount
public class SavingsAccount extends Account{

    private double interestRate;
    private double minimunBalance;

    public SavingsAccount(Customer customer, double balance) {
        super(customer, balance);
        this.minimunBalance=500;
        this.interestRate=3.5;
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("ACC NO: "+getAccountNumber());
        System.out.println("CUSTOMER NAME: "+getCustomer().getName());
        System.out.println("TYPE: " +getAccountType());
        System.out.println("BALANCE: " +getBalance());
        System.out.println("STATUS: " + getStatus());
        System.out.printf("Minimum Balance: " +minimunBalance);
        System.out.println("Interest annually: "+calculateInterestEarned());
    }
    @Override
    public String getAccountType() {
        return "Saving";}
    @Override
    public void withdraw(double amount) {
        // Check if withdrawal stays above minimum balance
        if (balance - amount >= minimunBalance) {
            balance -= amount;
            System.out.println("SavingAccount: Withdrew $" + amount +
                    ". New balance: $" + balance);
        } else {
            System.out.println("Withdrawal denied! Minimum balance of $" +
                    minimunBalance + " must be maintained.");
        }
    }


    public double calculateInterestEarned(){
        return this.balance * interestRate/100;
    }
}