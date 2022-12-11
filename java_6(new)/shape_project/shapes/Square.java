package shape_project.shapes;

public class Square extends Rectangle {
    protected double side;

    public Square(){
        super();
        this.side = 1;
    }
    public Square(double side){
        super(side, side);
        this.side = side;
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Shape: square, side: " + side + ", color: " + color;
    }
}
