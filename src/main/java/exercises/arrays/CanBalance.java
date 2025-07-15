package exercises.arrays;

/*
    Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.

    Examples:

    canBalance([1, 1, 1, 2, 1]) → true
    canBalance([2, 1, 1, 2, 1]) → false
    canBalance([10, 10]) → true
    The method has the following prototype:

    public static boolean canBalance(int[] v);
    where:

    v is the array to be evaluated

*/

public class CanBalance {
    public static int sum(int[] v, int begin, int end) {
        int sum = 0;
        for (int i = begin; i < end; ++i) {
            sum += v[i];
        }

        return sum;
    }

    public static boolean canBalance(int[] v) {
        if (v.length < 2) {
            return false;
        }

        int sumBegin = sum(v, 0,1);
        int sumEnd = sum(v, 1, v.length);

        for (int i = 1; i < v.length; i++) {
            if (sumBegin == sumEnd) {
                return true;
            }

            sumBegin += v[i];
            sumEnd -= v[i];
        }

        return false;
    }
}
