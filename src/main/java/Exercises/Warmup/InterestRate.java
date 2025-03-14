package Exercises.Warmup;

/*
Write a program that prints the balance of an account after the first, second, and third year.
The account has an initial balance of $1,000 and earns 5 percent interest per year.
 */

public class InterestRate {
    public static void main(String[] args) {
        double balance = 1000;
        final double intrest = 0.05;

        balance += balance * intrest;
        System.out.println("Balance after 1 year: " + balance);
        balance += balance * intrest;
        System.out.println("Balance after 2 year: " + balance);
        balance += balance * intrest;
        System.out.println("Balance after 3 year: " + balance);
    }
}
