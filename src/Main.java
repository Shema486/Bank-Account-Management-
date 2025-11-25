import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int choice =0;

        do{
            displayMenu();
            System.out.println("Enter choice (1-5): ");
            choice = scanner.nextInt();

            while(choice <1 || choice >5){
                System.out.println("Enter valid choice: ");
                System.out.println("Enter choice (1-5): ");
                choice = scanner.nextInt();
            }
            switch (choice){
                case 1 -> System.out.println("Create New Account");
                case 2 -> System.out.println("View All Accounts");
                case 3 -> System.out.println("Process Transaction");
                case 4 -> System.out.println("View Transaction History");
                case 5 -> System.out.println("Exit");
                default -> System.out.println("Enter valid choice");
            }


        }while (true);
    }
    // --- Helper Methods ---
    private static void displayMenu(){
        System.out.println("\n=============================================");
        System.out.println("      BANK ACCOUNT MANAGEMENT SYSTEM MENU    ");
        System.out.println("=============================================");
        System.out.println("1. Create New Account ");
        System.out.println("2. View All Accounts ");
        System.out.println("3. Process Transaction ");
        System.out.println("4. View Transaction History ");
        System.out.println("5. Exit");
        System.out.println("=============================================");
    }
}
