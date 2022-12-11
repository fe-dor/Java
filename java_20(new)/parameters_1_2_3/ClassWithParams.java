package parameters_1_2_3;

import java.io.Serializable;

public class ClassWithParams<T extends Comparable<T>, V extends Serializable, K extends Animal> {
    private final T firstP;
    private final V secondP;
    private final K thirdP;

    ClassWithParams(T firstP, V secondP, K thirdP){
        this.firstP = firstP;
        this.secondP = secondP;
        this.thirdP = thirdP;
    }

    public String getTypes(){
        return ("Type of firstP: " + firstP.getClass().getTypeName() + "\n" +
                "Type of secondP: " + secondP.getClass().getTypeName() + "\n"+
                "Type of thirdP: " + thirdP.getClass().getTypeName());
    }

    public T getFirstP() {
        return firstP;
    }

    public V getSecondP() {
        return secondP;
    }

    public K getThirdP() {
        return thirdP;
    }

    public static void main(String[] args) {
        User user = new User();
        Cat cat = new Cat();
        ClassWithParams<Integer, User, Cat> cwp = new ClassWithParams<Integer, User, Cat>(5, user, cat);
        System.out.println(cwp.getTypes());
    }
}
