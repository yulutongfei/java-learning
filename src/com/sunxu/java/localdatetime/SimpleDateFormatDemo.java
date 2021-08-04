package com.sunxu.java.localdatetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * @author 孙许
 * @version 1.0
 * @date 2020/10/1 10:23
 */
public class SimpleDateFormatDemo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.SIMPLIFIED_CHINESE);
        System.out.println("defaultLocale:" + Locale.getDefault());
        Calendar calendar = Calendar.getInstance();
        calendar.set(2019, Calendar.DECEMBER, 29, 0, 0 ,0);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("格式化日期:" + simpleDateFormat.format(calendar.getTime()));
        System.out.println("weekYear:" + calendar.getWeekYear());
        System.out.println("firstDayOfWeek:" + calendar.getFirstDayOfWeek());
        System.out.println("minimalDaysInFirstWeek:" + calendar.getMinimalDaysInFirstWeek());
    }
}
