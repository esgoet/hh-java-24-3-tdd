import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTest {

    @Test
    public void fibonacciTest_when0_thenReturn1() {
        //GIVEN
        int num = 0;

        //WHEN
        int actual = Fibonacci.fibonacci(num);

        //THEN
        assertEquals(1,actual);
    }
}
