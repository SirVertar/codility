package lesson8.equileader;

import org.junit.Test;

import static org.junit.Assert.*;

public class EquiLeaderTestSuite {
    @Test
    public void test1() {
        //Given
        int[] array = new int[]{4, 3, 4, 4, 4, 2};
        EquiLeader equiLeader = new EquiLeader();
        //When
        int result = equiLeader.solution(array);
        //Then
        assertEquals(2, result);
    }

    @Test
    public void test2() {
        //Given
        int[] array = new int[]{4, 4, 2, 5, 3, 4, 4, 4};
        EquiLeader equiLeader = new EquiLeader();
        //When
        int result = equiLeader.solution(array);
        //Then
        assertEquals(3, result);
    }
}
