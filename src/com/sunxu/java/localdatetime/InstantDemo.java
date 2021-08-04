package com.sunxu.java.localdatetime;

import java.time.Instant;

/**
 * @author 孙许
 * @version 1.0
 * @date 2020/10/1 16:45
 */
public class InstantDemo {

    public static void main(String[] args) {
        Instant instant = Instant.ofEpochSecond(50);
        System.out.println(instant);
        System.out.println(instant.getEpochSecond());
        System.out.println(instant.getNano());
        System.out.println(Instant.now());
    }
}
