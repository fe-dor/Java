package animation_3;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Animation extends JPanel {
    private static final Image[] images = new Image[]{new ImageIcon("src/animation_3/1.jpg").getImage(),
            new ImageIcon("src/animation_3/2.jpg").getImage(),
            new ImageIcon("src/animation_3/3.jpg").getImage(),
            new ImageIcon("src/animation_3/4.jpg").getImage(),
            new ImageIcon("src/animation_3/5.jpg").getImage()};
    private Image img;
    private int i = 0;

    public void paint(Graphics g){
        if(i == 5)
            i = 0;
        wait(500);
        g.drawImage(images[i], 0, 0, null);
        i++;
        this.repaint();
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame fr = new JFrame("Animation");
        fr.setSize(1200, 1200);
        fr.add(new Animation());
        fr.setVisible(true);
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
