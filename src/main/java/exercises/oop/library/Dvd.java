package exercises.oop.library;

import java.util.Objects;

public class Dvd extends Item{
    int length;

    public Dvd(String title, int year, int length) {
        super(title, year);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        Dvd dvd = (Dvd) o;
        return this.length == dvd.length && this.getYear() == dvd.getYear() && Objects.equals(title, dvd.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, year, length);
    }

    @Override
    public String toString() {
        return "Dvd{" +
                "length=" + length +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }
}
