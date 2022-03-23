package home_work_1;

public class OperatorsPriority {
    public static void main(String[] args) {
        int a = 2, b = 8;
        int operation1 = 5 + 2 / 8; // operation1 = 5, порядок операций: 1. деление; 2. сложение
        System.out.println("5 + 2 / 8 = " + operation1);

        int operation2 = (5 + 2) / 8; // operation2 = 0, порядок операций: 1. сложение, 2. деление
        System.out.println("(5 + 2) / 8 = " + operation2);

        int operation3 = (5 + a++) / 8; // operation3 = 0, порядок операций: 1. постфиксный инкремент,
        // но используется исходное значение; 2. сложение; 3. деление
        System.out.println("(5 + 2++) / 8 = " + operation3);

        a = 2;
        int operation4 = (5 + a++) / --b; // operation4 = 1, порядок операций: 1. постфиксный инкремент,
        // но используется исходное значение; 2. сложение; 3. префиксный декремент; 4. деление
        System.out.println("(5 + 2++) / --8 = " + operation4);

        a = 2;
        b = 8;
        int operation5 = (5 * 2 >> a++) / --b; // operation5 = 0, порядок  операций: 1. постфиксный инкремент,
        // но используется исходное значение; 2. умножение; 3. сдвиг вправо; 4. префиксный декремент; 5. деление
        System.out.println("(5 * 2 >> 2++) / --8 = " + operation5);

        a = 2;
        b = 8;
        int operation6 = (5 + 7 > 12 ? 68 : 22 * 2 >> a++) / --b; // operation6 = 1, порядок операций: 1. постфиксный
        // инкремент, но используется исходное значение; 2. умножение; 3. сдвиг вправо; 4. сложение; 5. сравнение.
        // 6. тернарный оператор; 7. префиксный декремент; 8. деление
        System.out.println("(5 + 7 > 12 ? 68 : 22 * 2 >> 2++) / --8 = " +operation6);

        //  int operation7 = (5 + 7 > 12 ? 68 >= 68 : 22 * 2 >> a++) / --b; такой код не скомпилируется, так как
        // в тернарном операторе используется булевый и целочисленный тип данных, а результат присваивается int

        boolean operation8 = 6 - 2 > 3  && 12 * 12 <= 119; // operation8 = false, порядок операций: 1. умножение;
        //2. сложение; 3. сравнение слева; 4. сравнение справа; 5.  логическое  «и»; итог false, так как вторая часть false
        System.out.println("6 - 2 > 3  && 12 * 12 <= 119 = " + operation8);

        boolean operation9 = true && false; // operation9 = false, так как второй операнд - false
        System.out.println("true && false = " + operation9);
    }
}
