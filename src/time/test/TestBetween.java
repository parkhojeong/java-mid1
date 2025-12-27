package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2024, 1, 1);
        LocalDate end = LocalDate.of(2024, 11, 21);
        System.out.println("start = " + start);
        System.out.println("end = " + end);

        Period between = Period.between(start, end);
        long daysBetween = ChronoUnit.DAYS.between(start, end);
        System.out.println(between.getYears() + "years " + between.getMonths() + "months " + between.getDays() + "days");
        System.out.println("daysBetween = " + daysBetween);


    }
}
