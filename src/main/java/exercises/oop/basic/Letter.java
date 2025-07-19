package exercises.oop.basic;

public class Letter {
    private final String from;
    private final String to;
    private final StringBuilder lines;

    /**
     * Constructs and initializes a letter with a sender and a recipient
     *
     * @param from the sender
     * @param to   the recipient
     */
    public Letter(String from, String to) {
        this.from = from;
        this.to = to;
        this.lines = new StringBuilder();
    }

    /**
     * Add line in append to the body of the letter
     * @param line line to be added
     */
    public void addLine(String line) {
        lines.append(line).append('\n');
    }

    public String getText() {
        return "Dear " + to + ":\n\n" + lines + "\n" + "Sincerely,\n\n" + from;
    }
}
