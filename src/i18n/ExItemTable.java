package i18n;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class ExItemTable {

    public record Item(String nameKey, double price, LocalDate purchaseDate) {}

    public static void main(String[] args) {

        var items = List.of(
            new Item("i102", 3.2, LocalDate.of(2023, 2, 1)),
            new Item("i134", 6.4, LocalDate.of(2023, 2, 10)),
            new Item("i100", 7, LocalDate.of(2023, 2, 5)),
            new Item("i164", 6.76, LocalDate.of(2023, 2, 8))
        );
        var locale = Locale.of("pt", "BR");
        //var locale = Locale.US;

        System.out.println(buildTable(items, locale));
    }

    private static String buildTable(List<Item> items, Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("i18n.items", locale);
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(locale);

        return items
            .stream()
            .map(i -> {
                String name = bundle.getString(i.nameKey);
                String price = nf.format(i.price);
                String date = dtf.format(i.purchaseDate);
                return String.format("%s\t\t%s\t\t%s", name, price, date);
            })
            .collect(Collectors.joining("\n"));
    }
}
