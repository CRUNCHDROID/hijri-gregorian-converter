import net.crunchdroid.hijri.gregorian.converter.ConvertedDate;
import net.crunchdroid.hijri.gregorian.converter.UmmAlqura;
import org.junit.Test;

import java.util.Date;
import java.util.Locale;

/**
 * @author CrunchDroid
 */
public class UmmAlquraModuleTest {

    @Test
    public void gregorian2UmmAlqura() throws Exception {
        System.out.println("=== TO UMM AL-QURA ===");

        // Initialize
        UmmAlqura calculator = new UmmAlqura(null);
        // or
        new UmmAlqura(Locale.getDefault());

        ConvertedDate date;

        // Gregorian to Hijri
        date = calculator.g2h(new Date());

        // Print
        System.out.println(date.format("EEEE, d MMMM yyyy G"));
        System.out.println(date.format("EEE, d MMM yyyy G"));
        System.out.println(date.format("EEE, dd-MM-yy G"));
        System.out.println(date.formatSource("EEEE, d MMMM yyyy"));
        System.out.println(date.formatSource("EEE, d MMM yyyy"));
        System.out.println(date.formatSource("EEE, dd-MM-yy"));
        System.out.println(date.toDate());
    }

    @Test
    public void ummAlqura2Gregorian() throws Exception {

        System.out.println("=== FROM UMM AL-QURA ===");

        // Hijri to Gregorian
        ConvertedDate date = new UmmAlqura(Locale.getDefault()).h2g(23, 9, 1438);

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
