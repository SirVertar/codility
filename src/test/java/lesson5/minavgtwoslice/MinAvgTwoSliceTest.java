package lesson5.minavgtwoslice;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinAvgTwoSliceTest  {

    @Test
    public void test1() {
        //Given
        int[] a = new int[]{4,2,2,5,1,5,8};
        MinAvgTwoSlice minAvgTwoSlice = new MinAvgTwoSlice();
        //When
        int result = minAvgTwoSlice.solution(a);
        //Then
        assertEquals(1, result);

    }

    @Test
    public void test2() {
        //Given
        int[] a = new int[]{-3, -5, -8, -4, -10};
        MinAvgTwoSlice minAvgTwoSlice = new MinAvgTwoSlice();
        //When
        int result = minAvgTwoSlice.solution(a);
        //Then
        assertEquals(2, result);

    }
    @Test
    public void test3() {
        //Given
        int[] a = new int[]{10000, -10000, -10000, 10000};
        MinAvgTwoSlice minAvgTwoSlice = new MinAvgTwoSlice();
        //When
        int result = minAvgTwoSlice.solution(a);
        //Then
        assertEquals(1, result);

    }


}
