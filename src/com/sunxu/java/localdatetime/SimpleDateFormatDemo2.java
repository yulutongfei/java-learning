package com.sunxu.java.localdatetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author 孙许
 * @version 1.0
 * @date 2020/10/1 11:08
 */
public class SimpleDateFormatDemo2 {

    public static final SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd");
    private static ThreadLocal<SimpleDateFormat> threadSafe = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd"));

    public static void main(String[] args) throws InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(100);

        for (int i = 0; i < 20; i++) {
            threadPool.execute(() -> {
                for (int i1 = 0; i1 < 10; i1++) {
                    try {
                        System.out.println(threadSafe.get().parse("2020-09-12"));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        threadPool.shutdown();
        threadPool.awaitTermination(1, TimeUnit.HOURS);
    }
}
