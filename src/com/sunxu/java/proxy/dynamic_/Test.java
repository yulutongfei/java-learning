package com.sunxu.java.proxy.dynamic_;

import java.lang.reflect.Proxy;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/1/8 06:32
 */
public class Test {

    public static void main(String[] args) {
        // 创建目标对象
        UserMapper userMapper = new UserMapper();
        // 利用Proxy的newProxyInstance方法动态的生成代理类以及代理对象
        MapperI mapper = (MapperI) Proxy.newProxyInstance(userMapper.getClass().getClassLoader(),
                userMapper.getClass().getInterfaces(),
                new MyInvocationHandler(userMapper));
        mapper.jdbcOpera();
        System.out.println(mapper.getClass().getName());
    }
}
