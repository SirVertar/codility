package lesson16.maxnonoverlappingsegments;

public class MaxNonOverlappingSegments {
    public int solution(int[] A, int[] B) {
        if (A.length == 0 || A.length == 1) {
            return A.length;
        }
        int result = 0;
        int lastEnd = 0;
        for (int i = 0; i < A.length; i++) {
            if (i != 0) {
                if (A[i] > lastEnd) {
                    result++;
                    lastEnd = B[i];
                }
            } else {
                result++;
                lastEnd = B[i];
            }
        }
        return result;
    }
}
