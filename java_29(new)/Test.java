import Item.*;
import mylist.MyList;
import n3.InternetOrder;
import n3.OrderAlreadyAddedException;
import n3.OrderManager;

public class Test {
    public static void main(String[] args) throws OrderAlreadyAddedException {
        OrderManager orderManager = new OrderManager();
        MyList<Item> items = new MyList<Item>();
        items.add(new Dish(15, "chicken", "very tasty"));
        items.add(new Dish(25, "bread", "fresh"));
        items.add(new Dish(5, "tea", "without sugar"));
        InternetOrder internetOrder = new InternetOrder(items);
        orderManager.addOrder("st. Prosperl Vernadskogo 78", internetOrder);
        System.out.println(orderManager.getTotalPrice());
    }
}
