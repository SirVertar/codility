package lesson6.distinct;

import org.junit.Test;

import static org.junit.Assert.*;

public class DistinctTestSuite {
    @Test
    public void test1() {
        //Given
        int[] array = new int[]{2, 1, 1, 2, 3, 1};
        Distinct distinct = new Distinct();
        //When
        int distinctNumber = distinct.solution(array);
        //Then
        assertEquals(3, distinctNumber);
    }


}
