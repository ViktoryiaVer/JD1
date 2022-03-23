package home_work_1;

import java.util.Scanner;
import static java.lang.Math.*;

public class MathMethods {
    public static void main(String[] args) {

        // Осуществляется и обрабатывается ввод чисел с клавиатуры
        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);
        int userNumber1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int userNumber2 = scanner.nextInt();

        // вычисляется сумма двух чисел и выводится в консоль
        int sum = addExact(userNumber1, userNumber2);
        System.out.println(userNumber1 + " + " + userNumber2 + " = "  + sum);

        // определяется максимальное число и выводится в консоль
        int max = max(userNumber1, userNumber2);
        System.out.println("Максимальное число  - " + max);

        // выполняется произведение двух чисел и выводится в консоль
        long product = multiplyExact(userNumber1, userNumber2);
        System.out.println(userNumber1 + " * " + userNumber2 + " = "  + product);

        // возведение первого числа в степень второго и вывод результата в консоль
        double power = pow(userNumber1, userNumber2);
        System.out.println(userNumber1 + " в степени " + userNumber2 + " = " + (int) power);

        // извлечение квадратного корня из первого числа
        double square = sqrt(userNumber1);

        // вывод результата с округлением
        System.out.println("Квадратный корень из " + userNumber1 + " с округлением = " + round(square));

        // получение рандомного числа от 0 до 20 и вывод его в консоль
        int randomNumber = (int) (Math.random () * 20);
        System.out.println("Смотрите, какое классное рандомное число от 0 до 20: " + randomNumber);
    }
}
