package exercises.functional;

import java.util.List;
import java.util.stream.Collectors;

public class NoYYZ {
    public static List<String> noYYZ(List<String> strings) {
        return strings.stream()
                .map(string -> string + "y")
                .filter(string -> !string.contains("yy"))
                .peek(string -> {
                    if (string.startsWith("z")) {
                        System.out.println(string);
                    }
                })
                .collect(Collectors.toList());
    }
}
