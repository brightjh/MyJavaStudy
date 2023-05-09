package top.brightzm.zipStreamDemo;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Demo3 {
    // 压缩文件夹

    public static void main(String[] args) throws IOException {

        File src = new File("E:\\HUAWEI\\zip\\src");

        File dest = new File(src.getParent(), src.getName() + ".zip");

        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));

        tozip(src,zos,"");

        zos.close();
    }

    public static void tozip(File src, ZipOutputStream zos, String path) throws IOException {
        // 开始压缩
        /*if (src.isFile()) {
            FileInputStream fis = new FileInputStream(src);
            ZipEntry zipEntry = new ZipEntry(src.getName());
            zos.putNextEntry(zipEntry);
            byte[] bytes = new byte[1024];
            int len;
            while ((len = fis.read(bytes)) != -1) {
                zos.write(bytes,0,len);
            }*/

        File[] files = src.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                // 将文件数据写入压缩包中文件
                ZipEntry zipEntry = new ZipEntry(path + "\\" + file.getName());
                zos.putNextEntry(zipEntry);
                FileInputStream fis = new FileInputStream(file);
                byte[] bytes = new byte[1024];
                int len;
                while ((len = fis.read(bytes)) != -1) {
                    zos.write(bytes, 0, len);
                }
                fis.close();
                zos.closeEntry();
            } else {
                tozip(file, zos, path + "\\" + file.getName());
            }

        }

    }


}
