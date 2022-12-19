package order;

import menu.MenuItem;
import customer_info.Customer;

public class TableOrder implements Order {
    private int size = 0;
    private MenuItem[] items = new MenuItem[500];
    private Customer customer;
    private int table;

    @Override
    public boolean add(MenuItem item) {
        items[size] = item;
        size++;
        return true;
    }

    @Override
    public String[] itemsNames() {
        String[] names = new String[size];
        for(int i = 0; i < size; i++){
            names[i] = items[i].getName();
        }
        return names;
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemQuantity(String itemName) {
        int q = 0;
        for(int i = 0; i < size; i++){
            if(items[i].getName().equals(itemName))
                q++;
        }
        return q;
    }

    @Override
    public int itemQuantity(MenuItem itemName) {
        int q = 0;
        for(int i = 0; i < size; i++){
            if(items[i].getName().equals(itemName.getName()))
                q++;
        }
        return q;
    }

    @Override
    public MenuItem[] getItems() {
        return items;
    }

    @Override
    public boolean remove(String itemName) {
        for (int i = 0; i < size; i++){
            if (items[i].getName().equals(itemName)){
                for(int j = i; j < size - 1; j++){
                    items[j] = items[j+1];
                }
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(MenuItem item) {
        for (int i = 0; i < size; i++){
            if (items[i].getName().equals(item.getName())){
                for(int j = i; j < size - 1; j++){
                    items[j] = items[j+1];
                }
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public int removeAll(String itemName) {
        int c = 0;
        for (int i = 0; i < size; i++){
            if (items[i].getName().equals(itemName)){
                for(int j = i; j < size - 1; j++){
                    items[j] = items[j+1];
                }
                size--;
                i--;
                c++;
            }
        }
        return c;
    }

    @Override
    public int removeAll(MenuItem item) {
        int c = 0;
        for (int i = 0; i < size; i++){
            if (items[i].getName().equals(item.getName())){
                for(int j = i; j < size - 1; j++){
                    items[j] = items[j+1];
                }
                size--;
                i--;
                c++;
            }
        }
        return c;
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        return sort(items);
    }

    public static MenuItem[] sort(MenuItem[] array) {
        // i - номер прохода
        for (int i = 0; i < array.length - 1; i++) {
            // внутренний цикл прохода
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1].getCost() > array[j].getCost()) {
                    MenuItem tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }

    @Override
    public int costTotal() {
        int c = 0;
        for(int i = 0; i < size; i++){
            c+=items[i].getCost();
        }
        return c;
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getSize() {
        return size;
    }
}
