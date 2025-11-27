package accounts;

import customers.Customer;

public class CheckingAccount extends Account{

    private double overdraftLimit;
    private double monthlyFee;

    public CheckingAccount(Customer customer, double initialBalance) {
        super(customer, initialBalance);
        this.overdraftLimit = 1000;
        this.monthlyFee =10;
    }

    //Menu after creating checkingAccount
    @Override
    public void displayAccountDetails() {
        System.out.println("ACC NO: "+getAccountNumber());
        System.out.println("CUSTOMER NAME: "+getCustomer().getName());
        System.out.println("TYPE: "+getStatus());
        System.out.print("BALANCE: "+getBalance());
        System.out.println("STATUS: "+getStatus());
        System.out.printf("OVERDRAFT LIMIT: $%,.2f" , overdraftLimit);
        System.out.printf("Monthly fee $%,.2f",monthlyFee);
        System.out.println("\n"+appyMonthlyFee());
    }
    //return type of account
    @Override
    public String getAccountType() {return "Checking";}
    @Override
    public void withdraw(double amount) {
        // Check if withdrawal stays within overdraft limit
        if (this.balance - amount >= overdraftLimit) {
            this.balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + this.balance);
        } else {
            System.out.println("Withdrawal denied! Overdraft limit of $1000 exceeded.");
        }
    }

    public String appyMonthlyFee(){
        balance -= monthlyFee;
        return "Monthly fee of $10 applied. New balance: $" + balance;
    }
}