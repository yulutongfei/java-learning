package com.sunxu.java.pattern;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/3/5 14:36
 */
public interface SensitiveWordFilter {

    /**
     * 拦截
     * @param content
     * @return
     */
    boolean doFilter(String content);
}
