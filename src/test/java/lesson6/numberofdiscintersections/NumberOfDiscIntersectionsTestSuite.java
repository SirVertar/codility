package lesson6.numberofdiscintersections;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfDiscIntersectionsTestSuite {
    @Test
    public void test1() {
        //Given
        int[] array = new int[]{1, 5, 2, 1, 4, 0};
        NumberOfDiscIntersections numberOfDiscIntersections = new NumberOfDiscIntersections();
        //When
        int result = numberOfDiscIntersections.solution(array);
        //Then
        assertEquals(11, result);
    }

    @Test
    public void test2() {
        //Given
        int[] array = new int[]{1, 2555554, 0};
        NumberOfDiscIntersections numberOfDiscIntersections = new NumberOfDiscIntersections();
        //When
        int result = numberOfDiscIntersections.solution(array);
        //Then
        assertEquals(2, result);
    }

    @Test
    public void test3() {
        //Given
        int[] array = new int[]{1, 2147483647, 0};
        NumberOfDiscIntersections numberOfDiscIntersections = new NumberOfDiscIntersections();
        //When
        int result = numberOfDiscIntersections.solution(array);
        //Then
        assertEquals(2, result);
    }

    @Test
    public void test4() {
        //Given
        int[] array = new int[]{2147483647, 2, 0};
        NumberOfDiscIntersections numberOfDiscIntersections = new NumberOfDiscIntersections();
        //When
        int result = numberOfDiscIntersections.solution(array);
        //Then
        assertEquals(3, result);
    }

    @Test
    public void test5() {
        //Given
        int[] array = new int[]{2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647, 2147483647};
        NumberOfDiscIntersections numberOfDiscIntersections = new NumberOfDiscIntersections();
        //When
        int result = numberOfDiscIntersections.solution(array);
        //Then
        assertEquals(21, result);
    }

}
