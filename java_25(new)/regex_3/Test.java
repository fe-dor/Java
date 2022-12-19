package regex_3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Test {

    private static String S;
    private static boolean bool;


    private static final String IPADDRESS_PATTERN = //проверка чтобы каждое число было от 0 до 255 и были точки
            "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";



    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        S=s.next();
        bool= validate(S);
        if(bool==true) {
            System.out.println("Строка является IP адресом");
        }
        else {
            System.out.println("Строка не является IP адресом");
        }
    }

    public static boolean validate(String ip){
        Pattern pattern = Pattern.compile(IPADDRESS_PATTERN);
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }

}
/*
– пример правильных выражений: 127.0.0.1, 255.255.255.0.
– пример неправильных выражений: 1300.6.7.8, abc.def.gha.bcd.
*/
