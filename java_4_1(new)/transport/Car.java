package transport;

public class Car extends Transport{
    private final static int speed = 60;
    private final static int costOfOnePassenger = 1000;
    private final static int costOfOneKgOfCargo = 50;

    public Car(int amountPassengers, int kgOfCargo, int distance) {
        super(amountPassengers, kgOfCargo, distance, speed, costOfOnePassenger, costOfOneKgOfCargo);
    }
}
