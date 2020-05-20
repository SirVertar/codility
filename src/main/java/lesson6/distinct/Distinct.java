package lesson6.distinct;

import java.util.*;

public class Distinct {
    public int solution(int[] A) {
        Set<Integer> resultSet= new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            resultSet.add(A[i]);
        }
        return resultSet.size();
    }
}
