package lesson15.countdistinctslices;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctSlices {
    public int solution(int M, int[] A) {
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            if (result > 1000000000) {
                return result;
            }
            boolean uniqueSet = true;
            int j = i;
            Set<Integer> set = new HashSet<>();
            while(uniqueSet && j < A.length) {
                if (set.add(A[j])) {
                    result++;
                    j++;
                } else {
                    uniqueSet = false;
                }
            }
        }
        return result;
    }
}
