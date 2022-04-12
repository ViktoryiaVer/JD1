package home_work_3.calcs.api;

/**
 * интерфейс математических операций (задание 8)
 */
public interface ICalculator {

    double addNumbers(double firstNumber, double secondNumber);
    double subtractNumbers(double firstNumber, double secondNumber);
    double multiplyNumbers(double firstNumber, double secondNumber);
    double divideNumbers(double firstNumber, double secondNumber);
    double exponentiateNumbers(double firstNumber, int secondNumber);
    double getModulusOfNumber(double number);
    double calculateSqrt(double x);

}
