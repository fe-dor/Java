package sorting_student_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabClassUI extends JFrame {
    LabClassUI(LabClass ssGPA){
        setLayout(new GridLayout(3,1));
        JPanel sortsPanel = new JPanel();
        JPanel findPanel = new JPanel();
        JPanel outPanel = new JPanel();
        JButton quickSort = new JButton("Быстрая сортировка");
        JButton mergeSort = new JButton("Сортировка слиянием");
        JButton out = new JButton("Вывести массив студентов");
        JTextField jtf = new JTextField(16);
        JButton find = new JButton("Поиск");
        sortsPanel.add(quickSort);
        sortsPanel.add(mergeSort);
        outPanel.add(out);
        findPanel.add(jtf);
        findPanel.add(find);
        add(sortsPanel);
        add(outPanel);
        add(findPanel);


        setSize(500, 150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        quickSort.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println ("-------Quick sort-------");
                ssGPA.quickSort(ssGPA.getStudents(), 0, ssGPA.getStudents().length - 1, 0);
                JOptionPane.showMessageDialog(null, ssGPA.outArrayString(ssGPA.getStudents()),
                        "Array", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        mergeSort.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println ("-------Merge sort-------");
                ssGPA.mergeSort(ssGPA.getStudents(), 0);
                JOptionPane.showMessageDialog(null, ssGPA.outArrayString(ssGPA.getStudents()),
                        "Array", JOptionPane.INFORMATION_MESSAGE);
            }
        });
        find.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println ("-------Find user-------");
                try {
                    Student tempStudent = ssGPA.find(jtf.getText());
                    JOptionPane.showMessageDialog(null, tempStudent.toString(),
                            "Array", JOptionPane.INFORMATION_MESSAGE);
                } catch (StudentNotFoundException | EmptyStringException e) {
                    e.printStackTrace();
                }

            }
        });
        out.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.out.println ("-------Out array-------");
                JOptionPane.showMessageDialog(null, ssGPA.outArrayString(ssGPA.getStudents()),
                        "Array", JOptionPane.INFORMATION_MESSAGE);
            }
        });

    }
}
