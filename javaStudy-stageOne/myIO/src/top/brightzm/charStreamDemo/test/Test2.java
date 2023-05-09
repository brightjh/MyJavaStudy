package top.brightzm.charStreamDemo.test;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {

    public static void main(String[] args) throws IOException {


        FileInputStream src = new FileInputStream("myIO\\a_en.txt");

        FileOutputStream dest = new FileOutputStream("myIO\\a_de.txt");

        encrypt(src, dest);

        dest.close();

        src.close();

    }

    public static void encrypt(FileInputStream in, FileOutputStream out) throws IOException {
        // 加密文件 解密
        byte[] bytes = new byte[1024];

        int len = in.read(bytes);

        if (len == -1) {
            System.out.println("源文件没有数据");
            return;
        }

        for (int i = 0; i < len; i++) {
            bytes[i] = (byte) (bytes[i] ^ 101);
        }

        out.write(bytes, 0, len);
    }

}
