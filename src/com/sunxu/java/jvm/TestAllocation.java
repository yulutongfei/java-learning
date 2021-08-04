package com.sunxu.java.jvm;

/**
 * @author 孙许
 * @version 1.0
 * @date 2020/10/14 10:42
 * VM参数: -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 * 8 1 1 10;
 */
public class TestAllocation {

    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        byte[] allcation1, allcation2, allcation3, allcation4;
        allcation1 = new byte[2 * _1MB];
        allcation2 = new byte[2 * _1MB];
        allcation3 = new byte[2 * _1MB];
        allcation4 = new byte[4 * _1MB];
    }
}
