// US-1: CheckingAccount
public class CheckingAccount extends Account{

    // Private fields specific to Checking accounts
    private final double overdraftLimit = 1000.00; // $1000 overdraft limit
    private final double standardMonthlyFee = 10.00; // $10 monthly fee

    //Constructor to invoke fields in parent class
    public CheckingAccount(Customer customer, double initialDeposit) {
        super(initialDeposit, customer);

    }

    //override methods from Account
    @Override
    public void displayAccountDetails() {

    }
    @Override
    public String getAccountType() {return "checking";}
    @Override
    public double withdraw(double amount) {return 0;}

    public void applyMonthlyFee(){};
}
