package localdateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ExtractToAndFroLocaDateTime {
    /*
    Output:
    Adding date to time:2024-11-20T23:11:01
    Adding time to date: 2024-11-20T23:11:01
    Only the date: 2024-11-20
    Only the time: 23:11:01
    2024
    NOVEMBER
    20
    23
    11
     */
    public static  void display() {
        LocalTime lt = LocalTime.of(23, 11,1);
        LocalDate ld = LocalDate.of(2024, 11, 20);
        // To combine Local Date to Time
        LocalDateTime ldt1 = lt.atDate(ld);
        System.out.println("Adding date to time:" + ldt1);

        // To combine Time to a date
        LocalDateTime ldt2 = ld.atTime(lt);
        System.out.println("Adding time to date: " + ldt2);

        // To extract the date
        LocalDate ldext = ldt1.toLocalDate();
        System.out.println("Only the date: " + ldext);

        // To extract the time
        LocalTime ltext = ldt1.toLocalTime();
        System.out.println("Only the time: " + ltext);

        // To get the specific portion of date and time
        System.out.println(ldt2.getYear());
        System.out.println(ldt2.getMonth());
        System.out.println(ldt2.getDayOfMonth());
        System.out.println(ldt2.getHour());
        System.out.println(ldt2.getMinute());
    }
}
