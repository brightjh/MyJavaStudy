package top.brightzm.demo;

public class Demo2 {
    public static void main(String[] args) {
        MyRun mr = new MyRun();

        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        t1.setName("thread1");
        t2.setName("thread2");

        t1.start();
        t2.start();

    }

}
