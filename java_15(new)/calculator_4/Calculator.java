package calculator_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Calculator extends JFrame implements ActionListener {
    StringBuilder expression = new StringBuilder();
    JTextField outText;
    int position = 0;

    public static void main(String[] args) {
        new Calculator();
    }

    public Calculator(){
        super("Simple calculator");

        JPanel masterPanel = new JPanel();
        masterPanel.setLayout(new GridLayout(2, 1));

        //Панель вывода
        outText = new JTextField(16);
        outText.setEditable(false);

        //Кнопки
        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout(4,4));
        //Объявляем кнопки
        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bDot, bEquals, bPlus, bMinus, bMultiply, bDiv;
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

        buttons.add(b7);
        buttons.add(b8);
        buttons.add(b9);
        buttons.add(bDiv);
        buttons.add(b4);
        buttons.add(b5);
        buttons.add(b6);
        buttons.add(bMultiply);
        buttons.add(b1);
        buttons.add(b2);
        buttons.add(b3);
        buttons.add(bMinus);
        buttons.add(b0);
        buttons.add(bDot);
        buttons.add(bEquals);
        buttons.add(bPlus);

        masterPanel.add(outText);
        masterPanel.add(buttons);
        this.add(masterPanel);
        this.setSize(250, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if(s.charAt(0) == '='){
            List<String> operations = new ArrayList<>();
            List<Double> digits = new ArrayList<>();
            int length = expression.length();
            StringBuilder tempDouble = new StringBuilder();
            char tempChar;
            for(int i = 0; i < length; i++){
                tempChar = expression.charAt(i);
                if(tempChar <= '9' && tempChar >= '0' || tempChar == '.'){
                    while (tempChar <= '9' && tempChar >= '0' || tempChar == '.') {
                        tempDouble.append(tempChar);
                        i++;
                        if(i < length)
                            tempChar = expression.charAt(i);
                        else
                            break;
                    }
                    digits.add(Double.parseDouble(tempDouble.toString()));
                    tempDouble.delete(0, tempDouble.length());
                }
                if((tempChar == '+' || tempChar == '-' || tempChar == '*' || tempChar == '/') && digits.size() != 0){
                    tempChar = expression.charAt(i + 1);
                    if (tempChar <= '9' && tempChar >= '0' || tempChar == '.'){
                        operations.add(String.valueOf(expression.charAt(i)));
                    }
                }
            }
            length = operations.size();
            for(int i = 0; i < length; i++){
                switch (operations.get(i)){
                    case("+") -> digits.set(i + 1, digits.get(i) + digits.get(i + 1));
                    case("-") -> digits.set(i + 1, digits.get(i) - digits.get(i + 1));
                    case("*") -> digits.set(i + 1, digits.get(i) * digits.get(i + 1));
                    case("/") -> digits.set(i + 1, digits.get(i) / digits.get(i + 1));
                }
            }
            outText.setText(String.valueOf(digits.get(digits.size() - 1)));
            expression = new StringBuilder(String.valueOf(digits.get(digits.size() - 1)));
            return;
        }
        else {
            expression.append(s);
            outText.setText(expression.toString());
        }
    }
}
