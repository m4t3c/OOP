package Exercises.Arrays;

import java.util.Arrays;

/*
    Write a method accepting an int[] eventually containing zeros and returning an int[] in which all the zeros are at the end of the array.
    Maintain the relative order of the other (non-zero) elements.

    Examples:

    moveZeroEnd([0, 0, 4, 2]) → [4, 2, 0, 0]
    moveZeroEnd([9, 0, 0, 4]) → [9, 4, 0, 0]
    moveZeroEnd([1, 0, 0, 0]) → [1, 0, 0, 0]
    The method has the following prototype:

    public static int[] moveZerosEnd(int[] v);
    where:

    v is the int[] array to be processed.
*/

public class MoveZerosEnd {
    public static int[] moveZerosEnd(int[] v) {
        int[] moved = new int[v.length];
        int i = 0;
        for (int j : v) {
            while (j != 0) {
                moved[i++] = j;
            }
        }

        return moved;
    }
}
