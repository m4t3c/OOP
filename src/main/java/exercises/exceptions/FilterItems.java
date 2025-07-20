package exercises.exceptions;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class FilterItems {
    public static List<String> filterItems(List<String> strings) {
        List<String> dst = new ArrayList<>();
        for (String string : strings) {
            try {
                CheckString.checkString(string);
                dst.add(string);
            } catch (ParseException ignored) {
            }
        }
        return dst;
    }
}
