package mirea.java.java_30.manage;

import mirea.java.java_30.menu.Dish;
import mirea.java.java_30.menu.DishTypeEnum;
import mirea.java.java_30.menu.Drink;
import mirea.java.java_30.menu.DrinkTypeEnum;
import mirea.java.java_30.order.Order;
import mirea.java.java_30.order.TableOrder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TableOrdersManagerTest {
    private TableOrdersManager tableOrdersManager = new TableOrdersManager();

    //Тест с проверкой значения
    //Тест проверяет, правильно ли работает функция получения общей суммы всех заказов
    @Test
    public void testOrdersCostSummary(){
        int newTable = 10;
        Order order1 = new TableOrder();
        order1.add(new Drink(DrinkTypeEnum.SODA)); //70
        order1.add(new Drink(DrinkTypeEnum.BEER)); //100
        Order order2 = new TableOrder();
        order2.add(new Dish(DishTypeEnum.CHICKEN)); //300
        order2.add(new Dish(DishTypeEnum.EGGS)); //280
        tableOrdersManager.add(order1, 2);
        tableOrdersManager.add(order2, 3);
        Assert.assertEquals(750, tableOrdersManager.ordersCostSummary());
    }

    //Тест с перехватом исключения
    //Тест пройден, если все столики заняты и при вызове метода freeTableNumber() Выдается ошибка NoFreeTableException
    //freeTableNumber() - один свободный столик
    @Test(expected = NoFreeTableException.class)
    public void testFreeTableNumber() throws NoFreeTableException {
        tableOrdersManager = new TableOrdersManager();
        for(int i = 1; i <= 27; i++){
            tableOrdersManager.add(new TableOrder(), i);
        }
        tableOrdersManager.freeTableNumber();
    }


    //Тест с перехватом исключения
    //Тест пройден, если все столики заняты и при вызове метода freeTableNumbers() Выдается ошибка NoFreeTableException
    //freeTableNumbers() - все свободные столики
    @Test(expected = NoFreeTableException.class)
    public void testFreeTableNumbers() throws NoFreeTableException {
        tableOrdersManager = new TableOrdersManager();
        for(int i = 1; i <= 27; i++){
            tableOrdersManager.add(new TableOrder(), i);
        }
        tableOrdersManager.freeTableNumbers();
    }
}