package exercises.strings;

/*
    Write two methods accepting a string and returning the reversed string.
    The first one has to use only String's methods (see String.charAt()), while the second one has to use StringBuilder's methods (see StringBuilder.reverse()).

    Examples:

    reverse("String test") → "tset gnirtS"
    reverse("John Doe") → "eoD nhoJ"
    reverse("Hello World!") → "!dlroW olleH"
    Methods have the following prototype:

    public static String reverseCharAt(String string);
    public static String reverseStringBuilder(String string);
    where:

    string is the string to be reversed
*/

public class Reverse {
    public static String reverseCharAt(String string){
        StringBuilder sb = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            sb.append(string.charAt(i));
        }
        return sb.toString();
    }

    public static String reverseStringBuilder(String string) {
        return new StringBuilder(string).reverse().toString();
    }
}
