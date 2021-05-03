package fibonachi;

import java.util.ArrayList;
import java.util.List;

public class FibonacciCalculator {

    public static int calculate(int number) {
        if (number > 2) {
            int result = calculate(number - 2) + calculate(number - 1);
            return result;
        } else {
            return 1;
        }
    }

    public static void printListOfFibonacciNumbers(int number) {
        List<Integer> numbers = new ArrayList<>();
        int firstNumber = 1;
        int secondNumber = 1;
        numbers.add(1);
        numbers.add(1);
        for (int i = 3; i <= number; i++) {
            if (firstNumber >= secondNumber) {
                secondNumber = firstNumber + secondNumber;
                numbers.add(secondNumber);
            } else {
                firstNumber = firstNumber + secondNumber;
                numbers.add(firstNumber);
            }
        }
        numbers.stream()
                .forEach(System.out::println);
    }

    public static void printTask(int number) {
        for (int i = 1; i <= number ; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("AB");
            } else if (i % 5 == 0) {
                System.out.println("B");
            } else if (i % 3 == 0) {
                System.out.println("A");
            } else {
                System.out.println(i);
            }
        }
    }

}
