package time.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2024, 1, 1, 9, 0, 0);
        ZonedDateTime zdtInSeoul = ZonedDateTime.of(dateTime, ZoneId.of("Asia/Seoul"));
        ZonedDateTime zdtInLondon = zdtInSeoul.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime zdtInNewYork = zdtInSeoul.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("zdtInSeoul = " + zdtInSeoul);
        System.out.println("zdtInLondon = " + zdtInLondon);
        System.out.println("zdtInNewYork = " + zdtInNewYork);

    }
}
