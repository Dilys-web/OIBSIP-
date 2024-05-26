import java.util.Scanner;

public class ATM {
      public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int userId, pin;

            // Sample account details (replace with data access logic)
            Account account = new Account(12345, 1000, 5000);

            System.out.println("Welcome to ATM!");

            while (true) {
                System.out.print("Enter User ID: ");
                userId = scanner.nextInt();
                System.out.print("Enter PIN: ");
                pin = scanner.nextInt();

                if (account.authenticate(userId, pin)) {
                    displayMenu();
                    int choice = scanner.nextInt();
                    performAction(choice, account);
                } else {
                    System.out.println("Invalid User ID or PIN. Please try again.");
                }
            }
        }
    }

    public static void displayMenu() {
        System.out.println("\nATM Menu:");
        System.out.println("1. Transactions History");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Transfer (not implemented)");
        System.out.println("5. Quit");
        System.out.print("Enter your choice: ");
    }

    public static void performAction(int choice, Account account) {
        switch (choice) {
            case 1:
                account.showTransactions();
                break;
            case 2:
                System.out.print("Enter amount to withdraw: ");
                int withdrawAmount = new Scanner(System.in).nextInt();
                account.withdraw(withdrawAmount);
                break;
            case 3:
                System.out.print("Enter amount to deposit: ");
                int depositAmount = new Scanner(System.in).nextInt();
                account.deposit(depositAmount);
                break;
            case 4:
                System.out.println("Transfer functionality not implemented yet.");
                break;
            case 5:
                System.out.println("Thank you for using ATM. Goodbye!");
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
            }
        
        }
}


