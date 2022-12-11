package transport;

public abstract class Transport {
    private int amountPassengers;
    private int kgOfCargo;
    private int distance;
    private final int speed;
    private final int costOfOnePassenger;
    private final int costOfOneKgOfCargo;

    public Transport(int amountPassengers, int kgOfCargo, int distance, int speed, int costOfOnePassenger, int costOfOneKgOfCargo) {
        this.amountPassengers = amountPassengers;
        this.kgOfCargo = kgOfCargo;
        this.distance = distance;
        this.speed = speed;
        this.costOfOnePassenger = costOfOnePassenger;
        this.costOfOneKgOfCargo = costOfOneKgOfCargo;
    }

    public void getInfo(){
        System.out.println("Cost for " + amountPassengers + " passengers is " + amountPassengers * costOfOnePassenger);
        System.out.println("Cost for " + kgOfCargo + "kg is " + kgOfCargo * costOfOneKgOfCargo);
        System.out.println("Travel time is " + distance * speed);
    }

    public int getAmountPassengers() {
        return amountPassengers;
    }

    public void setAmountPassengers(int amountPassengers) {
        this.amountPassengers = amountPassengers;
    }

    public int getKgOfCargo() {
        return kgOfCargo;
    }

    public void setKgOfCargo(int kgOfCargo) {
        this.kgOfCargo = kgOfCargo;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
