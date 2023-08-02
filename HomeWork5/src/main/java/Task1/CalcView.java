package Task1;

import java.util.Scanner;

public class CalcView {
    Scanner in = new Scanner(System.in);

    public double userInput() {
        System.out.print("Введите число: ");
        return in.nextDouble();
    }

    public void showOutput(double value) {
        System.out.printf("Результат: " + "%.2f",value);
    }

    public char chooseOperation() {
        System.out.print("Введите операцию (+, -, / *): ");
        return in.next().charAt(0);
    }
}