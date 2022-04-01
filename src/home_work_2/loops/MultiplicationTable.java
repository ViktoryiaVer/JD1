package home_work_2.loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("\n                           ТАБЛИЦА УМНОЖЕНИЯ\n");
        // вызов метода печати дважды с разными числами, чтобы по отдельности вывести две строки таблицы
        printMultiplicationTableRow( 2, 5);
        System.out.println(); // пустая строка между блоками
        printMultiplicationTableRow(6, 9 );
        System.out.println("\nЭТО\nНУЖНО             \nЗНАТЬ!");
    }

    /**
     * распечатывает строку таблицы умножения
     * @param y число, с которого нужно умножать
     * @param z число по которое (включительно) нужно умножать
     */

    public static void printMultiplicationTableRow ( int y, int z) {
        for(int i = 1; i<=10; i++) {
            for(int j = y; j<=z; j++ ) {
                int result = j * i;
                String stringResult = String.format("%2d * %2d = %2d", j, i, result);

                System.out.printf("%-20s", stringResult);
            }
            System.out.println();
        }
    }
}
