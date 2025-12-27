package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.JapaneseDate;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2025, 12, 27, 12, 10, 10);

        System.out.println("nowDt = " + nowDt);
        System.out.println("ofDt = " + ofDt);

        LocalDate localDate = ofDt.toLocalDate();
        System.out.println("localDate = " + localDate);

        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localTime = " + localTime);

        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("localDateTime = " + localDateTime);

        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println("ofDtPlus = " + ofDtPlus);
        LocalDateTime ofDtPlus1Year = ofDt.plusYears(1);
        System.out.println("ofDtPlus1Year = " + ofDtPlus1Year);

        System.out.println("before = " + nowDt.isBefore(ofDt));
        System.out.println("after = " + nowDt.isAfter(ofDt));
        System.out.println("equal = " + nowDt.isEqual(ofDt)); // same time with timeline
        System.out.println("equal = " + nowDt.equals(ofDt)); // same timezone, same time

    }
}
