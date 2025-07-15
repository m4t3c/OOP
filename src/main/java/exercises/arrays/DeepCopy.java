package exercises.arrays;

/*
    Write a method accepting an int[][] and returning a deep copy of the original.
    Deep copies differ from shallow copies in that the whole multidimensional array is duplicated instead of the first tier of pointers only.

    The method has the following prototype:

    public static int[][] deepCopy(int[][] original);
*/

import java.util.Arrays;

public class DeepCopy {
    public static int[][] deepCopy(int[][] original) {
        int[][] copy = new int[original.length][];
        for (int i = 0; i < copy.length; i++) {
            copy[i] = Arrays.copyOf(original[i], original[i].length);
        }

        return  copy;
    }
}
