package emarket;

import emarket.catalog.phones.Phone;

import java.util.ArrayList;

public class Cart {

    private ArrayList<Product> products;

    public Cart(User user){
        products = new ArrayList<>();
    }

    public void addToCart(Product product){
        products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}
