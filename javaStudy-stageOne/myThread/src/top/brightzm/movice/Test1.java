package top.brightzm.movice;

public class Test1 {

    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr);
        t1.setName("窗口一");

        Thread t2 = new Thread(mr);
        t2.setName("窗口二");

        Thread t3 = new Thread(mr);
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();

    }

}
