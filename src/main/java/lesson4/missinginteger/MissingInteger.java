package lesson4.missinginteger;

import java.util.*;

public class MissingInteger {

    public int solution(int[] A) {
        Arrays.sort(A);
        Set<Integer> set = new HashSet<>();
        int lastNumber = 0;
        int setSize = 0;
        for (int value : A) {
            if (value > 0) {
                if (value != 1 && setSize == 0) {
                    return 1;
                } else if (set.size() == value - 1 || setSize == value || value == 1) {
                    lastNumber = value;
                    set.add(value);
                    setSize = set.size();
                } else {
                    return lastNumber + 1;
                }
            }
        }
        if (setSize != 0) {
            return setSize + 1;
        }
        return 1;
    }
}
