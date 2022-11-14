package top.brightzm.demo1;

/**
 * @description: 多线程入门
 * @author: bright
 * @time: 2022/11/7 下午4:11
 */
public class demo1 {
    public static void main(String[] args) {
        System.out.println("main start....");
        Thread t = new Thread(){
            @Override
            public void run() {
                System.out.println("thread run...");
                System.out.println("thread end...");
            }
        };
        t.start();
        try {
            Thread.sleep(20);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("main end...");
    }

}
