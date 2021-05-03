package fibonachi;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciCalculatorTest {

    @Test
    public void shouldCalculate() {
        //Give
        //When
        int result1 = FibonacciCalculator.calculate(6);
        int result2 = FibonacciCalculator.calculate(10);
        int result3 = FibonacciCalculator.calculate(1);
        int result4 = FibonacciCalculator.calculate(2);
        FibonacciCalculator.printTask(15);
        //Then
        assertEquals(result3, 1);
        assertEquals(result4, 1);
        assertEquals(result1, 8);
        assertEquals(result2, 55);

    }

}
