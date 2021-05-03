package lesson15.countdistinctslices;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountDistinctSlicesTestSuite {
    @Test
    public void test1() {
        //Given
        int[] array = new int[]{3, 4, 5, 5, 2};
        int maxNumber = 6;
        CountDistinctSlices countDistinctSlices = new CountDistinctSlices();
        //When
        int result = countDistinctSlices.solution(maxNumber, array);
        //Then
        assertEquals(9, result);
    }

}
