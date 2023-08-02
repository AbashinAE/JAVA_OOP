package Task1;

public class CalcPresenter {

    private CalcModel model;
    private CalcView view;

    public CalcPresenter(CalcModel model, CalcView view) {
        this.model = model;
        this.view = view;
    }

    public void onAddButtonClicked() {
        double value1 = view.userInput();
        double value2 = view.userInput();

        char operation = view.chooseOperation();

        switch (operation) {
            case '+':
                model.sum(value1, value2);
                break;
            case '-':
                model.sub(value1, value2);
                break;
            case '*':
                model.mul(value1, value2);
                break;
            case '/':
                model.div(value1, value2);
                break;
            default:
                System.out.println("Введена неверная операция");
                break;

        }
        double result = model.getResult();
        view.showOutput(result);

    }

}
