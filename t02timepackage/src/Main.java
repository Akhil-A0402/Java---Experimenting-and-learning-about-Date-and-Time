import localdateandtime.ExtractToAndFroLocaDateTime;
import localdateandtime.LocalExample;
import localdateandtime.OperationsOnLocalDateTime;

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
    }

    public static void endOfLine(){
        System.out.println("---------------------------------------------------");
    }
}