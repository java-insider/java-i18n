package i18n;

import java.util.Arrays;
import java.util.Locale;

public class AppLocale {

    public static void main(String[] args) {

        Locale defaultLocale = Locale.getDefault();
        System.out.println(defaultLocale);

        System.out.println(Arrays.toString(Locale.getISOLanguages()));
        System.out.println(Arrays.toString(Locale.getISOCountries()));

        Locale locale1 = Locale.of("fr", "FR");
        System.out.println(locale1);

        Locale locale2 = Locale.forLanguageTag("fr-FR");
        System.out.println(locale2);
    }
}
