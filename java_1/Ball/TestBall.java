package Ball;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("green", 2.2);
        System.out.println(b1);
        System.out.println(b1.getArea());
        System.out.println(b1.getVolume());

        Ball b2 = new Ball(7.91);
        b2.setColor("yellow");
        System.out.println(b2);

        Ball b3 = new Ball(4.32);
        System.out.println(b3);
        System.out.println(b3.getVolume());
    }
}
