package accounts;

import customers.Customer;
import processTransaction.Transactable;

import java.text.DecimalFormat;

public abstract class Account implements Transactable {

    // Private fields (Encapsulation)
    private String accountNumber;
    private Customer customer;
    protected double balance;
    private String status;

    // Static field for generating unique account IDs (e.g., ACC001)
    public static int accountCounter=0;

    // Formatting for currency output
    private static final DecimalFormat df = new DecimalFormat("0.00");

    //constructor
    public Account( double initialBalance, Customer customer) {
        // Auto-generate unique ID
        accountCounter++;
        this.accountNumber =String.format("ACC%03d",accountCounter);//ACC001 --ACC002
        this.status = "ACTIVE";
        this.balance = initialBalance;
        this.customer = customer;// All new accounts are active
    }

    //  Getter for Readable
    public String getAccountNumber() {return accountNumber;}
    public String getStatus() {return status;}
    public double getBalance() {return balance;}
    public Customer getCustomer() {return customer;}

    //Abstract methods for polymorphism (must be implemented by subclasses)
    public abstract void displayAccountDetails();
    public  abstract String getAccountType();

    //Normal Method
    public boolean deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return false;
        }

        this.balance += amount;
        System.out.println(STR."Deposited: $\{df.format(amount)}");
        return true;
    }

    public abstract double withdraw(double amount);

    // Helper method for formatted balance display
    public String getFormattedBalance() {
        return STR."$\{df.format(balance)}";
    }


}
