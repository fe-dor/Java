package shape_project.move;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public MovableCircle(int x, int y, int radius){
        center = new MovablePoint(x, y, 100, 100); //7 работа
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "shape_project.move.MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
    public void moveUp(){
        center.moveUp();
        System.out.println("Circle is moving up");
    }
    public void moveDown(){
        center.moveDown();
        System.out.println("Circle is moving down");
    }
    public void moveLeft(){
        center.moveLeft();
        System.out.println("Circle is moving left");
    }
    public void moveRight(){
        center.moveRight();
        System.out.println("Circle is moving right");
    }

}
