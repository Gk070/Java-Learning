import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args){

        // Simple Banking Program
        System.out.println("SIMPLE BANKING PROGRAM 🏦");
        System.out.println("-------------------------");

        // Declare variables
        double balance = 0;
        boolean isRunning = true;
        int choice;

        // Display menu
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

        // Get and process users choice
        while (isRunning) {

            System.out.print("Enter your choice (1/2/3/4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance = deposit(balance);
                case 3 -> balance = withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice");
            }
        }

        // Exit message
        System.out.println();
        System.out.println("Thank you! Have a nice day! 😀");

        scanner.close();
    }

    // showBalance()
    static void showBalance(double balance){
        System.out.println();
        System.out.printf("₹%.2f\n", balance);
        System.out.println();
    }

    // deposit()
    static double deposit(double balance){

        double amount;
        System.out.print("Enter an amount to deposited: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println();
            System.out.println("Amount can't be negative");
            System.out.println();
        } else {
            balance += amount;
        }

        return balance;

    }

    // withdraw()
    static double withdraw(double balance){

        double amount;
        System.out.print("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println();
            System.out.println("Insufficient Funds");
            System.out.println();
        } else if (amount < 0) {
            System.out.println();
            System.out.println("Amount can't be negative");
            System.out.println();
        } else {
            balance -= amount;
        }

        return balance;
    }
}