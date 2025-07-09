package exercises.oop.basic;

/*
    Write a class named RationalNumber representing a rational number. RationalNumbers are immutable objects, indeed they cannot be changed after creation.
    Internally, the class represents numerator and denominator as int values.
    RationalNumbers must support equality with other RationalNumbers (see Object.equals(), Object.hashCode()) The class provides the following methods:

        public RationalNumber(int numerator, int denominator) creating the rational number. Before creating the object, numerator and denominator have to be simplified (i.e., divided by their greatest common divisor).
        public int getNumerator() returning the numerator.
        public int getDenominator() returning the denominator.
        public RationalNumber add(RationalNumber o) returning a RationalNumber object representing the sum of the current number and another number.
        public RationalNumber multiply(RationalNumber o) returning a RationalNumber object representing the multiplication of the current number and another number.
        public String toString().
    You can use the following two methods for computing the least common multiple and the greatest common divisor of two integer numbers.

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

public static int leastCommonMultiple(int a, int b) {
    return Math.abs(a * b) / greatestCommonDivisor(a, b);
}
 */

public class RationalNumber {
    private final int numerator;
    private final int denominator;

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

    public static int leastCommonMultiple(int a, int b) {
        return Math.abs(a * b) / greatestCommonDivisor(a, b);
    }

    public RationalNumber(int numerator, int denominator){
        numerator = numerator/greatestCommonDivisor(numerator,denominator);
        denominator = denominator/greatestCommonDivisor(numerator, denominator);
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    /**
     * Metodo che restituisce la somma tra 2 numeri razionali
     * @param o numero che va sommato al numero su cui è chiamato il metodo
     * @return numero che rappresenta la somma tra i 2 numeri
     */
    public RationalNumber add(RationalNumber o){
        int denominator_sum = leastCommonMultiple(this.getDenominator(), o.getDenominator());
        int numerator_sum = denominator_sum / this.getDenominator() * this.getNumerator() + denominator_sum / o.getDenominator() * o.getNumerator();
        return new RationalNumber(numerator_sum, denominator_sum);
    }


}
