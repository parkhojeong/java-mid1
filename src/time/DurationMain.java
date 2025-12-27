package time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {
    public static void main(String[] args) {
        Duration duration = Duration.ofMinutes(30);
        System.out.println(duration);

        LocalTime lt = LocalTime.of(1, 0);
        System.out.println("lt = " + lt);

        LocalTime plusTime = lt.plus(duration);
        System.out.println("plusTime = " + plusTime);

        LocalTime start = LocalTime.of(9, 0);
        LocalTime end = LocalTime.of(10, 0);
        Duration between = Duration.between(start, end);
        System.out.println("between = " + between.getSeconds());
        System.out.println("between.toHours() = " + between.toHours());
        System.out.println("between.toMinutes() = " + between.toMinutes());
        System.out.println("between.toMillisPart() = " + between.toMillisPart());
    }
}
