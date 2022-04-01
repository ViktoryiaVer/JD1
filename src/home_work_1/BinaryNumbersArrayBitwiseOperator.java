package home_work_1;

public class BinaryNumbersArrayBitwiseOperator {
    public static void main(String[] args) {
        byte userNumber = -15;
        // вызов метода и присваивание возвращаемого значения
        String binaryNumber = toBinaryString(userNumber);
        System.out.println(binaryNumber); // вывод результата в консоль
    }

    public static String toBinaryString (byte number) {
        byte numberPositive;

        // применение побитового оператора NOT для отрицательного числа (по сути, прибавление 1 к отрциательному числу
        // и перевод его в положительное число
        if(number < 0) {
            numberPositive = (byte) ~number;
        } else {
            numberPositive = number;
        }


        // положительное число делится 8 раз на 2, остаток добавляется в массив чисел
        // это первый этап преобразования числа из десятичной системы в двоичную
        byte [] numbers = new byte [8];

        for (int i = 0; i < numbers.length; i++) {
            byte remainder;
            remainder = (byte) (numberPositive % 2);
            numberPositive /= 2;
            numbers[i] = remainder;
        }

        // инвертирование массива чисел для обработки исходных отрицательных чисел
        if(number < 0) {
            for (int i = numbers.length -1; i >= 0; i--) {
                byte invertedNumber = (byte) ((numbers[i] == 1) ? 0 : 1);
                numbers[i] = invertedNumber; // на выходе из цикла получается массив интвертированных чисел, к которым
                // ранее была прибавлена 1
            }
        }
        // проход массива с конца и добавление каждого числа в строку, чтобы в итоге получить двоичное представление
        // исходного числа. это второй этап преобразования
        StringBuilder sb = new StringBuilder(); // создание нового объекта класса StringBuilder
        for (int i = numbers.length - 1; i >= 0; i--) {
            sb.append(numbers[i]);
        }
        return String.valueOf(sb); // возвращение строкового значения класса StringBuilder - двоичного представления исходного числа
    }
}
