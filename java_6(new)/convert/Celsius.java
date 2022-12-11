package convert;

public class Celsius implements Convertable{
    private double value;

    public Celsius(double value) {
        this.value = value;
    }

    @Override
    public void convert() {
        System.out.println((value * 9 / 5) + 32);
        System.out.println(value + 273.15);
    }
}
