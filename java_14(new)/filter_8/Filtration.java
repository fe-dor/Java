package filter_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Filtration {
    public static void main(String[] args) {
        List<Object> strings = new ArrayList<>();
        strings.add("qwerty");
        strings.add("error");
        strings.add("adding");
        List<Object> students = new ArrayList<>();
        students.add(new Student(2));
        students.add(new Student(1));
        students.add(new Student(4));

        FilterString filterString = new FilterString();
        FilterStudent filterStudent = new FilterStudent();
        filter(strings, filterString);
        filter(students, filterStudent);
        out(strings);
        System.out.println();
        out(students);
    }
    private static void filter(List<Object> objects, Filter filter){
        for(int i = objects.size() - 1; i >= 0; i--){
            if(filter.apply(objects.get(i)) == 0){
                objects.remove(i);
            }
        }
    }
    public static void out(List<Object> objects){
        int size = objects.size();
        for (int i = 0; i < size; i++){
            System.out.println(objects.get(i));
        }
    }
}
