import java.util.ArrayList;
import java.util.Date;

public class Account {
    private final int accountId;
    private final int pin;
    private double balance;
    private final ArrayList<Transaction> transactions; // List to store transactions

    public Account(int accountId, int pin, double balance) {
        this.accountId = accountId;
        this.pin = pin;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public boolean authenticate(int userId, int enteredPin) {
        return userId == accountId && enteredPin == pin;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactions.add(new Transaction(amount, "Withdrawal", new Date()));
            System.out.println("Withdrawal successful. Please collect your cash.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction(amount, "Deposit", new Date()));
        System.out.println("Deposit successful. Your new balance is: " + balance);
    }

    public void showTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions found.");
        } else {
            System.out.println("Transaction History:");
            for (Transaction transaction : transactions) {
                System.out.println("Date: " + transaction.getDate() + ", Amount: " + transaction.getAmount() + ", Type: " + transaction.getType());
            }
        }
    }
}
