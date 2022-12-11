package emarket;

public class User {
    private String login;
    private String password;
    private Cart cart;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.cart = new Cart(this);
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Cart getCart() {
        return cart;
    }
}
