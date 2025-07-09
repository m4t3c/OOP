package exercises.warmup;

import java.util.random.RandomGenerator;
import java.util.Scanner;

/*
    Write a program implementing a simple quiz game.
    The computer selects a random number between 0 and 3 then ask the user to guess the number.
    The game ends when the user correctly guesses the number 0.
    (see java.util.random.RandomGenerator, java.util.Scanner).
*/

public class GuessNumber {
    public static void main(String[] args) {
        RandomGenerator rng = RandomGenerator.getDefault();
        Scanner scanner = new Scanner(System.in);

        while(true){
            int number = rng.nextInt(4);
            System.out.println("Sto pensando a un numero compreso tra 1 e 3... indovina qual'è! ");
            int answer = scanner.nextInt();
            if (answer != number) {
                System.out.println("Risposta sbagliata");
            } else {
                if (answer != 0) {
                    System.out.println("Risposta corretta, continuiamo!");
                } else {
                    System.out.println("Risposta corretta, ci fermiamo quì");
                    break;
                }
            }
        }
    }
}
