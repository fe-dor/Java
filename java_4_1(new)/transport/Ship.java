package transport;

public class Ship extends Transport{
    private final static int speed = 100;
    private final static int costOfOnePassenger = 8000;
    private final static int costOfOneKgOfCargo = 250;

    public Ship(int amountPassengers, int kgOfCargo, int distance) {
        super(amountPassengers, kgOfCargo, distance, speed, costOfOnePassenger, costOfOneKgOfCargo);
    }
}
