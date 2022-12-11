package findrubeurusd_3;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(findRubEurUsd("12.3RUB, fejhge12 EUdsfrg3.789 USD"));
    }
    public static ArrayList<String> findRubEurUsd(String s){
        Pattern p  = Pattern.compile("\\d+(\\.\\d+)?\\s?((USD)|(EUR)|(RUB))");  //сколько угодно чисел, точка и
                                                                                //сколько угодно чисел - не обязательно
                                                                                //пробел - не обязательно, валюта
        Matcher m = p.matcher(s);
        ArrayList<String> ans = new ArrayList<>();
        while (m.find()){
            ans.add(m.group());
        }
        return ans;
    }
}
