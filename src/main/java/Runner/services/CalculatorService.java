package Runner.services;

import Runner.Runner;
import Runner.businessLogic.Calculator;
import Runner.exceptions.IntegralParametrsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import Runner.IntegralParameters;

@RestController
public class CalculatorService {

    @Autowired
    Calculator calculator;

    @GetMapping(path = "/calculate-integral-not-recursive", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public double calculateIntegralNotRecursive(@RequestBody IntegralParameters integralParameters) throws IntegralParametrsException {
        return calculator.calculateIntegralNotRecursive(
                integralParameters.getUpperIntegralBound(),
                integralParameters.getLowerIntegralBound(),
                integralParameters.getAccuracy());
    }

    @GetMapping(path = "/calculate-integral-recursive", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public double calculateIntegralRecursive(@RequestBody IntegralParameters integralParameters) throws IntegralParametrsException {
        return calculator.calculateIntegralNotRecursive(
                integralParameters.getUpperIntegralBound(),
                integralParameters.getLowerIntegralBound(),
                integralParameters.getAccuracy());
    }

}
