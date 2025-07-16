package exercises.strings;

/*
        Write a method accepting a string and returning a boolean value.
        The function returns true if "good" appears at the beginning of the string (see String.charAt() method).

        Examples:

        goodAtTheBeginning("good Sweet") → true
        goodAtTheBeginning(" good Sweet") → false
        goodAtTheBeginning("goo") → false
        The method has the following prototype:

        public static boolean goodAtTheBeginning(String s);
        where:

        string is the string to be processed
*/

public class GoodAtTheBeginning {
    public static boolean goodAtTheBeginning(String s) {
        return s.startsWith("good");
    }
}
