package lesson8.equileader;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EquiLeader {
    public int solution(int[] A) {
        if (A.length == 1) {
            return 0;
        }
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer number : A) {
            if (!map.containsKey(number)) {
                map.put(number, 1);
            } else {
                map.put(number, map.get(number) + 1);
            }
        }
        int totalMaxNumbersQty = 0;
        int maxNumber = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > totalMaxNumbersQty) {
                totalMaxNumbersQty = entry.getValue();
                maxNumber = entry.getKey();
            }
        }
        int size = A.length;
        int currentMaxNumberQuantity = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == maxNumber) {
                currentMaxNumberQuantity++;
            }
            if (currentMaxNumberQuantity > (i + 1) / 2 && totalMaxNumbersQty - currentMaxNumberQuantity > (size - (i+1)) / 2) {
                result++;
            }

        }
        return result;
    }
}
