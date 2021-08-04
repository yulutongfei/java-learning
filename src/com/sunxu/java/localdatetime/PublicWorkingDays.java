package com.sunxu.java.localdatetime;

import java.time.DayOfWeek;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

/**
 * @author 孙许
 * @version 1.0
 * @date 2020/10/6 15:37
 */
public class PublicWorkingDays implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek now = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int dayToAdd = 1;
        if (now == DayOfWeek.FRIDAY) {
            dayToAdd = dayToAdd + 2;
        } else if (now == DayOfWeek.SATURDAY) {
            dayToAdd = dayToAdd + 1;
        }
        return temporal.plus(dayToAdd, ChronoUnit.DAYS);
    }
}
