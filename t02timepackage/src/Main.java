import localdateandtime.*;

public class Main {
    public static void main(String[] args) {
        /*
        LocalDate, LocalTime, LocalDateTime
         */
        LocalExample.display();
        endOfLine();
        /*
        Convert the LocalDate and LocalTime to LocalDateTime and fro
         */
        ExtractToAndFroLocaDateTime.display();
        endOfLine();

        /*
        Operations on LocalDateTime
         */
        OperationsOnLocalDateTime.display();
        endOfLine();

        /*
        Duration
         */
        DurationAndPeriod.display();
        endOfLine();

        /*
        Instance and Duration
         */
        InstanceAndPeriod.display();
        endOfLine();

        /*
        ZonedTime
         */
        ZonedTimeAndConversion.display();
        endOfLine();

        /*
        ZonedTime with respect to system
         */
        SystemZonedTime.display();
        endOfLine();
    }

    public static void endOfLine(){
        System.out.println("---------------------------------------------------");
    }
}