package mirea.java.java_30.manage;


import mirea.java.java_30.menu.MenuItem;
import mirea.java.java_30.order.Order;

import java.io.Serializable;


public interface OrdersManager {
    public int itemsQuantity(String itemName);
    public int itemsQuantity(MenuItem item);
    public Order[] getOrders();
    public int ordersCostSummary();
    public int ordersQuantity();
}
