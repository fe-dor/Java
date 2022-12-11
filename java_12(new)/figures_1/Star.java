package figures_1;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class Star extends Shape{
    public Star(Color color, int x, int y) {
        super(color, x, y);
    }

    public void draw(Graphics g) {

        int[] xPoints = {9, 15, 0, 18, 3};
        int[] yPoints = {0, 18, 6, 6, 18};

        Graphics2D g2d = (Graphics2D) g;
        GeneralPath star = new GeneralPath();

        star.moveTo(xPoints[0] + this.getX(), yPoints[0] + this.getY());
        for (int i = 1; i < xPoints.length; i++) {
            star.lineTo(xPoints[i] + this.getX(), yPoints[i] + this.getY());
        }
        star.closePath();

        g2d.setColor(this.getColor());
        g2d.fill(star);
    }
}
