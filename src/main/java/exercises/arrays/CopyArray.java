package exercises.arrays;

/*
    Write a method accepting a double[] and returning a copy of the initial double[] (see System.arraycopy()).
*/

public class CopyArray {
    public static double[] copyArray(double[] v) {
        double[] dst = new double[v.length];
        System.arraycopy(v, 0, dst, 0, v.length);
        return dst;
    }
}
