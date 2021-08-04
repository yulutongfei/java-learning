package com.sunxu.java.localdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * @author 孙许
 * @version 1.0
 * @date 2020/10/1 12:08
 */
public class PeriodDemo {

    public static void main(String[] args) {
        System.out.println("计算时间差");
        LocalDate from = LocalDate.of(2020, 10, 1);
        LocalDate to = LocalDate.of(2020, 12, 2);
        Period period = Period.between(from, to);
        System.out.println(period);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
        System.out.println(ChronoUnit.DAYS.between(from, to));
    }
}
