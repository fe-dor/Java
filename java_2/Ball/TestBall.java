package Ball;

public class TestBall {
    public static void main(String[] args){
        Ball b1 = new Ball(21.2,9.34);
        System.out.println(b1);
        b1.move(4,-1);
        System.out.println(b1);
    }
}
