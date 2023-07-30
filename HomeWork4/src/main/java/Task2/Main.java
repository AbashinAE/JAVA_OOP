package Task2;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {9,7,2,1,5,0,4,6};
        String[] str = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница"};
        printArray(numbers);
        System.out.println(" ");
        printArray(str);

    }

    static <T> void printArray(T[] array) {
        for (T item: array
        ) {
            System.out.printf(item + " ");

        }
    }
}
