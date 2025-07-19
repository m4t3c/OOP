package exercises.oop.basic;

import java.util.Arrays;

/**
 * A resizable array providing methods for its manipulation instead of the [] notation.
 */
public class EnhancedResizableArray {
    public static final int DEFAULT_CAPACITY = 4;
    private int[] v;

    /**
     * Build and enhanced int array with a default capacity
     */
    public EnhancedResizableArray(int[] v) {
        this.v = new int[DEFAULT_CAPACITY];
    }

    /**
     * Return the element stored at the specified array index.
     * @param index the index to be retrieved
     * @return the element stored at the specified array index
     */
    public int get(int index) {
        return v[index];
    }

    /**
     * Sets the element stored at the specified array index with a new value.
     * If the array's capacity is smaller than the index, a new int[] have to be allocated with a capacity of 2*index.
     * All the newly allocated elements have to be 0
     * @param index the index to be set
     * @param value the value to be set
     */
    public void set(int index, int value) {
        if (index >= v.length) {
            int[] tmp = new int[index * 2];
            System.arraycopy(v, 0, tmp, 0, v.length);
            v = tmp;
        }
        v[index] = value;
    }

    /**
     * Verifies if the specified value is contained within the array
     * @param value the value to be verified
     * @return true if value is contained, false otherwise
     */
    public boolean contains(int value) {
        for (int i : v) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * Sets all the elements of the arrray at the specified value
     * @param value the value to set all the elements of the array
     */
    public void fill(int value) {
        Arrays.fill(v, value);
    }

    /**
     * Returns the capacity of the internal array
     * @return the capacity of the internal array
     */
    public int lenght(){
        return v.length;
    }

    /**
     * Returns a copy of the array of the values
     * @return the array
     */
    public int[] toArray() {
        return Arrays.copyOf(v, v.length);
    }
}
