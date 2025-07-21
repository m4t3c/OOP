package exercises.generics;

import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static <T> T max(List<T> list, Comparator<? super T> cmp) {
        T max = list.get(0);
        for (T item : list) {
            if (cmp.compare(max, item) < 0) {
                max = item;
            }
        }
        return max;
    }
    public static <T> T min(List<T> list, Comparator<? super T> cmp) {
        T min = list.get(0);
        for (T item : list) {
            if (cmp.compare(min, item) > 0) {
                min = item;
            }
        }
        return min;
    }
}
