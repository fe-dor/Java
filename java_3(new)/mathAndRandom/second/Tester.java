package mathAndRandom.second;

public class Tester {
    public static void main(String[] args) {
        Circle[] circle = new Circle[10];
        for(int i = 0; i < 10; i++){
            circle[i] = new Circle((int)(100 * Math.random()), (int)(100 * Math.random()), 100 * Math.random());
        }
    }
}
