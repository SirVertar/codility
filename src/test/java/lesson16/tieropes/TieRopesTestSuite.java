package lesson16.tieropes;

import org.junit.Test;

import static org.junit.Assert.*;

public class TieRopesTestSuite {

    @Test
    public void test1() {
        //Given
        int k = 4;
        int[] array = new int[]{1, 2, 3, 4, 1, 1, 3};
        TieRopes tieRopes = new TieRopes();
        //When
        int result = tieRopes.solution(k, array);
        //Then
        assertEquals(3, result);
    }

}
