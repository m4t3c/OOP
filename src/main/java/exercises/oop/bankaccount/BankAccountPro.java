package exercises.oop.bankaccount;

/**
 * A fully fledged bank account, allowing international transfers, negative balances, and a 2pc interest rate.
 * However, all this comes with the cost of 1 Euro for each operation (deposit, withdrawal).
 */
public class BankAccountPro extends AbstractBankAccount {
    /**
     * Constructs a new bank account
     * @param IBAN the IBAN of the bank account
     * @param balance the initial balance of the bank account
     */
    public BankAccountPro(String IBAN, double balance) {
        super(IBAN, balance, 1, 0.02);
    }

    /**
     * Deposit an amount on the account. Fees are applied
     * @param amount the amount to be deposited
     */
    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        applyFee();
    }

    /**
     * Withdraw an amount on the account. Fees are applied
     * @param amount the amount to be withdrawn
     * @return the amount withdrawn
     */
    @Override
    public double withdraw(double amount) {
        double outAmount = super.withdraw(amount);
        applyFee();
        return outAmount;
    }
}
