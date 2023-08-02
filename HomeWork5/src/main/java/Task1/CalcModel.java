package Task1;

public class CalcModel {

    private double result;


    public double sum(double value1, double value2) {
        result = value1 + value2;
        return result;
    }

    public double div(double value1, double value2) {
        if (value2 != 0) {
            result = value1 / value2;
        } else {
            throw new IllegalArgumentException("Деление на ноль недопустимо.");
        }
        return result;
    }

    public double mul(double value1, double value2) {
        result =  value1 * value2;
        return result;
    }
    public double sub(double value1, double value2) {
       result = value1 - value2;
       return result;
    }
    public double getResult() {
        return result;
    }
}