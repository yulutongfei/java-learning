package com.sunxu.java.jvm;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/3/23 00:05
 */
public class Demo1 {

    public static void main(String[] args) {
        byte[] array1 = new byte[1024 * 1024];
        array1 = new byte[1024 * 1024];
        array1 = new byte[1024 * 1024];
        array1 = null;

        byte[] array2 = new byte[2 * 1024 * 1024];
    }
}
