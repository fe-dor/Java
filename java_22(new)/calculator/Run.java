package calculator;

public class Run {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        Gui gui = new Gui(controller);
        view.setGui(gui);
    }
}
