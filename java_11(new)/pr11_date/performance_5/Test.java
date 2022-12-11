package pr11_date.performance_5;

import pr11_date.developer_1.Developer;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        System.out.println("ArrayList: ");
        long time1 = System.currentTimeMillis();
        System.out.println(time1);
        List<Developer> developer1 = new ArrayList<Developer>();
        for(int i = 0; i < 10000; i++){
            developer1.add(new Developer("Паращенко Федор", new Date(1665576767289L)));
            developer1.add(new Developer("Иван Иванов", new Date(1665576767284L)));
            developer1.add(new Developer("Степан Петров", new Date(1665576767285L)));
            developer1.add(2, new Developer("Петр Петров", new Date(1665576767282L)));
            developer1.remove(1);
            developer1.get(i % 10000);
        }
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis() - time1);


        System.out.println("LinkedList: ");
        long time2 = System.currentTimeMillis();
        System.out.println(time2);

        List<Developer> developer2 = new ArrayList<Developer>();
        for(int i = 0; i < 10000; i++){
            developer2.add(new Developer("Паращенко Федор", new Date(1665576767289L)));
            developer2.add(new Developer("Иван Иванов", new Date(1665576767282L)));
            developer2.add(new Developer("Степан Петров", new Date(1665576767281L)));
            developer2.add(2, new Developer("Петр Петров", new Date(1665576767282L)));
            developer2.remove(1);
            developer2.get(i % 10000);
        }
        System.out.println(System.currentTimeMillis());
        System.out.println(System.currentTimeMillis() - time2);
    }
}
