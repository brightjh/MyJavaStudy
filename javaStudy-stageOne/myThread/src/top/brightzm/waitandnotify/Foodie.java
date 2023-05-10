package top.brightzm.waitandnotify;

public class Foodie extends Thread {

    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) break;

                if (Desk.foodFlag == 0) {
                    try {
                        Desk.lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                Desk.count--;
                Desk.foodFlag = 0;
                System.out.println("消费者正在消费,还能买" + Desk.count + "个");
                Desk.lock.notifyAll();

            }
        }
    }
}
