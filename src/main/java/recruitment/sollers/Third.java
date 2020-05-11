package recruitment.sollers;

import java.util.*;

public class Third {
    public int solution(int[] A, int[] B) {

        Map<Integer, Integer> citiesAndTheirLastConnectionCity = new HashMap<>();
        Set<Integer> citySet = new HashSet<>();
        Set<Integer> connectionCitiesSet = new HashSet<>();

        Map<Integer, Integer> connectionMap = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            connectionMap.put(A[i], B[i]);
            citySet.add(A[i]);
            connectionCitiesSet.add(B[i]);
        }


        if (connectionCitiesSet.size() == 1) {
            return B[0];
        }
        return -1;
    }
}
