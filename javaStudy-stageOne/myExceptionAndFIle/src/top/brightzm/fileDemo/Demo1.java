package top.brightzm.fileDemo;

import java.io.File;

/**
 * @description:
 * @author: bright
 * @time: 2023/4/3 下午4:47
 */
public class Demo1 {

    public static void main(String[] args) {

        File f1 = new File("E:\\HUAWEI\\a.txt");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());



    }

}
