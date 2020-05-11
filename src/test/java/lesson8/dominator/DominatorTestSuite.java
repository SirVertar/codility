package lesson8.dominator;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DominatorTestSuite {


    @Test
    public void test1() {
        //Given
        int[] A = new int[]{3, 4, 3, 2, 3, -1, 3, 3};
        List<Integer> results = Arrays.asList(0,2,4,6,7);
        Dominator dominator = new Dominator();
        //When
        int result = dominator.solution(A);
        //THen
        assertTrue(results.contains(result));
    }

    @Test
    public void test2() {
        //Given
        int[] A = new int[]{3, 4, 3, 2, 3, -1, 3,77,88};
        List<Integer> results = Arrays.asList(0,2,4,6,7);
        Dominator dominator = new Dominator();
        //When
        int result = dominator.solution(A);
        //THen
        assertEquals(-1, result);
        //assertTrue(results.contains(result));
    }
    @Test
    public void test3() {
        //Given
        int[] A = new int[]{0,0,1,1,1};
        List<Integer> results = Arrays.asList(2,3,4);
        Dominator dominator = new Dominator();
        //When
        int result = dominator.solution(A);
        //THen
        assertTrue(results.contains(result));
    }


}
