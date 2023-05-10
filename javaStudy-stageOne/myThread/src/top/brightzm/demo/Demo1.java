package top.brightzm.demo;

public class Demo1 {

    public static void main(String[] args) {

        Thread thread1 = new MyTread();
        thread1.setName("1");

        Thread thread2 = new MyTread();
        thread2.setName("2");

        thread1.start();

        thread2.start();



    }

}
