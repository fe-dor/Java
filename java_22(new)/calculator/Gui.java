package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame implements ActionListener {
    StringBuilder expression = new StringBuilder();
    JTextField outText;
    JTextArea historyText;
    Controller controller;

    public Gui(Controller controller){
        super("Simple calculator");
        this.controller = controller;

        JPanel masterPanel = new JPanel();
        masterPanel.setLayout(new GridLayout(1, 2));

        JPanel outAndButtons = new JPanel();
        outAndButtons.setLayout(new GridLayout(2, 1));

        //Панель вывода
        outText = new JTextField(32);
        outText.setEditable(false);

        //Кнопки
        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout(5,1));
        JPanel row1 = new JPanel();
        row1.setLayout(new GridLayout(1,4));
        JPanel row2 = new JPanel();
        row2.setLayout(new GridLayout(1,4));
        JPanel row3 = new JPanel();
        row3.setLayout(new GridLayout(1,4));
        JPanel row4 = new JPanel();
        row4.setLayout(new GridLayout(1,4));
        JPanel row5 = new JPanel();
        //Объявляем кнопки
        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bDot, bEquals, bPlus, bMinus, bMultiply, bDiv, bSpace;
        //Инициализируем кнопки
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bDot = new JButton(".");
        bEquals = new JButton("=");
        bPlus = new JButton("+");
        bMinus = new JButton("-");
        bMultiply = new JButton("*");
        bDiv = new JButton("/");
        bSpace = new JButton("Space");

        b9.addActionListener(this);
        b8.addActionListener(this);
        b7.addActionListener(this);
        b6.addActionListener(this);
        b5.addActionListener(this);
        b4.addActionListener(this);
        b3.addActionListener(this);
        b2.addActionListener(this);
        b1.addActionListener(this);
        b0.addActionListener(this);
        bDot.addActionListener(this);
        bEquals.addActionListener(this);
        bPlus.addActionListener(this);
        bMinus.addActionListener(this);
        bMultiply.addActionListener(this);
        bDiv.addActionListener(this);
        bSpace.addActionListener(this);

        row1.add(b7);
        row1.add(b8);
        row1.add(b9);
        row1.add(bDiv);
        row2.add(b4);
        row2.add(b5);
        row2.add(b6);
        row2.add(bMultiply);
        row3.add(b1);
        row3.add(b2);
        row3.add(b3);
        row3.add(bMinus);
        row4.add(b0);
        row4.add(bDot);
        row4.add(bEquals);
        row4.add(bPlus);

        buttons.add(row1);
        buttons.add(row2);
        buttons.add(row3);
        buttons.add(row4);
        buttons.add(bSpace);

        //Панель история операций
        historyText = new JTextArea();
        historyText.setEditable(false);

        outAndButtons.add(outText);
        outAndButtons.add(buttons);
        masterPanel.add(outAndButtons);
        masterPanel.add(historyText);
        this.add(masterPanel);
        this.setSize(500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if(s.equals("Space"))
            s = " ";
        if(s.charAt(0) == '='){
            try {
                controller.calculateExpression(expression.toString());
            } catch (WrongExpressionException ex) {
                JOptionPane.showMessageDialog(null, "Error: wrong operation",
                        "Alert", JOptionPane.INFORMATION_MESSAGE);
            } finally {
                outText.setText("");
                expression.delete(0, expression.length());
            }
        }
        else {
            expression.append(s);
            outText.setText(expression.toString());
        }
    }

    public void addHistory(String expression){
        if(historyText.getText().isEmpty())
            historyText.setText(expression + "\n**********************\n");
        else
            historyText.setText(historyText.getText() + expression + "\n**********************\n");
    }
}
