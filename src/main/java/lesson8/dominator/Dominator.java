package lesson8.dominator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dominator {
    public int solution(int[] A) {
        int lengthOfArray = A.length;
        if (lengthOfArray == 0) {
            return -1;
        }
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < lengthOfArray; i++) {
            if (!map.containsKey(A[i])) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(A[i], list);
            } else {
                List<Integer> value = map.get(A[i]);
                value.add(i);
                map.put(A[i], value);
            }
        }
        int maxQty = 0;
        int result = -1;
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            if (entry.getValue().size() > maxQty) {
                maxQty = entry.getValue().size();
                result = entry.getKey();
            }
        }
        if ((maxQty > (A.length / 2) && lengthOfArray % 2 == 0) || (maxQty >= (A.length / 2) + 1 && lengthOfArray % 2 != 0)) {
            return map.get(result).get(0);
        }
        return -1;
    }
}
