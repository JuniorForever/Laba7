import Runner.businessLogic.Calculator;
import Runner.exceptions.IntegralParametrsException;
import org.junit.Test;

public class IntegralParametrsExceptionTest {
    Calculator calculator = new Calculator();
    @Test(expected = IntegralParametrsException.class)
    public void integralParametrsExceptionTest() throws IntegralParametrsException{
        calculator.calculateIntegralRecursive(10,11,0);
    }
}