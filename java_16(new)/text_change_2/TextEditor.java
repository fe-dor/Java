package text_change_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditor extends JFrame {
    private JTextArea jta = new JTextArea();
    private Font default_font = new Font("Verdana", Font.PLAIN, 16);
    private Font tnr = new Font("Times New Roman", Font.PLAIN, 16);
    private Font ss = new Font("MS Sans Serif", Font.PLAIN, 16);
    private Font cn = new Font("Courier New", Font.PLAIN, 16);

    TextEditor(){
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(changeColor());
        menuBar.add(changeFont());
        setJMenuBar(menuBar);

        setLayout(new GridLayout(3,1));
        add(new JPanel());
        JPanel masterPanel = new JPanel();
        jta.setFont(default_font);
        add(jta);
        add(new JPanel());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TextEditor();
    }

    private JMenu changeColor() {
        JMenu colorMenu = new JMenu("Цвет");

        JMenuItem blue = new JMenuItem("Синий");
        JMenuItem red = new JMenuItem("Красный");
        JMenuItem black = new JMenuItem("Черный");

        colorMenu.add(blue);
        colorMenu.addSeparator();
        colorMenu.add(red);
        colorMenu.addSeparator();
        colorMenu.add(black);

        blue.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                jta.setForeground(Color.BLUE);
                System.out.println ("-------Color changed on blue-------");
            }
        });
        red.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                jta.setForeground(Color.RED);
                System.out.println ("-------Color changed on red-------");
            }
        });
        black.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                jta.setForeground(Color.BLACK);
                System.out.println ("-------Color changed on black-------");
            }
        });

        return colorMenu;
    }

    private JMenu changeFont() {
        JMenu fontMenu = new JMenu("Шрифт");

        JMenuItem times_new_roman = new JMenuItem("Times New Roman");
        JMenuItem sans_serif = new JMenuItem("MS Sans Serif");
        JMenuItem courier_new = new JMenuItem("Courier New");

        fontMenu.add(times_new_roman);
        fontMenu.addSeparator();
        fontMenu.add(sans_serif);
        fontMenu.addSeparator();
        fontMenu.add(courier_new);

        times_new_roman.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                jta.setFont(tnr);
                System.out.println ("-------Font changed on Times New Roman-------");
            }
        });
        sans_serif.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                jta.setFont(ss);
                System.out.println ("-------Font changed on MS Sans Serif-------");
            }
        });
        courier_new.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                jta.setFont(cn);
                System.out.println ("-------Font changed on Courier New-------");
            }
        });

        return fontMenu;
    }
}
