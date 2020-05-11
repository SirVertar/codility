package lesson5.passingcars;

import junit.framework.TestCase;
import org.junit.Test;

public class PassingCarsTestSuite extends TestCase {
    @Test
    public void test1() {
        //Given
        int[] a = new int[]{0,1,0,1,1};
        PassingCars passingCars = new PassingCars();
        //When
        int result = passingCars.solution(a);
        //Then
        assertEquals(5, result);

    }

}
