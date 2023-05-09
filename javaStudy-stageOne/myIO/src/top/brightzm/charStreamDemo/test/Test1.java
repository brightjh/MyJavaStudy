package top.brightzm.charStreamDemo.test;

import java.io.*;

public class Test1 {

    public static void main(String[] args) throws IOException {
        // 拷贝文件夹

        File src = new File("E:\\HUAWEI\\src");

        File dest = new File("E:\\HUAWEI\\dest");

        copyDir(src,dest);
    }

    public static void copyDir(File src,File dest) throws IOException {
        dest.mkdirs();

        File[] files = src.listFiles();

        for (File file : files) {
            if (file.isFile()){
                copyFile(file,new File(dest,file.getName()));
            }else {
                copyDir(file,new File(dest,file.getName()));
            }
        }
    }

    public static void copyFile(File src,File dest) throws IOException {

        FileInputStream in = new FileInputStream(src);

        FileOutputStream out = new FileOutputStream(dest);

        byte[] outBytes = new byte[1024];

        int len;

        while ((len = in.read(outBytes)) != -1 ){
            out.write(outBytes,0,len);
        }

        out.close();

        in.close();

    }



}
