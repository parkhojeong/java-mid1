package time.test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 1, 1);
        for (int i = 0; i < 5; i++) {
            System.out.println("date = " + date);
            date = date.plusWeeks(2);
        }
    }
}
