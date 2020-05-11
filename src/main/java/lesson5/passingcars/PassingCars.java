package lesson5.passingcars;

public class PassingCars {
    public int solution(int[] A) {
        int sumOfAll = 0;
        int temporarySum = 0;
        for (int i = A.length-1; i >= 0; i--) {
            if (A[i] == 1) {
                temporarySum++;
            } else {
                sumOfAll += temporarySum;
            }
            if (sumOfAll > 1_000_000_000) {
                return -1;
            }
        }
        return sumOfAll;
    }
}
