package Exercises.Warmup;

import java.util.random.RandomGenerator;
import java.util.Scanner;

/*
    Write a program implementing a simple quiz game.
    The computer selects a random number between 0 and 3 then ask the user to guess the number.
    The game ends when the user correctly guesses the number 0.
 */

public class GuessNumber {
    public static void main(String[] args) {
        RandomGenerator rng = RandomGenerator.getDefault();
        Scanner scn = new Scanner(System.in);

        while (true) {
            int rdn = rng.nextInt(0, 4);
            System.out.println("Chose a number between 0 and 3:");
            int n = scn.nextInt();
            if (rdn == n) {
                System.out.println("Well done!");
                if (n == 0) {
                    break;
                }
            } else {
                System.out.println("Wrong, try again");
            }
        }
    }
}
