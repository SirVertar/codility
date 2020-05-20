package lesson6.maxproductofthree;

import java.security.AlgorithmConstraints;
import java.util.Arrays;

public class MaxProductOfThree {
    public int solution(int[] A) {

        int[] maxes = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        // Invariant: maxes[0] <= maxes[1] <= maxes[2]

        int[] mins = {Integer.MAX_VALUE, Integer.MAX_VALUE};
        // Invariant: mins[0] <= mins[1]

        // O(n)
        for( int a : A )
        {
            updateMaxes( a, maxes );
            updateMins( a, mins );
        }

        System.out.println(Arrays.toString(maxes));
        System.out.println(Arrays.toString(mins));

        int obvious = maxes[0] * maxes[1] * maxes[2];
        int twoBigNegs = mins[0] * mins[1] * maxes[2];
        return Math.max( obvious, twoBigNegs );
    }

    private static void updateMaxes( int a, int[] maxes )
    {
        if( a >= maxes[2] ) {
            // Found new max, shift down
            maxes[0] = maxes[1];
            maxes[1] = maxes[2];
            maxes[2] = a;
        } else if( a >= maxes[1] ) {
            maxes[0] = maxes[1];
            maxes[1] = a;
        } else if( a > maxes[0] ) {
            maxes[0] = a;
        }
    }

    private static void updateMins( int a, int[] mins )
    {
        if( a <= mins[0] ) {
            // Found new min, shift down
            mins[1] = mins[0];
            mins[0] = a;
        } else if( a < mins[1] ) {
            mins[1] = a;
        }
    }

//        int maxTriplet = Integer.MIN_VALUE;
//        for (int i = 0; i < A.length - 2; i++) {
//            for (int j = i + 1; j < A.length - 1; j++) {
//                for (int k = j + 1; k < A.length; k++) {
//                    int tempTriplet = A[i] * A[j] * A[k];
//                    if (tempTriplet > maxTriplet) {
//                        maxTriplet = A[i] * A[j] * A[k];
//                    }
//
//                }
//            }
//        }
//        return maxTriplet;
}
