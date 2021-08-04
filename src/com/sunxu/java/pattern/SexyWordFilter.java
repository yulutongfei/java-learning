package com.sunxu.java.pattern;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/3/5 14:39
 */
public class SexyWordFilter implements SensitiveWordFilter{

    @Override
    public boolean doFilter(String content) {
        return false;
    }
}
