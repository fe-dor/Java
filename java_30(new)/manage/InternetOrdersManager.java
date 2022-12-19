package manage;

import menu.MenuItem;
import order.Order;

public class InternetOrdersManager implements OrdersManager {
    private QueueNode head = null;
    private QueueNode tail = null;
    private int size;

    public boolean add(Order order){
        if(head == null){
            head = new QueueNode();
            head.next = head;
            head.prev = head;
            head.value = order;
            tail = head;
        }
        else {
            QueueNode t = tail;
            QueueNode v = new QueueNode();
            v.next = head;
            v.prev = t;
            v.value = order;
            tail = v;
            t.next = v;
            head.prev = v;
        }
        size++;
        return true;
    }

    public Order remove(){
        QueueNode v = head;
        head.prev.next = head.next;
        head.next.prev = head.prev;
        head = head.next;
        size--;
        return v.value;
    }

    public Order order(){
        return head.value;
    }

    @Override
    public int itemsQuantity(String itemName) { //для каждого заказа вызываем ф-цию кол-ва этого айтема
        QueueNode v = head;
        int q = 0;
        for(int i = 0; i < size; i++){
            q+=v.value.itemQuantity(itemName);
            v = v.next;
        }
        return q;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        QueueNode v = head;
        int q = 0;
        for(int i = 0; i < size; i++){
            q+=v.value.itemQuantity(item.getName());
            v = v.next;
        }
        return q;
    }

    @Override
    public Order[] getOrders() {
        Order[] orders = new Order[size];
        QueueNode v = head;
        for(int i = 0; i < size; i++){
            orders[i] = v.value;
            v = v.next;
        }
        return orders;
    }

    @Override
    public int ordersCostSummary() {//складываем суммы каждого отдельного заказа
        int cost = 0;
        QueueNode v = head;
        for(int i = 0; i < size; i++){
            cost+=v.value.costTotal();
            v = v.next;
        }
        return cost;
    }

    @Override
    public int ordersQuantity() {
        return size;
    }
}