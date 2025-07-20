package exercises.collections;

import java.util.Map;

public class ValuesKeys {
    public static boolean valuesKeys(Map<String, String> map) {
        for (String value : map.values()) {
            if (map.containsKey(value)) {
                return true;
            }
        }
        return false;
    }
}
