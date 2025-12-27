package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        // runtime error
//        int seconds = now.get(ChronoField.SECOND_OF_MINUTE);
//        System.out.println("seconds = " + seconds);

        if(now.isSupported(ChronoField.SECOND_OF_MINUTE)) {
            int seconds = now.get(ChronoField.SECOND_OF_MINUTE);
            System.out.println("seconds = " + seconds);
        }
    }
}
