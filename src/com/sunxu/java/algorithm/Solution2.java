package com.sunxu.java.algorithm;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/6/12 14:36
 */
public class Solution2 {

    public static void main(String[] args) {
        int n = 9;
        // 00000101
        // 11111011
        // 00000001
        System.out.println(n & (~n + 1));
    }
}
