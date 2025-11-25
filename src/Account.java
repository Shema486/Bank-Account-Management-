public abstract class Account {

    //private field
    private String accountNumber;
    private Customer customer;
    private double balance;
    private String status;

    // Static field for generating unique account IDs (e.g., ACC001)
    public static int accountCounter=0;

    //constructor
    public Account( double initialBalance, Customer customer) {
        accountCounter++;
        this.accountNumber =String.format("ACC%03d",accountCounter);//ACC001 --ACC002
        this.status = "ACTIVE";
        this.balance = initialBalance;
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
