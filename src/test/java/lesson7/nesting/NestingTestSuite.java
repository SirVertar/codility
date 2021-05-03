package lesson7.nesting;

import org.junit.Test;

import static org.junit.Assert.*;

public class NestingTestSuite {
    @Test
    public void test1() {
        //Given
        String word = "(()(())())";
        Nesting nesting = new Nesting();
        //When
        int result = nesting.solution(word);
        //Then
        assertEquals(1, result);
    }

}
