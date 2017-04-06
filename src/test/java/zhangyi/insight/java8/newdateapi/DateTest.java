package zhangyi.insight.java8.newdateapi;

import org.junit.Test;
import org.mockito.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DateTest {
    @Test
    public void test_LocalDate() {
        LocalDate date = LocalDate.of(2015, 1, 6);
        assertThat(date.getYear(), is(2015));
        assertThat(date.getMonth(), is(Month.JANUARY));
        assertThat(date.getDayOfMonth(), is(6));
        assertThat(date.getDayOfYear(), is(6));
        assertThat(date.lengthOfMonth(), is(31));
        assertThat(date.isLeapYear(), is(false));

        assertThat(date.plusWeeks(1), is(LocalDate.of(2015, 1, 13)));
        assertThat(date.minusYears(10), is(LocalDate.of(2005, 1, 6)));
        assertThat(date.plus(10, ChronoUnit.MONTHS).minusDays(5), is(LocalDate.of(2015, 11, 1)));
    }

    @Test
    public void test_LocalTime() {
        LocalTime time = LocalTime.of(14, 20, 15);
        assertThat(time.getHour(), is(14));
        assertThat(time.getMinute(), is(20));
        assertThat(time.getSecond(), is(15));
    }
}
