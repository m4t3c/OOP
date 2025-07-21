package exercises.functional;

import java.util.List;
import java.util.stream.Collectors;

public class NoTeen {
    public static List<Integer> noTeen(List<Integer> nums) {
        List<Integer> filteredNums = nums.stream()
                .filter(age -> age < 13 || age > 19)
                .collect(Collectors.toList());
        return filteredNums;
    }
}
