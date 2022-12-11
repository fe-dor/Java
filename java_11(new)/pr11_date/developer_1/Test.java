package pr11_date.developer_1;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.setFullName("Паращенко Федор");
        developer.setDateOfGetTask(new Date(1665576767289L));
        System.out.println(developer);

    }
}
