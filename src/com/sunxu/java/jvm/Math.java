package com.sunxu.java.jvm;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/3/27 12:59
 */
public class Math {
    public static final int initData = 666;
    public static User user = new User();

    public int compute() {  //一个方法对应一块栈帧内存区域
        int a = 1;
        int b = 2;
        int c = (a + b) * 10;
        return c;
    }

    public static void main(String[] args) {
        Math math = new Math();
        math.compute();
        System.out.println("test");
    }
}
