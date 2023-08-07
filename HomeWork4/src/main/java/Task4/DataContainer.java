package Task4;
import java.util.*;

public class DataContainer<T>  {

    private List<T> data; // Создаём поле - список с типом <T>

    DataContainer(ArrayList<T> data) {
        this.data = data;
    } // Конструктор для передачи значений

    T getValue(int index) {
        return data.get(index);
    } // Метод получения по индексу

    void addValue(T value) {
        data.add(value);
    } // Метод добавления значения

    void removeValue(T value) {
        data.remove(value);
    } // Метод удаления значения

    void sort(Comparator<T> comparator) { // Метод сортировки нашего датастора
        data.sort(comparator);
    }

    void printData () {                         // Метод Вывода на экран
        for (T value : data) {
            System.out.print(value + " ");}
    }

}