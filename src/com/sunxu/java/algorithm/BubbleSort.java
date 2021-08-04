package com.sunxu.java.algorithm;

import java.util.stream.IntStream;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/6/11 20:52
 * 冒泡排序
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 3, 1, 5, 16, 21, 14, 9};
        sort(arr);
        IntStream.of(arr).forEach(System.out::println);
    }

    private static void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int e = arr.length - 1; e > 0; e--) {
            for (int i = 0; i < e; i++) {
                if (arr[i] > arr[i + 1]) {
                    arr[i] = arr[i] ^ arr[i + 1];
                    arr[i + 1] = arr[i] ^ arr[i + 1];
                    arr[i] = arr[i] ^ arr[i + 1];
                }
            }
        }
    }

}
