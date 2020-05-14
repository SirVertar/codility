package lesson3.tapeequilibrium;

import org.junit.Test;

import static org.junit.Assert.*;

public class TapeEquilibriumTestSuite {
    @Test
    public void test1() {
        //Given
        int[] array = new int[]{3,1,2,4,3};
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        //When
        int result = tapeEquilibrium.solution(array);
        //Then
        assertEquals(1, result);

    }
}
