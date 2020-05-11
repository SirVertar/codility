package lesson2.cyclicrotation;

import org.junit.Test;

import static org.junit.Assert.*;

public class CyclicRotationTestSuite {
    @Test
    public void test() {
        //Given
        int[] a = new int[]{3, 8, 9, 7, 6};
        int k = 3;
        CyclicRotation cyclicRotation = new CyclicRotation();
        //When
        int[] result;
        result = cyclicRotation.solution(a, k);
        //Then
        assertEquals(9, result[0]);
        assertEquals(7, result[1]);
        assertEquals(6, result[2]);
        assertEquals(3, result[3]);
        assertEquals(8, result[4]);

    }
}
