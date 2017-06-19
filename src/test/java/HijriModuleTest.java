import net.crunchdroid.hijri.gregorian.converter.ConvertedDate;
import net.crunchdroid.hijri.gregorian.converter.Hijri;
import org.junit.Test;

import java.util.Date;
import java.util.Locale;

/**
 * @author CrunchDroid
 */
public class HijriModuleTest {

    @Test
    public void gregorian2Hijri() throws Exception {

        System.out.println("=== TO HIJRI ===");

        // Initialize
        Hijri calculator = new Hijri(null);

        // or
        new Hijri(Locale.getDefault());

        ConvertedDate date;

        // Gregorian to Hijri
        date = calculator.hDate(new Date());

        // Print
        System.out.println(date.format("EEEE, d MMMM yyyy G ('long')"));
        System.out.println(date.format("EEE, d MMM yyyy G '''''''MMMedium'"));
        System.out.println(date.format("EEE, dd-MM-yy G '''short'''"));
        System.out.println(date.formatSource("EEEE, d MMMM yyyy"));
        System.out.println(date.formatSource("EEE, d MMM yyyy"));
        System.out.println(date.formatSource("EEE, dd-MM-yy"));
        System.out.println(date.toDate());

        // or manually
        System.out.printf("Long: %s, %s %s %s %s\n",
                date.getDayOfWeekName(),
                date.getDayOfMonth(),
                date.getMonthName(),
                date.getYear(),
                date.getEraName());
        System.out.printf("Medium: %s %s-%s-%s\n",
                date.getDayOfWeekShortName(),
                date.getDayOfMonth(),
                date.getMonthShortName(),
                date.getYear());
        System.out.printf("Short: %s-%s-%s\n",
                date.getDayOfMonth(),
                date.getMonth(),
                date.getYear());
    }

    @Test
    public void hijri2Gregorian() throws Exception {

        System.out.println("=== FROM HIJRI ===");

        // Hijri to Gregorian
        ConvertedDate date = new Hijri(Locale.getDefault()).gDate(23, 9, 1438);

        // Print
        System.out.println(date.format("EEEE, d MMMM yyyy G"));
        System.out.println(date.format("EEE, d MMM yyyy G"));
        System.out.println(date.format("EEE, dd-MM-yy G"));
        System.out.println(date.formatSource("EEEE, d MMMM yyyy"));
        System.out.println(date.formatSource("EEE, d MMM yyyy"));
        System.out.println(date.formatSource("EEE, dd-MM-yy"));
        System.out.println(date.toDate());


    }
}
