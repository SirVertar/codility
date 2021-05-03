package lesson15.counttriangels;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountTrianglesTest {
    @Test
    public void test1() {
        //Given
        int[] array = new int[]{10, 2, 5, 1, 8, 12};
        CountTriangles countTriangles = new CountTriangles();
        //When
        int result = countTriangles.solution(array);
        //Then
        assertEquals(4, result);
    }
}
