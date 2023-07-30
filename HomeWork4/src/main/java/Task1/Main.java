package Task1;

public class Main {
    public static void main(String[] args) {
        printElements(10);
        printElements("Hello world");
        printElements(5.9);

    }

    static <T> void printElements(T element) {
        System.out.println(element);
    }
}
