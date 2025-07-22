package exercises.functional;

import java.util.List;

public class NoYY {
    public static List<String> noYY(List<String> strings) {
        return strings.stream().map(s -> s + "y").filter(s -> !s.contains("yy")).toList();
    }
}
