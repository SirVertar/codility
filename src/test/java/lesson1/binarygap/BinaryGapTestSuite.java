package lesson1.binarygap;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryGapTestSuite {
    @Test
    public void test1() {
        //Given
        int number = 1376796946;
        //When
        BinaryGap binaryGap = new BinaryGap();
        int result = binaryGap.calculateBigZero(number);
        //Then
        assertEquals(5, result);
    }

    @Test
    public void test2() {
        //Given
        int number = 6;
        //When
        BinaryGap binaryGap = new BinaryGap();
        int result = binaryGap.calculateBigZero(number);
        //Then
        assertEquals(0, result);
    }

    @Test
    public void test3() {
        //Given
        int number = 328;
        //When
        BinaryGap binaryGap = new BinaryGap();
        int result = binaryGap.calculateBigZero(number);
        //Then
        assertEquals(2, result);
    }

    @Test
    public void test4() {
        //Given
        int number = 5;
        //When
        BinaryGap binaryGap = new BinaryGap();
        int result = binaryGap.calculateBigZero(number);
        //Then
        assertEquals(1, result);
    }


}
