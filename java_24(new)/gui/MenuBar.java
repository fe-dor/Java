package gui;

import create.ICreateDocument;
import document.IDocument;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBar extends JFrame {
    private ICreateDocument createDocument;
    private IDocument document;
    private int id = 0;
    public MenuBar(ICreateDocument createDocument) throws HeadlessException {
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(file());
        setJMenuBar(menuBar);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setVisible(true);
        this.createDocument = createDocument;
    }

    private JMenu file() {
        JMenu file = new JMenu("File");
        JMenuItem createNew = new JMenuItem("New");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");
        file.add(createNew);
        file.addSeparator();
        file.add(open);
        file.addSeparator();
        file.add(save);
        file.addSeparator();
        file.add(exit);

        createNew.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                document = createDocument.createNew(""+ id++);
                document.out();
            }
        });

        open.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                document = createDocument.createOpen();
            }
        });

        save.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                document.save();
            }
        });

        exit.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                System.exit(0);
            }
        });

        return file;
    }
}
