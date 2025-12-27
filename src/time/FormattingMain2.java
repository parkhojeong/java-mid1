package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.of(2025, 12, 27, 10, 50, 30);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatted = now.format(formatter);
        System.out.println(formatted);

        String dateTimeString = "2030-01-01 11:30:00";
        LocalDateTime parsed = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println(parsed);
    }
}
