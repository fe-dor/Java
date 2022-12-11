package pr11_date.student_3;

import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date date = new Date(102, Calendar.MARCH, 19, 22, 21, 32);
        Student student = new Student("Федор", "Паращенко", "ИВТ", 2, "ивбо-04-21",
                12312, 68.5, date);
        System.out.println(student.getDateOfBirth());
    }
}
