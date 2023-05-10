package top.brightzm.waitamdnotify01;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread {

    // 生产者

    ArrayBlockingQueue<String> queue;

    public Cook(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        while (true) {
            try {
                queue.put("商品");
                System.out.println("生产者生产了一个商品");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
