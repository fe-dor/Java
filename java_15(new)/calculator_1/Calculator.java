package calculator_1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Calculator extends JFrame{
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton button = new JButton(" Add them up");
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    //начало конструктора класса LabExample
    Calculator(String operation){
        super("Example");
        setLayout(new FlowLayout());
        setSize(250,150);
        setLocationRelativeTo(null);
        // создаем надпись 1
        add(new JLabel("1st Number"));
        // добавляем текстовое поле jta1
        add(jta1);
        // создаем надпись 2
        add(new JLabel("2nd Number"));
        // добавляем текстовое поле jta2
        add(jta2);
        // добавляем кнопку
        add(button);
        //добавляем слушателя к кнопке

        button.addActionListener(new ActionListener(){
            // добавляем реализацию actionPerformed
            public void actionPerformed(ActionEvent ae){
                try{
                    //переменная для хранения ввода в текстовое поле 1
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    //переменная для хранения ввода в текстовое поле 2
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    //создаем всплывающее окно INFORMATION_MESSAGE
                    switch (operation) {
                        case ("+") -> JOptionPane.showMessageDialog(null, "Result = " + (x1 + x2),
                                "Alert", JOptionPane.INFORMATION_MESSAGE);
                        case ("-") -> JOptionPane.showMessageDialog(null, "Result = " + (x1 - x2),
                                "Alert", JOptionPane.INFORMATION_MESSAGE);
                        case ("*") -> JOptionPane.showMessageDialog(null, "Result = " + (x1 * x2),
                                "Alert", JOptionPane.INFORMATION_MESSAGE);
                        case ("/") -> JOptionPane.showMessageDialog(null, "Result = " + (x1 / x2),
                                "Alert", JOptionPane.INFORMATION_MESSAGE);
                    }
                }catch(Exception e){
                    //создаем всплывающее окно ERROR_MESSAGE
                    JOptionPane.showMessageDialog( null, "Error in Numbers !","alert" ,
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });// конец button.addActionListener()
        setVisible(true);
    } // конец конструктора
public static void main(String[]args){
    String operations[] = {"+", "-", "*", "/"};
    String operation = (String) JOptionPane.showInputDialog(null,
            "Pick the operation you want", "calculator_1.Calculator",
            JOptionPane.PLAIN_MESSAGE, null, operations, operations[0]);
    new Calculator(operation);
} // конец main()
} // конец класса LabExample
