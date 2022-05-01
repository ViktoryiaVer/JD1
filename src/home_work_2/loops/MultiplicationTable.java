package home_work_2.loops;

public class MultiplicationTable {

    /**
     * распечатывает строку таблицы умножения
     * @param y число, с которого нужно умножать
     * @param z число по которое (включительно) нужно умножать
     */

    public static void printMultiplicationTableRow (int y, int z) {
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
