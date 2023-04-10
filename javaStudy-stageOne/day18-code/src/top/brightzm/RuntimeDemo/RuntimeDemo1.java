package top.brightzm.RuntimeDemo;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {
        // 当前系统运行环境
        Runtime r = Runtime.getRuntime();
        // 停止虚拟机
//        r.exit(0);
//        System.out.println("执行了吗");
        //获得CPU线程数
        System.out.println(r.availableProcessors());
        // JVM能从系统中获得的内存大小
        System.out.println("能获得");
        System.out.println(r.maxMemory() + " b");
        System.out.println(r.maxMemory() / 8  + " KB");
        System.out.println(r.maxMemory() / 8 / 1024 + " MB");
        System.out.println(r.maxMemory() / (Math.sqrt(1024)) + " GB");

        System.out.println("=============================");
        // JVM已经从系统中获得的内存
        System.out.println("已获" + r.totalMemory() + " b");

        // JVM剩余大小
        System.out.println("剩余" + r.freeMemory() + " b");

        // 运行CMD指令
        r.exec("Typora");


    }
}
