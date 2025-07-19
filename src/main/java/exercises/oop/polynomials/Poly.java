package exercises.oop.polynomials;

/**
 * Interface representing a polynomial with arbitrary grade
 *
 * @author Matteo Coppa
 */
public interface Poly {

    /**
     * Returns the degree of the polynomial
     *
     * @return the degree of the polynomial
     */
    int degree();

    /**
     * Returns the cofficient of a given degree (0 ... n)
     *
     * @param degree The degree to be queried (get the coefficient)
     *
     * @return The coefficient of the monomial with the specified degree
     */
    double coefficient(int degree);

    /**
     * Returns all the coefficients of the polynomial
     *
     * @return all the coefficients of the polynomial
     */
    double[] coefficients();

    /**
     * Returns the derivate of the given polynomial
     *
     * @return the derivate of the given polynomial
     */
    Poly derivative();
}
