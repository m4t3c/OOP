package Exercises.Arrays;

/*
    Write a method accepting an int and returning the sequence of the digits as an int[].

    Examples:

    321 → [3, 2, 1]
    123 → [1, 2, 3]
    The method has the following prototype:

    public static int[] splitter(int input);
    where:

    input is the integer number taken as input.
*/

public class Splitter {
    public static int[] splitter(int input){
        String stringNumber = Integer.toString(input);
        int lenght = stringNumber.length();
        int[] digits = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            digits[i] = Character.getNumericValue(stringNumber.charAt(i));
        }

        return digits;
    }
}
