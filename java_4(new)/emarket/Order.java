package emarket;

public class Order {
    public Order(User user){
        double price = 0;
        if(user.getCart().getProducts().size() == 0){
            System.out.println("Your cart is empty :(");
        }
        for(int i = 0; i < user.getCart().getProducts().size(); i++){
            System.out.println(user.getCart().getProducts().get(i).toString());
            price += Double.parseDouble(user.getCart().getProducts().get(i).
                    getPhone().getData()[1][user.getCart().getProducts().get(i).getModel()]);
        }
        System.out.println("Total price: " + price);
        System.out.println("Yor order has been processed.");
    }
}
