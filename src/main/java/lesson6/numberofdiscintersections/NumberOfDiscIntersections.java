package lesson6.numberofdiscintersections;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NumberOfDiscIntersections {
    public int solution(int[] A) {
        int result = 0;
        Set<Long> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (i != j) {
                    Long first = (long)i * 10 + j;
                    Long second = (long)j * 10 + i;
                    if (i + (long)A[i] <= j + (long)A[j] && i + (long)A[i] >= j - A[j] &&
                            !set.contains(first) && !set.contains(second)) {
                        result++;
                        set.add(first);
                        set.add(second);
                    }
                }
            }
        }
        if (result > 10000000) {
            return -1;
        }
        return result;
    }
}
