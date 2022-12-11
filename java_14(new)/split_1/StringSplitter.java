package split_1;

import java.util.Arrays;
import java.util.Scanner;

public class StringSplitter {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Введите паттерн(' ', ':', ','):"); //ограничения метода split
        String p = sc.nextLine();
        System.out.println(Arrays.toString(str.split(p))); //split возвращает массив
    }
}
