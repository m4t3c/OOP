package exercises.strings;

/*
    Write a method accepting a string and returning true if the string is a palindrome, ignoring case considerations (see StringBuilder class).

    Examples:

    palindrome("whistleblower") → false
    palindrome("radar") → true
    palindrome("r") → true
    palindrome("") → true
    palindrome("RaceCar") → true
    The method has the following prototype:

    public static boolean isPalindrome(String s);
    where:

    string is the string to be processed
*/

public class Palindrome {
    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }

        String reversed = new StringBuilder(s).reverse().toString();
        return reversed.equalsIgnoreCase(s);
    }
}
