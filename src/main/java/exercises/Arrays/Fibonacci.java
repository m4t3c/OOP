package Exercises.Arrays;

/*
    Write a method accepting an int and returning a long[] composed of the first n numbers of the Fibonacci series.

    Examples:

    fibonacci(1) → [0]
    fibonacci(2) → [0, 1]
    fibonacci(5) → [0, 1, 1, 2, 3]
    The method has the following prototype:

    public static long[] fibonacci(int n);
    where:

    n is the number of Fibonacci numbers to be generated.
*/

public class Fibonacci {
    public static long[] fibonacci(int n) {
        long[] sequence;
        if (n == 1) {
            sequence = new long[]{0};
        }
        if (n == 2) {
            sequence = new long[]{0, 1};
        } else {
            sequence = new long[n];
            sequence[0] = 0;
            sequence[1] = 1;
            for (int i = 2; i < n; i++) {
                sequence[i] = sequence[i - 1] + sequence[i - 2];
            }
        }

        return sequence;
    }
}
