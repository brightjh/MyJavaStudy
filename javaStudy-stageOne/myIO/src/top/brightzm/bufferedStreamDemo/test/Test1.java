package top.brightzm.bufferedStreamDemo.test;

import java.io.*;

public class Test1 {

    public static void main(String[] args) throws IOException {
        // 利用字节缓冲流拷贝文件

        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream("E:\\HUAWEI\\src\\hello.txt")
        );

        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("E:\\HUAWEI\\hello.txt")
        );

        int i;

        while ((i = bis.read()) != -1) {
            bos.write(i);
        }

        bos.close();

        bis.close();
    }


}
