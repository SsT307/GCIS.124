/* ---------------------------------- JUNIT --------------------------------- */
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FirstClassTest {
    @Test
    public void testPositiveCalculator()
    {
        // setup
        int num1 = 2;
        int num2 = 6;

        // invoke
        double expected = 5.0;
        double actual = FirstClass.calculate(num1, num2); // didnt have to connect using an object because static is used in the function

        // analyze
        assertEquals(expected, actual, 0.001); // 0.001 is the tolerance amount

    }

    public void testBothNegativeCalculator()
    {
        // setup
        int num1 = -2;
        int num2 = -6;

        // invoke
        double expected = 5.0;
        double actual = FirstClass.calculate(num1, num2);

        // analyze
        assertEquals(expected, actual, 0.001);
    }
    
    public void testOneNegativeCalculator()
    {
        // setup
        int num1 = 2;
        int num2 = -6;

        // invoke
        double expected = -5.0;
        double actual = FirstClass.calculate(num1, num2);

        // analyze
        assertEquals(expected, actual, 0.001);
    }

    public void testZeroCalculator()
    {
        // setup
        int num1 = 0;
        int num2 = 6;

        // invoke
        double expected = 0;
        double actual = FirstClass.calculate(num1, num2);

        // analyze
        assertEquals(expected, actual, 0.001);
    }

}
