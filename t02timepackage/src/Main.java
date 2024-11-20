import localdateandtime.ExtractToAndFroLocaDateTime;
import localdateandtime.LocalExample;

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
    }

    public static void endOfLine(){
        System.out.println("---------------------------------------------------");
    }
}