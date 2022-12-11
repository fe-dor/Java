package figures_1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DynamicShapes extends JPanel{
    private List<Shape> shapes = new ArrayList<>();
    private Random random = new Random();

    public DynamicShapes() {

        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(600, 400));
        int shapeType = 0;
        Color color;

        for(int i = 0; i < 20; i++){
            shapeType = random.nextInt(4);
            color = Color.getHSBColor(random.nextInt(360),random.nextInt(100), random.nextInt(360));

            switch (shapeType) {
                case 0 -> addCircle(color,590, 390);
                case 1 -> addStar(color, 580, 380);
                case 2 -> addSquare(color, 580, 380);
                case 3 -> addTriangle(color,580, 350);
            }
        }
    }

    public void addCircle(Color color, int maxX, int maxY) {
        shapes.add(new Circle(color, random.nextInt(maxX), random.nextInt(maxY)));
        repaint();
    }

    public void addStar(Color color, int maxX, int maxY) {
        shapes.add(new Star(color, random.nextInt(maxX), random.nextInt(maxY)));
        repaint();
    }

    public void addSquare(Color color, int maxX, int maxY) {
        shapes.add(new Square(color, random.nextInt(maxX), random.nextInt(maxY)));
        repaint();
    }

    public void addTriangle(Color color, int maxX, int maxY) {
        shapes.add(new Triangle(color, random.nextInt(maxX), random.nextInt(maxY)));
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Object s : shapes) {
            if (s instanceof Circle) {
                ((Circle) s).draw(g);
            }
            if (s instanceof Star) {
                ((Star) s).draw(g);
            }
            if (s instanceof Square) {
                ((Square) s).draw(g);
            }
            else if(s instanceof Triangle){
                ((Triangle) s).draw(g);
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new DynamicShapes());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
