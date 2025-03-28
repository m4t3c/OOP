package exercises.Arrays;

import java.util.Arrays;

/*
    Write a method accepting an int and returning the sequence of the digits as an int[].

    Examples:

    321 → [3, 2, 1]
    123 → [1, 2, 3]
    The method has the following prototype:
 */

public class Splitter {
    public static int[] splitter(int input){
        String inp = Integer.toString(input);
        int[] res = new int[inp.length()];
        for (int i = 0; i < inp.length(); ++i){
            res[i] = Character.getNumericValue(inp.charAt(i));
        }

        return res;
    }

    public static void main(String[] args) {
        int i = 246;
        int[] res = splitter(i);

        System.out.println(Arrays.toString(res));
    }
}
