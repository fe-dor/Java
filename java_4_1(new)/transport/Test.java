package transport;

public class Test {
    public static void main(String[] args) {
        Transport car = new Car(7, 100, 500);
        Airplane airplane = new Airplane(2, 75, 2000);
        Ship ship = new Ship(3, 200, 800);
        Train train = new Train(5, 300, 1000);
        car.getInfo();
        airplane.getInfo();
        ship.getInfo();
        train.getInfo();
    }
}
