package exercises.oop.bankaccount;

/**
 * Simple bank account. Supports national transfers, pays no interest, do not apply any fee.
 */
public class BankAccountEasy extends AbstractBankAccount{

    /**
     * Contructs a new account with operation fees and interest rate set to 0.
     * @param IBAN the IBAN of the bank account
     * @param balance the initial balance of the bank account
     */
    public BankAccountEasy(String IBAN, double balance) {
        super(IBAN, balance, 0.0, 0.0);
    }

    /**
     * Withdraws from a specified amount.
     * Amount are limited to the available balance.
     * @param amount the amount to be withdrawn
     * @return the amount actually withdrawn
     */
    @Override
    public double withdraw(double amount) {
        double allowedAmount = Math.min(amount, balance);
        return super.withdraw(allowedAmount);
    }

    @Override
    public double transfer(BankAccount other, double amount) {
        String countryCodeSrc = IBAN.substring(0, 2);
        String countryCodeDst = other.getIBAN().substring(0, 2);
        if (!countryCodeSrc.equals(countryCodeDst)){
            throw new IllegalArgumentException("International tranfers invalid");
        }
        double allowedAmount = withdraw(amount);
        other.deposit(allowedAmount);
        return allowedAmount;
    }
}
