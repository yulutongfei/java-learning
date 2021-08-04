package com.sunxu.java.jvm;

import java.lang.invoke.*;

/**
 * @author 孙许
 * @version 1.0
 * @date 2020/10/13 14:15
 */
public class Circuit {

    public static void main(String[] args) {
        startRace(new Horse());
    }

    public static void startRace(Object object) {

    }

    public static CallSite bootstrap(MethodHandles.Lookup lookup, String name, MethodType callSiteType) throws NoSuchMethodException, IllegalAccessException {
        MethodHandle methodHandle = lookup.findVirtual(Horse.class, name, MethodType.methodType(void.class));
        return new ConstantCallSite(methodHandle.asType(callSiteType));
    }
}

class Horse {

    public void race() {
        System.out.println("马赛跑");
    }
}

class Deer {

    public void race() {
        System.out.println("鹿赛跑");
    }
}
