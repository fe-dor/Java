package menu_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serial;

public class Program extends JFrame {

    public Program(){
        super("Системное меню");


        // Создание строки главного меню
        JMenuBar menuBar = new JMenuBar();
        // Добавление в главное меню выпадающих пунктов меню
        menuBar.add(createFileMenu());
        menuBar.add(createEditMenu());
        menuBar.add(createInfoMenu());
        // Подключаем меню к интерфейсу приложения
        setJMenuBar(menuBar);
        // Открытие окна

        JPanel masterPanel = new JPanel();
        masterPanel.setLayout(new GridLayout(2,1));
        masterPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

        JPanel textPanel = new JPanel();
        JTextField jta = new JTextField(10);
        textPanel.add(jta);
        masterPanel.add(textPanel);

        JPanel buttonsPanel = new JPanel();
        JButton button1 = new JButton("add");
        JButton button2 = new JButton("delete");
        buttonsPanel.add(button1);
        buttonsPanel.add(button2);
        masterPanel.add(buttonsPanel);

        add(masterPanel);

        setSize(300, 150);
        setVisible(true);


    }

    public static void main(String[] args) {
        new Program();
    }
    private JMenu createFileMenu()
    {
        // Создание выпадающего меню
        JMenu file = new JMenu("Файл");
        // Пункт меню "Сохранить"
        JMenuItem save = new JMenuItem("Сохранить");
        // Пункт меню из команды с выходом из программы
        JMenuItem exit = new JMenuItem(new ExitAction());
        // Добавим в меню пункта save
        file.add(save);
        // Добавление разделителя
        file.addSeparator();
        file.add(exit);

        save.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println ("-------Saved-------");
            }
        });
        return file;
    }

    private JMenu createEditMenu()
    {
        // создадим выпадающее меню
        JMenu editMenu = new JMenu("Правка");

        JMenuItem copy = new JMenuItem("Копировать");
        JMenuItem cutOut = new JMenuItem("Вырезать");
        JMenuItem insert = new JMenuItem("Вставить");

        editMenu.add(copy);
        editMenu.addSeparator();
        editMenu.add(cutOut);
        editMenu.addSeparator();
        editMenu.add(insert);

        copy.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println ("-------Copied-------");
            }
        });
        cutOut.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println ("-------Cut out-------");
            }
        });
        insert.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println ("-------Inserted-------");
            }
        });

        return editMenu;
    }

    private JMenu createInfoMenu()
    {
        // Создание выпадающего меню
        JMenu info = new JMenu("Информация");
        JMenuItem thisProgram = new JMenuItem("Справка");
        info.add(thisProgram);

        thisProgram.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(null, "This is the program with menu, two buttons and" +
                                " text input field.",
                        "Alert", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        return info;
    }

    static class ExitAction extends AbstractAction
    {
        @Serial
        private static final long serialVersionUID = 1L;
        ExitAction() {
            putValue(NAME, "Выход");
        }
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}
