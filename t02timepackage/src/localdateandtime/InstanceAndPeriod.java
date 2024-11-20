package localdateandtime;

import java.time.Duration;
import java.time.Instant;

public class InstanceAndPeriod {
    /*
    Output:
    Timestamp : 2024-11-20T07:31:14.037751400Z
    Nanoseconds : 37751400
    PT3H
    PT2H45M
    Seconds : 9900
     */
    public static void display() {
        // Get current timestamp
        Instant instant = Instant.now();
        System.out.println("Timestamp : " + instant);

        // Get nanoseconds from last seconds
        int nanoseconds = instant.getNano();
        System.out.println("Nanoseconds : " + nanoseconds);

        // Set the duration to three hours
        Duration threeHours = Duration.ofHours(3);

        // subtracting 15 mins
        /*
        Note: The objects are immutable as mentioned above so any action performed on the variable isn't reflected in
        variable, thus new variable needs to be created for storing the data, otherwise directly display.
         */
        threeHours.minusMinutes(15);
        System.out.println(threeHours);
        System.out.println(threeHours.minusMinutes(15));

        long seconds = threeHours.minusMinutes(15).getSeconds();
        System.out.println("Seconds : " + seconds);
    }
}
