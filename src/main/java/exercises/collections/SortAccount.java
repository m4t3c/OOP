package exercises.collections;

import java.time.LocalDate;
import java.util.List;

public class SortAccount {
    public static class Account {
        double amount;
        double interestRate;
        LocalDate duePayment;

        public Account(double amount, double interestRate, LocalDate duePayment) {
            this.amount = amount;
            this.interestRate = interestRate;
            this.duePayment = duePayment;
        }

        public double getAmount() {
            return amount;
        }

        public double getInterestRate() {
            return interestRate;
        }

        public LocalDate getDuePayment() {
            return duePayment;
        }


    }
}
