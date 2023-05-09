package top.brightzm.BytesStreamDemo.outputDemo;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo4 {

    public static void main(String[] args) throws IOException {
        // 循环读取

        FileInputStream fis = new FileInputStream("myIO\\a.txt");

        int temp;

        while ((temp = fis.read()) != -1){
            System.out.print((char) temp);
        }

        fis.close();

    }

}
