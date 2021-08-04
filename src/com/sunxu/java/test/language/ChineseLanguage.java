package com.sunxu.java.test.language;

import com.sunxu.java.test.transfer.ChineseToEn;
import com.sunxu.java.test.transfer.Transfer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/3/16 20:39
 */
public class ChineseLanguage implements Language {

    private static Map<String, Transfer> transferMap = new HashMap<>();

    static {
        transferMap.put("En", new ChineseToEn());
    }

    @Override
    public Language transfor(String languageType) {
        Transfer transfer = transferMap.get(languageType);
        return transfer.transfor(this);
    }

    @Override
    public String speak() {
        return "这是中文";
    }
}
