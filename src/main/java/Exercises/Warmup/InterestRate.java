package Exercises.Warmup;

/*
    Write a program that prints the balance of an account after the first, second, and third year.
    The account has an initial balance of $1,000 and earns 5 percent interest per year.
*/

public class InterestRate {
    public static void main(String[] args) {
        final double interest = 0.05;
        double balance = 1000;

        balance += balance * interest;
        System.out.println("Bilancio al primo anno: " + balance);
        balance += balance * interest;
        System.out.println("Bilancio al secondo anno: " + balance);
        balance += balance * interest;
        System.out.println("Bilancio al terzo anno: " + balance);
    }
}
