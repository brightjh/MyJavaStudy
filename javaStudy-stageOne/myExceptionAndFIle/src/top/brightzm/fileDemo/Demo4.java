package top.brightzm.fileDemo;

import java.io.File;

public class Demo4 {

    public static void main(String[] args) {

        File f = new File("E:\\Java");

        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file);
        }


    }


}
