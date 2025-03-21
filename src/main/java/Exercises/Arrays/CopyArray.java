package Exercises.Arrays;

import java.util.*;

/* Write a method accepting a double[] and returning a copy of the initial double[] */

public class CopyArray {
    public static double[] copyArray(double[] v){
        double[] res = new double[v.length];
        System.arraycopy(v, 0, res, 0, v.length);

        return res;
    }

    public static void main(String[] args) {
        double[] a1 = {23, 14, 64};
        double[] res = copyArray(a1);

        System.out.println(Arrays.toString(a1));
    }
}
