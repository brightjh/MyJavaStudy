package top.brightzm.bufferedStreamDemo.test;

import java.io.*;

public class Test2 {

    public static void main(String[] args) throws IOException {
        long start;
        long stop;

        // 一个字节 字节流
        FileInputStream fis1 = new FileInputStream("E:\\HUAWEI\\movie\\f1.mp4");
        FileOutputStream fos1 = new FileOutputStream("E:\\HUAWEI\\movie\\f1_22.mp4");

        start = System.currentTimeMillis();
        byteCopy(fis1,fos1);
        stop = System.currentTimeMillis();
        System.out.println("字节流 一个字节： "+ (stop - start));

        fos1.close();
        fis1.close();

        //数组 字节流
        FileInputStream fis2 = new FileInputStream("E:\\HUAWEI\\movie\\f1.mp4");
        FileOutputStream fos2 = new FileOutputStream("E:\\HUAWEI\\movie\\f1_22.mp4");

        start = System.currentTimeMillis();
        bytesCopy(fis2,fos2);
        stop = System.currentTimeMillis();
        System.out.println("字节流 数组： "+ (stop - start));

        fos2.close();
        fis2.close();

        // 字节 缓冲流
        BufferedInputStream bis1= new BufferedInputStream(new FileInputStream("E:\\HUAWEI\\movie\\f1.mp4"));
        BufferedOutputStream bos1= new BufferedOutputStream(new FileOutputStream("E:\\HUAWEI\\movie\\f1_22.mp4"));

        start = System.currentTimeMillis();
        bufferedByteCopy(bis1,bos1);
        stop = System.currentTimeMillis();
        System.out.println("缓冲流 字节： "+ (stop - start));

        bos1.close();
        bis1.close();

        // 数组 缓冲流
        BufferedInputStream bis2= new BufferedInputStream(new FileInputStream("E:\\HUAWEI\\movie\\f1.mp4"));
        BufferedOutputStream bos2= new BufferedOutputStream(new FileOutputStream("E:\\HUAWEI\\movie\\f1_22.mp4"));

        start = System.currentTimeMillis();
        bufferedBytesCopy(bis2,bos2);
        stop = System.currentTimeMillis();
        System.out.println("缓冲流 数组： "+ (stop - start));

        bos2.close();
        bis2.close();

    }

    public static void byteCopy(FileInputStream fis, FileOutputStream fos) throws IOException {
        // 字节流拷贝 单个字节
        int c;

        while ((c = fis.read()) != -1) {
            fos.write(c);
        }

    }

    public static void bytesCopy(FileInputStream fis, FileOutputStream fos) throws IOException {
        // 字节流拷贝 字节数组
        byte[] bytes = new byte[1024];

        int len;

        while ((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }

    }

    public static void bufferedByteCopy(BufferedInputStream bis,BufferedOutputStream bos) throws IOException {
        // 字节缓冲流 单个字节
        int c;

        while ((c = bis.read()) != -1){
            bos.write(c);
        }

    }

    public static void bufferedBytesCopy(BufferedInputStream bis,BufferedOutputStream bos) throws IOException{

        byte[] bytes = new byte[1024];

        int len;

        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }

    }

}
