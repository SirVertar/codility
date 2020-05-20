package lesson6.triangle;

import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void test1() {
        //Given
        int[] array = new int[]{10, 2, 5, 1, 8, 20};
        Triangle triangle = new Triangle();
        //When
        int isTriangular = triangle.solution(array);
        //Then
        assertEquals(1, isTriangular);
    }

    @Test
    public void test2() {
        //Given
        int[] array = new int[]{10, 50, 5, 1};
        Triangle triangle = new Triangle();
        //When
        int isTriangular = triangle.solution(array);
        //Then
        assertEquals(0, isTriangular);
    }

    @Test
    public void test3() {
        //Given
        int[] array = new int[]{10};
        Triangle triangle = new Triangle();
        //When
        int isTriangular = triangle.solution(array);
        //Then
        assertEquals(0, isTriangular);
    }

    @Test
    public void test4() {
        //Given
        int[] array = new int[]{2, 2, 1};
        Triangle triangle = new Triangle();
        //When
        int isTriangular = triangle.solution(array);
        //Then
        assertEquals(1, isTriangular);
    }

    @Test
    public void test5() {
        //Given
        int[] array = new int[]{10, -10};
        Triangle triangle = new Triangle();
        //When
        int isTriangular = triangle.solution(array);
        //Then
        assertEquals(0, isTriangular);
    }

    @Test
    public void test6() {
        //Given
        int[] array = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
        Triangle triangle = new Triangle();
        //When
        int isTriangular = triangle.solution(array);
        //Then
        assertEquals(1, isTriangular);
    }
}
