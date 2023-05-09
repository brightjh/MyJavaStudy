package top.brightzm.zipStreamDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Demo1 {

    public static void main(String[] args) throws IOException {
        // 解压缩包
        File src = new File("E:\\HUAWEI\\src.zip");

        File dest = new File("E:\\HUAWEI\\todo");

        unzip(src,dest);

    }

    public static void unzip(File src, File dest) throws IOException {

        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));

        ZipEntry zipEntry;

        while ((zipEntry = zip.getNextEntry()) != null) {
            if (zipEntry.isDirectory()) {
                File file = new File(dest, zipEntry.toString());
                file.mkdirs();
            } else {
                FileOutputStream fos = new FileOutputStream(new File(dest, zipEntry.toString()));
                int b;
                while ((b = zip.read()) != -1){
                    fos.write(b);
                }
                fos.close();
                zip.closeEntry();
            }
        }
        zip.close();
    }


}
