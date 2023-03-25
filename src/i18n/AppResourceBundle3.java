package i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class AppResourceBundle3 {

    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("i18n.Messages", Locale.of("fr", "CA"));
        System.out.println(bundle.getString("greetings"));
    }
}
