package com.sunxu.java.lamda;

import java.util.stream.Stream;

/**
 * @author 孙许
 * @version 1.0
 * @date 2020/9/4 12:35
 */
public class CreateStream {

    public static void main(String[] args) {
        createStreamByIterator().forEach(System.out::println);
    }

    public static Stream<String> createStreamByIterator() {
        Stream<String> sunxu = Stream.iterate("sunxu", i -> i + 1).limit(4);
        return sunxu;
    }

    
}
