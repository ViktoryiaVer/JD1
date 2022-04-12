package home_work_3.runners;

/**
 * в классе считается выражение без калькулятора (задание 1)
 */
public class WithoutCalculatorMain {

    public static void main(String[] args) {
        double doubleResult = 4.1 + 15 * 7 + Math.pow((28d / 5d),2); // 4.1 + 15 * 7 + (28 / 5) ^ 2 = 140.459
        System.out.println(doubleResult);
    }

}
