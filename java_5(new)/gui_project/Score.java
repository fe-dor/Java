package gui_project;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Score extends JFrame {
    private int milanScore = 0;
    private int madridScore = 0;
    private String ws = "";

    private JButton bMilan = new JButton("AC Milan");
    private JButton bMadrid = new JButton("Real Madrid");
    private JLabel result = new JLabel("Result: 0 X 0");
    private JLabel lastScorer = new JLabel("Last Scorer: N/A");
    private JLabel winner = new JLabel("Winner: DRAW");
    private Font fnt1 = new Font("Times new roman", Font.BOLD, 20);
    private Font fnt2 = new Font("Times new roman", Font.BOLD, 17);

    public static void main(String[] args) {
        new Score();
    }

    public Score() {
        setLayout(new BorderLayout());
        add(bMilan, BorderLayout.WEST);
        add(bMadrid, BorderLayout.EAST);
        add(result, BorderLayout.CENTER);
        add(lastScorer, BorderLayout.NORTH);
        add(winner, BorderLayout.SOUTH);

        result.setVerticalAlignment(JLabel.CENTER);
        result.setHorizontalAlignment(JLabel.CENTER);
        result.setFont(fnt1);
        lastScorer.setVerticalAlignment(JLabel.CENTER);
        lastScorer.setHorizontalAlignment(JLabel.CENTER);
        lastScorer.setFont(fnt2);
        winner.setVerticalAlignment(JLabel.CENTER);
        winner.setHorizontalAlignment(JLabel.CENTER);
        winner.setFont(fnt2);

        setSize(400,250);

        bMilan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                milanScore += 1;
                result.setText("Result: " + milanScore + " X " + madridScore);
                lastScorer.setText("Last Scorer: AC Milan");
                if (milanScore == madridScore) {
                    ws = "DRAW";
                } else if (milanScore > madridScore) {
                    ws = "AC Milan";
                } else {
                    ws = "Real Madrid";
                }
                winner.setText("Winner: " + ws);
            }
        });

        bMadrid.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae){
                madridScore+=1;
                result.setText("Result: " + milanScore + " X " + madridScore);
                lastScorer.setText("Last Scorer: Real Madrid");
                if (milanScore == madridScore){
                    ws = "DRAW";
                }
                else if (milanScore > madridScore){
                    ws = "AC Milan";
                }
                else {
                    ws = "Real Madrid";
                }
                winner.setText("Winner: " + ws);
            }
        });

        setVisible(true);
    }

}
