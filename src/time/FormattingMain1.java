package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 12, 31);
        System.out.println("date = " + date);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String formatted = date.format(formatter);
        System.out.println(formatted);

        LocalDate parsed = LocalDate.parse("2024/12/31", formatter);
        System.out.println(parsed);
    }
}
