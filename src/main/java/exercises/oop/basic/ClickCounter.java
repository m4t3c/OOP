package exercises.oop.basic;

/*
    Write a class named ClickCounter representing a simple device to keep track of how many times a button (in this case a method) is clicked.
    Internally, the class represents the number of clicks with an int value (starting from 0). The class provides the following methods:

        public int getValue() returning the current number of clicks.
        public void click() increasing the number of clicks of 1 unit.
        public void undo() decreasing the number of clicks of 1 unit (but preventing negative click values).
        public void reset() setting the number of clicks to 0.
    Refer to the UML diagram, JavaDoc documentation, and unit tests for further inspiration.
 */

public class ClickCounter {
    private int value;

    /**
     * Il metodo getValue() restituisce il valore dell'attributo value
     * @return il valore dell'attributo value
     */
    public int getValue(){
        return value;
    }

    /**
     * Il metodo click() incrementa di uno il counter
     */
    public void click(){
        value++;
    }

    /**
     * Il metodo undo() decrementa di uno il counter, controllando che sia sempre maggiore di 0
     */
    public void undo(){
        value = Math.max(value - 1, 0);
    }

    /**
     * Il metodo reset() ripristina il counter a 0
     */
    public void reset(){
        value = 0;
    }

    public static void main(String[] args) {
        ClickCounter cc = new ClickCounter();
        System.out.println(cc.getValue());
        cc.click();
        cc.click();
        System.out.println(cc.getValue());
        cc.undo();
        System.out.println(cc.getValue());
    }
}
