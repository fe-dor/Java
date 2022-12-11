package guessing_game_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessingGame extends JFrame implements ActionListener {
    private JPanel masterPanel = new JPanel();
    private JTextField jta = new JTextField(10);
    private JButton button = new JButton("Try your luck!");
    private Font fnt = new Font("Times new roman",Font.BOLD,20);
    private int number;
    private Random random = new Random();
    private int counter = 0;
    private boolean close = false;

    GuessingGame(){
        super("Try to guess number in range [0,20]");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        number = random.nextInt(21);
        button.addActionListener(this);
        masterPanel.add(jta);
        masterPanel.add(button);
        add(masterPanel);
        setSize(500, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GuessingGame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int value = Integer.parseInt(jta.getText().trim());
        if(value == number){
            JOptionPane.showMessageDialog(null, "Congratulations! You're right!",
                    "Alert", JOptionPane.INFORMATION_MESSAGE);
            close = true;
        }
        if(value > number){
            JOptionPane.showMessageDialog(null, "Your number is greater!",
                    "Alert", JOptionPane.INFORMATION_MESSAGE);
        }
        if(value < number){
            JOptionPane.showMessageDialog(null, "Your number is less!",
                    "Alert", JOptionPane.INFORMATION_MESSAGE);
        }
        counter++;
        if(counter == 3){
            close = true;
        }
        if(close){
            this.setVisible(false);
            System.exit(0);
        }
    }

    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}
