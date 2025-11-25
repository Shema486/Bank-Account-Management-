public abstract class Account {

    //private field
    private String accountNumber;
    private Customer customer;
    private double balance;
    private String status;

    //static field - for generating unique account number
    public static int accountCounter;

    //constructor
    public Account( double balance, Customer customer) {
        accountCounter++;
        this.accountNumber = "ACC" + String.format("%03d",accountCounter);//ACC001 --ACC002
        this.status = "ACTIVE";
        this.balance = balance;
        this.customer = customer;
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
    public double deposit(double amount) {return 0;}
    public double withdraw(double amount) {return 0;}

}
