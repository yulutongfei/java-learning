package com.sunxu.java.test.language;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/3/16 20:38
 */
public interface Language {

    Language transfor(String languageType);

    String speak();
}
