import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // simple baking app


        double balance = 0.0;
        boolean isRunning = true;
        int choice;
        while (isRunning) {
            System.out.println("*****************");
            System.out.println("Banking Program");
            System.out.println("*****************");
            System.out.println("Option 1: Show Balance");
            System.out.println("Option 2: Deposit");
            System.out.println("Option 3: Withdraw");
            System.out.println("Option 4: Exit");
            System.out.println("*****************");
            System.out.print("Enter your choice(1-4): ");
            choice = scanner.nextInt();
    
    
            switch (choice) {
                case 1 -> System.out.println(balance);
                    
                case 2 -> balance += deposit();
    
                case 3 -> System.out.println("Withdraw");
    
                case 4 -> {
                    System.out.println("Exiting the program...");
                    isRunning = false;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }


        // widthdraw

        // Exit message
        scanner.close();
        
    }

    static void showBalance(double balance) {
        System.out.println("******************");
        System.out.println("Your current balance is: " + balance);
    }

    static double deposit() {
        double amount;
        System.out.print("Enter the amount to deposit: ");
        amount = scanner.nextDouble();
        if(amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive number.");
            return 0;
        } else {
            System.out.println("Deposited: " + amount);
            return amount;
        }
    }
}
