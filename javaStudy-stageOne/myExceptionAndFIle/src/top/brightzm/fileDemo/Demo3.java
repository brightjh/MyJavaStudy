package top.brightzm.fileDemo;

import java.io.File;
import java.io.IOException;

public class Demo3 {

    public static void main(String[] args) throws IOException {

        /*File f = new File("E:\\HUAWEI\\bbb.txt");
        boolean result = f.createNewFile();
        System.out.println(result);*/

        File f = new File("E:\\HUAWEI\\aaa\\bbb\\ccc");

        System.out.println(f.mkdirs());


    }

}
