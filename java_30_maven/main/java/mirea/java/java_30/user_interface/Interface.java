package mirea.java.java_30.user_interface;

import mirea.java.java_30.customer_info.Address;
import mirea.java.java_30.customer_info.Customer;
import mirea.java.java_30.manage.InternetOrdersManager;
import mirea.java.java_30.manage.NoFreeTableException;
import mirea.java.java_30.manage.TableOrdersManager;
import mirea.java.java_30.menu.*;
import mirea.java.java_30.order.InternetOrder;
import mirea.java.java_30.order.Order;
import mirea.java.java_30.order.TableOrder;

import java.util.Scanner;

public class Interface {
    private TableOrdersManager tableOrdersManager = new TableOrdersManager();
    private InternetOrdersManager internetOrdersManager = new InternetOrdersManager();

    public static void main(String[] args) throws WrongNumberException, NoFreeTableException {
        Interface user_interface = new Interface();
        Serializater serializater = new Serializater();
        user_interface.tableOrdersManager = serializater.deserializationT();
        user_interface.internetOrdersManager = serializater.deserializationI();
        int i_or_t = 0;
        user_interface.sWelcome();
        Scanner sc = new Scanner(System.in);

        while (true) {
            serializater.serialization(user_interface.tableOrdersManager, user_interface.internetOrdersManager);
            i_or_t = user_interface.starting(sc);
            if (i_or_t == 1)
                user_interface.sI1(sc);
            if (i_or_t == 2)
                user_interface.sT1(sc);
        }
    }





    public void sWelcome(){
        System.out.println("Welcome to restaurant manager!");
    }

    public int starting(Scanner sc) throws WrongNumberException {
        int section;

        System.out.println("(1) Internet order / (2) Table order /");
        section = sc.nextInt();
        sc.nextLine();

        if (section < 1 || section > 2){
            throw  new WrongNumberException();
        }
        return section;
    }

    public void sI1(Scanner sc) throws WrongNumberException {
        int section;

        System.out.println("(1) Create order / (2) Get cost summary / (3) Remove head order / (4) Item's quantity" +
                "/ (5) All orders / (6) Orders quantity /");
        section = sc.nextInt();
        sc.nextLine();
        if(section < 1 || section > 6)
            throw new WrongNumberException();
        switch (section){
            case 1:
                Customer customer = newCustomer(sc);
                InternetOrder order = new InternetOrder();
                order.setCustomer(customer);
                creatingOrder(order, sc);
                internetOrdersManager.add(order);
                break;
            case 2:
                System.out.println("Cost summary: " + internetOrdersManager.ordersCostSummary());
                break;
            case 3:
                internetOrdersManager.remove();
                break;
            case 4:
                DishTypeEnum[] dishes = DishTypeEnum.values();
                System.out.println("Dishes: ");
                for(int i = 0; i < dishes.length; i++){
                    System.out.println(dishes[i].getType() + " : " + internetOrdersManager.itemsQuantity(dishes[i].getType()));
                }
                DrinkTypeEnum[] drinks = DrinkTypeEnum.values();
                System.out.println("Drinks: ");
                for(int i = 0; i < drinks.length; i++){
                    System.out.println(drinks[i].getType() + " : " + internetOrdersManager.itemsQuantity(drinks[i].getType()));
                }
                break;
            case 5:
                Order[] orders = internetOrdersManager.getOrders();
                for (int i = 0; i < orders.length; i++){
                    System.out.println(orders[i].getCustomer().getAddress().getStreetName() + " " + orders[i].getCustomer().getAddress().getBuildingNumber()
                    + "; total cost: " + orders[i].costTotal());
                }
                break;
            case 6:
                System.out.println("Orders quantity: " + internetOrdersManager.ordersQuantity());
        }
    }
    public void sT1(Scanner sc) throws WrongNumberException, NoFreeTableException {
        int section;

        System.out.println("(1) Create new order / (2) Get cost summary / (3) Remove order / (4) Item's quantity" +
                "/ (5) All orders / (6) Orders quantity / (7) Get one free table number / (8) Free table numbers" +
                "/ (9) Get order (by table) / ");
        section = sc.nextInt();
        sc.nextLine();
        if(section < 1 || section > 9)
            throw new WrongNumberException();
        switch (section){
            case 1:
                System.out.println("Choose table: ");

                int[] tables = tableOrdersManager.freeTableNumbers();
                if(tables.length < 1) {
                    System.out.println("No free tables");
                    break;
                }
                for(int i = 0; i < tables.length; i++)
                    System.out.print(tables[i] + " / ");
                System.out.println();
                int tableNumber = sc.nextInt();
                sc.nextLine();
                boolean flag = false;
                for(int i = 0; i < tables.length; i++ ){
                    if(tableNumber == tables[i]) {
                        flag = true;
                        break;
                    }
                }
                if(!flag){
                    throw new WrongNumberException();
                }
                TableOrder order = new TableOrder();
                creatingOrder(order, sc);
                tableOrdersManager.add(order, tableNumber);
                break;
            case 2:
                System.out.println("Cost summary: " + tableOrdersManager.ordersCostSummary());
                break;
            case 3:
                System.out.println("Select the table whose mirea.java.java_30.order to delete: ");
                int[] tables3 = tableOrdersManager.freeTableNumbers();
                if(tables3.length == 27) {
                    System.out.println("All tables are free");
                    break;
                }
                int[] tables3_ = new int[27 - tables3.length];
                int j = 0,k = 0;
                for(int i = 0; i < 27; i++){ //Выделяем массив занятых столиков
                    if(i+1 == tables3[j]) {
                        j++;
                    }
                    else {
                        tables3_[k] = i+1;
                        k++;
                    }
                }
                for(int i = 0; i < k; i++){
                    System.out.print(tables3_[i] + " / ");
                }
                System.out.println();
                int tableNumber3 = sc.nextInt();
                sc.nextLine();
                boolean flag3 = false;
                for(int i = 0; i < tables3_.length; i++ ){
                    if(tableNumber3 == tables3_[i]) {
                        flag3 = true;
                        break;
                    }
                }
                if(!flag3){
                    throw new WrongNumberException();
                }
                System.out.println("Order removed");
                tableOrdersManager.remove(tableNumber3);
                break;
            case 4:
                DishTypeEnum[] dishes = DishTypeEnum.values();
                System.out.println("Dishes: ");
                for(int i = 0; i < dishes.length; i++){
                    System.out.println(dishes[i].getType() + " : " + tableOrdersManager.itemsQuantity(dishes[i].getType()));
                }
                DrinkTypeEnum[] drinks = DrinkTypeEnum.values();
                System.out.println("Drinks: ");
                for(int i = 0; i < drinks.length; i++){
                    System.out.println(drinks[i].getType() + " : " + tableOrdersManager.itemsQuantity(drinks[i].getType()));
                }
                break;
            case 5:
                Order[] orders = tableOrdersManager.getOrdersWithTables();
                if(orders.length == 0){
                    System.out.println("0 orders2");
                }
                for (int i = 0; i < orders.length; i++){
                    if(orders[i] != null)
                    System.out.println("table " + (i+1)
                            + "; total cost: " + orders[i].costTotal());
                }
                break;
            case 6:
                System.out.println("Orders quantity: " + tableOrdersManager.ordersQuantity());
                break;
            case 7:
                System.out.println("Free table : " + tableOrdersManager.freeTableNumber());
                break;
            case 8:
                System.out.println("Free tables numbers: ");
                int[] tables7 = tableOrdersManager.freeTableNumbers();
                for(int i = 0; i < tables7.length; i++){
                    System.out.print(tables7[i] + " / ");
                }
                System.out.println();
                break;
            case 9:
                System.out.println("Choose one: ");
                int[] tables8 = tableOrdersManager.freeTableNumbers();
                if(tables8.length == 27) {
                    System.out.println("All tables are free");
                    break;
                }
                int[] tables8_ = new int[27 - tables8.length];
                int j8 = 0,k8 = 0;
                for(int i = 0; i < 27; i++){ //Выделяем массив занятых столиков
                    if(i+1 == tables8[j8]) {
                        j8++;
                    }
                    else {
                        tables8_[k8] = i+1;
                        k8++;
                    }
                }
                for(int i = 0; i < k8; i++){
                    System.out.print(tables8_[i] + " / ");
                }
                System.out.println();
                int tableNumber8 = sc.nextInt();
                sc.nextLine();
                boolean flag8 = false;
                for(int i = 0; i < tables8_.length; i++ ){
                    if(tableNumber8 == tables8_[i]) {
                        flag8 = true;
                        break;
                    }
                }
                if(!flag8){
                    System.out.println("It's a free table!");
                    throw new WrongNumberException();
                }
                TableOrder order8 = (TableOrder) tableOrdersManager.getOrder(tableNumber8);
                MenuItem[] items = order8.getItems();
                System.out.println("Order: ");
                for (int i = 0; i < order8.getSize(); i++){
                    System.out.print(items[i].getName() + " ");
                }
                break;
        }
    }

    public void creatingOrder(Order order, Scanner sc) throws WrongNumberException {
        int typeItem = 0;
        int numberMenu = 0;

        while(true) {
            System.out.println("(1) Dish / (2) Drink / (3) Exit / ");
            typeItem = sc.nextInt();
            if (typeItem == 3) {
                break;
            }
            if (typeItem == 1) {
                //Dish
                System.out.println("Dish: ");
                DishTypeEnum[] dishes = DishTypeEnum.values();
                for (int i = 0; i < dishes.length; i++) {
                    System.out.print("(" + (i + 1) + ") " + dishes[i].toString() + " price: " + dishes[i].getCost() + " / ");
                }
                System.out.println();
                System.out.println("Write number: ");
                numberMenu = sc.nextInt();
                sc.nextLine();
                if (numberMenu < 1 || numberMenu > dishes.length + 1) {
                    throw new WrongNumberException();
                }
                order.add(new Dish(dishes[numberMenu-1]));
            }
            if (typeItem == 2) {
                //Drink
                System.out.println("Drink: ");
                DrinkTypeEnum[] drinks = DrinkTypeEnum.values();
                for (int i = 0; i < drinks.length; i++) {
                    System.out.print("(" + (i + 1) + ") " + drinks[i].toString() + " price: " + drinks[i].getCost() + " / ");
                }
                System.out.println();
                System.out.println("Write number: ");
                numberMenu = sc.nextInt();
                sc.nextLine();
                if (numberMenu < 1 || numberMenu > drinks.length + 1) {
                    throw new WrongNumberException();
                }
                order.add(new Drink(drinks[numberMenu - 1]));
            }
            if (typeItem < 1 || typeItem > 3) {
                throw new WrongNumberException();
            }
            System.out.println("Item is added!");
        }
    }


    public Customer newCustomer(Scanner sc){
        String firstName, secondName;
        int age;
        String cityName, streetName;
        int zipCode, buildingNumber, apartmentNumber;
        char buildingLatter;

        System.out.println("Creating new customer");
        System.out.println("first name: ");
        firstName = sc.nextLine();
        System.out.println("second name: ");
        secondName = sc.nextLine();
        System.out.println("age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("address: ");
        System.out.println("city: ");
        cityName = sc.nextLine();
        System.out.println("zip code: ");
        zipCode = sc.nextInt();
        sc.nextLine();
        System.out.println("street name: ");
        streetName = sc.nextLine();
        System.out.println("building number: ");
        buildingNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("building latter: ");
        buildingLatter = sc.nextLine().charAt(0);
        System.out.println("apartment number: ");
        apartmentNumber = sc.nextInt();
        sc.nextLine();

        return new Customer(firstName, secondName, age, new Address(cityName, zipCode, streetName, buildingNumber, buildingLatter, apartmentNumber));
    }
}
