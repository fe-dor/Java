package Item;

public final class Dish implements Item, Comparable<Item>{
    private int price;
    private String name;
    private String description;

    public Dish(int price, String name, String description) {
        if(price < 0 || name.isEmpty() || description.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.price = price;
        this.name = name;
        this.description = description;
    }

    @Override
    public int get_price() {
        return price;
    }

    @Override
    public String get_name() {
        return name;
    }

    @Override
    public String get_description() {
        return description;
    }

    @Override
    public int compareTo(Item o) {
        return Integer.compare(this.price, o.get_price());
    }
}
