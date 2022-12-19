package n3;

import Item.Item;
import mylist.MyList;

public interface Order {
    boolean add(Item item);
    boolean delete(String name);
    boolean deleteAllByName(String name);
    int count();
    MyList<Item> getItems();
    int getTotalPrice();
    int getCountOfPosition(String name);
    String[] namesOfOrderPositions();
    MyList<Item> getItemsSortedByPrice();
}
