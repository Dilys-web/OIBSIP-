import java.util.ArrayList;
import java.util.List;

    public class Bank {
    private final List<Account> accounts; // List to store all accounts

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account getAccount(int accountId) {
        for (Account account : accounts) {
            if (account.getAccountId() == accountId) {
                return account;
            }
        }
        return null;
    }

    public boolean transfer(int fromAccountId, int toAccountId, double amount) {
        Account fromAccount = getAccount(fromAccountId);
        Account toAccount = getAccount(toAccountId);

        if (fromAccount != null && toAccount != null && fromAccount.getBalance() >= amount) {
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
            return true;
        } else {
            return false;
        }
    }

}
