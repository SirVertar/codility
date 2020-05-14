package lesson4.frogriverone;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < X; i++) {
            set.add(i + 1);
        }

        for (int i = 0; i < A.length; i++) {
            set.remove(A[i]);
            if(set.size() == 0) {
                return i;
            }
        }
        return -1;
    }
}
