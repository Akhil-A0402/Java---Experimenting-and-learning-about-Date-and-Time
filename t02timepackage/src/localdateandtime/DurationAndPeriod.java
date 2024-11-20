package localdateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class DurationAndPeriod {

    /*
    Output: For year 2025
    Christmas in : 1 months and 5 days
    Period display format: P1Y1M5D

     */

    public static void display() {
        LocalDate now = LocalDate.now();
        LocalDate xmas = LocalDate.of(now.getYear(), 12, 25);

        Period timeToChristmas = Period.between(now, xmas);
        System.out.println(String.format("Christmas in : %d months and %d days", timeToChristmas.getMonths(), timeToChristmas.getDays()));

        // Checking the format of Period value
        System.out.println("Period display format: " + timeToChristmas);
    }
}
