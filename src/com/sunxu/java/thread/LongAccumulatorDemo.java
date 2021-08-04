package com.sunxu.java.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.stream.IntStream;

/**
 * @author 孙许
 * @version 1.0
 * @date 2020/9/1 17:49
 */
public class LongAccumulatorDemo {

    public static void main(String[] args) throws InterruptedException {
        LongAccumulator accumulator = new LongAccumulator(Long::sum, 0);
        ExecutorService executorService = Executors.newFixedThreadPool(16);

        IntStream.range(0, 10).forEach(i -> executorService.submit(() -> accumulator.accumulate(i)));

        Thread.sleep(3000);
        System.out.println(accumulator.getThenReset());
    }
}
