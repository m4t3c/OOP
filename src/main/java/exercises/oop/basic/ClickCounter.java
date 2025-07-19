package exercises.oop.basic;

/**
 * A click counter to keep track of how many times the click() method is called.
 */

public class ClickCounter {
    private int value = 0;

    /**
     * Gets the current value of this counter.
     *
     * @return the current value
     */
    public int getValue() {
        return value;
    }

    /**
     * Increase the value of this counter by 1.
     */
    public void click() {
        value += 1;
    }

    /**
     * Decrease the value of this counter by 1. Prevents also the counter to go below 0.
     */
    public void undo() {
        value -= 1;
    }

    /**
     * Set the number of clicks to 0.
     */
    public void reset() {
        value = 0;
    }
}
