package top.brightzm.waitandnotify;

public class Cook extends Thread {

    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0) break;

                if (Desk.foodFlag == 1) {
                    try {
                        Desk.lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }


                Desk.foodFlag = 1;
                System.out.println("生产者正在生产");
                Desk.lock.notifyAll();
            }

        }
    }
}
