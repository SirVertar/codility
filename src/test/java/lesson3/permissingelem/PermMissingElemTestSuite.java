package lesson3.permissingelem;

import org.junit.Test;

import static org.junit.Assert.*;

public class PermMissingElemTestSuite {

    @Test
    public void test1() {
        //Given
        int[] array = new int[]{2, 3, 1, 5};
        PermMissingElem permMissingElem = new PermMissingElem();
        //When
        int result = permMissingElem.solution(array);
        //Then
        assertEquals(4, result);
    }

}
