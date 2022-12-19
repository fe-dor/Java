package mirea.java.java_30.order;

import mirea.java.java_30.customer_info.Customer;
import mirea.java.java_30.menu.MenuItem;

public interface Order {
    public boolean add(MenuItem item);
    public String[] itemsNames();
    public int itemsQuantity();
    public int itemQuantity(String itemName);
    public int itemQuantity(MenuItem itemName);
    public MenuItem[] getItems();
    public boolean remove(String itemName);
    public boolean remove(MenuItem item);
    public int removeAll(String itemName);
    public int removeAll(MenuItem item);
    public MenuItem[] sortedItemsByCostDesc();
    public int costTotal();
    public Customer getCustomer();
    public void setCustomer(Customer customer);
}
