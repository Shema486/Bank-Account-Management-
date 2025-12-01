package transactionHistory;

import processTransaction.Transaction;

public class TransactionManager {
    // Composition: Holds an array of Transaction objects
    private Transaction[] transactions;
    private int transactionCount;
    private final int MAX_TRANSACTIONS = 200;

    public TransactionManager() {
        this.transactions = new Transaction[MAX_TRANSACTIONS];
        this.transactionCount = 0;
    }

    // Method for US-3 (Process Transaction)
    public void addTransaction(Transaction newTransaction) {
        if (transactionCount < MAX_TRANSACTIONS) {
            // Note: Since we are using an array, we are adding to the end (newest transaction)
            transactions[transactionCount] = newTransaction;
            transactionCount++;
//            System.out.println("Transaction added successfully!");
        } else {
            System.out.println("Transaction log full! Cannot add more transactions.");        }
    }

    // Helper method to calculate totals for US-4 summary
    private double calculateTotal(String accountNumber, String type) {
        double total = 0.0;
        for (int i = 0; i < transactionCount; i++) {
            Transaction t = transactions[i];
            if (t.getAccountNumber().equalsIgnoreCase(accountNumber) && t.getType().equalsIgnoreCase(type)) {
                total += t.getAmount();
            }
        }
        return total;
    }

    // Method for US-4 (View Transaction History)
    public void viewTransactionsByAccount(String accountNumber) {
        boolean found = false;

        System.out.println("\n--- TRANSACTION HISTORY FOR " + accountNumber + " ---");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.printf("| %-7s | %-19s | %-12s | %-10s | %-10s | %-10s |\n",
                "ID", "Timestamp", "Account", "Type", "Amount", "Balance After");
        System.out.println("------------------------------------------------------------------------------------");

        // DSA: Iteration over the array to filter and display
        for (int i = transactionCount - 1; i >= 0; i--) {
            Transaction t = transactions[i];
            if (t.getAccountNumber().equalsIgnoreCase(accountNumber)) {
                this.transactions[i].displayTransactionDetails();
                found = true;
            }
        }

        if (!found) {System.out.println("| NO TRANSACTIONS FOUND for account " + accountNumber + ".");}

        System.out.println("------------------------------------------------------------------------------------");
        // Display Summary (US-4 Acceptance Criteria)
        double totalDeposits = calculateTotal(accountNumber, "DEPOSIT");
        double totalWithdrawals = calculateTotal(accountNumber, "WITHDRAW");
        double netChange = totalDeposits - totalWithdrawals;
        System.out.printf("SUMMARY: Total Deposits: $%,.2f | Total Withdrawals: $%,.2f | Net Change: %s$%,.2f\n",
                totalDeposits, totalWithdrawals, (netChange >= 0 ? "+" : "-"), netChange);
        System.out.println("------------------------------------------------------------------------------------");

    }
    public double calculateTotalWithdraw(String accountNumber) {
        double total = 0;

        for (int i = 0; i < transactionCount; i++) {
            Transaction t = transactions[i];
            if (t.getAccountNumber().equalsIgnoreCase(accountNumber) &&
                    t.getType().equalsIgnoreCase("WITHDRAW")) {
                total += t.getAmount();
            }
        }

        return total;
    }
    public double calculateTotalDeposit(String accountNumber) {
        double total = 0;

        for (int i = 0; i < transactionCount; i++) {
            Transaction t = transactions[i];
            if (t.getAccountNumber().equalsIgnoreCase(accountNumber) &&
                    t.getType().equalsIgnoreCase("DEPOSIT")) {
                total += t.getAmount();
            }
        }

        return total;
    }


    public int getTransactionCount() {
        return transactionCount;
    }
}
