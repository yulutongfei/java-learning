package com.sunxu.java.localdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * @author 孙许
 * @version 1.0
 * @date 2020/10/5 16:41
 */
public class TimeOperationDemo {

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2017, 9, 21);
        LocalDate date2 = date1.withYear(2019);
        System.out.println(date2);
        LocalDate date3 = date1.plusYears(1);
        System.out.println(date3);
        LocalDate date4 = date1.minusYears(2);
        System.out.println(date4);
        LocalDate with = date1.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(with);
        LocalDate with1 = date1.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
        System.out.println(with1);
    }
}
