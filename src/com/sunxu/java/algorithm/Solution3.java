package com.sunxu.java.algorithm;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/6/12 14:31
 */
public class Solution3 {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 2, 7, 5, 21, 21, 5, 9, 11};
        System.out.println(find(arr));
    }

    public static int find(int[] arr) {
        // 00000101
        // 00000111
        // 00000010
        // eor = a ^ b;
        // eor != 0 必定有一位是1
        int eor = 0;
        for (int i = 0; i < arr.length; i++) {
            eor ^= arr[i];
        }
        // 找到one最右边的1
        int rightOne = eor & (~eor + 1);

        int onlyOne = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((rightOne & arr[i]) != 0) {
                onlyOne ^= arr[i];
            }
        }
        System.out.println(onlyOne);
        System.out.println(onlyOne ^ eor);
        return eor;
    }
}
