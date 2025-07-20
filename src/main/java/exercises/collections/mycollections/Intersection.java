package exercises.collections.mycollections;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersections = new HashSet<>();

        for (int item : first) {
            if (second.contains(item)) {
                intersections.add(item);
            }
        }
        return intersections;
    }
    public static Set<Integer> intersectionRetainAll(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersection = new HashSet<>(first);
        intersection.retainAll(second);
        return intersection;
    }
}
