package top.brightzm.charStreamDemo.inputDemo;

import java.io.FileReader;
import java.io.IOException;

public class Demo2 {

    public static void main(String[] args) throws IOException {

        // 带参read方法
        FileReader fr = new FileReader("myIO\\a.txt");

        char[] chars = new char[2];

        int len;

        while ((len = fr.read(chars)) != -1){
            System.out.print(chars);
        }

        fr.close();


    }


}
