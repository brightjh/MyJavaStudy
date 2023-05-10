package top.brightzm.demo;

public class MyTread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName() + "hello");
        }
    }
}
