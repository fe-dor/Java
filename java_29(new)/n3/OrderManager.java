package n3;

import Item.Item;
import mylist.MyList;

import java.util.HashMap;
import java.util.Set;

public class OrderManager {
    HashMap<String, Order> addressOrder = new HashMap<>();

    public OrderManager() {
    }

    public void addOrder(String address, Order order) throws OrderAlreadyAddedException {
        if(addressOrder.containsKey(address))
            throw new OrderAlreadyAddedException();
        addressOrder.put(address, order);
    }

    public Order getOrder(String address){
        return addressOrder.get(address);
    }

    public void removeOrder(String address){
        addressOrder.remove(address);
    }

    public void addPosition(String address, Item item){
        addressOrder.get(address).add(item);
    }

    public MyList<Order> getOrders() {
        MyList<Order> myList = new MyList<>();
        Set<String> addresses = addressOrder.keySet();
        String[] massive = addresses.toArray(new String[0]);
        for (int i = 0; i < massive.length; i++){
            myList.add(addressOrder.get(massive[i]));
        }
        return myList;
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        MyList<Order> myList = getOrders();
        for(int i = 0; i < myList.size(); i++){
            totalPrice += myList.pop().getTotalPrice(); // складываем общие суммы всех заказов
        }
        return totalPrice;
    }

    public int countOfOnePosition(String name) throws IllegalTableNumber {
        if(name.startsWith("table") || Integer.parseInt(name.substring(5)) > 30){
            throw new IllegalTableNumber();
        }
        int count = 0;
        MyList<Order> myList = getOrders();
        for(int i = 0; i < myList.size(); i++){
            count += myList.pop().getCountOfPosition(name);
        }
        return count;
    }
}

