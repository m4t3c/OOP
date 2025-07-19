package exercises.oop.bankaccount;

/**
 * Abstract implementation of BankAccount interface
 */
public abstract class AbstractBankAccount implements BankAccount {
    /**
     * IBAN of the account
     */
    protected String IBAN;

    /**
     * The balance of the account
     */
    protected double balance;

    /**
     * The fee to be applied to deposits and withdrawals
     */
    protected double operationFee;

    /**
     * The interest rate to be applied
     */
    protected double interestRate;

    /**
     * Construct a new BankAccount
     * @param IBAN the IBAN of the bank account
     * @param balance the balance of the bank account
     * @param operationFee the operation fee to be applied to deposit and withdraw operation
     * @param interestRate the interest rate to be applied
     */
    protected AbstractBankAccount(String IBAN, double balance, double operationFee, double interestRate) {
        setIBAN(IBAN);
        this.balance = balance;
        this.interestRate = interestRate;
        setOperationFee(operationFee);
    }

    /**
     * Throws an IllegalArgumentException if the passed value is negative.
     * @param value the value to be evaluated by the function.
     */
    protected void checkPositiveValue(double value) {
        if(value < 0.0){
            throw new IllegalArgumentException("Negative values are not allowed for this operation");
        }
    }

    @Override
    public String getIBAN() {
        return IBAN;
    }

    /**
     * Sets the IBAN. Only compliant form are allowed.
     * a valid IBAN must have a length comprised between 8 and 34 characters and the first two characters (representing the country) must be uppercase letters;
     * @param IBAN the IBAN to be set.
     */
    @Override
    public void setIBAN(String IBAN) {
        BankAccount.checkIBAN(IBAN);
        this.IBAN = IBAN;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public double getOperationFee() {
        return operationFee;
    }

    /**
     * Sets operation fees. Only positive values are allowed.
     * @param operationFee the operation fee to be set
     */
    @Override
    public void setOperationFee(double operationFee) {
        checkPositiveValue(operationFee);
        this.operationFee = operationFee;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * Deposit an amount on the account. No fees are applied
     * @param amount the amount to be deposited
     */
    @Override
    public void deposit(double amount) {
        checkPositiveValue(amount);
        balance += amount;
    }

    /**
     * Witdraw an amount from the account. No fees are applied
     * @param amount the amount to be withdrawn
     * @return the amount withdrawn
     */
    @Override
    public double withdraw(double amount) {
        checkPositiveValue(amount);
        balance -= amount;
        return amount;
    }

    /**
     * Transfers an amount on a different account.
     * Fees are applied according to the specific rules of each account.
     * @param other the other bank account
     * @param amount the amount to be transferred
     * @return the amount transferred
     */
    @Override
    public double transfer(BankAccount other, double amount) {
        withdraw(amount);
        other.deposit(amount);
        return amount;
    }

    /**
     * Add interests to the account
     */
    @Override
    public void addInterest() {
        balance += balance * interestRate;
    }

    /**
     * Applies the fee to the account
     */
    @Override
    public void applyFee() {
        balance -= operationFee;
    }
}
