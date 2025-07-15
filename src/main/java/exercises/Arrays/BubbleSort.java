package Exercises.Arrays;

import java.util.Arrays;

/*
    Write two methods for ordering an int[].
    The only difference between the two methods is that the first one orders the original int[] directly and returns void,
    while the second one returns a sorted COPY of the original int[] (you can use the Bubble Sort algorithm).

    Examples:

    bubbleSort([6, 3, 4, 2]) → [2, 3, 4, 6]
    bubbleSort([9, 8, 7, 4]) → [4, 7, 8, 9]
    bubbleSort([1, 0, 0, 0]) → [0, 0, 0, 1]
    The method has the following prototype:

    public static void bubbleSort(int[] v);
    public static int[] bubbleSortCopy(int[] v);
    where:

    v is the int[] array to be sorted.
*/
public class BubbleSort {
    public static void bubbleSort(int[] v){
        boolean changed = true;
        while(changed) {
            changed = false;
            for (int i = 0; i < v.length - 1; i++) {
                if (v[i] > v[i + 1]) {
                    changed = true;
                    int tmp = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = tmp;
                }
            }
        }
    }
    public static int[] bubbleSortCopy(int[] v){
        int[] copy = Arrays.copyOf(v, v.length);
        bubbleSort(copy);
        return copy;
    }
}
