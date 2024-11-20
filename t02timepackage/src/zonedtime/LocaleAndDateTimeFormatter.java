package zonedtime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocaleAndDateTimeFormatter {
    /*
    Wednesday 11 20 2024
    2024 නොවැම්බර් 20
    Wed 2024 20 Nov
    20.11.2024
     */
    public static void display() {
        Locale usLocale = new Locale("en", "US");
        Locale lkLocale = new Locale("si", "LK");
        Locale jpLocale = new Locale("jp");
        Locale deLocale = new Locale("de", "CH");

        LocalDate today = LocalDate.now();

        DateTimeFormatter usDTF = DateTimeFormatter.ofPattern("EEEE MM dd yyyy", usLocale);
        DateTimeFormatter lkDTF = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).localizedBy(lkLocale);
        DateTimeFormatter jpDTF = DateTimeFormatter.ofPattern("EEEE yyyy dd MMM", jpLocale);
        DateTimeFormatter deDTF = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).localizedBy(deLocale);

        String localizedDateForUS = today.format(usDTF);
        String localizedDateForLK = today.format(lkDTF);
        String localizedDateForJP = today.format(jpDTF);
        String localizedDateForDE = today.format(deDTF);

        System.out.println(localizedDateForUS);
        System.out.println(localizedDateForLK);
        System.out.println(localizedDateForJP);
        System.out.println(localizedDateForDE);
    }
}
