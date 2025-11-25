public class PremiumCustomer extends Customer{

    // Private field specific to Premium customers
    private final double minimumBalance = 10000; // Minimum to maintain premium status

    public PremiumCustomer(String contact, String name, int age, String address) {
        super(contact, name, age, address);
    }

    @Override
    public void displayCustomerDetails() {
        System.out.println("Customer ID: " + getCustomerId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Contact: " + getContact());
        System.out.println("Type: " + getCustomerType() + " (Priority Service)");
        System.out.println("Benefit: Monthly fees waived.");
        System.out.println("Min Balance Requirement: $" + String.format("%,.2f", minimumBalance));
    }

    // Override the abstract method to specify the type
    @Override
    public String getCustomerType() {
        return "Premium";
    }

    // Special method for benefits (waived fees)
    public boolean hasWaivedFees() {
        // Premium customers always have waived monthly fees
        return true;
    }

    // Getter for minimumBalance
    public double getMinimumBalance() {
        return minimumBalance;
    }
}
