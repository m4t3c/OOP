package exercises.arrays;

/*
    For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering another multiple of 10.
    So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.

    Examples:

    tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
    tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
    tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]
    The method has the following prototype:

    public static int[] tenRun(int[] v);
    where:

    v is the int[] array to be processed.

*/

public class TenRun {
    public static int[] tenRun(int[] v) {
        int multiple = 0;
        for (int i = 0; i < v.length; i++) {
            if ((v[i] % 10 == 0) && (v[i] != 0)) {
                multiple = v[i];
            } else if (multiple != 0) {
                v[i] = multiple;
            }
        }
        return v;
    }
}
