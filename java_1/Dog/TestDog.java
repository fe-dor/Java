package Dog;

import Dog.Dog;

public class TestDog {
    public static void main(String[] args){
        Dog d1 = new Dog("George", 4);
        Dog d2 = new Dog("Steve", 1);
        Dog d3 = new Dog("Paul");
        d3.setAge(8);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
