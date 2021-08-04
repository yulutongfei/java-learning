package com.sunxu.java.proxy.dynamic_;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/1/8 05:53
 * 目标对象
 */
public class UserMapper implements MapperI {

    @Override
    public void jdbcOpera() {
        System.out.println("===UserMapper执行核心业务代码===");
    }
}
