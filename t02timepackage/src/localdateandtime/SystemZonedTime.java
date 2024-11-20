package localdateandtime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class SystemZonedTime {
    /*
    Output
    My Time zone : 2024-11-20T14:14:01.281402800+05:30[Asia/Calcutta]
    Berlin : 2024-11-20T09:44:01.281402800+01:00[Europe/Berlin]
    Seoul : 2024-11-20T17:44:01.281402800+09:00[GMT+09:00]
    Seattle : 2024-11-20T01:44:01.281402800-07:00[UTC-07:00]
     */
    public static void display(){
        ZoneId sysZone = ZoneId.systemDefault();
        ZoneId berlin = ZoneId.of("Europe/Berlin");
        ZoneId seoul = ZoneId.of("GMT+9");
        ZoneId seattle = ZoneId.of("UTC-7");

        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime myTimeZone = ZonedDateTime.of(now, sysZone);

        ZonedDateTime berlinZonedDateTime = myTimeZone.withZoneSameInstant(berlin);
        ZonedDateTime seoulZonedDateTime = myTimeZone.withZoneSameInstant(seoul);
        ZonedDateTime seattleZonedDateTime = myTimeZone.withZoneSameInstant(seattle);

        System.out.println("My Time zone : " + myTimeZone);
        System.out.println("Berlin : " + berlinZonedDateTime);
        System.out.println("Seoul : " + seoulZonedDateTime);
        System.out.println("Seattle : " + seattleZonedDateTime);
    }

}
