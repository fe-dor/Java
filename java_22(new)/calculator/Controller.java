package calculator;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void calculateExpression(String expression) throws WrongExpressionException {
        model.setExpression(expression);
        model.calculations();
        viewInficksForm();
        viewResult();
    }

    public void viewInficksForm() throws WrongExpressionException {
        view.viewHistory(model.getInficksForm());
    }

    public void viewResult() throws WrongExpressionException {
        view.viewResult(model.getResult());
    }
}
