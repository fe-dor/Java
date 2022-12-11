package emarket;

import java.util.ArrayList;
import java.util.Scanner;

public class Users {
    private ArrayList<User> users = new ArrayList<User>();

    public Users(){
        this.users.add(new User("ivan012", "123*_0kz"));
        this.users.add(new User("1fedor1", "hg89_1ll"));
        this.users.add(new User("777alex", "ops43_+1"));
    }

    public User newUser(){
        String login;
        String password;
        Scanner sc = new Scanner(System.in);
        System.out.println("Login: ");
        login = sc.nextLine();
        System.out.println("Password: ");
        password = sc.nextLine();
        User user = new User(login,password);
        System.out.println("Registration successful!");
        System.out.println("Hi, " + user.getLogin());
        return user;
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
