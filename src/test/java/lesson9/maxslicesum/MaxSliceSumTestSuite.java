package lesson9.maxslicesum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxSliceSumTestSuite {
    @Test
    public void test1() {
        //Given
        int[] array = new int[]{3, 2, -6, 4, 0};
        MaxSliceSum maxSliceSum = new MaxSliceSum();
        //When
        int result = maxSliceSum.solution(array);
        //Then
        assertEquals(5, result);
    }

}
