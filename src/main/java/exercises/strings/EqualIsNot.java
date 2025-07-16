package exercises.strings;

/*
    Write a method accepting a string, and returning true if the number of appearances of "is" anywhere in the string is equal
    to the number of appearances of "not" anywhere in the string (case-sensitive) (See String.indexOf()).

    Examples:

    equalIsNot("is not") → true
    equalIsNot("This is not") → false
    equalIsNot("This is notnot") → true
    equalIsNot("noisxxnotyynotxisi") → true
    The method has the following prototype:

    public static boolean equalIsNot(String string);
    where:

    string is the string to be processed
*/

public class EqualIsNot {
    public static boolean equalIsNot(String string) {
        if (string == null || string.isEmpty()) {
            return true;
        }

        int indexis = string.indexOf("is");
        int indexnot = string.indexOf("not");
        while (indexis != -1 && indexnot != -1) {
            indexis = string.indexOf("is", indexis + 2);
            indexnot = string.indexOf("not", indexnot + 3);
        }

        return indexis == indexnot;
    }
}
