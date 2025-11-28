package processTransaction;
import accounts.Account;
import customers.RegularCustomer;

public class AccountManager {
    // Composition: Holds an array of Account objects
    private Account[] accounts;
    private int accountCount;
    private final int MAX_ACCOUNTS = 50;

    public AccountManager() {
        this.accounts = new Account[MAX_ACCOUNTS];
        this.accountCount = 0;
    }

    // Method for US-2 (Create Account)
        public void addAccount(Account newAccount) {
            if (accountCount < accounts.length) {
                accounts[accountCount] = newAccount;
                accountCount++;
//                System.out.println("Account added successfully!");
            } else {
                System.out.println("Bank is full! Cannot add more accounts.");
            }
    }

    // Method for US-3 (Process Transaction) - DSA: Linear Search
     public Account findAccount(String accountNumber) {
        for (int i =0; i<accountCount;i++){
             if(accounts[i].getAccountNumber().equals(accountNumber)){
                return accounts[i];
               }
            }
             return null;
        }


    // Method to calculate total balance
    public double getTotalBalance() {
        double total = 0;
        for (int i = 0; i < accountCount; i++) {
            total += accounts[i].getBalance();  // Add each account's balance
        }
        return total;
    }
    // Method for US-1 (View Accounts)
    public void viewAllAccounts() {
        if (accountCount == 0) {
            System.out.println("No accounts in the bank.");
            return;
        }

        System.out.println("----- All Bank Accounts -----");
        for (int i = 0; i < accountCount; i++) {
            accounts[i].displayAccountDetails();
        }
        System.out.println("Total account: "+getAccountCount());
        System.out.println("Total Bank balance: $"+getTotalBalance());
    }

    // Getter
    public int getAccountCount() {return accountCount;}
}