package shape_project.move;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public MovableRectangle(int x1, int y1, int x2, int y2){ // Новый для 7 работы
        topLeft = new MovablePoint(x1, y1);
        bottomRight = new MovablePoint(x2, y2);
    }

    private boolean checkSpeeds(MovablePoint a, MovablePoint b){
        if (a.xSpeed == b.xSpeed && a.ySpeed == b.ySpeed)
            return true;
        return false;
    }

    @Override
    public void moveUp() {
        if(checkSpeeds(topLeft, bottomRight)){
            topLeft.moveUp();
            bottomRight.moveUp();
            System.out.println("Rectangle is moving up");
        }
        else {
            System.out.println("wrong speeds");
        }
    }

    @Override
    public void moveDown() {
        if(checkSpeeds(topLeft, bottomRight)){
            topLeft.moveDown();
            bottomRight.moveDown();
            System.out.println("Rectangle is moving down");
        }
        else {
            System.out.println("wrong speeds");
        }
    }

    @Override
    public void moveLeft() {
        if(checkSpeeds(topLeft, bottomRight)){
            topLeft.moveLeft();
            bottomRight.moveLeft();
            System.out.println("Rectangle is moving left");
        }
        else {
            System.out.println("wrong speeds");
        }
    }

    @Override
    public void moveRight() {
        if(checkSpeeds(topLeft, bottomRight)){
            topLeft.moveRight();
            bottomRight.moveRight();
            System.out.println("Rectangle is moving right");
        }
        else {
            System.out.println("wrong speeds");
        }
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
