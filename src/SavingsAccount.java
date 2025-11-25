public class SavingsAccount extends Account{

    //private field;
    private double interestRate;
    private double minimumBalance;

    //Constructor to invoke fields in parent class
    public SavingsAccount(String accountNumber, String status, double balance, Customer customer,double interestRate,double minimumBalance) {
        super(accountNumber, status, balance, customer);
        this.minimumBalance = 500;
        this.interestRate = 3.5;
    }

    //override methods from Account
    @Override
    public void displayAccountDetails() {}
    @Override
    public String getAccountType() {return "";}
    @Override
    public double withdraw(double amount) {return 0;}

    public double calculateInterest(){return 0;}
}
