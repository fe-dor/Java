package manage;

import menu.MenuItem;
import order.Order;

public class TableOrdersManager implements OrdersManager {
    private Order[] orders = new Order[27];

    public TableOrdersManager() {
        for (int i = 0; i < 27; i++){
            orders[i] = null;
        }
    }

    public void add(Order order, int tableNumber){
        orders[tableNumber-1] = order;
    }

    public void addItem(MenuItem item, int tableNumber){
        orders[tableNumber-1].add(item);
    }

    public int freeTableNumber() throws NoFreeTableException {
        int result = 0;
        for (int i = 0; i < 27; i++){
            if(orders[i] == null){
                result = i + 1;
                break;
            }
        }
        if(result == 0)
            throw new NoFreeTableException();
        else
            return result;
    }

    public int[] freeTableNumbers() throws NoFreeTableException {
        int count = 0;
        for (int i = 0; i < 27; i++){
            if(orders[i] == null){
                count++;
            }
        }
        if(count == 0)
            throw new NoFreeTableException();
        int[] tables = new int[count];
        int j = 0;
        for (int i = 0; i < 27; i++){
            if(orders[i] == null){
                tables[j] = i + 1;
                j++;
            }
        }
        return tables;
    }

    public Order getOrder(int tableNumber){
        return orders[tableNumber - 1];
    }

    public void remove(int tableNumber){
        orders[tableNumber - 1] = null;
    }

    public int remove(Order order) throws NoSuchOrderException {
        for (int i = 0; i < 27; i++){
            if(orders[i] == order){
                orders[i] = null;
                return (i + 1);
            }
        }
        throw new NoSuchOrderException();
    }

    public int removeAll(){
        for (int i = 0; i < 27; i++){
            orders[i] = null;
        }
        return 0;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int q = 0;
        for(int i = 0; i < 27;i++){
            if(orders[i] != null){
                q+=orders[i].itemQuantity(itemName);
            }
        }
        return q;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int q = 0;
        for(int i = 0; i < 27;i++){
            if(orders[i] != null){
                q+=orders[i].itemQuantity(item.getName());
            }
        }
        return q;
    }

    @Override
    public Order[] getOrders() {
        Order[] orders1 = new Order[ordersQuantity()];
        int j = 0;
        for(int i = 0; i < 27; i++){
            if(orders[i] != null){
                orders1[j] = orders[i];
                j++;
            }
        }
        return orders1;
    }

    @Override
    public int ordersCostSummary() {
        int cost = 0;
        for (int i = 0; i < 27; i++){
            if(orders[i] != null){
                cost+=orders[i].costTotal();
            }
        }
        return cost;
    }

    @Override
    public int ordersQuantity() {
        int count = 0;
        for (int i = 0; i < 27; i++){
            if(orders[i] == null){
                count++;
            }
        }
        return 27 - count;
    }

    public Order[] getOrdersWithTables() {
        return orders;
    }

}