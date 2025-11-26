import java.util.Scanner;

public class Main {
    private static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args){

        int choice =0;


        do{
            displayMenu();
            System.out.print("Enter choice (1-5): ");
            choice = scanner.nextInt();

            while(choice <1 || choice >5){
                System.out.println("Enter valid choice: ");
                System.out.print("Enter choice (1-5): ");
                choice = scanner.nextInt();
            }
            switch (choice){
                case 1 -> createAccount();
                case 2 -> System.out.println("View All Accounts");
                case 3 -> System.out.println("Process Transaction");
                case 4 -> System.out.println("View Transaction History");
                case 5 -> System.out.println("\nThank you for using the Bank Account Management System. Goodbye!");
                default -> System.out.println("Invalid choice. Please enter a number between 1 and 5.");

            }

        }while(true);

    }

    // --- Helper Methods ---
    private static void displayMenu() {
        System.out.println("\n=============================================");
        System.out.println("||                                          ||");
        System.out.println("||    BANK ACCOUNT MANAGEMENT SYSTEM MENU   ||");
        System.out.println("||                                          ||");
        System.out.println("=============================================");
        System.out.println("1. Create New Account ");
        System.out.println("2. View All Accounts ");
        System.out.println("3. Process Transaction ");
        System.out.println("4. View Transaction History ");
        System.out.println("5. Exit");
        System.out.println("=============================================");
    }
    private static void initializeDate(){}
    private static void createAccount(){

        System.out.println("\n--- CREATE NEW ACCOUNT ---");
        System.out.print("Enter Customer Name: ");
        int choice = 0;
        String name = scanner.next();

        System.out.print("Enter Customer Contact: ");
        String contact = scanner.next();

        System.out.print("Enter Customer Address: ");
        String address = scanner.next();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.println("\nCustomer type: ");
        System.out.println("1. Regular Customer (standard banking services)");
        System.out.println("2. Premium Customer (Enhanced benefits, min balance $10,000)\n");


        do {
            System.out.print("select type (1-2):");
            choice = scanner.nextInt();

            while (choice <1 || choice>2){
                System.out.println("Enter right choice 1/2");
                System.out.print("select type: (1-2)");
                choice = scanner.nextInt();
            }

            switch (choice) {
                case 1->{
                    System.out.println("\nAccount type: ");
                    System.out.println("1.Saving Account(interest:3.5%, Min Balance:$500)");
                    System.out.println("2.Checking Account(overdraft:$1000, Monthly fee:$10)\n");

                    System.out.print("\nselect type (1-2): ");
                    choice = scanner.nextInt();
                    if (choice ==1)
                        System.out.print("Enter amount to deposit: ");
                    scanner.nextLine();

                }
                case 2-> {
                    System.out.println("Account type: \n");
                    System.out.println("1.Saving Account(interest:3.5%, Min Balance:$500)");
                    System.out.println("2.Checking Account(overdraft:$1000, Monthly fee:$10)\n");

                    System.out.print("select type (1-2):");
                    choice = scanner.nextInt();
                    if (choice ==2)
                        System.out.print("Enter amount to deposit: ");
                    scanner.nextLine();

                 }

            }
        }while (true);



    }
}
