package calculator;

import javax.swing.*;

public class View{
    private Gui gui;

    public void viewHistory(String history){
        gui.addHistory(history);
    }

    public void viewResult(double result){
        JOptionPane.showMessageDialog(null, "Result = " + result,
                "Alert", JOptionPane.INFORMATION_MESSAGE);
    }

    public void setGui(Gui gui) {
        this.gui = gui;
    }
}