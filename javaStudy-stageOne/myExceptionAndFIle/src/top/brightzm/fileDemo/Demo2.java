package top.brightzm.fileDemo;

import java.io.File;

public class Demo2 {

    public static void main(String[] args) {

        File f1 = new File("E:\\HUAWEI\\a.txt");

        System.out.println(f1.length()); //只能获取文件夹的大小

        System.out.println(f1.getName()); //获取名称


    }

}
