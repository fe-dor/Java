package emarket.authentication;

import emarket.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Authentication {
    private String login;
    private String password;

    public void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Login: ");
        login = sc.nextLine();
        System.out.println("Password: ");
        password = sc.nextLine();
    }

    public User check(ArrayList<User> users){
        for(int i = 0; i < users.size(); i++){
            if(users.get(i).getLogin().equals(this.login)){
                if(users.get(i).getPassword().equals(this.password)){
                    System.out.println("Authentication successful!");
                    System.out.println("Hi, " + users.get(i).getLogin());
                    return users.get(i);
                }
                else {
                    System.out.println("Incorrect password");
                    return null;
                }
            }
        }
        System.out.println("Incorrect login");
        return null;
    }
}
