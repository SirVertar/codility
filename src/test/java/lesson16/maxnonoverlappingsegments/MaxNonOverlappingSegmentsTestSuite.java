package lesson16.maxnonoverlappingsegments;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxNonOverlappingSegmentsTestSuite {

    @Test
    public void test1() {
        //Given
        int[] arrayA = new int[]{1, 3, 7, 9, 9};
        int[] arrayB = new int[]{5, 6, 8, 9, 10};
        MaxNonOverlappingSegments maxNonOverlappingSegments = new MaxNonOverlappingSegments();
        //When
        int result = maxNonOverlappingSegments.solution(arrayA, arrayB);
        //Then
        assertEquals(3, result);
    }
}
