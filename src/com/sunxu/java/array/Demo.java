package com.sunxu.java.array;

/**
 * @author 孙许
 * @version 1.0
 * @date 2020/4/28 05:49
 */
public class Demo {

    public static void main(String[] args) {
        int[][] array = new int[1000_0][1000_0];
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000_0; i++) {
            for (int j = 0; j < 1000_0; j++) {
                array[j][i] = 0;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
