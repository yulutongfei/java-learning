package com.sunxu.java.test;

import com.sunxu.java.test.language.ChineseLanguage;
import com.sunxu.java.test.language.Language;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/3/16 20:37
 * 任意两种语言的转换 x -> y
 *
 *
 * 营销
 */
public class Application {

    public static void main(String[] args) {
        Language chineseLanguage = new ChineseLanguage();
        System.out.println(chineseLanguage.speak());
        Language transfor = chineseLanguage.transfor("En");
        System.out.println(transfor.speak());
    }
}
