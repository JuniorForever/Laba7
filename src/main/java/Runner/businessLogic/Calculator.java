package Runner.businessLogic;
import Runner.exceptions.IntegralParametrsException;
import org.springframework.stereotype.Component;

import java.util.stream.IntStream;

@Component
public class Calculator {
    private int upperIntegralBound, lowerIntegralBound, accuracy = 1;
    private double y;
    private double dy;

    public double f(double x) {
        return (-3 * x * x + 2 * x + 9);
    }

    public double i(double a, double b, int n, double y) {
        return ((b - a) / (2 * n) * y);
    }

    public double calculateIntegralNotRecursive(int a, int b, int n) throws IntegralParametrsException {
        if (a < b || n < 1) {
            throw new IntegralParametrsException("Не правильно введены параметры интегрирования");
        }
        upperIntegralBound = a;
        lowerIntegralBound = b;
        accuracy = n;
        y = f(lowerIntegralBound) + f(upperIntegralBound);
        dy = (upperIntegralBound - lowerIntegralBound) / n;
        IntStream.range(0, n - 1).forEach(value -> y += 2 * (f(lowerIntegralBound + dy * --accuracy)));
        return i(b, a, n, y);
    }

    public double calculateIntegralRecursive(int a, int b, int n) throws IntegralParametrsException {
        if (a < b || n < 1) {
            throw new IntegralParametrsException("Не правильно введены параметры интегрирования");
        }
        upperIntegralBound = a;
        lowerIntegralBound = b;
        dy = (upperIntegralBound - lowerIntegralBound) / n;
        if (accuracy == 1) {
            y = f(lowerIntegralBound) + f(upperIntegralBound);
        }
        if (accuracy == n) {
            return i(b, a, n, y);
        } else {
            y += 2 * (f(lowerIntegralBound + dy * accuracy));
            accuracy++;
            return calculateIntegralRecursive(a, b, n);
        }
    }
}



