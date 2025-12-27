package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter year: ");
        int year = scanner.nextInt();
        System.out.print("enter month: ");
        int month = scanner.nextInt();

        LocalDate date = LocalDate.of(year, month, 1);
        LocalDate firstDayNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth());

        System.out.println("Su Mo Tu We Th Fr Sa");
        for (int i = 0; i < date.getDayOfWeek().getValue(); i++) {
            System.out.print("   ");
        }

        while(date.isBefore(firstDayNextMonth)){
            System.out.printf("%2d ", date.getDayOfMonth());
            if(date.getDayOfWeek() == DayOfWeek.SATURDAY){
                System.out.println();
            }
            date = date.plusDays(1);
        }
    }
}
