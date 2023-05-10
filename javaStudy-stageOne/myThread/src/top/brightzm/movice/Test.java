package top.brightzm.movice;

public class Test {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("窗口一");

        MyThread t2 = new MyThread();
        t2.setName("窗口二");

        MyThread t3 = new MyThread();
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();



    }

}
