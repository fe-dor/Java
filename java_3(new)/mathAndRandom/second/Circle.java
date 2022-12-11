package mathAndRandom.second;

public class Circle {
    private Point point;
    private double radius;
    private double circuit;

    public Circle(int x, int y, double radius){
        this.radius = radius;
        point = new Point(x, y);
        circuit = 2*Math.PI*radius;
    }

}
