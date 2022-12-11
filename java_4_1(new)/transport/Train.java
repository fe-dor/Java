package transport;

public class Train extends Transport{
    private final static int speed = 120;
    private final static int costOfOnePassenger = 3000;
    private final static int costOfOneKgOfCargo = 70;

    public Train(int amountPassengers, int kgOfCargo, int distance) {
        super(amountPassengers, kgOfCargo, distance, speed, costOfOnePassenger, costOfOneKgOfCargo);
    }
}
