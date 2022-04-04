package home_work_2.arrays;

/**
 * класс для возвращения значения из метода для нахождения двух минимальных элементво массива (решение задания 2.4.4)
 */
public class MinElements {
    private int first;
    private int second;

    MinElements(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
