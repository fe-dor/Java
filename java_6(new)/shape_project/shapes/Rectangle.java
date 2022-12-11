package shape_project.shapes;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(){
        this.width = 1;
        this.length = 1;
        this.color = "blue";
        this.filled = false;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
        this.color = "blue";
        this.filled = false;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea() {
        return length*width;
    }
    @Override
    public double getPerimeter() {
        return (length+width)*2;
    }
    @Override
    public String toString() {
        return "Shape: rectangle, width: " + width + ", length: " + length + ", color: " + color;
    }
}
