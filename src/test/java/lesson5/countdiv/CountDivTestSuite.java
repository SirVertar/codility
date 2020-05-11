package lesson5.countdiv;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountDivTestSuite {

    @Test
    public void test1() {
        //Given
        int a = 6;
        int b = 11;
        int k = 2;
        CountDiv countDiv = new CountDiv();
        //When
        int result = countDiv.solution(a, b, k);
        //Then
        assertEquals(3, result);
    }

    @Test
    public void test2() {
        //Given
        int a = 11;
        int b = 345;
        int k = 17;
        CountDiv countDiv = new CountDiv();
        //When
        int result = countDiv.solution(a, b, k);
        //Then
        assertEquals(20, result);
    }

    @Test
    public void test3() {
        //Given
        int a = 0;
        int b = 1;
        int k = 11;
        CountDiv countDiv = new CountDiv();
        //When
        int result = countDiv.solution(a, b, k);
        //Then
        assertEquals(1, result);
    }
    @Test
    public void test4() {
        //Given
        int a = 0;
        int b = 0;
        int k = 20;
        CountDiv countDiv = new CountDiv();
        //When
        int result = countDiv.solution(a, b, k);
        //Then
        assertEquals(1, result);
    }

    @Test
    public void test5() {
        //Given
        int a = 1;
        int b = 2;
        int k = 1;
        CountDiv countDiv = new CountDiv();
        //When
        int result = countDiv.solution(a, b, k);
        //Then
        assertEquals(2, result);
    }
    @Test
    public void test6() {
        //Given
        int a = 10;
        int b = 10;
        int k = 5;
        CountDiv countDiv = new CountDiv();
        //When
        int result = countDiv.solution(a, b, k);
        //Then
        assertEquals(1, result);
    }
    @Test
    public void test7() {
        //Given
        int a = 10;
        int b = 10;
        int k = 20;
        CountDiv countDiv = new CountDiv();
        //When
        int result = countDiv.solution(a, b, k);
        //Then
        assertEquals(0, result);
    }

    @Test
    public void test8() {
        //Given
        int a = 10;
        int b = 10;
        int k = 7;
        CountDiv countDiv = new CountDiv();
        //When
        int result = countDiv.solution(a, b, k);
        //Then
        assertEquals(0, result);
    }

    @Test
    public void test9() {
        //Given
        int a = 0;
        int b = 14;
        int k = 2;
        CountDiv countDiv = new CountDiv();
        //When
        int result = countDiv.solution(a, b, k);
        //Then
        assertEquals(8, result);
    }


}
