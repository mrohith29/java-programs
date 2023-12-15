package moodle_programs;
import java.time.*;
import java.util.Scanner;
import java.time.temporal.TemporalAdjuster;

public class date_and_time_api {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
//        LocalDate n  = LocalDate.
        LocalDate date = LocalDate.of(year, month, 1);
        System.out.println(date.getDayOfYear());
        System.out.println(date);
        System.out.println(date.getDayOfWeek());
        int x = date.lengthOfMonth();
//        LocalDate d = LocalDate.of(month,year,1);
        LocalDate newDate = LocalDate.of(year, month, x);
//        System.out.println(date.getDayOfWeek());
        System.out.println(newDate.getDayOfWeek());
//        LocalDate date = LocalDate.now();
//        System.out.println(date);
//        System.out.println(date.getDayOfMonth());
//        System.out.println(date.getDayOfWeek());
//        System.out.println(date.getDayOfYear());
//        System.out.println(date.getMonth());
//        System.out.println(date.getMonthValue());
//        System.out.println(date.getYear());
//        System.out.println(date.isLeapYear());
//        System.out.println(date.lengthOfMonth());
//        System.out.println(date.lengthOfYear());
//        System.out.println(date.minusDays(10));
//        System.out.println(date.minusMonths(10));
//        System.out.println(date.minusYears(10));
//        System.out.println(date.plusDays(10));
//        System.out.println(date.plusMonths(10));
//        System.out.println(date.plusYears(10));
//        System.out.println(date.withDayOfMonth(10));
//        System.out.println(date.withDayOfYear(10));
//        System.out.println(date.withMonth(10));
//        System.out.println(date.withYear(10));
        /*

//        System.out.println(date.with(TemporalAdjuster.lastDayOfMonth()));
//        System.out.println(date.with(TemporalAdjuster.firstDayOfMonth()));
//        System.out.println(date.with(TemporalAdjuster.firstDayOfNextMonth()));
//        System.out.println(date.with(TemporalAdjuster.firstDayOfNextYear()));
//        System.out.println(date.with(TemporalAdjuster.firstDayOfYear()));
//        System.out.println(date.with(TemporalAdjuster.firstInMonth(DayOfWeek.MONDAY)));
//        System.out.println(date.with(TemporalAdjuster.lastDayOfYear()));
//        System.out.println(date.with(TemporalAdjuster.lastInMonth(DayOfWeek.MONDAY)));
//        System.out.println(date.with(TemporalAdjuster.next(DayOfWeek.MONDAY)));
//        System.out.println(date.with(TemporalAdjuster.nextOrSame(DayOfWeek.MONDAY)));
//        System.out.println(date.with(TemporalAdjuster.previous(DayOfWeek.MONDAY)));
//        System.out.println(date.with(TemporalAdjuster.previousOrSame(DayOfWeek.MONDAY)));
//        System.out.println(date.with(TemporalAdjuster.dayOfWeekInMonth(1, DayOfWeek.MONDAY)));
//        System.out.println(date.with(TemporalAdjuster.next(DayOfWeek.MONDAY)));
//        System.out.println(date.with(TemporalAdjuster.nextOrSame(DayOfWeek.MONDAY)));
//        System.out.println(date.with(TemporalAdjuster.previous(DayOfWeek.MONDAY)));
//        System.out.println(date.with(TemporalAdjuster.previousOrSame(DayOfWeek.MONDAY)));
//        System.out.println(date.with(TemporalAdjuster.dayOfWeekInMonth(1,
//                DayOfWeek.MONDAY)));
         */
    }
}
