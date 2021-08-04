package com.sunxu.java.lesson1;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * @author 孙许
 * @version 1.0
 * @date 2020/4/18 05:39
 * 😂
 */
public class InnerClassDemo {

    public static void main(String[] args) {
        PropertyChangeListener propertyChangeListener = new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {

            }
        };
    }

}
