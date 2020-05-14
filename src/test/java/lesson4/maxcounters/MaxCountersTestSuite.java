package lesson4.maxcounters;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MaxCountersTestSuite {
    @Test
    public void test1() {
        //Given
        int[] array = new int[]{3, 4, 4, 6, 1, 4, 4};
        int maxCounter = 5;
        MaxCounters maxCounters = new MaxCounters();
        int[] expectedResultArray = new int[]{3,2,2,4,2};
        //When
        int[] resultArray = maxCounters.solution(maxCounter, array);
        //Then
        assertArrayEquals(expectedResultArray, resultArray);
    }

}
