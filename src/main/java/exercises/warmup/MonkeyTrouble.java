package exercises.warmup;

import java.util.Scanner;

/*
    We have two monkeys, a and b, and two boolean values (aSmile and bSmile) indicate if each is smiling.
    We are in trouble if they are both smiling or if neither of them is smiling.
    Write a program asking the user if monkeys are smiling and print an alert if we are in trouble (see java.util.Scanner).
 */

public class MonkeyTrouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("La scimmia 'a' sta sorridendo? (true/false) ");
        boolean aSmile = scanner.nextBoolean();
        System.out.println("La scimmia 'b' sta sorridento? (true/false) ");
        boolean bSmile = scanner.nextBoolean();

        if (aSmile != bSmile) {
            System.out.println("Non siamo in pericolo!");
        } else {
            System.out.println("Siamo in pericolo!");
        }
    }
}
