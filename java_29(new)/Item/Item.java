package Item;

public interface Item {
    int get_price();
    String get_name();
    String get_description();
    public int compareTo(Item o);
}
