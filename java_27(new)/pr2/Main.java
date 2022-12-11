package pr2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = createMap();
        System.out.println(getSameFirstNameCount(map));
    }
    private static Map<String, String> createMap(){
        Map<String, String> map = new HashMap<>();
        map.put("Паращенко", "Федор");
        map.put("Smith", "Andrew");
        map.put("Кузнецов", "Федор");
        map.put("Иванов", "Иван");
        map.put("Scott", "Michel");
        map.put("Martinez", "Oscar");
        map.put("Halpert", "Oscar");
        map.put("Shrut", "Dwight");
        map.put("Flanderson", "Toby");
        map.put("Bernard", "Andrew");
        return map;
    }

    private static int getSameFirstNameCount(Map<String, String> map){
        Set<String> set = new HashSet<>();
        int c = 0;
        int c_this_name;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            set.add(entry.getValue());
        }
        for (String s : set) {
            c_this_name = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if(s.equals(entry.getValue())){
                    c_this_name++;
                }
            }
            if (c_this_name > 1){
                c+=c_this_name;
            }
        }

        return c;
    }


}
