package lesson9.maxprofit;

public class MaxProfit {
    public int solution(int[] A) {
        int max = 0;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] - A[i] > max) {
                    max = A[j] - A[i];
                }
            }
        }
        return max;
    }
}
