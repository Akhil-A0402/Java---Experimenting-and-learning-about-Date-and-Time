package localdateandtime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.SortedMap;

public class ZonedTimeAndConversion {
    /*
    Output
    Past date and time: 2024-11-19T18:30
    Berlin : 2024-11-19T18:30+01:00[Europe/Berlin]
    Denver: 2024-11-19T18:30-06:00[UTC-06:00]
     */

    public static void display(){
        LocalDateTime ldt = LocalDateTime.of(2024, 11, 19, 18, 30);
        System.out.println("Past date and time: " + ldt);
        // Setting the Zone to Berlin, Germany
        ZoneId zoneBerlin = ZoneId.of("Europe/Berlin");

        // Setting time to Denver, Colorado, USA
        ZoneId zoneDenver = ZoneId.of("UTC-6");

        // Past-time in Berlin
        ZonedDateTime pastDateTimeInBerlin = ZonedDateTime.of(ldt, zoneBerlin);
        System.out.println("Berlin : " + pastDateTimeInBerlin);

        // Past-time in Denver
        ZonedDateTime pastDateTimeInDenver = ZonedDateTime.of(ldt, zoneDenver);
        System.out.println("Denver: " + pastDateTimeInDenver);

    }
}
