package top.brightzm.fileDemo;

import java.io.File;

public class Test3 {

    public static void main(String[] args) {
        // 查询E盘下的jpg文件
        File src = new File("E:\\");

        findJpg(src);



    }

    public static void findJpg(File src){

        File[] files = src.listFiles();

        try {
            for (File file : files) {
                if (file.isFile()){
                    if (file.getName().endsWith(".jpg")){
                        System.out.println(file);
                    }
                }else {
                    findJpg(file);
                }
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }


    }

}
