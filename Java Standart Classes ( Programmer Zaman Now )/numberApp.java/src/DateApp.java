// Date & Calender Class
import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {
        // Date tanggal = new Date();

        Calendar calender = Calendar.getInstance();
        calender.set(Calendar.YEAR, 2019);
        calender.set(Calendar.MONTH, Calendar.SEPTEMBER);
        calender.set(Calendar.HOUR_OF_DAY, 10);
        Date result = calender.getTime();
        System.out.println(result); 
    }
}
