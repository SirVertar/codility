package lesson6.maxproductofthree;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxProductOfThreeTestSuite {
    @Test
    public void test1() {
        //Given
        int[] array = new int[]{-3, 1, 2, -2, 5, 6};
        MaxProductOfThree maxProductOfThree = new MaxProductOfThree();
        //When
        int result = maxProductOfThree.solution(array);
        //Then
        assertEquals(60, result);
    }

}
