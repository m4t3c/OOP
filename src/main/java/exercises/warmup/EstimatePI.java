package exercises.warmup;

import java.util.random.RandomGenerator;

/*
    It is possible to get an estimate of the mathematical constant π by using a random process.
    The idea is based on the fact that the area of a circle of radius 1 is equal to π, and the area of a quarter of that circle is π/4.

 <-- 1 -->
 ---------
|x        |
|     x   |
|       x |
|        x|
 ---------
The area of the square is 1, while the area of the part inside the circle is π/4.
If we choose a point in the square at random, the probability that it is inside the circle is π/4.
If we choose N points in the square at random (see Math.random()), and if C of them are inside the circle, we expect the fraction C/N of points that fall inside the circle to be about π/4.
If N is large enough, we can expect 4 * C/N to be a good estimate for π.

Write a program producing increasingly accurate estimates of PI as reported below (see System.out.printf()):

[trials=2^3] [error=27.32395447pc] [estimate=4.0000000000000000]
[trials=2^4] [error=11.40846016pc] [estimate=3.5000000000000000]
[trials=2^5] [error=3.45071301pc] [estimate=3.2500000000000000]
[trials=2^6] [error=1.46127622pc] [estimate=3.1875000000000000]
[trials=2^7] [error=-0.52816057pc] [estimate=3.1250000000000000]
[trials=2^8] [error=1.46127622pc] [estimate=3.1875000000000000]
[trials=2^9] [error=6.18618859pc] [estimate=3.3359375000000000]
[trials=2^10] [error=0.09353843pc] [estimate=3.1445312500000000]
[trials=2^11] [error=0.77740732pc] [estimate=3.1660156250000000]
[trials=2^12] [error=-0.12405622pc] [estimate=3.1376953125000000]
*/

public class EstimatePI {

    public static long areInside(long trials) {
        final RandomGenerator RND = RandomGenerator.getDefault();
        long areInside = 0;

        for (int i = 0; i < trials; i++) {
            double x = RND.nextDouble();
            double y = RND.nextDouble();

            if ((x*x + y*y) < 1) {
                areInside++;
            }
        }

        return areInside;
    }

    public static void main(String[] args) {
        for (int i = 3; i <= 24; ++i) {
            long trials =(long)Math.pow(2,i);
            long areInside = areInside(trials);

            double estimate = 4 * areInside/(double)trials;
            double error = 100 * (estimate - Math.PI) / Math.PI;
            System.out.printf("[trials=2^%d] [error=%.8fpc] [estimate=%.16f]\n", i, error, estimate);
        }
    }
}
