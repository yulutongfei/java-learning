package com.sunxu.java.localdatetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;

/**
 * @author 孙许
 * @version 1.0
 * @date 2020/10/5 17:15
 */
public class DateTimeFormatterDemo {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = new DateTimeFormatterBuilder()
                .appendText(ChronoField.YEAR)
                .appendLiteral("年")
                .appendText(ChronoField.MONTH_OF_YEAR, TextStyle.NARROW)
                .appendLiteral("月")
                .appendText(ChronoField.DAY_OF_MONTH)
                .appendLiteral("日")
                .appendText(ChronoField.HOUR_OF_DAY)
                .appendLiteral("时")
                .appendText(ChronoField.MINUTE_OF_HOUR)
                .appendLiteral("分")
                .appendText(ChronoField.SECOND_OF_MINUTE)
                .appendLiteral("秒")
                .toFormatter();
        String format = now.format(dateTimeFormatter);
        System.out.println(format);
    }
}
