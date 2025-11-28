###
Bank Account Management System (Java Console Application)
Project Overview 🏦
This is a comprehensive Java console application designed to simulate a basic bank account management system. It was built to demonstrate proficiency in core Object-Oriented Programming (OOP) principles, fundamental Data Structures and Algorithms (DSA), and robust application structure.

The system supports two distinct account types (Savings and Checking) and manages the flow of transactions and account creation via dedicated Manager classes.

Features (User Stories) ✨
The application fulfils the following core functional requirements:

Create Account (US-2): Allows users to register new accounts, choosing between Savings and Checking types, and linking them to Regular or Premium customers.

View All Accounts (US-1): Displays a list of all currently active bank accounts, including the total asset balance managed by the bank.

Process Transaction (US-3): Handles deposits and withdrawals, applying specific business rules:

Savings: Requires a minimum balance of $500.

Checking: Allows withdrawals up to an overdraft limit of $1000.

View Transaction History (US-4): Displays a reverse chronological history of all transactions for a specific account, including a summary of total deposits and withdrawals.

Simple Menu (US-5): Provides a clear, navigable console menu with input validation.

Technical Design & Implementation Details
OOP Structure (Inheritance & Polymorphism)
Abstraction: Uses abstract classes (Customer, Account) and an interface (Transactable) to define common contracts.

Inheritance: Uses two parallel hierarchies (SavingsAccount/CheckingAccount extends Account and RegularCustomer/PremiumCustomer extends Customer).

Polymorphism: Withdrawal logic is implemented polymorphically, ensuring the correct minimum balance or overdraft rule is applied based on the runtime account type.

Composition: AccountManager and TransactionManager classes contain arrays of Account and Transaction objects, respectively, to manage the collections.

Data Structures and Algorithms (DSA)
Data Structures: All accounts and transactions are stored in fixed-size Arrays (Account[], Transaction[]).

Algorithms:

Linear Search: Implemented in AccountManager to quickly locate accounts by ID.

Iteration & Filtering: Used in TransactionManager to filter and display transaction history for specific accounts.

ID Generation: Static counters are used in the base classes to ensure sequential, unique IDs (ACC001, CUS001, etc.).
