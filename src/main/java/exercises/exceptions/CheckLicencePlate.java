package exercises.exceptions;

public class CheckLicencePlate {
    public static void checkIfMadeOfLetters(String string) {
        for (char c : string.toCharArray()) {
            if(!Character.isLetter(c)){
                throw new IllegalArgumentException("Not a letter " + c);
            }
        }
    }

    public static void checkIfMadeOfNumbers(String string) {
        for (char c : string.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("Not a number " + c);
            }
        }
    }

    public static void checkLicencePlate(String licence){
        if (licence.length() != 7) {
            throw new IllegalArgumentException("Lenghts != 7");
        }
        checkIfMadeOfLetters(licence.substring(0, 2));
        checkIfMadeOfNumbers(licence.substring(2, 5));
        checkIfMadeOfLetters(licence.substring(5, 7));
    }
}
