package com.sunxu.java.proxy.static_;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/1/8 05:56
 */
public class StaticProxy {

    private UserMapper userMapper;

    public StaticProxy(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public void startJdbcOpera() {
        System.out.println("===获取连接===");
        userMapper.jdbcOpera();
        System.out.println("===关闭数据库连接===");
    }
}
