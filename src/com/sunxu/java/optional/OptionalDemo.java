package com.sunxu.java.optional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/5/30 13:59
 */
public class OptionalDemo {


    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        User userA = new User("孙许", "安徽");
        User userB = new User("王思思", "江西");
        users.add(userA);
        users.add(userB);

//        List<String> names = Optional.ofNullable(users)
//                .stream()
//                .flatMap(Collection::stream)
//                .map(User::getName)
//                .collect(Collectors.toList());

    }
}
