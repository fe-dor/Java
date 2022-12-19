package mirea.java.java_30.menu;

import java.io.Serializable;

public enum DrinkTypeEnum implements Serializable {
    BEER(100, "Beer", "light beer, 0.5", 4.6),
    WINE(400, "Wine", "semi-sweet", 6.1),
    VODKA(200, "Vodka", "semi-sweet", 40.0),
    BRANDY(600, "Brandy", "from US", 37.5),
    CHAMPAGNE(400, "Champagne", "from France", 7.0),
    WHISKEY(600, "Whiskey", "from Scotland", 40.0),
    TEQUILA(700, "Tequila", "from Mexico", 44.0),
    RUM(500, "Rum", "from England", 40.0),
    VERMUTH(650, "Vermuth", "from Italy", 10.0),
    LIQUEUR(600, "Liqueur", "with honey", 30.0),
    JAGERMEISTER(800, "Jagermeister", "like liqueur", 34.0),
    JUICE(50, "Juice", "apple", 0),
    COFFEE(90, "Coffee", "latte", 0),
    GREEN_TEA(50, "Green tea", "without sugar", 0),
    BLACK_TEA(50, "Black tea", "without sugar", 0),
    MILK(40, "Milk", "without lactose", 0),
    WATER(10, "Water", "clear water", 0),
    SODA(70, "Soda", "Coke", 0);

    private int cost;
    private String type;
    private String description;
    private double alcoholVol;

    DrinkTypeEnum(int cost, String type, String description, double alcoholVol) {
        this.cost = cost;
        this.type = type;
        this.description = description;
        this.alcoholVol = alcoholVol;
    }

    public int getCost() {
        return cost;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public double getAlcoholVol() {
        return alcoholVol;
    }

    @Override
    public String toString() {
        return type;
    }
}
