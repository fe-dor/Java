package emarket.catalog;

import emarket.Cart;
import emarket.Order;
import emarket.Product;
import emarket.User;
import emarket.catalog.enums.Iphone;
import emarket.catalog.enums.Samsung;
import emarket.catalog.enums.Xiaomi;
import emarket.catalog.phones.Phone;

import java.util.Scanner;

public class Catalog {
    private User user;

    public Catalog(User user){
        this.user = user;
    }

    public int showCatalog(Scanner sc){
        System.out.println("Xiaomi(1), Apple(2), Samsung(3)");
        int x = sc.nextInt();
        Phone phone = null;
        if(x == 1){
            phone = new emarket.catalog.phones.Xiaomi();
            for(Xiaomi xiaomi : Xiaomi.values()){
                System.out.println("(" + xiaomi.getJ() + ")" + xiaomi + " : " + xiaomi.getI() + "$");
            }
        }
        if(x == 2){
            phone = new emarket.catalog.phones.Iphone();
            for(Iphone iphone : Iphone.values()){
                System.out.println("(" + iphone.getJ() + ")" + iphone + " : " + iphone.getI() + "$");
            }
        }
        if(x == 3){
            phone = new emarket.catalog.phones.Samsung();
            for(Samsung samsung : Samsung.values()){
                System.out.println("(" + samsung.getJ() + ")" + samsung + " : " + samsung.getI() + "$");
            }
        }

        int m = getModel(sc) - 1;
        if(m < 0 || m > 2){
            System.out.println("Try again!");
            return 0;
        }
        user.getCart().addToCart(new Product(phone, m));
        System.out.println("Added to cart!");
        System.out.println("Continue shopping(1), Go to cart(2)");
        return sc.nextInt();
    }
    private int getModel(Scanner sc){
        System.out.println("Choose model: ");
        return sc.nextInt();
    }
}
