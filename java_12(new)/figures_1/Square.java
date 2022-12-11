package figures_1;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class Square extends Shape{
    public Square(Color color, int x, int y) {
        super(color, x, y);
    }
    public void draw(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        GeneralPath square = new GeneralPath();

        square.moveTo(this.getX(), this.getY());
        square.lineTo(15 + this.getX(), this.getY());
        square.lineTo(15 + this.getX(), 15 + this.getY());
        square.lineTo(this.getX(), 15 + this.getY());

        square.closePath();

        g2d.setColor(this.getColor());
        g2d.fill(square);
    }
}
