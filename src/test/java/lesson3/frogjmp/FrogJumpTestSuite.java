package lesson3.frogjmp;

import org.junit.Test;

import static org.junit.Assert.*;

public class FrogJumpTestSuite {

    @Test
    public void test1() {
        //Given
        int from = 10;
        int to = 85;
        int oneJumpDistance = 30;
        FrogJump frogJump = new FrogJump();
        //When
        int result = frogJump.solution(from, to, oneJumpDistance);
        //When
        assertEquals(3, result);
    }

}
