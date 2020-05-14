package lesson4.permcheck;

import org.junit.Test;

import static org.junit.Assert.*;

public class PermCheckTestSuite {

    @Test
    public void test1() {
        //Given
        int[] array = new int[]{4,1,3};
        PermCheck permCheck = new PermCheck();
        //When
        int missingNumber = permCheck.solution(array);
        //Then
        assertEquals(0, missingNumber);
    }


    @Test
    public void test2() {
        //Given
        int[] array = new int[]{9,8,7,6,5,4,2,3};
        PermCheck permCheck = new PermCheck();
        //When
        int missingNumber = permCheck.solution(array);
        //Then
        assertEquals(0, missingNumber);
    }

    @Test
    public void test3() {
        //Given
        int[] array = new int[]{9,8,7,6,5,4,2,3,1};
        PermCheck permCheck = new PermCheck();
        //When
        int missingNumber = permCheck.solution(array);
        //Then
        assertEquals(1, missingNumber);
    }
}
