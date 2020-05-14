package lesson4.frogriverone;

import org.junit.Test;

import static org.junit.Assert.*;

public class ForgRiverOneTestSuite {
    @Test
    public void test1() {
        //Given
        int[] leavesArray = new int[]{1,3,1,4,2,3,5,4};
        int endOfRiver  = 5;
        FrogRiverOne frogRiverOne = new FrogRiverOne();
        //When
        int result = frogRiverOne.solution(endOfRiver, leavesArray);
        //Then
        assertEquals(6, result);
    }

}
