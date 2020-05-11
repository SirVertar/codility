package lesson2.oddoccurrenceslnArray;

import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {
    public int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int value : A) {
            if (set.contains(value)) {
                set.remove(value);
            } else {
                set.add(value);
            }
        }
        return set.stream()
                .findFirst()
                .get();
    }

}
