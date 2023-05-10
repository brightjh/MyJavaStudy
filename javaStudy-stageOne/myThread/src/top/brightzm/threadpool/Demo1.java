package top.brightzm.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo1 {
    public static void main(String[] args) {
        // 创建默认线程池

        ExecutorService pool = Executors.newCachedThreadPool();

        pool.submit(new MyRunnable());

        pool.submit(new MyRunnable());


    }
}
