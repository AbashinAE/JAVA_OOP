package Task3;

public class Main {
    public static void main(String[] args) {
        getMax(7, 10);
        getMax(8, 8);

        getMax(10.7, 7.10);

        getMax("пять", "четырнадцать");

    }

    static <T extends Comparable<T>> void getMax(T prm, T prm2) {
        if (prm.compareTo(prm2) > 0) {
            System.out.println(prm + "  >  " + prm2);

        }
        if (prm.compareTo(prm2) < 0) {
            System.out.println(prm2 + " > " + prm);
        }
        if (prm.compareTo(prm2) == 0) {
            System.out.println(prm + " = " + prm2 );
        }
    }
}
