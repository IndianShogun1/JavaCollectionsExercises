import java.text.SimpleDateFormat;
import java.util.Date;

public class Ques8 {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("dd-MMMM-yyyy");
        System.out.println(ft.format(now));
    }
}
