package top.brightzm.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Demo2 {

    public static void main(String[] args) {
        // 自定义线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(3, 6, 60,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(6),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());



    }

}
