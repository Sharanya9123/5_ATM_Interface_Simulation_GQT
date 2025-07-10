package core_java_projects;

import java.util.Scanner;

// Class to represent a simple ATM interface
class ATM {
    private double balance;

    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }

    public void checkBalance() {
        System.out.println(" Current Balance: ₹" + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(" ₹" + amount + " deposited successfully.");
        } else {
            System.out.println(" Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(" ₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println(" Insufficient balance or invalid amount.");
        }
    }
}

public class ATM_Interface_Simulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM myATM = new ATM(10000); // Starting balance
        int choice;

        // Greeting Message (formal style)
        System.out.println("*********************************************");
        System.out.println(" Welcome to SecureATM - Your Trusted Partner");
        System.out.println("*********************************************");
        System.out.println("Please choose from the options below:");

        do {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit Cash");
            System.out.println("3. Withdraw Cash");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    myATM.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    double depositAmount = sc.nextDouble();
                    myATM.deposit(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdrawAmount = sc.nextDouble();
                    myATM.withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.println("\nThank you for banking with SecureATM!");
                    System.out.println("Visit again. Have a financially healthy day!");
                    break;

                default:
                    System.out.println("Invalid selection. Please try again.");
            }

        } while (choice != 4);
    }
}
