package menu;

public final class Drink extends MenuItem implements Alcoholable{
    private double alcoholVol;
    private DrinkTypeEnum type;

    public Drink(DrinkTypeEnum type) {
        super(type.getCost(), type.getType(), type.getDescription());
        this.alcoholVol = type.getAlcoholVol();
        this.type = type;
    }

    public DrinkTypeEnum getType(){
        return type;
    }

    @Override
    public boolean isAlcoholicDrink() {
        return alcoholVol > 0;
    }

    @Override
    public double getAlcoholVol() {
        return alcoholVol;
    }

}
