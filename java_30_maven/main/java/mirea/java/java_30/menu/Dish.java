package mirea.java.java_30.menu;

import java.io.Serializable;

public final class Dish extends MenuItem implements Serializable {
    private DishTypeEnum type;

    public Dish(DishTypeEnum type) {
        super(type.getCost(), type.getType(), type.getDescription());
    }
}
