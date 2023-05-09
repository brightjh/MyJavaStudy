package top.brightzm.BytesStreamDemo.outputDemo;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3 {

    public static void main(String[] args) throws IOException {
        // 换行写和续写

         FileOutputStream fos = new FileOutputStream("myIO\\a.txt");

        fos.write("buxiangxuexi\n".getBytes());

        fos.write("jiayou".getBytes());

        fos.close();

    }

}
