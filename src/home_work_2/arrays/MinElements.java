package home_work_2.arrays;

import java.util.Objects;

/**
 * класс для возвращения значения из метода для нахождения двух минимальных элементво массива (решение задания 2.4.4)
 */
public class MinElements {
    private int first;
    private int second;

    public MinElements(int first, int second) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MinElements elements = (MinElements) o;
        return first == elements.first && second == elements.second;
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    @Override
    public String toString() {
        return "MinElements{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
