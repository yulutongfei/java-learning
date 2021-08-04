package com.sunxu.java.effective;

/**
 * @author 孙许
 * @version 1.0
 * @date 2020/7/9 14:34
 */
public enum Operation {

    /**
     *
     */
    PLUS {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    };

    public abstract double apply(double x, double y);
}
