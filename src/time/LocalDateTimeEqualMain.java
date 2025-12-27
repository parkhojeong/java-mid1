package time;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.chrono.JapaneseDate;

public class LocalDateTimeEqualMain {
    public static void main(String[] args) {
        // 1. ISO 달력 기준 현재 시간
        LocalDateTime now = LocalDateTime.now();

        // 2. 일본 달력 기준 같은 시간 생성 (비교를 위해 ChronoLocalDateTime 사용)
        ChronoLocalDateTime<?> japaneseDateTime = JapaneseDate.now().atTime(now.toLocalTime());

        // equals() 비교: 연표가 다르므로 false
        System.out.println("equals(): " + now.equals(japaneseDateTime));

        // isEqual() 비교: 시점이 같으므로 true
        System.out.println("isEqual(): " + now.isEqual(japaneseDateTime));
    }
}
