package top.brightzm.lockDemo;

import top.brightzm.movice.MyThread;

public class Demo {

    public static void main(String[] args) {

        top.brightzm.movice.MyThread t1 = new top.brightzm.movice.MyThread();
        t1.setName("窗口一");

        top.brightzm.movice.MyThread t2 = new top.brightzm.movice.MyThread();
        t2.setName("窗口二");

        top.brightzm.movice.MyThread t3 = new MyThread();
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();


    }

}
