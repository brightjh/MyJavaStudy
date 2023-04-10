package top.brightzm.fileDemo;

import java.io.File;
import java.io.IOException;

public class Test1 {

    public static void main(String[] args) throws IOException {

        // 创建父级路径
        File f = new File("myExceptionAndFile\\aaa");

        f.mkdirs();

        File src = new File(f,"a.txt");
        boolean b = src.createNewFile();

        if (b){
            System.out.println("success");
        }else {
            System.out.println("defend");
        }




    }

}
