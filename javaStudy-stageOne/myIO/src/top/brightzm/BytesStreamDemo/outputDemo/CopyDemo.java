package top.brightzm.BytesStreamDemo.outputDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDemo {

    public static void main(String[] args) throws IOException {
        // 文件拷贝

        FileInputStream fis = new FileInputStream("E:\\steam\\steamapps\\workshop\\content" +
                "\\431960\\884307090\\video\\8-test.webm");
        FileOutputStream fos = new FileOutputStream("myIO\\copy.webm");

        // 开始拷贝
        /*int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }*/


        byte[] bytes = new byte[1024*1024*4];
        int len;

        while ((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }

        fos.close();
        fis.close();


    }

}
