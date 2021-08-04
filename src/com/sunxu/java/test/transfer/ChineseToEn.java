package com.sunxu.java.test.transfer;

import com.sunxu.java.test.language.EnLanguage;
import com.sunxu.java.test.language.Language;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/3/16 20:40
 */
public class ChineseToEn implements Transfer {

    @Override
    public Language transfor(Language language) {
        return new EnLanguage();
    }
}
