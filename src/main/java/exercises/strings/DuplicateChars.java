package exercises.strings;

/*
    Write a method accepting a string and returning all recurring characters contained into the string as a char[].
    More specifically, recurring characters have to be returned in alphabetical order (see String.valueOf(), String.contains(), String.toCharArray()).
    For example: headmistressship -> [e,h,i,s].

    Examples:

    duplicateChars("whistleblower") → [e, l, w]
    duplicateChars("ss") → [s]
    duplicateChars("s") → []
    duplicateChars("") → []
    The method has the following prototype:

    public static char[] duplicateChars(String input);
    where:

    string is the string to be processed

*/

public class DuplicateChars {
    public static char[] duplicateChars(String input) {

        StringBuilder seen = new StringBuilder();
        StringBuilder recurring = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            String tmp = String.valueOf(input.charAt(i));
            if (!seen.toString().contains(tmp)) {
                seen.append(tmp);
            } else if (!recurring.toString().contains(tmp)) {
                recurring.append(tmp);
            }
        }

        char[] res = recurring.toString().toCharArray();
        java.util.Arrays.sort(res);

        return res;
    }
}
