package com.sunxu.java.effective;

/**
 * @author 孙许
 * @version 1.0
 * @date 2020/7/8 10:39
 */
public class Demo1 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += 1;
        }
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(sum);
    }
}
