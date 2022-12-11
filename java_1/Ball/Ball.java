package Ball;

public class Ball {
    private String color;
    private double radius;

    public Ball(String color, double radius){
        this.color = color;
        this.radius = radius;
    }
    public Ball(String color){
        this.color = color;
        radius = 4;
    }
    public Ball(double radius){
        this.radius = radius;
        color = "black";
    }
    public Ball(){
        radius = 4;
        color = "black";
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    @Override
    public String toString() {
        return "Color: "+color+", radius: "+radius;
    }
    public double getVolume(){
        return 4/3*Math.PI*radius*radius*radius;
    }
    public double getArea(){
        return 4*Math.PI*radius*radius;
    }
}
