package localdateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalExample {

    //Output
    /*
    Local Date : 2024-11-20
    Local Time: 09:11:44.855413400
    Local Date Time : 2024-11-20T09:11:44.855413400
    Local Date on : 2024-11-20
    Local Time on: 09:21
    Local Date Time on: 2024-11-20T09:21
     */
    public static void display(){
        LocalDate ld = LocalDate.now();
        System.out.println("Local Date : " + ld);

        LocalTime lt = LocalTime.now();
        System.out.println("Local Time: " + lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("Local Date Time : " + ldt);

        // To define data to a specific date and time we are going to use `of` method
        LocalDate ldo = LocalDate.of(2024, 11, 20);
        System.out.println("Local Date on : " + ldo);

        LocalTime lto = LocalTime.of(9, 21);
        System.out.println("Local Time on: " + lto);

        LocalDateTime ldto = LocalDateTime.of(2024, 11,20, 9, 21);
        System.out.println("Local Date Time on: " + ldto);

    }
}
