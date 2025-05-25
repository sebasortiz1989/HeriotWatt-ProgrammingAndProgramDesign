package Module9;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test {
    public static void main(String[] args) {
        Calendar cal = new GregorianCalendar();
        cal.get(Calendar.WEEK_OF_MONTH);
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        Double i = 4.5;
        System.out.println(i);
    }
}
