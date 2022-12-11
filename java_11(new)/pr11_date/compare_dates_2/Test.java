package pr11_date.compare_dates_2;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date dateWas = new Date(1665576767289L);
        Date dateNow = new Date();
        int res = dateWas.compareTo(dateNow);
        if (res == 0){
            System.out.println("dateWas equal to dateNow");
        }
        else if (res > 0){
            System.out.println("dateWas is after dateNow");
        }
        else if (res < 0){
            System.out.println("dateWas is before dateNow");
        }
        else {
            System.out.println("error");
        }
    }
}
