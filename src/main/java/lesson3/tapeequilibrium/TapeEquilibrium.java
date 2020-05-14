package lesson3.tapeequilibrium;

import java.util.Arrays;
import java.util.stream.Stream;

public class TapeEquilibrium {
    public int solution(int[] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        int minValue = 0;
        int leftSum = 0;
        int rightSum = sum;
        for (int i = 0; i < A.length-1; i++) {
            leftSum += A[i];
            rightSum -= A[i];
            if (i == 0) {
                minValue = Math.abs(leftSum - rightSum);
            }else if(Math.abs(leftSum - rightSum) < minValue) {
                minValue = Math.abs(leftSum - rightSum);
            }
        }
        return minValue;
    }
}
