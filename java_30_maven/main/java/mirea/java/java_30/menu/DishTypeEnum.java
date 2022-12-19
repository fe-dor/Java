package mirea.java.java_30.menu;

import java.io.Serializable;

public enum DishTypeEnum implements Serializable {
    CHICKEN(300, "Chicken", "150g."),
    BEEF(400, "Beef", "150g."),
    FRIES(170, "Fries", "200g."),
    EGGS(280, "Eggs", "160g."),
    SALAD(250, "Salad", "150g."),
    SOUP(400, "Soup", "350g."),
    PORK(420, "Pork", "150g.");

    private int cost;
    private String type;
    private String description;

    DishTypeEnum(int cost, String type, String description) {
        this.cost = cost;
        this.type = type;
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return type;
    }
}
