package lesson4.maxcounters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxCounters {
    public int[] solution(int N, int[] A) {

        int[] resultArray = new int[N];
        int max = 0;
        int kMax = 0;
        for (int value : A) {
            if (value == N + 1) {
                kMax = max;
            } else if (value != N + 1) {
                if (resultArray[value - 1] < kMax) {
                    resultArray[value - 1] = kMax;
                }
                resultArray[value - 1] = resultArray[value - 1] + 1;
                if (resultArray[value - 1] > max) {
                    max = resultArray[value - 1];
                }
            }
        }

        if (max > 0) {
            int temp = 0;
            for (int i = A.length - 1; i >= 0; i--) {
                if (A[i] != N + 1) {
                    resultArray[A[i] - 1] = resultArray[A[i] - 1] - 1;
                    temp++;
                } else {
                    Arrays.fill(resultArray, kMax);
                    break;
                }
            }
            for (int i = 0; i < temp; i++) {
                resultArray[A[A.length - 1 - i] - 1] = resultArray[A[A.length - 1 - i] - 1] + 1;
            }
        }
        return resultArray;
    }
}
