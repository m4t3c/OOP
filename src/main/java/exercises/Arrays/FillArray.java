package exercises.Arrays;

import java.util.Arrays;
import java.util.random.RandomGenerator;

/*
Write a method returning a double[] already filled with values (see java.util.Arrays, java.util.random.RandomGenerator).
 */

public class FillArray {
    public static double[] fillArray(int size, double value, boolean addNoise){
        double[] res = new double[size];
        if(addNoise){
            RandomGenerator rng = RandomGenerator.getDefault();
            for (int i = 0; i < size; ++i){
                double n = rng.nextDouble(value - (value * 0.05), value + (value * 0.05));
                res[i] = n;
            }
        }else {
            Arrays.fill(res, value);
        }

        return  res;
    }

    public static void main(String[] args) {
        double[] res = fillArray(5, 1032, true);

        System.out.println(Arrays.toString(res));
    }
}
