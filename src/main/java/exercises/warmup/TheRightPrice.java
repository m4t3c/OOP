package exercises.warmup;

import java.util.random.RandomGenerator;
import java.util.Scanner;

/*
    The computer selects a random number between [0, 100] representing the price of an imaginary item.
    Two users are asked to guess the right price.
    The user which proposed the number closer to the right price wins.
    Note that Math.abs(n) returns the absolute value of a number (see java.util.random.RandomGenerator, java.util.Scanner).
*/

public class TheRightPrice {
    public static void main(String[] args) {
        RandomGenerator rnd = RandomGenerator.getDefault();
        int rightPrice = rnd.nextInt(101);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Utente a scrivi un numero compreso tra 0 e 100 ");
        int aScanner = scanner.nextInt();
        System.out.println("Utente b scrivi un numero compreso tra 0 e 100 ");
        int bScanner = scanner.nextInt();
        if ((Math.abs(rightPrice - aScanner)) < (Math.abs(rightPrice - bScanner))) {
            System.out.println("Ha vinto l'utente a!");
        } else if ((Math.abs(rightPrice - aScanner)) > (Math.abs(rightPrice - bScanner))) {
            System.out.println("Ha vinto l'utente b!");
        } else {
            System.out.println("a e b hanno vinto!");
        }
    }
}
