package zhangyi.insight.java8.newdateapi;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DateTest {
    @Test
    public void test_LocalDate() {
        LocalDate date = LocalDate.of(2015, 1, 6);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfYear());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear());

        System.out.println(date.plusWeeks(1));
        System.out.println(date.minusYears(10));
        System.out.println(date.plus(10, ChronoUnit.MONTHS).minusDays(5));
    }

    @Test
    public void test_LocalTime() {
        LocalTime time = LocalTime.of(14, 20, 15);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
    }
}
