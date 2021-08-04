package com.sunxu.java.jvm;

import java.lang.invoke.MethodHandles.Lookup;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

/**
 * @author 孙许
 * @version 1.0
 * @date 2020/7/5 17:23
 * 通过lookup 生成MethodHandle
 */

class Foo {
    private static void bar(Object o) {
        System.out.println(o);
    }
    public static Lookup lookup() {
        return MethodHandles.lookup();
    }

    public static void main(String[] args) throws Throwable {
        // 获取方法句柄的不同方式
        MethodHandles.Lookup lookup = Foo.lookup(); // 具备Foo类的访问权限
        Method method = Foo.class.getDeclaredMethod("bar", Object.class);
        MethodHandle mh0 = lookup.unreflect(method);
        mh0.invoke("sunxu");

        MethodType t = MethodType.methodType(void.class, Object.class);
        MethodHandle mh1 = lookup.findStatic(Foo.class, "bar", t);
        mh1.invokeExact((Object)"孙许");
    }
}


