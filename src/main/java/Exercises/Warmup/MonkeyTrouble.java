package Exercises.Warmup;

import java.util.Scanner;

/*
    We have two monkeys, a and b, and two boolean values (aSmile and bSmile) indicate if each is smiling.
    We are in trouble if they are both smiling or if neither of them is smiling.
    Write a program asking the user if monkeys are smiling and print an alert if we are in trouble
 */

public class MonkeyTrouble {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Is monkey a smiling? (true/false)");
        boolean a = s.nextBoolean();
        System.out.println("Is monkey b smiling? (true/false)");
        boolean b = s.nextBoolean();

        if(a == b){
            System.out.println("We are in trouble");
        } else {
            System.out.println("We are not in trouble");
        }
    }
}
