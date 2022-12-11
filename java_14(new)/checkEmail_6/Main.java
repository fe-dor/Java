package checkEmail_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkEmail("ivanivanov@gmail.com"));
        System.out.println(checkEmail(".iv ivanov@gmail.com"));
        System.out.println(checkEmail("alexanderinvanov@gmail"));
        System.out.println(checkEmail("qwerewe@g@mail.ru"));
    }
    public static boolean checkEmail(String s){
        Matcher m = Pattern.compile(
                "[a-zA-Z0-9]+[a-zA-Z0-9!#$%&'*+\\-/=?^_`{|}~.]*@[a-zA-Z0-9\\-_.]+\\.[a-zA-Z]+"
        ).matcher(s);
        return m.find() && m.group().equals(s);
    }
}
