package i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class AppResourceBundle2 {

    public static void main(String[] args) {
        System.out.println(Locale.getDefault());

        ResourceBundle bundle = ResourceBundle.getBundle("i18n.Messages", Locale.of("pt", "BR"));
        System.out.println(bundle.getString("greetings"));
    }
}
