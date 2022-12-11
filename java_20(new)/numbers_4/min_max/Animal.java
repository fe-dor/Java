package numbers_4.min_max;

import java.io.Serializable;

public class Animal implements Comparable<Animal> {
    private int years;
    private String type;

    public Animal(int years, String type) {
        this.years = years;
        this.type = type;
    }

    @Override
    public int compareTo(Animal o) {
        return Integer.compare(this.years, o.years);
    }

    @Override
    public String toString() {
        return ""+type;
    }
}
