package lesson15.counttriangels;


import java.util.Arrays;

public class CountTriangles {
    public int solution(int[] A) {
        int result = 0;
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                for (int k = j + 1; k < A.length; k++) {
                    if (A[i] + A[j] > A[k]
                            && A[i] + A[k] > A[j]
                            && A[k] + A[j] > A[i]) {
                        result++;
                    } else {
                        break;
                    }
                }
            }
        }
        return result;
    }
}
