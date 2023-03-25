package i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class AppResourceBundle {

    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("Messages", Locale.of("pt", "BR"));

        String someText = bundle.getString("msg");
        System.out.println(someText);
    }
}
