package numbers_5;

import java.util.HashMap;
import java.util.Map;

public class Number {
    private String countryCode;
    private String firstThreeNumbers;
    private String secondThreeNumbers;
    private String fourNumbers;
    private static final Map<String,String> DICTIONARY = new HashMap<>();

    public Number(String number){
        fillDictionary();
        int length = number.length();
        String code = number.substring(0, length - 10);
        if(code.startsWith("+"))
            countryCode = code.substring(1);
        else
            countryCode = DICTIONARY.get(code);
        firstThreeNumbers = number.substring(length - 10, length - 7);
        secondThreeNumbers = number.substring(length - 7, length - 4);
        fourNumbers = number.substring(length - 4);
    }

    @Override
    public String toString() {
        return "Number{" +
                "countryCode='" + countryCode + '\'' +
                ", firstThreeNumbers='" + firstThreeNumbers + '\'' +
                ", secondThreeNumbers='" + secondThreeNumbers + '\'' +
                ", fourNumbers='" + fourNumbers + '\'' +
                '}';
    }

    public static void fillDictionary(){
        DICTIONARY.put("8","7");
    }
}
