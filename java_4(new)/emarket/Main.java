package emarket;

import emarket.authentication.Authentication;
import emarket.catalog.Catalog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Users users = new Users();
        User user = null;
        System.out.println("Welcome to phone's e-market!");
        Scanner sc = new Scanner(System.in);
        while (user == null){
            user = start(users, sc);
        }
        Catalog catalog = new Catalog(user);
        while(catalog.showCatalog(sc) != 2){
        };
        Order order = new Order(user);
        sc.close();
    }
    public static User start(Users users, Scanner sc){
        System.out.println("Authorization(1), Registration(2)");
        String x = sc.next();
        if(x.equals("1")){
            Authentication authentication = new Authentication();
            authentication.getData();
            return authentication.check(users.getUsers());
        }
        else {
            return users.newUser();
        }
    }

}
