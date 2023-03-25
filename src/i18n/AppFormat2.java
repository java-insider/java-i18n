package i18n;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class AppFormat2 {

    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.of(2000, 5, 10, 14, 35, 10);
        System.out.println(ldt);

        String formatted = ldt.format(
            DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.MEDIUM)
                .withLocale(Locale.of("en", "US"))
        );
        System.out.println(formatted);
    }
}
