package com.sunxu.java.algorithm;

import java.util.stream.IntStream;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/6/11 21:24
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 3, 1, 5, 16, 21, 14, 9};
        sort(arr);
        IntStream.of(arr).forEach(System.out::println);
    }

    private static void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                arr[j] = arr[j] ^ arr[j + 1];
                arr[j + 1] = arr[j] ^ arr[j + 1];
                arr[j] = arr[j] ^ arr[j + 1];
            }
        }
    }
}
