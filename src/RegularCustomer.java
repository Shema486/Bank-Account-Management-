public class RegularCustomer extends Customer{

    // Constructor (simply calls the abstract class constructor)
    public RegularCustomer(String contact, String name, int age, String address) {
        super(contact, name, age, address);
    }

    // Override the abstract method to display customer details
    @Override
    public void displayCustomerDetails() {
        System.out.println("Customer ID: " + getCustomerId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Contact: " + getContact());
        System.out.println("Type: " + getCustomerType() + " (Standard banking services)");
    }

    // Override the abstract method to specify the type
    @Override
    public String getCustomerType() {
        return "Regular";
    }
}
