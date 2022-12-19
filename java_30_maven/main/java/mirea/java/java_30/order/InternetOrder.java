package mirea.java.java_30.order;

import mirea.java.java_30.customer_info.Customer;
import mirea.java.java_30.menu.MenuItem;

import java.io.Serializable;

public class InternetOrder implements Order, Serializable {
    private int size = 0;
    private ListNode head;
    private ListNode tail;
    private Customer customer;

    @Override
    public boolean add(MenuItem item) {
        if(head == null) {
            head = new ListNode();
            head.next = tail;
            head.value = item;
            tail = head;
        }
        else {
            ListNode v = tail;
            ListNode t = new ListNode();
            t.next = head;
            t.value = item;
            tail.next = t;
            tail = t;
        }
        size++;
        return true;
    }

    @Override
    public String[] itemsNames() {
        String[] itemsNames = new String[size];
        ListNode v = head;
        for(int i = 0; i < size; i++){
            itemsNames[i] = v.value.getName();
            v = v.next;
        }
        return itemsNames;
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemQuantity(String itemName) {
        int q = 0;
        ListNode v = head;
        for(int i = 0; i < size; i++){
            if(v.value.getName().equals(itemName)){
                q++;
            }
            v = v.next;
        }
        return q;
    }

    @Override
    public int itemQuantity(MenuItem itemName) {
        int q = 0;
        ListNode v = head;
        for(int i = 0; i < size; i++){
            if(v.value.getName().equals(itemName.getName())){
                q++;
            }
            v = v.next;
        }
        return q;
    }

    @Override
    public MenuItem[] getItems() {
        MenuItem[] items = new MenuItem[size];
        ListNode v = head;
        for(int i = 0; i < size; i++){
            items[i] = v.value;
            v = v.next;
        }
        return items;
    }

    @Override
    public boolean remove(String itemName) {
        ListNode v = tail;
        for(int i = 0; i < size; i++){
            if(v.next.value.getName().equals(itemName)){
                v.next = v.next.next;
                size--;
                return true;
            }
            v = v.next;
        }
        return false;
    }

    @Override
    public boolean remove(MenuItem item) {
        ListNode v = tail;
        for(int i = 0; i < size; i++){
            if(v.next.value.getName().equals(item.getName())){
                v.next = v.next.next;
                size--;
                return true;
            }
            v = v.next;
        }
        return false;
    }

    @Override
    public int removeAll(String itemName) {
        int q = 0;
        ListNode v = tail;
        int iterations = size;
        for(int i = 0; i < iterations; i++){
            if(v.next.value.getName().equals(itemName)){
                v.next = v.next.next;
                size--;
                q++;
                continue;
            }
            v = v.next;
        }
        return q;
    }

    @Override
    public int removeAll(MenuItem item) {
        int q = 0;
        ListNode v = tail;
        int iterations = size;
        for(int i = 0; i < iterations; i++){
            if(v.next.value.getName().equals(item.getName())){
                v.next = v.next.next;
                size--;
                q++;
                continue;
            }
            v = v.next;
        }
        return q;
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        MenuItem[] items = new MenuItem[size];
        ListNode v = head;
        for(int i = 0; i < size; i++){
            items[i] = v.value;
            v = v.next;
        }
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
        ListNode v = head;
        for(int i = 0; i < size; i++){
            c+=v.value.getCost();
            v = v.next;
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
}