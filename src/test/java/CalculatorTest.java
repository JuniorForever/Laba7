import Runner.businessLogic.Calculator;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void integralCalculationNotRecursive() throws Exception {
            double actual = calculator.calculateIntegralNotRecursive(13, 10, 2);
            double expected = -1055.25;
            assertEquals(actual, expected, 0);
    }

    @Test
    public void integralCalculationRecursive() throws Exception {
            double actual = calculator.calculateIntegralRecursive(13, 10, 2);
            double expected = -1055.25;
            assertEquals(actual, expected, 0);
    }
}