package com.sunxu.java.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjusters;

import static java.time.temporal.ChronoField.*;

/**
 * @author 孙许
 * @version 1.0
 * @date 2020/10/1 11:56
 */
public class LocalDateTimeDemo {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.plusDays(30).minus(Period.ofDays(1)));
        System.out.println(LocalDate.now().with(TemporalAdjusters.firstDayOfMonth()));
        System.out.println(LocalDate.now().plusDays(1).query(LocalDateTimeDemo::isFamilyDay));
        System.out.println(now.with(new PublicWorkingDays()));
    }

    public static boolean isFamilyDay(TemporalAccessor accessor) {
        if (accessor.get(DAY_OF_MONTH) == 1 && accessor.get(MONTH_OF_YEAR) == 10) {
            return true;
        }
        return false;
    }
}
