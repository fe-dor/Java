package image_console_2;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class ImageOut extends JPanel {
    private Image img = null;

    public ImageOut(String path){
        img = new ImageIcon("src/image_console_2/"+path).getImage();
    }

    public void paint(Graphics g){
        g.drawImage(img, 0, 0, null);
    }
    public static void main(String[] args) {

        JFrame fr = new JFrame("Image");
        fr.setSize(1900, 1000);
        String path = input();
        fr.add(new ImageOut(path));
        fr.setVisible(true);
    }

    public static String input(){
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        sc.close();
        return path;
    }
}
