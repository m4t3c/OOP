package exercises.oop.library;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * A library, intended as a collection of rents
 */
public class Library {
    final ArrayList<Rent> rents;

    /**
     * Constructs an empty library
     */
    public Library() {
        rents = new ArrayList<>();
    }

    /**
     * Adds a new rent to the library
     * @param rent the rent to be added
     * @return true if the rent is added false otherwise
     */
    public boolean addRent(Rent rent) {
        return rents.add(rent);
    }

    /**
     * Remove a rent by the library
     * @param rent the rent to be removed
     * @return true if the rent is removed false otherwise
     */
    public boolean removeRent(Rent rent) {
        return rents.remove(rent);
    }

    /**
     * Returns a list of rents whose end-date is before than a specified date
     * @param now the specified date
     * @return a list of expired rents
     */
    public ArrayList<Rent> getExpired(LocalDate now) {
        ArrayList<Rent> expired = new ArrayList<>();
        for (Rent rent : rents) {
            if (rent.isExpired(now)) {
                expired.add(rent);
            }
        }
        return expired;
    }
}
