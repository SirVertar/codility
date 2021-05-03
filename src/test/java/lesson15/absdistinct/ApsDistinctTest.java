package lesson15.absdistinct;

import org.junit.Test;

import static org.junit.Assert.*;

public class ApsDistinctTest {

    @Test
    public void test1() {
        //Given
        int[] array = new int[]{-5, -3, -1, 0, 3, 6};
        ApsDistinct apsDistinct = new ApsDistinct();
        //When
        int result = apsDistinct.solution(array);
        //Then
        assertEquals(5, result);
    }

}
