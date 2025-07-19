package exercises.oop.basic;

/**
 * Representation of a BankAccount with operation of deposit and withdraw
 */
public class BankAccount {
    double balance;

    /**
     * Constructs and initializes an empty BankAccount.
     */
    public BankAccount() {
        balance = 0;
    }

    /**
     * Constructs and initializes a BankAccount with specified balance.
     */
    public BankAccount(double balance) {
        this.balance = balance;
    }

    /**
     * Returns the current balance.
     * @return the current balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Increase the BankAccount balance by amount
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Decrease the BankAccount balance by amount
     */
    public void withdraw(double amount) {
        balance -= amount;
    }
}
