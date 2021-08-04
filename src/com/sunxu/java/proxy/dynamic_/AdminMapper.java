package com.sunxu.java.proxy.dynamic_;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/1/8 06:31
 */
public class AdminMapper implements MapperI{

    @Override
    public void jdbcOpera() {

        System.out.println("===AdminMapper执行核心业务代码===");
    }
}
