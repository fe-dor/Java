package transport;

public class Airplane extends Transport{
    private final static int speed = 700;
    private final static int costOfOnePassenger = 5000;
    private final static int costOfOneKgOfCargo = 200;

    public Airplane(int amountPassengers, int kgOfCargo, int distance) {
        super(amountPassengers, kgOfCargo, distance, speed, costOfOnePassenger, costOfOneKgOfCargo);
    }
}
