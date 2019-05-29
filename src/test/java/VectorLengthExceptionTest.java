import Runner.exceptions.VectorLengthException;
import Runner.businessLogic.VectorMultiplier;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class VectorLengthExceptionTest {
    VectorMultiplier vectorMultiplier = new VectorMultiplier();
    ArrayList<Integer> vec1 = new ArrayList<>(
            Arrays.asList(1, 2, 3,5));
    ArrayList<Integer> vec2 = new ArrayList<>(
            Arrays.asList(3, 4, 5));
    @Test(expected = VectorLengthException.class)
    public void vectorLengthExceptionTest() throws VectorLengthException {
        vectorMultiplier.recursiveVectorMultiply(vec1,vec2);
    }
}