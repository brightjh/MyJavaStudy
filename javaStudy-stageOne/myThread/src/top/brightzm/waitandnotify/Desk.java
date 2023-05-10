package top.brightzm.waitandnotify;

public class Desk {

    // 是否存在食物
    public static int foodFlag = 0;


    // 食物个数
    public static int count = 10;

    // 锁对象
    public static Object lock = new Object();

}
