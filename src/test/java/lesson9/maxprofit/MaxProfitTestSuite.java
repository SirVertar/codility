package lesson9.maxprofit;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxProfitTestSuite {
    @Test
    public void test1() {
        //Given
        int[] array = new int[]{23171, 21011, 21123, 21366, 21013, 21367};
        MaxProfit maxProfit = new MaxProfit();
        //When
        int result = maxProfit.solution(array);
        //Then
        assertEquals(356, result);
    }

}
