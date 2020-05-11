package lesson2.oddoccurrenceslnArray;

import org.junit.Test;

import static org.junit.Assert.*;

public class OddOccurrencesInArrayTestSuite {
    @Test
    public void test() {
        //Given
        int[] a = new int[]{9, 3, 9, 3 ,9 ,7 ,9};
        OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
        //When
        int result = oddOccurrencesInArray.solution(a);
        //Then
        assertEquals(7, result);
    }
}
