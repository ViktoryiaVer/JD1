package home_work_2.loops;

/**
 * в классе решается задание по вычислению факториала 1.1
 */
public class FactorialOnlyCycle {
    public static void main(String[] args) {
        long userNumber = Long.parseLong(args[0]);

        //создание булевых перемнных для последующих проверок
        boolean isPositiveNumber = userNumber > 0;
        boolean isDataTypeOverFlowed = false;

        long factorial = 1;
        StringBuilder resultString = new StringBuilder();

        // обработка ввода не положительного аргумента
        if(!isPositiveNumber) {
            System.out.println("Вы ввели не положительное число. Передайте в консоль положительное число.");
        } else {

            // последовательное умножение i на i++ до тех пор, пока i не станет больше введенного аргумента
            for(int i = 1; i <= userNumber; i++) {
                factorial *= i;

                // обработка переполнения типа long: когда происходит переполнение, изначально положительное число становится не положительным
                if(factorial <= 0) {
                    System.out.println("Переполнение типа long.\nЧтобы избежать переполнения, передайте в консоль число <= 20");
                    isDataTypeOverFlowed = true;
                    break;
                }
                // запись хода решения в переменную String: * добавляется только тогда, когда цифра не последняя
                if(i != userNumber) {
                    resultString.append(i).append(" * ");
                } else {
                    resultString.append(i);
                }
            }

            // печать итогового результата происходит только в том случае, если не было переполнения
            if(!isDataTypeOverFlowed) {
                System.out.println(resultString + " = " + factorial);
            }
        }
    }
}
