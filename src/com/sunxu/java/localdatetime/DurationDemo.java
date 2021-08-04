package com.sunxu.java.localdatetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @author 孙许
 * @version 1.0
 * @date 2020/10/5 16:31
 */
public class DurationDemo {

    public static void main(String[] args) {
        LocalDateTime from = LocalDateTime.of(2020, 10, 1, 0, 0, 0);
        LocalDateTime to = LocalDateTime.now();

        Duration between = Duration.between(from, to);
        System.out.println(between.get(ChronoUnit.MONTHS));
    }
}
