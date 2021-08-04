package com.sunxu.java.algorithm;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/6/12 14:31
 */
public class Solution1 {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 2, 7, 5, 21, 21, 5, 9};
        System.out.println(find(arr));
    }

    public static int find(int[] arr) {
        int one = 0;
        for (int i = 0; i < arr.length; i++) {
            one ^= arr[i];
        }
        return one;
    }
}
