package hasDigitPlus_4;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(hasDigitPlus("1 / 3 -5"));
        System.out.println(hasDigitPlus("1 + 3 -5"));
        System.out.println(hasDigitPlus("1 / 3+5"));
    }
    public static boolean hasDigitPlus(String s){
        return Pattern.compile("\\d+\\s*\\+").matcher(s).find();
    }
}
