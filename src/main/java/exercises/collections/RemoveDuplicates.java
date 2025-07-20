package exercises.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {
    public static List<Integer> removeDuplicates(List<Integer> list) {
        //We use the HashSet to remove the duplicates in the list, then we create a new ArrayList starting from the HashSet
        return new ArrayList<>(new HashSet<>(list));
    }
}
