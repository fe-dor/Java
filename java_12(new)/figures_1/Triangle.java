package figures_1;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class Triangle extends Shape{
    public Triangle(Color color, int x, int y) {
        super(color, x, y);
    }

    public void draw(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        GeneralPath triangle = new GeneralPath();

        triangle.moveTo(this.getX(), this.getY());
        triangle.lineTo(10 + this.getX(), this.getY() - 15);
        triangle.lineTo(20 + this.getX(), this.getY());

        triangle.closePath();

        g2d.setColor(this.getColor());
        g2d.fill(triangle);
    }
}
