package math;

public class Test {
    public static void main(String[] args) {
        MathCalculable mc1 = new MathFunc();
        int r = 10;
        double l = 2 * mc1.PI * r;
        System.out.println(l);
        System.out.println(mc1.power(-1, 3));
    }
}
