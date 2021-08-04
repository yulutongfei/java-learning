package com.sunxu.java.file;

import java.io.File;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * @author 孙许
 * @version 1.0
 * @date 2021/1/18 17:30
 */
public class Application {

    public static void main(String[] args) {
        File file = new File("/Users/sunxu/Downloads/考霸训练营");
        if (file.isDirectory()) {
            Stream.of(Objects.requireNonNull(file.listFiles())).forEach(mp4File -> {
                String newName = mp4File.getName().replace("30天考霸训练营，北大博士后教你通关任何考试（完结） - ", "")
                        .replace("【瑞客论坛 www.ruike1.com】", "");
                mp4File.renameTo(new File(newName));
            });
        }
    }
}
