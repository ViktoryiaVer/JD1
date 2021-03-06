package home_work_4;

import home_work_4.comparator.ComparableComparator;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;


/**
 * класс-контейнер для хранения данных обобщенного типа и операций с ними
 * @param <T> обобщенный тип
 */
public class DataContainer <T> implements Iterable<T>{
    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    /**
     * геттер для поля data
     * @return поле data
     */
    public T[] getItems() {
        return this.data;
    }

    /**
     * получает элемент из поля data по его индексу
     * @param index индекс, по которому нужно получить объект
     * @return объект типа T
     */
    public T get(int index) {
        if(index >= this.data.length || index < 0) {
            return null;
        }
        return data[index];
    }

    /**
     * добавляет данные во внутреннее поле data
     * @param item объект типа T, который необходимо добавить
     * @return номер позиции, в которую были вставлены данные, начиная с 0
     */
    public int add(T item){
        if(item == null) {
            return -1;
        }
        for (int i = 0; i < this.data.length; i++) {
            if (data[i] == null) {
                data[i] = item;
                return i;
            }
        }

        if(this.data.length == 0 || this.data[this.data.length - 1] != null) {
            this.data = Arrays.copyOf(this.data, this.data.length + 1);
            this.data[this.data.length - 1] = item;
            return this.data.length -1;
        }

        return -1;
    }

    /**
     * удаляет элемент из поля data по его индексу
     * @param index индекс того элемента, который нужно удалить
     * @return true, если элемент был удален, false, если такого индекса нет, и, соответственно, элемент не был удален
     */
    public boolean delete(int index) {
        if(index >= this.data.length || index < 0) {
            return false;
        }

        for(int i = index; i < this.data.length-1; i++) {
            this.data[i] = this.data[i+1];
        }
        this.data = Arrays.copyOf(this.data, this.data.length - 1);
        return true;
    }

    /**
     * удаляет элемент из поля data
     * @param item элемент, который необходимо удалить
     * @return true, если элемент был удален, false, если такого элемента нет, и, соответственно, он не был удален
     */
    public boolean delete(T item) {
        if(item == null){
            return false;
        }
        for (int i = 0; i < this.data.length; i++) {
            if(this.data[i].equals(item)) {
               return delete(i);
            }
        }
        return false;
    }

    /**
     * сортирует данные в поле data, используя реализацию сравнения из переданного объекта Comparator
     * @param comparator компаратор для сравнения элементов поля data
     */
    public void sort(Comparator<T> comparator) {
        sort(this, comparator);
    }

    /**
     * сортирует элементы в переданном объекте DataContainer<T>, используя реализацию сравнения, вызываемую у хранимых объектов
     * @param container объект DataContainer, элементы в котором необходимо отсортировать
     * @param <T> обобщенный тип параметра container, связанный с интерфейсом Comparable
     */
    public static <T extends Comparable<T>> void sort(DataContainer <T> container) {
        sort(container, new ComparableComparator<>());
    }


    /**
     * сортирует элементы в переданном объекте DataContainer<T>, используя реализацию сравнения из переданнгго объекта интерфейса Comparator
     * @param container объект DataContainer, элементы которого необходимо отсортировать
     * @param comparator объекта интерфейса Comparator с реализацией сравнения
     * @param <T> обобщенный тип параметров container и comparator
     */
    public static <T> void sort(DataContainer <T> container, Comparator <T> comparator) {
        for(int i = 0; i < container.data.length-1; i++) {
            boolean wasSwap = false;
            for(int j = 0; j < container.data.length-1; j++) {
                if(comparator.compare(container.data[j], container.data[j+1]) > 0) {
                    T temp = container.get(j);
                    container.data[j] = container.data[j+1];
                    container.data[j+1] = temp;
                    wasSwap = true;
                }
            }
            if(!wasSwap) {
                break;
            }
        }
    }

    /**
     * выводит содержимое data без ячеек, в которых хранится null
     * @return элементы с содержимым поля data без ячеек с null в виде строки
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        boolean isCommaNeeded = false;
        for (T item : this.data) {
            if (item != null) {
                if (isCommaNeeded) {
                    sb.append(", ");
                } else {
                    isCommaNeeded = true;
                }
                sb.append(item);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * сравнивает объект DataContainer <T> с другим объектом
     * @param o объект, с которым сравнивается текущий объект
     * @return true, если объекты равны, false, если объекты не равны
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataContainer<?> that = (DataContainer<?>) o;
        return Arrays.equals(data, that.data);
    }

    /**
     * получает хэшкод объекта DataContainer <T> (на основе поля data)
     * @return хэшкод объекта DataContainer <T> (на основе поля data)
     */
    @Override
    public int hashCode() {
        return Arrays.hashCode(data);
    }

    @NotNull
    @Override
    public Iterator<T> iterator() {
        return new DataContainerIterator();
    }

    /**
     * внутренний класс с реализацией интерфейса Iterator для итерирования элементов поля data
     */
    class DataContainerIterator implements Iterator<T>{
        T current;
        int index;

        public DataContainerIterator() {
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return get(index) != null;
        }

        @Override
        public T next() {
            current = get(this.index);
            this.index++;
            return current;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Эта операция не поддерживается.");
        }
    }
}
