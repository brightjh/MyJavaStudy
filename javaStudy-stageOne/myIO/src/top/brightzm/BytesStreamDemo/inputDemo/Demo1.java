package top.brightzm.BytesStreamDemo.inputDemo;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo1 {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("myIO\\a.txt");

        int i = fis.read();

        System.out.println(i);

        fis.close();

    }

}
