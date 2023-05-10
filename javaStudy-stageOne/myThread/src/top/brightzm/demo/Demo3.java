package top.brightzm.demo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Demo3 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 多线程处理的任务
        Mycallable mc = new Mycallable();
        // 管理运行结果
        FutureTask<Integer> ft = new FutureTask<>(mc);

        Thread t = new Thread(ft);

        t.start();

        Integer integer = ft.get();

        System.out.println(integer);

    }

}
