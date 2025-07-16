package exercises.strings;

/*
    Write a method accepting a string and returning the same string trimmed of the first and last characters if the first and last characters are equal.
    Otherwise, the original string is returned (see String.substring(), String.charAt() methods).

    Examples:

    removeFirstLast("google") → "google"
    removeFirstLast("aenema") → "enem"
    removeFirstLast("FF") → ""
    removeFirstLast("F") → "F"
    The method has the following prototype:

    public static String removeFirstLast(String s);
    where:

    string is the string to be processed
*/

public class RemoveFirstLast {
    public static String removeFirstLast(String s) {
        if (s.length() < 2) {
            return s;
        }

        char first = s.charAt(0);
        char last = s.charAt(s.length() - 1);
        if (first == last) {
            return s.substring(1, s.length() - 1);
        }
        return s;
    }
}
