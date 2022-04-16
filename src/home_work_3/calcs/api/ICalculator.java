package home_work_3.calcs.api;

/**
 * интерфейс математических операций (задание 8)
 */
public interface ICalculator {

    double add(double a, double b);
    double subtract(double a, double b);
    double multiply(double a, double b);
    double divide(double a, double b);

    double pow(double a, int b);
    double abs(double x);
    double sqrt(double x);

}
