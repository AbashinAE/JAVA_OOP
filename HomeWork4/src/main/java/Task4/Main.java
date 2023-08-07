package Task4;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        DataContainer<String> stringdatacontainer = new DataContainer<>(new ArrayList<>()); // Создаем экземпляр
        stringdatacontainer.addValue("C"); // Добавляем значение
        stringdatacontainer.addValue("OO");
        stringdatacontainer.addValue("OOO");
        stringdatacontainer.addValue("OOOO");
        stringdatacontainer.addValue("OOOOL");
        System.out.println(stringdatacontainer.getValue(0)); // Реализация метода получения значения по индексу
        stringdatacontainer.printData(); // Реализация метода вывода массива на экран
        System.out.println();
        stringdatacontainer.sort((str1,str2) -> str2.compareTo(str1)); // Сортировка в обратном порядке
        stringdatacontainer.printData();

    }
}