package regex_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        boolean flag = checkExpression("(3+5)-9*(4+1)");
        if(flag){
            System.out.println("Правильное выражение со скобками");
        }
        else {
            System.out.println("Неправильное выражение со скобками");
        }

    }


    private static boolean checkExpression(String input) {
        Pattern pattern = Pattern.compile("\\([\\d+/*-]*\\)"); //патерн - любое кол-во цифр и знаков внутри скобок
        Matcher matcher = pattern.matcher(input);
        do {
            input = matcher.replaceAll(""); //удаляем из строки все совпадение
            matcher = pattern.matcher(input);
        } while (matcher.find()); //проверяем есть ли еще совпадения
        return input.matches("[\\d+/*-]*"); //любое кол-во цифр и знаков
    }
}
