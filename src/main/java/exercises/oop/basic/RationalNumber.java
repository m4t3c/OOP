package exercises.oop.basic;

import java.util.Objects;

/**
 * A rational number supporting addition and multiplication with other rational numbers.
 */
public class RationalNumber {
    private final int numerator;
    private final int denominator;

    /**
     * Constructor and initializes a new rational number with the specified numerator and denominator
     * @param numerator the numerator of the rational
     * @param denominator the denominator of the rational
     */
    public RationalNumber(int numerator, int denominator) {
        int gcd = greatestCommonDivisor(numerator, denominator);
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     * Returns the numerator of the rational
     * @return the numerator
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Returns the denominator of the rational
     * @return the denominator
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Adds one rational to the current rational
     * @param o the rational to be added
     * @return a new rational representing the sum
     */
    public RationalNumber add(RationalNumber o) {
        int lcm = leastCommonMultiple(denominator, o.denominator);
        int num = numerator * (lcm / denominator) + o.getNumerator() * (lcm / o.getDenominator());
        return new RationalNumber(num, lcm);
    }

    /**
     * Multiplies one rational to the current rational
     * @param o the rational to be multiplied
     * @return a new rational representing the product
     */
    public RationalNumber multiply(RationalNumber o) {
        int num = numerator * o.getNumerator();
        int den = denominator * o.getDenominator();
        return new RationalNumber(num, den);
    }


    /**
     * Returns the greatest common divisor of two integers number.
     * @param a the first integer number
     * @param b the second integer number
     * @return the greatest common divisor
     */
    public static int greatestCommonDivisor(int a, int b) {
        int max = Math.max(Math.abs(a), Math.abs(b));
        int min = Math.min(Math.abs(a), Math.abs(b));

        int rest = max % min;
        if (max % min == 0) {
            return min;
        } else {
            return greatestCommonDivisor(min, rest);
        }
    }

    /**
     * Returns the least common multiple of two integer number
     * @param a the first integer number
     * @param b the second integer number
     * @return the least common multiple
     */
    public static int leastCommonMultiple(int a, int b) {
        return Math.abs(a * b) / greatestCommonDivisor(a, b);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        RationalNumber that = (RationalNumber) o;
        return numerator == that.numerator && denominator == that.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public String toString() {
        return "RationalNumber{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
