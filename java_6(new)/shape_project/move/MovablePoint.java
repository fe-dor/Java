package shape_project.move;

public class MovablePoint implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(int x, int y){ // Новый 7 работа
        this.x = x;
        this.y = y;
        this.xSpeed = 10;
        this.ySpeed = 10;
    }

    @Override
    public String toString() {
        return "shape_project.move.MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    public void moveUp(){
        y+=1;
        System.out.println("Point is moving up");
    }
    public void moveDown(){
        y-=1;
        System.out.println("Point is moving down");
    }
    public void moveLeft(){
        x-=1;
        System.out.println("Point is moving left");
    }
    public void moveRight(){
        x+=1;
        System.out.println("Point is moving right");
    }

    public boolean SpeedTest(MovablePoint mc){
        double s1 = Math.pow((xSpeed*xSpeed + ySpeed*ySpeed), 0.5);
        double s2 = Math.pow((mc.xSpeed*mc.xSpeed + mc.ySpeed* mc.ySpeed), 0.5);

        return s1 == s2;
    }


}
