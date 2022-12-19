package n3;

import Item.Item;
import mylist.MyList;

import java.util.HashSet;
import java.util.Set;

public class InternetOrder implements Order {
    MyList<Item> positions;

    public InternetOrder(MyList<Item> positions) {
        this.positions = positions;
    }

    public InternetOrder() {
    }

    @Override
    public boolean add(Item item) {
        positions.add(item);
        return true;
    }

    @Override
    public boolean delete(String name) {
        Item item;
        for(Item p : positions){
            if(p.get_name().equals(name)){
                positions.delete(p);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteAllByName(String name) {
        Item item;
        for(Item p : positions){
            if(p.get_name().equals(name)){
                positions.delete(p);
            }
        }
        return true;
    }

    @Override
    public int count() {
        return positions.size();
    }

    @Override
    public MyList<Item> getItems() {
        return positions;
    }

    @Override
    public int getTotalPrice() {
        int totalPrice = 0;
        for(int i = 0; i < positions.size(); i++){
            totalPrice += positions.pop().get_price(); // складываем общие суммы всех заказов
        }
        return totalPrice;
    }

    @Override
    public int getCountOfPosition(String name) {
        int count = 0;
        for(int i = 0; i < positions.size(); i++){
            if(positions.pop().get_name().equals(name))
                count++;
        }
        return count;
    }

    @Override
    public String[] namesOfOrderPositions() {
        Set<String> set = new HashSet<>();
        for(int i = 0; i < positions.size(); i++){
            set.add(positions.pop().get_name());
        }
        String[] array = new String[set.size()];
        // копируем элементы из набора в строковый массив
        int i = 0;
        for (String s: set) {
            array[i++] = s;
        }
        return array;
    }

    @Override
    public MyList<Item> getItemsSortedByPrice() {
        MyList<Item> myList = positions;
        Item mas[] = new Item[myList.size()];
        for (int i = 0; i < myList.size(); i++){
            mas[i] = myList.pop();
        }
        boolean isSorted = false;
        Item buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < positions.size() - 1; i++) {
                if(mas[i].compareTo(mas[i+1]) >= 1){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        MyList<Item> myList1 = new MyList<Item>();
        for (int i = 0; i < mas.length; i++){
            myList1.add(mas[i]);
        }
        return myList1;
    }
}
