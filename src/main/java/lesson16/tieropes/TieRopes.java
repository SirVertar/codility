package lesson16.tieropes;

public class TieRopes {
    public int solution(int K, int[] A) {
        int result = 0;
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            if (sum >= K) {
                result++;
                sum = 0;
            }
        }
        return result;
    }
}
