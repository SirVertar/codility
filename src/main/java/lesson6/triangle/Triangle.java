package lesson6.triangle;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Triangle {
    public int solution(int[] A) {
        int[] trio = new int[3];
        Arrays.sort(A);
        int j = 0;
        int k = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            if (j < 3) {
                trio[j] = A[i];
                j++;
                if (checkIfTriangle(trio) && j == 3) {
                    return 1;
                }
                continue;
            }
            if (k % 3 == 0) {
                trio[0] = A[i];
                if (checkIfTriangle(trio)) {
                    return 1;
                }
                k++;
            } else if (k % 3 == 1) {
                trio[1] = A[i];
                if (checkIfTriangle(trio)) {
                    return 1;
                }
                k++;
            } else {
                trio[2] = A[i];
                if (checkIfTriangle(trio)) {
                    return 1;
                }
                k++;
            }
        }
        return 0;
    }

    private boolean checkIfTriangle(int[] array) {
        long firstNumber = array[0];
        long secondNumber = array[1];
        long thirdNumber = array[2];
        return firstNumber + secondNumber > thirdNumber &&
                firstNumber + thirdNumber > secondNumber &&
                secondNumber + thirdNumber > firstNumber;
    }
}
