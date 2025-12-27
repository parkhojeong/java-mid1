package time.test;

import java.time.LocalDateTime;
import java.time.Period;

public class TestPlus {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        System.out.println("dateTime = " + dateTime);

        LocalDateTime plussed = dateTime
                .plus(Period.of(1, 2, 3))
                .plusHours(4);

        System.out.println("plussed = " + plussed);

    }
}
