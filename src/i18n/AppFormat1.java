package i18n;

import java.text.NumberFormat;
import java.util.Locale;

public class AppFormat1 {

    public static void main(String[] args) {
        double n = 3456.78;

        NumberFormat nf1 = NumberFormat.getNumberInstance(Locale.of("pt", "BR"));
        NumberFormat nf2 = NumberFormat.getNumberInstance(Locale.of("en", "US"));

        NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));
        NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.of("en", "US"));

        System.out.println(n);
        System.out.println(nf1.format(n));
        System.out.println(nf2.format(n));
        System.out.println(nf3.format(n));
        System.out.println(nf4.format(n));
    }
}
