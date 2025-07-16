package exercises.strings;

import java.util.StringTokenizer;

/*
    Write a method accepting a string, and counting the number of words ending in 'y' or 'z' so the 'y' in "heavy" and the 'z' in "fez" count,
    but not the 'y' in "yellow" (not case-sensitive) (see java.util.StringTokenizer class, String.endsWith() method).

    Examples:

    countYZ("fez day") → 2
    countYZ("day fez") → 2
    countYZ("day fyyyz") → 2
    The method has the following prototype:

    public static int countYZ(String string);
    where:

    string is the string to be processed
*/

public class CountYZ {
    public static int countYZ(String string) {
        int count = 0;
        StringTokenizer token = new StringTokenizer(string);
        while (token.hasMoreTokens()) {
            String tmp = token.nextToken().toLowerCase();
            if (tmp.endsWith("z") || tmp.endsWith("y")) {
                count++;
            }
        }
        return count;
    }
}
