package exercises.oop.polynomials;

import java.util.ArrayList;

/**
 * Polynomial with coefficients stored as an ArrayList
 *
 * @author Matteo Coppa
 */
public class ListPoly extends  AbstractPoly{
    final ArrayList<Double> coefficients;

    public ListPoly(double[] coefficients) {
        this.coefficients = new ArrayList<>();
        for (double c : coefficients) {
            this.coefficients.add(c);
        }
    }

    public double coefficient(int degree) {
        return coefficients.get(degree);
    }

    public double[] coefficients() {
        double[] target = new double[coefficients.size()];
        for (int i = 0; i < target.length; i++){
            target[i] = coefficients.get(i);
        }
        return target;
    }

    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    @Override
    public Poly derivative() {
        return new ListPoly(this.derive());
    }

}
