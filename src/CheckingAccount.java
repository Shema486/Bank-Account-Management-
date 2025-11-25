public class CheckingAccount extends Account{

    //private fields
    private double overdraftLimit;
    private double monthlyFee;

    //Constructor to invoke fields in parent class
    public CheckingAccount(String accountNumber, String status, double balance, Customer customer,double overdraftLimit,double monthlyFee) {
        super(accountNumber, status, balance, customer);
        this.overdraftLimit = 1000;
        this.monthlyFee = 10;
    }

    //override methods from Account
    @Override
    public void displayAccountDetails() {}
    @Override
    public String getAccountType() {return "";}
    @Override
    public double withdraw(double amount) {return 0;}

    public void applyMonthlyFee(){};
}
