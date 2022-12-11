package pr1;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet();
        set.add("capacitor");
        set.add("resistor");
        set.add("inductor");
        set.add("emf source");
        TreeSet<String> treeSet = new TreeSet<>(set);

    }
}
