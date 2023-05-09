package top.brightzm.zipStreamDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Demo2 {

    public static void main(String[] args) throws IOException {
        // 压缩单个文件
        File src = new File("E:\\HUAWEI\\hello.txt");

        File dest = new File("E:\\HUAWEI\\hello.zip");

        tozip(src,dest);


    }

    public static void tozip(File src,File dest) throws IOException {
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));

        zos.putNextEntry(new ZipEntry("hello.txt"));

        FileInputStream fis = new FileInputStream(src);
        int b;
        while ((b= fis.read())!= -1){
            zos.write(b);
        }
        fis.close();

        zos.close();
    }

}
