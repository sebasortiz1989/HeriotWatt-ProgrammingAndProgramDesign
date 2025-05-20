package Module7;

/*
Java API has the GregorianCalendar class in the java.util package, which you can use to obtain the year,
month, and day of a date. The no-arg constructor constructs an instance for the current date, and the methods;

get(GregorianCalendar.MONTH),

get(GregorianCalendar.YEAR),

and get(GregorianCalendar.DAY_OF_MONTH) return the year, month, and day.


Write a program to perform two tasks:

■Display the current year, month, and day.

■The GregorianCalendarclass has the setTimeInMillis(long), which can be used to set a specified elapsed
time since January 1, 1970. Set the value to 1234567898765L and display the year, month, and day.
 */
import java.util.GregorianCalendar;

public class AddEx1 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println("Year is " + calendar.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + calendar.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + calendar.get(GregorianCalendar.DATE));

        calendar.setTimeInMillis(1234567898765L);
        System.out.println("Year is " + calendar.get(GregorianCalendar.YEAR));
        System.out.println("Month is " + calendar.get(GregorianCalendar.MONTH));
        System.out.println("Date is " + calendar.get(GregorianCalendar.DATE));
    }
}