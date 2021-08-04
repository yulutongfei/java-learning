package com.sunxu.java.localdatetime;

import java.time.*;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author 孙许
 * @version 1.0
 * @date 2020/10/6 15:48
 */
public class ZoneDemo {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        Instant nowInstant = Instant.now();
        System.out.println(now.atStartOfDay());
        ZoneId zoneId = TimeZone.getDefault().toZoneId();
        LocalDateTime localDateTime = nowInstant.atZone(zoneId).toLocalDateTime();
        LocalDateTime localDateTime1 = LocalDateTime.ofInstant(nowInstant, zoneId);
        System.out.println(localDateTime);
        System.out.println(localDateTime1);
        System.out.println(zoneId);

        Date dateNow = new Date();
        Instant instant = dateNow.toInstant();
        LocalDateTime localDateTime2 = LocalDateTime.ofInstant(instant, zoneId);
        System.out.println(localDateTime2);

        LocalDateTime nowLocalDateTime = LocalDateTime.now();
        Instant instant1 = nowLocalDateTime.atZone(zoneId).toInstant();
        Date from = Date.from(instant1);
        System.out.println(from);

        ZoneId zoneId1 = ZoneId.systemDefault();

    }
}
