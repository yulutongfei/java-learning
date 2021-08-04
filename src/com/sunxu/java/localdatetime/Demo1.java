package com.sunxu.java.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

/**
 * @author 孙许
 * @version 1.0
 * @date 2020/10/1 16:13
 */
public class Demo1 {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getDayOfYear());
        System.out.println(LocalDate.now().isLeapYear());
        System.out.println(localDateTime.get(ChronoField.YEAR));
        System.out.println(localDateTime.toLocalDate());
        System.out.println(localDateTime.toLocalTime());
    }
}
