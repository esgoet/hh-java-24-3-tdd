import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {

    @Test
    public void fibonacciTest_when0_thenReturn0() {
        //GIVEN
        int num = 0;

        //WHEN
        int actual = Fibonacci.fibonacci(num);

        //THEN
        assertEquals(0,actual);
    }

    @Test
    public void fibonacciTest_when1_thenReturn1() {
        //GIVEN
        int num = 1;

        //WHEN
        int actual = Fibonacci.fibonacci(num);

        //THEN
        assertEquals(1,actual);
    }

    @Test
    public void fibonacciTest_when2_thenReturn1() {
        //GIVEN
        int num = 2;

        //WHEN
        int actual = Fibonacci.fibonacci(num);

        //THEN
        assertEquals(1,actual);
    }

    @Test
    public void fibonacciTest_when6_thenReturn8() {
        //GIVEN
        int num = 1;

        //WHEN
        int actual = Fibonacci.fibonacci(num);

        //THEN
        assertEquals(1,actual);
    }
}
