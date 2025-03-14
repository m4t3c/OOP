package Exercises.Warmup;

import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.Scanner;

/*
    The computer selects a random number between [0, 100] representing the price of an imaginary item.
    Two users are asked to guess the right price.
    The user which proposed the number closer to the right price wins.
    Note that Math.abs(n) returns the absolute value of a number
 */

public class TheRightPrice {
    public static void main(String[] args) {
        RandomGenerator rng = RandomGenerator.getDefault();
        Scanner scn = new Scanner(System.in);
        int p = rng.nextInt(101);
        System.out.println("First guess");
        int g1 = scn.nextInt();
        System.out.println("Second guess");
        int g2 = scn.nextInt();

        if (Math.abs(p - g1) < Math.abs(p - g2)) {
            System.out.println("First user wins");
        } else if (Math.abs(p - g1) > Math.abs(p - g2)) {
            System.out.println("Second user wins");
        } else {
            System.out.println("Both user wins");
        }

    }
}
