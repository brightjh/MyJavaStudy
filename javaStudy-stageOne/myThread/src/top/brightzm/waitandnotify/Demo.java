package top.brightzm.waitandnotify;

public class Demo {

    public static void main(String[] args) {
        Cook c = new Cook();
        Foodie f = new Foodie();

        c.setName("生产者");
        f.setName("消费者");

        c.start();
        f.start();

    }
}
