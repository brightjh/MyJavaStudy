package top.brightzm.waitamdnotify01;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread {

    ArrayBlockingQueue<String> queue;

    public Foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String taken = queue.take();
                System.out.println(taken);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
