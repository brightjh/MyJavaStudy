package top.brightzm.fileDemo;

import java.io.File;

public class Test5 {

    // 统计文件大小

    public static void main(String[] args) {

        File src = new File("E:\\Java");

        long len = getLen(src) / 1024;

        System.out.println(len);

    }


    public static long getLen(File src) {
        long len = 0L;

        File[] files = src.listFiles();

        for (File file : files) {
            if (file.isFile()) {
                len += file.length();
            } else {
                len += getLen(file);
            }

        }

        return len;

    }


}
