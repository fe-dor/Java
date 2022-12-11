package pr3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("capacitor", 100);
        map.put("resistor", 200);
        map.put("inductor", 300);
        map.put("emf source", 400);
        System.out.println(map.get("capacitor"));
        map.remove("capacitor");
        System.out.println(map.get("capacitor"));
    }
}
