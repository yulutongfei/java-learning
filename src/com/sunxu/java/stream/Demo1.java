package com.sunxu.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author 孙许
 * @version 1.0
 * @date 2020/4/23 13:51
 */
public class Demo1 {

    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(
                new Apple(80, "green"),
                new Apple(155, "green"),
                new Apple(120, "red")
        );

        Predicate<Apple> predicate = apple -> Objects.equals("green", apple.getColor());



    }

    private List<Apple> getApples(List<Apple>inventory,  Predicate<Apple> predicate) {
        return inventory.stream().filter(predicate)
                .collect(Collectors.toList());
    }


    public static class Apple {

        private int weight = 0;
        private String color = "";

        public Apple(int weight, String color) {
            this.weight = weight;
            this.color = color;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @SuppressWarnings("boxing")
        @Override
        public String toString() {
            return String.format("Apple{color='%s', weight=%d}", color, weight);
        }

    }
}
