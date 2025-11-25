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
        String name = scanner.next();

        System.out.print("Enter ege: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Customer Contact: ");
        String contact = scanner.nextLine();

        System.out.print("Enter Customer Address: ");
        String address = scanner.nextLine();

        System.out.printf("You names are %s and you are %d years old\n",name,age);
        System.out.printf("You phone number is %s and you are have address %s ",contact,address);
    }
}
