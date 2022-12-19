package menu;

public final class Dish extends MenuItem{
    private DishTypeEnum type;

    public Dish(DishTypeEnum type) {
        super(type.getCost(), type.getType(), type.getDescription());
    }
}
