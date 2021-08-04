package com.sunxu.java.algorithm;

import java.util.Objects;
import java.util.stream.IntStream;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/6/11 20:27
 */
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 3, 1, 5, 16, 21, 14, 9};
        sort(arr);
        IntStream.of(arr).forEach(System.out::println);
    }

    public static void sort(int[] arr) {
        if (Objects.isNull(arr) || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
