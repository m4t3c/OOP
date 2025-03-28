package exercises.strings;

/*
Write two methods accepting a string and returning the same string without the first two characters.
The first one has to use String.charAt(), while the second one has to use StringBuilder.delete().
 */

public class RemoveFirstTwoChars {
    public static String removeFirstTwoCharsCharAt(String string){
        if(string.length() >= 0 && string.length() <= 2){
            return "";
        }
        String res = "";
        for (int i = 2; i < string.length(); i++){
            res += string.charAt(i);
        }

        return res;
    }
    public static String removeFirstTwoCharsStringBuilder(String string) {
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.delete(0, 2);
        return sb.toString();
    }
    public static void main(String[] args) {
        String r1 = removeFirstTwoCharsCharAt("Giacomo merda");
        String r2 = removeFirstTwoCharsStringBuilder("Giacomo merda");
        System.out.println(r1);
        System.out.println(r2);
    }
}
