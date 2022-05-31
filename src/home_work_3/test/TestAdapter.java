package home_work_3.test;

import home_work_3.calcs.adapter.CalculatorStringAdapter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TestAdapter {

    @ParameterizedTest
    @MethodSource("expressions")
    public void testExpressionCalc(String expression, double expected){
        CalculatorStringAdapter calc = new CalculatorStringAdapter();
        double calculate = calc.calculateString(expression);
        Assertions.assertEquals(expected, calculate);
    }

    static Stream<Arguments> expressions() {
        return Stream.of(
                arguments("1 + 2 + 3 - 1", 5),
                arguments("1 + 2 * 3", 7),
                arguments("(1 + 2) * 3", 9),
                arguments("(-1 - 2 ) * 3",-9),
                arguments("|-1 - 2| * 3", 9),
                arguments("4.1 + 15 * 7 + (28 / 5) ^ 2", 140.45999999999998),
                arguments("PI",3.141592653589793),
                arguments("pi",3.141592653589793),
                arguments("E",2.718281828459045),
                arguments("e",2.718281828459045)
        );
    }
}
