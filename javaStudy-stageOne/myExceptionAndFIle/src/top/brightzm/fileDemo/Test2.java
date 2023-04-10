package top.brightzm.fileDemo;

import java.io.File;

public class Test2 {

    public static void main(String[] args) {

        File f = new File("E:\\HUAWEI\\aaa");

        boolean result = haveTxt(f);

        System.out.println(result);


    }

    // 在文件夹中查找txt结尾的
    public static boolean haveTxt(File file) {
        File[] files = file.listFiles();

        for (File f : files) {
            if (f.isFile() && f.getName().endsWith(".txt")) {
                return true;
            }

        }
        return false;
    }

}
