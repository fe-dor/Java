package figures_1;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Circle extends Shape{
    public Circle(Color color, int x, int y) {
        super(color, x, y);
    }

    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D.Double circle = new Ellipse2D.Double(this.getX(), this.getY(), 10, 10);

        g2d.setColor(this.getColor());
        g2d.fill(circle);
    }
}
