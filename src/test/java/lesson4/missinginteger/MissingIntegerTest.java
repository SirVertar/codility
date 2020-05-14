package lesson4.missinginteger;

import org.junit.Test;

import static org.junit.Assert.*;

public class MissingIntegerTest {

    @Test
    public void test1() {
        //Given
        int[] array = new int[]{1, 3, 6, 4, 1, 2};
        MissingInteger missingInteger = new MissingInteger();
        //When
        int result = missingInteger.solution(array);
        //Then
        assertEquals(5, result);
    }

    @Test
    public void test2() {
        //Given
        int[] array = new int[]{1, 2, 3, 4, 5};
        MissingInteger missingInteger = new MissingInteger();
        //When
        int result = missingInteger.solution(array);
        //Then
        assertEquals(6, result);
    }

    @Test
    public void test3() {
        //Given
        int[] array = new int[]{-1, -3, -4};
        MissingInteger missingInteger = new MissingInteger();
        //When
        int result = missingInteger.solution(array);
        //Then
        assertEquals(1, result);
    }

}
