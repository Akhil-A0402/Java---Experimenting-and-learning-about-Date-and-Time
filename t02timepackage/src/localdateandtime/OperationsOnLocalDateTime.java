package localdateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class OperationsOnLocalDateTime {
    /*
    Output
    The future time : 2124-11-22T17:29:26.201942600
    Is future before ldt :false
    Is future after ldt : true
     */
    public static void display(){
        LocalDateTime ldt = LocalDateTime.now();
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();

        LocalDateTime futureTime = ldt
                .plusYears(100)
                .plusDays(2)
                .plusHours(5);

        System.out.println("The future time : " + futureTime);

        boolean isBefore = futureTime.isBefore(ldt);
        boolean isAfter = futureTime.isAfter(ldt);

        System.out.println("Is future before ldt :" + isBefore);
        System.out.println("Is future after ldt : " + isAfter);
    }
}
