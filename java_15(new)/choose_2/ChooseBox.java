package choose_2;

import javax.swing.*;
import java.awt.*;

public class ChooseBox extends JPanel{
    public ChooseBox(){
        String[] countries = {"Australia", "China", "England", "Russia"};
        String country = (String) JOptionPane.showInputDialog(null,
                "Pick the country you want", "Countries",
                JOptionPane.PLAIN_MESSAGE, null, countries, countries[0]);

        switch (country) {
            case ("Australia") -> JOptionPane.showMessageDialog(null, "Area : 7,692,024 km2; " +
                            "Population: 25,986,700; Capital: Sydney",
                    "Information", JOptionPane.INFORMATION_MESSAGE);
            case ("China") -> JOptionPane.showMessageDialog(null, "Area : 9,596,961 km2; " +
                            "Population: 1,410,539,758; Capital: Beijing",
                    "Information", JOptionPane.INFORMATION_MESSAGE);
            case ("England") -> JOptionPane.showMessageDialog(null, "Area : 130,279 km2; " +
                            "Population: 56,489,800; Capital: London",
                    "Information", JOptionPane.INFORMATION_MESSAGE);
            case ("Russia") -> JOptionPane.showMessageDialog(null, "Area : 17,098,246 km2; " +
                            "Population: 145,864,296; Capital: Moscow",
                    "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new ChooseBox());
    }
}
