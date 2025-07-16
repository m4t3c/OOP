package exercises.strings;

/*
    Write two methods accepting a string and returning the same string without the first two characters.
    Keep the first character if it is 'H' and keep the second character if it is 'e'.
    The first method has to use String.charAt(), while the second one has to use StringBuilder.deleteCharAt().

    Examples:

    removeFirstTwoCharsIf("Hello World!") → "Hello World!"
    removeFirstTwoCharsIf("Good World!") → "od World!"
    removeFirstTwoCharsIf("Ho") → "H"
    removeFirstTwoCharsIf("Ne") → "e"
    removeFirstTwoCharsIf("Y") → ""
    The methods have the following prototype:

    public static String removeFirstTwoCharsIfCharAt(String string);
    public static String removeFirstTwoCharsIfStringBuilder(String string);
    where:

    string is the string to be processed
*/

public class RemoveFirstTwoCharsIf {
    public static String removeFirstTwoCharsIfCharAt(String string) {
        int i = 2;
        if (string.charAt(1) == 'e') {
            i = 1;
        }
        if (string.charAt(0) == 'H') {
            i = 0;
        }
        StringBuilder sb = new StringBuilder();
        for (; i < string.length(); i++) {
            sb.append(string.charAt(i));
        }

        return sb.toString();
    }

    public static String removeFirstTwoCharsIfStringBuilder(String string){
        StringBuilder sb = new StringBuilder(string);
        if (string.length() > 1 && string.charAt(1) != 'e') {
            sb.deleteCharAt(1);
        }
        if (!string.isEmpty() && string.charAt(0) != 'H') {
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}
