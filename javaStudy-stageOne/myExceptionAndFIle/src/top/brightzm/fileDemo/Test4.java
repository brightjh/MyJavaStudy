package top.brightzm.fileDemo;

import java.io.File;

public class Test4 {

    public static void main(String[] args) {

        // 删除多级文件

        File src = new File("E:\\JavaTest");

        rmDir(src);

    }

    public static void rmDir(File src) {
        File[] files = src.listFiles();

        // 删除多级目录
        for (File file : files) {
            if (file.isDirectory()) {
                rmDir(file);
            } else {
                file.delete();
            }
        }

        // 删除自己
        src.delete();
    }

}
