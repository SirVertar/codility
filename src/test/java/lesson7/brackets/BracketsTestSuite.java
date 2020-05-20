package lesson7.brackets;

import lesson7.brackets.Brackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BracketsTestSuite {

    @Test
    public void test1() {
        //Given
        String word = "{[()()]}";
        Brackets brackets = new Brackets();
        //When
        int result = brackets.solution(word);
        //Then

        assertEquals(1, result);
    }

    @Test
    public void test2() {
        //Given
        String word = "([)()]";
        Brackets brackets = new Brackets();
        //When
        int result = brackets.solution(word);
        //Then
        assertEquals(0, result);
    }

    @Test
    public void test3() {
        //Given
        String word = ")(";
        Brackets brackets = new Brackets();
        //When
        int result = brackets.solution(word);
        //Then
        assertEquals(0, result);
    }
    @Test
    public void test4() {
        //Given
        String word = "))((";
        Brackets brackets = new Brackets();
        //When
        int result = brackets.solution(word);
        //Then
        assertEquals(0, result);
    }

    @Test
    public void test5() {
        //Given
        String word = "({{({}[]{})}}[]{})";
        Brackets brackets = new Brackets();
        //When
        int result = brackets.solution(word);
        //Then
        assertEquals(1, result);
    }


}
