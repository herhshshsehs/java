import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int correctPin = 1234;
        double balance = 1000;
        int attempts = 3;
        boolean loggedIn = false;
        System.out.println("===== SIMPLE ATM =====");

        while (attempts > 0 && !loggedIn) {
            System.out.println("Enter your PIN:");
            int pin = input.nextInt();

            if (pin == correctPin) {
                loggedIn = true;
                System.out.println("Login successful!");
            } else {
                attempts = attempts - 1;
                System.out.println("Incorrect PIN.");
                System.out.println("Remaining attempts: " + attempts);

                if (attempts == 0) {
                    System.out.println("Your account has been blocked.");
                }
            }
        }

        if (loggedIn) {
            int choice = 0;

            while (choice != 4) {
                System.out.println("===== ATM MENU =====");
                System.out.println("1. Check balance");
                System.out.println("2. Deposit money");
                System.out.println("3. Withdraw money");
                System.out.println("4. Exit");
                System.out.println("Choose an option:");
                choice = input.nextInt();

                if (choice == 1) {
                    // Показать баланс
                    System.out.println("Your balance: " + balance);
                } else if (choice == 2) {
                    // Пополнение
                    System.out.println("Enter the deposit amount:");
                    double amount = input.nextDouble();

                    if (amount > 0) {
                        balance = balance + amount;
                        System.out.println("Deposit successful.");
                        System.out.println("Your balance: " + balance);
                    } else {
                        System.out.println("Invalid amount. Balance has not changed.");
                    }
                } else if (choice == 3) {
                    // Снятие
                    System.out.println("Enter the withdrawal amount:");
                    double amount = input.nextDouble();

                    if (amount > 0 && amount <= balance) {
                        balance = balance - amount;
                        System.out.println("Withdrawal successful.");
                        System.out.println("Your balance: " + balance);
                    } else {
                        System.out.println("Invalid amount. Balance has not changed.");
                    }
                } else if (choice == 4) {
                    System.out.println("Goodbye!");
                } else {
                    System.out.println("Wrong option. Please choose 1, 2, 3 or 4.");
                }
            }
        }
    }
}