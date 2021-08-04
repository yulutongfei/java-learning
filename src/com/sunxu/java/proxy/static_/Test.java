package com.sunxu.java.proxy.static_;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/1/8 05:57
 */
public class Test {

    public static void main(String[] args) {
        UserMapper mapper = new UserMapper();
        StaticProxy proxy = new StaticProxy(mapper);
        proxy.startJdbcOpera();
    }
}
