package lesson7.stonewall;

import org.junit.Test;

import static org.junit.Assert.*;

public class StoneWallTestSuite {
    @Test
    public void test1() {
        //Given
        int[] array = new int[]{8, 8, 5, 7, 9, 8, 7, 4, 8};
        StoneWall stoneWall =  new StoneWall();
        //When
        int result = stoneWall.solution(array);
        //Then
        assertEquals(7, result);
    }

    @Test
    public void test2() {
        //Given
        int[] array = new int[]{3, 2, 1};
        StoneWall stoneWall =  new StoneWall();
        //When
        int result = stoneWall.solution(array);
        //Then
        assertEquals(3, result);
    }

    @Test
    public void test3() {
        //Given
        int[] array = new int[]{1000000000};
        StoneWall stoneWall =  new StoneWall();
        //When
        int result = stoneWall.solution(array);
        //Then
        assertEquals(1, result);
    }

    @Test
    public void test4() {
        //Given
        int[] array = new int[]{2, 5, 1, 4, 6, 7, 9, 10, 1};
        StoneWall stoneWall =  new StoneWall();
        //When
        int result = stoneWall.solution(array);
        //Then
        assertEquals(8, result);
    }
}
