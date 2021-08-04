package com.sunxu.java.lamda;

import java.util.function.Predicate;

/**
 * @author 孙许
 * @version 1.0
 * @date 2020/9/1 22:20
 */
public class LambdaUsage {

    public static void main(String[] args) {
        Predicate<String> test = String::isEmpty;
    }
}
