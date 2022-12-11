package pr11_date.create_date_4;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Dates {
    private Date date;
    private Calendar calendar;

    public Dates(int year, int month, int day, int hrs, int min) {
        date = new Date(year - 1900, month, day, hrs, min);
        calendar = new GregorianCalendar(year, month, day, hrs, min);
    }

    public Date getDate() {
        return date;
    }

    public Calendar getCalendar() {
        return calendar;
    }
}
