import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        /*
        Before Java 8
         */
        Date now = new Date();
        // Output => Current date: Wed Nov 20 08:56:36 IST 2024
        /*
        Issue it pick up default time zone
         */
        System.out.println("Current date: " + now);

        Calendar cal = Calendar.getInstance();
        // Output => Index of January: 0
        /*
        The classes are zero based index approach to represent the months, thus begins from index 0
         */
        System.out.println("Index of January: " + cal.JANUARY);

        // Another issue is the conversion of data with TimeZone from database by JDBC.

    }
}