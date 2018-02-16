import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Ques9 {
    public static void main(String[] args) {
        Date now = new Date();
        Locale[] locales = {Locale.US, Locale.GERMANY, Locale.FRANCE};
        DateFormat ft = null;
        for (Locale locale : locales) {
            ft = DateFormat.getDateInstance(DateFormat.FULL, locale);
            System.out.println("The date for " + locale.getDisplayCountry() + " is " + ft.format(now));
        }
    }
}
