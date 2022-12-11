package guessing_game_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Areas extends JFrame implements MouseListener {


    Areas(){
        setSize(500, 500);
        setVisible(true);
        setLayout(new GridLayout(3,3));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Button jtn = new Button("North");
        Button jtw = new Button("West");
        Button jtc = new Button("Center");
        Button jte = new Button("East");
        Button jts = new Button("South");
        jtn.addMouseListener(this);
        jtw.addMouseListener(this);
        jtc.addMouseListener(this);
        jte.addMouseListener(this);
        jts.addMouseListener(this);

        adder(new JPanel());
        adder(jtn);
        adder(new JPanel());
        adder(jtw);
        adder(jtc);
        adder(jte);
        adder(new JPanel());
        adder(jts);
        adder(new JPanel());
    }

    public static void main(String[] args) {
        new Areas();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        String s = e.getComponent().getAccessibleContext().getAccessibleName();
        System.out.println(s);
        switch (s){
            case ("North") -> JOptionPane.showMessageDialog(null, "Добро пожаловать в САО",
                    "Information", JOptionPane.INFORMATION_MESSAGE);
            case ("West") -> JOptionPane.showMessageDialog(null, "Добро пожаловать в ЗАО",
                    "Information", JOptionPane.INFORMATION_MESSAGE);
            case ("Center") -> JOptionPane.showMessageDialog(null, "Добро пожаловать в ЦАО",
                    "Information", JOptionPane.INFORMATION_MESSAGE);
            case ("East") -> JOptionPane.showMessageDialog(null, "Добро пожаловать в ВАО",
                    "Information", JOptionPane.INFORMATION_MESSAGE);
            case ("South") -> JOptionPane.showMessageDialog(null, "Добро пожаловать в ЮАО",
                    "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public void adder(Component component){
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3));
        for(int i = 0 ; i < 8; i++){
            if(i == 4)
                panel.add(component, CENTER_ALIGNMENT);
            panel.add(new JPanel());
        }
        add(panel);
    }
}
