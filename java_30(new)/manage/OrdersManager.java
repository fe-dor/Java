package manage;


import menu.MenuItem;
import order.Order;


public interface OrdersManager {
    public int itemsQuantity(String itemName);
    public int itemsQuantity(MenuItem item);
    public Order[] getOrders();
    public int ordersCostSummary();
    public int ordersQuantity();
}
