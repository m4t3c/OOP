package exercises.oop.bankaccount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountProTest {
    BankAccount bankAccount;

    @BeforeEach
    void init() {
        bankAccount = new BankAccountPro("IT0000012345", 1000);
    }

    @Test
    void checkIBAN() {
        assertThrows(IllegalArgumentException.class, () -> new BankAccountPro("IT001230000000000000000000000000000", 0.0));
        assertThrows(IllegalArgumentException.class, () -> new BankAccountPro("IT00123", 0.0));
        assertThrows(IllegalArgumentException.class, () -> new BankAccountPro("It001234", 0.0));
        assertThrows(IllegalArgumentException.class, () -> new BankAccountPro("It001234", 0.0));
        assertThrows(IllegalArgumentException.class, () -> new BankAccountPro("it001234", 0.0));
        assertDoesNotThrow(() -> new BankAccountPro("IT001234", 0.0));
        assertThrows(IllegalArgumentException.class, () -> bankAccount.setIBAN("IT11"));
    }

    @Test
    void negativeFeeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> bankAccount.setOperationFee(-1.0));
    }

    @Test
    void deposit() {
        assertThrows(IllegalArgumentException.class, () -> bankAccount.deposit(-100));
        bankAccount.deposit(1000);
        assertEquals(1999, bankAccount.getBalance());
    }

    @Test
    void withdraw() {
        assertThrows(IllegalArgumentException.class, () -> bankAccount.withdraw(-100));
        bankAccount.withdraw(2000);
        assertEquals(-1001, bankAccount.getBalance());
    }

    @Test
    void transfer() {
        BankAccountPro otherInternational = new BankAccountPro("DE0000012345", 1000);
        assertEquals(2000, bankAccount.transfer(otherInternational,2000));
        assertEquals(-1001, bankAccount.getBalance());
        assertEquals(2999, otherInternational.getBalance());
    }


    @Test
    void addInterest() {
        bankAccount.addInterest();
        assertEquals(1020, bankAccount.getBalance());
    }
}