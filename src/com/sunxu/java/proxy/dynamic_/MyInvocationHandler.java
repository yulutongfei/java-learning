package com.sunxu.java.proxy.dynamic_;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/1/8 06:45
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * invoke方法是用于进行增强处理的
     * @param proxy 动态生成的代理的实例
     * @param method 当前目标对象正在执行的方法
     * @param args 当前目标对象正在执行的方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("===获取连接===");
        method.invoke(target, args);
        System.out.println("===关闭数据库连接===");
        return null;
    }
}
