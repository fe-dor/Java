package phone;

import java.util.ArrayList;

public class Phone {
    private String number;
    private String model;
    private String weight;

    public Phone(String number, String model, String weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String inNumber){
        System.out.println("Calls: " + inNumber);
    }

    public void receiveCall(String inNumber, String inName){
        System.out.println("Calls: " + inName + " " + inNumber);
    }

    public void sendMessage(String s[]){
        for (int i = 0; i < s.length; i++){
            System.out.println(s[i]);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }

    public String getNumber() {
        return number;
    }
}
