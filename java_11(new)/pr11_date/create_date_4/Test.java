package pr11_date.create_date_4;

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        Dates dates = new Dates(2002, Calendar.MARCH, 19, 22, 21);
        System.out.println(dates.getDate());
        System.out.println(dates.getCalendar().getTime());
    }
}
